package com.api.usuarios.controller;

import com.api.usuarios.model.UsuarioModel;
import com.api.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public ArrayList<UsuarioModel> getUsers(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    @PostMapping
    public UsuarioModel saveUser(@RequestBody UsuarioModel user){
        return usuarioRepository.save(user);
    }

    @GetMapping(path = "/{id}")
    public UsuarioModel getUserById(@PathVariable("id") Long id){
        return usuarioRepository.findById(id).get();
    }

    @PutMapping(path = "/{id}")
    public UsuarioModel updateUserById(@RequestBody UsuarioModel request, @PathVariable("id") Long id){
        UsuarioModel user = usuarioRepository.findById(id).get();
        user.setNombre(request.getNombre());
        user.setApellido(request.getApellido());
        user.setEmail(request.getEmail());
        usuarioRepository.save(user);
        return user;
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        try{
            usuarioRepository.deleteById(id);
            return "User with id "+id+" deleted";
        } catch (Exception e) {
            return "Error deletes user with id "+id;
        }
    }

}
