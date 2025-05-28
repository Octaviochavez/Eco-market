package com.eco_market.eco_market.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@Table(name = "reporte")
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Reporte {
    @Id 
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_reporte;
    @Column(nullable = false)
        private String tipo_reporte;
    @Column(nullable = false)
        private Date fecha_reporte;
    @ManyToMany
    @JoinTable(name = "reporte_pedido", 
               joinColumns = @JoinColumn(name= "id_reporte"), 
               inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private List<Producto> productos = new ArrayList<>();
    
}
