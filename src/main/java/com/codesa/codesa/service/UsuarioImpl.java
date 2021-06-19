package com.codesa.codesa.service;

import com.codesa.codesa.model.Usuario;
import com.codesa.codesa.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }
    
    @Override
    public List<Usuario> consultar(String nombre) {
        return usuarioRepository.consultar(nombre);
    }
    
    @Override
    public void deleteUsuario(int id) {
		System.out.println("UsuarioImpl delete");

		usuarioRepository.deleteById(id);
	}

}
