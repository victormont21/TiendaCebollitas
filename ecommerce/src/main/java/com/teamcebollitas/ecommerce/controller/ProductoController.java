package com.teamcebollitas.ecommerce.controller;

import com.teamcebollitas.ecommerce.models.ProductoModel;
import com.teamcebollitas.ecommerce.models.ResponseDataModel;
import com.teamcebollitas.ecommerce.models.requestProducto;
import com.teamcebollitas.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})

public class ProductoController
{
    @Autowired
    ProductoService oProductoService;

    @RequestMapping(value = "/productos",method = RequestMethod.GET)
    public ArrayList<ProductoModel> readProductosController(@RequestParam int is_active,@RequestParam int categoria)
    {
        System.out.printf("TIPO : "+is_active);
        System.out.printf("CATEGORIA : "+categoria);
        return this.oProductoService.readProductoService(is_active,categoria);
    }


    @RequestMapping(value = "/detalle_producto",method = RequestMethod.GET)
    public Optional<ProductoModel> readProductoDetalleController(@RequestParam Long producto)
    {
        System.out.printf("PRODUCTO ID DETALLE : "+producto);
        return this.oProductoService.readDetalleProductoService(producto);
    }

    @RequestMapping(value = "/insert_producto",method = RequestMethod.POST)
    public ProductoModel registerProductoController(@RequestBody ProductoModel oP)
    {
        return this.oProductoService.registerProductoService(oP);
    }

    @RequestMapping(value = "/update_producto",method = RequestMethod.PUT)
    public ResponseDataModel updateProductoController(@RequestBody ProductoModel oP)
    {
        return  oProductoService.updateProductoService(oP);
    }


    @RequestMapping(value = "/delete_producto",method = RequestMethod.DELETE)
    public ResponseDataModel deleteProductoController(@RequestBody ProductoModel oP)
    {
        System.out.printf("ID DELETE PRODUCTO : "+oP.getId());
        return  oProductoService.deleteProductoService(oP.getId());
    }

    @RequestMapping(value = "/active_producto",method = RequestMethod.PUT)
    public ResponseDataModel activeProductoController(@RequestBody ProductoModel oP)
    {
        System.out.printf("ID DELETE PRODUCTO : "+oP.getId());
        return  oProductoService.activeProductoService(oP.getId());
    }

}
