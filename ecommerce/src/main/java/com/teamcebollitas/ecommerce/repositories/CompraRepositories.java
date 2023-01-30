package com.teamcebollitas.ecommerce.repositories;
import com.teamcebollitas.ecommerce.models.CarritoModel;
import com.teamcebollitas.ecommerce.models.CompraModel;
import com.teamcebollitas.ecommerce.models.RequestCarritoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CompraRepositories extends CrudRepository<CompraModel,Long>
{
    @Query(value = "select * from compra as C where C.email_cliente = ?1 order by date_compra desc",nativeQuery = true)
    ArrayList<CompraModel> findAllComprasEmail(String email);
}
