package com.teamcebollitas.ecommerce.repositories;
import com.teamcebollitas.ecommerce.models.CategoryModel;
import com.teamcebollitas.ecommerce.models.RolModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositories extends CrudRepository<CategoryModel,Long>
{

}
