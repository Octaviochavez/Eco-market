package com.eco_market.eco_market.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @ManyToMany
    @JoinTable(name = "logistica_pedido", 
               joinColumns = @JoinColumn(name= "id_logistica"), 
               inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private List<Producto> productos = new ArrayList<>();
}
