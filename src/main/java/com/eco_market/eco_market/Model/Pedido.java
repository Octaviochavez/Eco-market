package com.eco_market.eco_market.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import jakarta.persistence.*;
@Data
@Table(name = "pedido")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id_pedido;
    @Column(nullable = false)
        private Date fecha_pedido;
    @Column(nullable = false)
        private String estado_pedido;
    @Column(nullable = false)
        private boolean pagado;
    @Column(nullable = false)
        private Integer total_pedido;
    @ManyToOne
    @JoinColumn(name = "rut_usuario", referencedColumnName = "run", nullable = false)
    private Usuario usuario;
}
