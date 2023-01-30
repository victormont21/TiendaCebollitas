package com.teamcebollitas.ecommerce.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrito")
public class RequestCarritoModel
{
    @Id
    private String email_carrito;
    private int producto_carrito;

    @Column(columnDefinition = "default = 1")
    private int cantidad_carrito;

    public RequestCarritoModel(){}

    public String getEmail_carrito() {
        return email_carrito;
    }

    public void setEmail_carrito(String email_carrito) {
        this.email_carrito = email_carrito;
    }

    public int getProducto_carrito() {
        return producto_carrito;
    }

    public void setProducto_carrito(int producto_carrito) {
        this.producto_carrito = producto_carrito;
    }

    public int getCantidad_carrito() {
        return cantidad_carrito;
    }

    public void setCantidad_carrito(int cantidad_carrito) {
        this.cantidad_carrito = cantidad_carrito;
    }
}
