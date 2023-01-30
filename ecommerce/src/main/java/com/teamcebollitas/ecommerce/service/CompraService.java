package com.teamcebollitas.ecommerce.service;
import com.teamcebollitas.ecommerce.models.CarritoModel;
import com.teamcebollitas.ecommerce.models.CompraModel;
import com.teamcebollitas.ecommerce.repositories.CarritoRepositories;
import com.teamcebollitas.ecommerce.repositories.CompraRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CompraService
{
    @Autowired
    CompraRepositories oCompraRepositories;

    public CompraModel insertCompraService(CompraModel oC)
    {
        return oCompraRepositories.save(oC);
    }

    public ArrayList<CompraModel> readComprasEmail(String email,int fk_rol)
    {
        if(fk_rol == 2){
            return oCompraRepositories.findAllComprasEmail(email);
        }else{
            return (ArrayList<CompraModel>) oCompraRepositories.findAll();
        }
    }
}
