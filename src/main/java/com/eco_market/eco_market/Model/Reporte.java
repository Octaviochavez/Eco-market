package com.eco_market.eco_market.Model;

import java.util.Date;
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
    @Column(nullable = false)
        private String contenido;
}
