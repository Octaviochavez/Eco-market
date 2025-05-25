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
        private String rut_usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta", nullable = false)
    private Venta venta;
    @Column(nullable = false)
        private String comentario;
    @Column(nullable = false)
        private Integer puntuacion;
    @Column(nullable = false)    
    private Date fecha_resena;
}
