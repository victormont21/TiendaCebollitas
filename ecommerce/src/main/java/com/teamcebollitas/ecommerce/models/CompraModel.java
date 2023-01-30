package com.teamcebollitas.ecommerce.models;

import jakarta.persistence.*;

@Entity
@Table(name = "compra")
public class CompraModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false,name = "id")
    private Long id;
    private String id_paypal;
    private String email_cliente;

    @Column(columnDefinition = "default 0.00")
    private String total;

    @Column(columnDefinition = "default now()")
    private String date_compra;
    @Column(name = "detalle_compra")
    private String detalle_compra;

    public CompraModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_paypal() {
        return id_paypal;
    }

    public void setId_paypal(String id_paypal) {
        this.id_paypal = id_paypal;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDate_compra() {
        return date_compra;
    }

    public void setDate_compra(String date_compra) {
        this.date_compra = date_compra;
    }

    public String getDetalle_compra() {
        return detalle_compra;
    }

    public void setDetalle_compra(String detalle_compra) {
        this.detalle_compra = detalle_compra;
    }
}
