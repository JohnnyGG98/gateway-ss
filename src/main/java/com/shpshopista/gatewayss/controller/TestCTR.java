package com.shpshopista.gatewayss.controller;

import com.shpshopista.gatewayss.model.user.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Johnny
 */
@RestController
@CrossOrigin(origins = "*")
public class TestCTR {

    @RequestMapping("/saluda")
    public Usuario hello() {
        Usuario u = new Usuario();
        u.setUser_nick("Taguz");
        u.setUser_pass("Passs");
        u.setId_usuario(10);
        u.setUser_activo(true);
        return u;
    }

}
