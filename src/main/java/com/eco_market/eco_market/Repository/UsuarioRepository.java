package com.eco_market.eco_market.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eco_market.eco_market.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
        @Query("SELECT u FROM Usuario u WHERE u.run = :run")
            List<Usuario> buscarPorRun(@Param("run") String run);

        @Query(value = "SELECT * FROM Usuario WHERE correo_usuario = :correo_usuario", nativeQuery = true)
            Usuario buscarPorCorreo(@Param("correo_usuario") String correo_usuario);

}
