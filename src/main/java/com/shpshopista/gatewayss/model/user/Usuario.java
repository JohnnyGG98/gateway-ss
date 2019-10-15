package com.shpshopista.gatewayss.model.user;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Where;

/**
 *
 * @author Johnny
 */
@Where(clause = "user_activo = true")
@Entity
@Table(
        name = "\"Usuarios\"",
        schema = "public"
)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long id_usuario;

    @Column(name = "user_nick", nullable = false, unique = true)
    private String nick;

    @Column(name = "user_pass", nullable = false)
    //@JsonIgnore
    private String user_pass;

    @Column(name = "user_tipo", nullable = false, columnDefinition = "character varying(1) DEFAULT 'C'")
    private String user_tipo;

    @Column(name = "user_activo", columnDefinition = "BOOLEAN DEFAULT 'true'")
    private boolean user_activo = true;

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUser_nick() {
        return nick;
    }

    public void setUser_nick(String user_nick) {
        this.nick = user_nick;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_tipo() {
        return user_tipo;
    }

    public void setUser_tipo(String user_tipo) {
        this.user_tipo = user_tipo;
    }

    public boolean isUser_activo() {
        return user_activo;
    }

    public void setUser_activo(boolean user_activo) {
        this.user_activo = user_activo;
    }

}
