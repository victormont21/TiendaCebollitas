package com.teamcebollitas.ecommerce.models;

public class CarritoModel
{

    private String email_carrito;
    private String nombre;
    private int cantidad_carrito;
    private Double total;



    public CarritoModel(String email_carrito, String nombre, int cantidad_carrito, Double total) {
        this.email_carrito = email_carrito;
        this.nombre = nombre;
        this.cantidad_carrito = cantidad_carrito;
        this.total = total;
    }


    public String getEmail_carrito() {
        return email_carrito;
    }

    public void setEmail_carrito(String email_carrito) {
        this.email_carrito = email_carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_carrito() {
        return cantidad_carrito;
    }

    public void setCantidad_carrito(int cantidad_carrito) {
        this.cantidad_carrito = cantidad_carrito;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
