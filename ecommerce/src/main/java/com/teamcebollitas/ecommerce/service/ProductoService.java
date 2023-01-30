package com.teamcebollitas.ecommerce.service;
import com.teamcebollitas.ecommerce.models.ProductoModel;
import com.teamcebollitas.ecommerce.models.ResponseDataModel;
import com.teamcebollitas.ecommerce.repositories.ProductoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class ProductoService
{
    @Autowired
    ProductoRepositories oProductoRepositories;

    public ArrayList<ProductoModel> readProductoService(int is_All,int categoria)
    {
        /** 1 ACTIVOS **/
        /** 0 ALL **/
        ArrayList<ProductoModel> oList =  new ArrayList<ProductoModel>();
        System.out.printf("IS ALL INTERFACE : "+is_All);
        if(is_All == 0 && categoria == 0)
        {
            oList = (ArrayList<ProductoModel>) oProductoRepositories.findAll();
        }else if (is_All == 1 && categoria == 0){
            oList = (ArrayList<ProductoModel>) oProductoRepositories.findAllProductsActivos(categoria);
        }else{
            System.out.println("SOLOS ACTIVO");
            System.out.println("CATEGORIA SERVICE : "+categoria);
            oList = (ArrayList<ProductoModel>) oProductoRepositories.findAllProductsActivosCategory(categoria);
        }
        return oList;
    }

    public Optional<ProductoModel> readDetalleProductoService(Long idProducto)
    {
        return oProductoRepositories.findById(idProducto);
    }
    public ProductoModel registerProductoService(ProductoModel oP)
    {
        return oProductoRepositories.save(oP);
    }


    public ResponseDataModel updateProductoService(ProductoModel oP)
    {
        String error = "";
        try{
            oProductoRepositories.updateProductoId(oP.getId(),oP.getNombre(),oP.getFoto(),
                    oP.getPrecio(),oP.getStock(),oP.getDetalleProveedor(),oP.getDescripcion(),oP.getFk_categoria());
            return new ResponseDataModel("Producto Actualizado",200);
        }catch (Exception e){
            System.out.printf(e.getMessage());
            error = e.getMessage();
        }

        return new ResponseDataModel(error,400);
    }

    public ResponseDataModel deleteProductoService(Long id)
    {
        String error = "";
        try{
            oProductoRepositories.deleteProductoId(id);
            return new ResponseDataModel("Producto ELIMINADO ",200);
        }catch (Exception e){
            System.out.printf(e.getMessage());
            error = e.getMessage();
        }

        return new ResponseDataModel(error,400);
    }


    public ResponseDataModel activeProductoService(Long id)
    {
        String error = "";
        try{
            oProductoRepositories.activeProductoId(id);
            return new ResponseDataModel("Producto ACTIVADO ",200);
        }catch (Exception e){
            System.out.printf(e.getMessage());
            error = e.getMessage();
        }

        return new ResponseDataModel(error,400);
    }
}
