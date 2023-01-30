package com.teamcebollitas.ecommerce.controller;
import com.teamcebollitas.ecommerce.models.UsuarioModel;
import com.teamcebollitas.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
public class UsuarioController
{
    @Autowired
    UsuarioService oUsuarioService;

    @RequestMapping(value = "/usuario",method = RequestMethod.POST)
    public UsuarioModel registroUsuarioController(@RequestBody UsuarioModel usuario)
    {
        return this.oUsuarioService.registerUsuarioService(usuario);
    }

    @RequestMapping(value = "/login_usuario",method = RequestMethod.POST)
    public UsuarioModel loginUsuarioController(@RequestBody UsuarioModel oU)
    {
        return this.oUsuarioService.loginUsuarioService(oU.getEmail(),oU.getContrasenia(),oU.getFk_rol());
    }

}
