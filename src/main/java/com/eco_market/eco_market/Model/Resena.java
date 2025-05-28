package com.eco_market.eco_market.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import jakarta.persistence.*;
@Data
@Table(name = "resena")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Resena {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_resena;
    @Column(nullable = false)
        private String titulo_resena;
    @Column(nullable = false)
        private String comentario;
    @Column(nullable = false)    
    private Date fecha_resena;
    @OneToOne
    @JoinColumn(name= "id_resena_producto", referencedColumnName= "id_producto",nullable = false)
    private Producto producto;
    @ManyToOne
    @JoinColumn(name= "id_resena_usuario", referencedColumnName = "id", nullable = false)
    private Usuario usuario;
}
