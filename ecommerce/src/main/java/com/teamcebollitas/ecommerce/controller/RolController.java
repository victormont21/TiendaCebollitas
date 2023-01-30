package com.teamcebollitas.ecommerce.controller;
import com.teamcebollitas.ecommerce.models.RolModel;
import com.teamcebollitas.ecommerce.models.UsuarioModel;
import com.teamcebollitas.ecommerce.service.RolService;
import com.teamcebollitas.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/rol")
public class RolController
{
    @Autowired
    RolService oRolService;

    @GetMapping()
    public ArrayList<RolModel> readRolController()
    {
        return this.oRolService.readRolService();
    }

}
