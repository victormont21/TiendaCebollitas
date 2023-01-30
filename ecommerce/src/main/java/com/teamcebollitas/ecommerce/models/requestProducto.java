package com.teamcebollitas.ecommerce.models;

public class requestProducto
{
    private int categoria;
    private int estado;

    public requestProducto(){}

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
