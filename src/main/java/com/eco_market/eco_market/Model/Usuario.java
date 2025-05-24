package com.eco_market.eco_market.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Data
@Table(name = "usuario")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
    @Column(unique = true, length = 13, nullable = false)
        private String run;
    @Column(nullable = false)
        private String p_nomb_usuario;
    @Column(nullable = true)    
        private String s_nomb_usuario;
    @Column(nullable = false)    
        private String p_apelli_usuario;
    @Column(nullable = false)    
        private String s_apell_usuario;
    @Column(nullable = false)    
        private String correo_usuario;
    @Column(nullable = false)    
        private String rol;

    
}
