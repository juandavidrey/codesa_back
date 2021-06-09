package com.codesa.codesa.repository;

import com.codesa.codesa.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    @Query("select u from Usuario u where u.USUARIO_NOMBRE like %:nombre% ")
    List<Usuario> consultar(String nombre);
}
