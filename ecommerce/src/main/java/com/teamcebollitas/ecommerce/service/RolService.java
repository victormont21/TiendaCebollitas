package com.teamcebollitas.ecommerce.service;
import com.teamcebollitas.ecommerce.models.RolModel;
import com.teamcebollitas.ecommerce.models.UsuarioModel;
import com.teamcebollitas.ecommerce.repositories.RolRepositories;
import com.teamcebollitas.ecommerce.repositories.UsuarioRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class RolService
{
    @Autowired
    RolRepositories rolRepositories;

    public ArrayList<RolModel> readRolService()
    {
        return (ArrayList<RolModel>) rolRepositories.findAll();
    }
}
