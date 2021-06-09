package com.codesa.codesa.service;

import com.codesa.codesa.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> getUsuarios();
    List<Usuario> consultar(String nombre);
    
}
