package com.teamcebollitas.ecommerce.repositories;
import com.teamcebollitas.ecommerce.models.CarritoModel;
import com.teamcebollitas.ecommerce.models.ProductoModel;
import com.teamcebollitas.ecommerce.models.RequestCarritoModel;
import com.teamcebollitas.ecommerce.models.RolModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CarritoRepositories extends JpaRepository<RequestCarritoModel,String>
{
    @Query(value = "call insertCarrito(?1,?2,?3)",nativeQuery = true)
    int saveCarritoRepositories(String email,int producto,int cantidad);

    @Query(value = "select C.email_carrito,P.nombre,C.cantidad_carrito,(P.precio * C.cantidad_carrito) as total from carrito as C join productos as P on C.producto_carrito = P.id",nativeQuery = true)
    ArrayList<CarritoModel> findAllCarritoEmail(String email);

}
