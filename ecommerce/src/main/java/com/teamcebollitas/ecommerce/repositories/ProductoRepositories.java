package com.teamcebollitas.ecommerce.repositories;
import com.teamcebollitas.ecommerce.models.ProductoModel;
import com.teamcebollitas.ecommerce.models.RolModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProductoRepositories extends CrudRepository<ProductoModel,Long>
{
    @Query(value = "select * from productos where activo = 1 and fk_categoria = ?1",nativeQuery = true)
    ArrayList<ProductoModel> findAllProductsActivosCategory(int categoria);

    @Query(value = "select * from productos where activo = 1",nativeQuery = true)
    ArrayList<ProductoModel> findAllProductsActivos(int categoria);


    @Modifying
    @Transactional
    @Query(value = "update productos set nombre = ?2,foto = ?3,precio=?4,descuento = 0,stock=?5,detalle_proveedor=?6,descripcion=?7,fk_categoria=?8 where id = ?1",nativeQuery = true)
    void updateProductoId(Long id,String name,String foto,double precio,int stock,String detalle_pro,String descrip,int fk_categoria);


    @Modifying
    @Transactional
    @Query(value = "update productos set activo = 0 where id = ?1",nativeQuery = true)
    void deleteProductoId(Long id);


    @Modifying
    @Transactional
    @Query(value = "update productos set activo = 1 where id = ?1",nativeQuery = true)
    void activeProductoId(Long id);



}
