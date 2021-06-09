package com.codesa.codesa.controller;

import com.codesa.codesa.service.UsuarioService;
import com.codesa.codesa.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> listarTodos() {
        return usuarioService.getUsuarios();
    }

    @RequestMapping("/consultar/{nombre}")
    public List<Usuario> consultar(@PathVariable String nombre){
        System.out.println("consultar "+nombre);
        return usuarioService.consultar(nombre);
    }

}
