package com.teamcebollitas.ecommerce.repositories;
import com.teamcebollitas.ecommerce.models.UsuarioModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositories extends CrudRepository<UsuarioModel,String>
{
    @Query(value = "select U.* from usuarios as U where U.email = ?1 and U.contrasenia = ?2 and U.fk_rol = ?3",nativeQuery = true)
    UsuarioModel findLoginUsuario(String email,String pass,int rol);
}
