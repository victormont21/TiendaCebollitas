package com.teamcebollitas.ecommerce.service;
import com.teamcebollitas.ecommerce.models.UsuarioModel;
import com.teamcebollitas.ecommerce.repositories.UsuarioRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
public class UsuarioService
{
    @Autowired
    UsuarioRepositories usuarioRepositories;

    public UsuarioModel registerUsuarioService(UsuarioModel oUsuarioModel)
    {
        return usuarioRepositories.save(oUsuarioModel);
    }

    public UsuarioModel loginUsuarioService(String email,String pass,int rol)
    {
        System.out.printf("EMAIL : "+email);
        System.out.printf("CONTRASENIA : "+pass);
        UsuarioModel oU = usuarioRepositories.findLoginUsuario(email,pass,rol);
        return  (oU == null ? new UsuarioModel() : oU);
    }
}
