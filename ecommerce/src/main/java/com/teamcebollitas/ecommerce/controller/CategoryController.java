package com.teamcebollitas.ecommerce.controller;

import com.teamcebollitas.ecommerce.models.CategoryModel;
import com.teamcebollitas.ecommerce.models.RolModel;
import com.teamcebollitas.ecommerce.service.CategoryService;
import com.teamcebollitas.ecommerce.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("/categorias")
public class CategoryController
{
    @Autowired
    CategoryService oCateService;

    @GetMapping()
    public ArrayList<CategoryModel> readCategoryController()
    {
        return this.oCateService.readCategoryService();
    }

}
