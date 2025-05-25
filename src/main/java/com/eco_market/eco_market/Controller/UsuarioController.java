package com.eco_market.eco_market.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eco_market.eco_market.Model.Usuario;
import com.eco_market.eco_market.Service.UsuarioService;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
        public ResponseEntity<List<Usuario>> listar(){
        List<Usuario> usuarios = usuarioService.findAll();
        if (usuarios.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(usuarios);
    }
    @PostMapping
    public ResponseEntity<Usuario> guardar(@RequestBody Usuario usuario) {
        Usuario UsuarioNuevo = usuarioService.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioNuevo);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscar(@PathVariable Integer id) {
        try{
            Usuario usuario = usuarioService.findById(id);
            return ResponseEntity.ok(usuario);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
        @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        try{
            Usuario user = usuarioService.findById(id);
            user.setId(id);
            user.setRun(usuario.getRun());
            user.setP_nomb_usuario(usuario.getP_nomb_usuario());
            user.setS_nomb_usuario(usuario.getS_nomb_usuario());
            user.setP_apelli_usuario(usuario.getP_apelli_usuario());
            user.setS_apell_usuario(usuario.getS_apell_usuario());
            user.setCorreo_usuario(usuario.getCorreo_usuario());
            user.setRol(user.getRol());
            usuarioService.save(user);
            return ResponseEntity.ok(usuario);
           
        }catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    
    }
    @DeleteMapping("/{id}")
        public ResponseEntity<?> eliminar(@PathVariable Long id){
        try{
            usuarioService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }


}
