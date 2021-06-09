CREATE OR REPLACE TRIGGER D_USUARIO  
  BEFORE INSERT OR UPDATE ON T_USUARIO
  REFERENCING OLD AS OLD NEW AS NEW
  FOR EACH ROW
DECLARE
	nuevo_id_usuario number;
BEGIN
  IF (INSERTING) THEN
	select S_ROL.nextval into nuevo_id_usuario from dual;
    :new.USUARIO_ID := nuevo_id_usuario;
  END IF;
  EXCEPTION
    WHEN OTHERS THEN
      Raise_Application_Error( -20003, 'ERROR: '||SQLERRM );
END;