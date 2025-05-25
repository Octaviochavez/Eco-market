package com.eco_market.eco_market.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Data
@Table(name = "logistica")
@Entity
@AllArgsConstructor
@NoArgsConstructor


public class Logistica {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id_logistica;
    @Column(nullable = false)    
        private String direccion;
    @Column(nullable = false)    
        private String estado;
    @Column(nullable = false)
        private Date fecha_envio;
    
    @OneToOne
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta", nullable = false)
    private Venta venta;
}
