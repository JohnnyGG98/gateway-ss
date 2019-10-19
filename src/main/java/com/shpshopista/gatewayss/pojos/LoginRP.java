package com.shpshopista.gatewayss.pojos;

import java.io.Serializable;

/**
 *
 * @author Johnny
 */
public class LoginRP implements Serializable {

    private final String jwttoken;
    private final long id_user;
    private final String user_nick;
    private final String user_tipo;
    private final long id_persona;

    public LoginRP(String token, UsuarioRP user) {
        this.jwttoken = token;
        this.id_user = user.getId();
        this.user_nick = user.getNick();
        this.user_tipo = user.getTipo();
        this.id_persona = user.getPersona();
    }

    public String getJwttoken() {
        return jwttoken;
    }

    public String getUser_nick() {
        return user_nick;
    }

    public String getUser_tipo() {
        return user_tipo;
    }

    public long getId_user() {
        return id_user;
    }

    public long getId_persona() {
        return id_persona;
    }

}
