CREATE OR REPLACE TRIGGER D_ROL  
  BEFORE INSERT OR UPDATE ON T_ROL
  REFERENCING OLD AS OLD NEW AS NEW
  FOR EACH ROW
DECLARE
    nuevo_id_rol number;
BEGIN
  IF (INSERTING) THEN
    select S_ROL.nextval into nuevo_id_rol from dual;
    :new.ROL_ID := nuevo_id_rol;
  END IF;
  EXCEPTION
    WHEN OTHERS THEN
      Raise_Application_Error( -20003, 'ERROR: '||SQLERRM );
END;