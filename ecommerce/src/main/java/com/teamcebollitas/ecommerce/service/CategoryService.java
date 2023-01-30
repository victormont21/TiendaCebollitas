package com.teamcebollitas.ecommerce.service;
import com.teamcebollitas.ecommerce.models.CategoryModel;
import com.teamcebollitas.ecommerce.models.RolModel;
import com.teamcebollitas.ecommerce.repositories.CategoryRepositories;
import com.teamcebollitas.ecommerce.repositories.RolRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryService
{
    @Autowired
    CategoryRepositories categoryRepositories;

    public ArrayList<CategoryModel> readCategoryService()
    {
        return (ArrayList<CategoryModel>) categoryRepositories.findAll();
    }
}
