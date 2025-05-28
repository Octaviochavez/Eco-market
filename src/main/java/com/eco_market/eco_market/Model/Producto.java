package com.eco_market.eco_market.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import jakarta.persistence.*;
@Data
@Table(name = "producto")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id_producto;
    @Column(nullable = false)
        private String nombre_producto;
    @Column(nullable = false)
        private String descri_producto;
    @Column(nullable = false)
        private int stock;
    @Column(nullable = false)
        private String categoria;
    @ManyToOne
    @JoinColumn(name= "id_pedido_usuario", referencedColumnName = "id_pedido", nullable = false)
    private Pedido pedido;


}
