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
    private Integer id_producto;
}
