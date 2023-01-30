package com.teamcebollitas.ecommerce.models;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioModel
{
    @Id
    @Column(unique = true,nullable = false)
    private String email;
    private String nombres;
    private String telefono;
    private String contrasenia;
    private int fk_rol;

    public UsuarioModel(){};

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getFk_rol() {
        return fk_rol;
    }

    public void setFk_rol(int fk_rol) {
        this.fk_rol = fk_rol;
    }
}
