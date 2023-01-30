package com.teamcebollitas.ecommerce.controller;

import com.teamcebollitas.ecommerce.models.CarritoModel;
import com.teamcebollitas.ecommerce.models.RequestCarritoModel;
import com.teamcebollitas.ecommerce.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController
{
    @Autowired
    CarritoService carritoService;

    @PostMapping()
    public int insertCarritoController(@RequestBody RequestCarritoModel oRequestCarritoModel)
    {
        return carritoService.saveCarritoService(oRequestCarritoModel.getEmail_carrito(),
                oRequestCarritoModel.getProducto_carrito(),
                oRequestCarritoModel.getCantidad_carrito());
    }

    @GetMapping()
    public ArrayList<CarritoModel> readCarritoControles(@RequestParam String email)
    {
        System.out.println("EMAIL CARRITO : "+email);
        return (ArrayList<CarritoModel>) carritoService.readCarritoService(email);
    }

}
