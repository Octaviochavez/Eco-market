package com.eco_market.eco_market.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "venta")
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Venta {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
        private Integer id_venta;
    @Column(nullable = false)
        private Date fecha_venta;
    @Column(nullable = false)    
        private double total;
    @Column(nullable = false)
        private String rut_usuario;
    
    @ManyToMany
    @JoinTable(
        name = "venta_producto",
        joinColumns = @JoinColumn(name = "id_venta"),
        inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private List<Producto> productos = new ArrayList<>();
}
