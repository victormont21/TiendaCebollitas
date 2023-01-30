package com.teamcebollitas.ecommerce.controller;

import com.teamcebollitas.ecommerce.models.CompraModel;
import com.teamcebollitas.ecommerce.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("/compra")
public class CompraController
{
    @Autowired
    CompraService oCompraService;

    @PostMapping()
    public CompraModel insertCompraController(@RequestBody CompraModel oCompraModel)
    {
        System.out.printf("DETALLE COMPRA : "+oCompraModel.getDetalle_compra() );
        return oCompraService.insertCompraService(oCompraModel);
    }


    @GetMapping()
    public ArrayList<CompraModel> readCompraController(@RequestParam String email,@RequestParam int fk_rol)
    {
        return oCompraService.readComprasEmail(email,fk_rol);
    }


}
