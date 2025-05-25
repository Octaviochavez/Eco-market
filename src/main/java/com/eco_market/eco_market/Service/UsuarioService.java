package com.eco_market.eco_market.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eco_market.eco_market.Model.Usuario;
import com.eco_market.eco_market.Repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
    public Usuario findById(long id){
        return usuarioRepository.findById(id).get();
    }
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void delete(long id){
        usuarioRepository.deleteById(id);
    }

}
