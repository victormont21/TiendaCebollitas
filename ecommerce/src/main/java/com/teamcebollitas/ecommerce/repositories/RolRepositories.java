package com.teamcebollitas.ecommerce.repositories;
import com.teamcebollitas.ecommerce.models.RolModel;
import com.teamcebollitas.ecommerce.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepositories extends CrudRepository<RolModel,Long>
{

}
