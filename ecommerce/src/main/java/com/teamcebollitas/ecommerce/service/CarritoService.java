package com.teamcebollitas.ecommerce.service;
import com.teamcebollitas.ecommerce.models.CarritoModel;
import com.teamcebollitas.ecommerce.models.RolModel;
import com.teamcebollitas.ecommerce.repositories.CarritoRepositories;
import com.teamcebollitas.ecommerce.repositories.RolRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarritoService
{
    @Autowired
    CarritoRepositories carritoRepositories;

    public int saveCarritoService(String email,int producto,int cantidad)
    {
        return carritoRepositories.saveCarritoRepositories(email,producto,cantidad);
    }

    public ArrayList<CarritoModel> readCarritoService(String email)
    {
        ArrayList<CarritoModel> oL = new ArrayList<>();
        try{
            oL = carritoRepositories.findAllCarritoEmail(email);
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }
        return oL;
    }
}
