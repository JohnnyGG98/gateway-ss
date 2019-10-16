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
    private long id;

    @Column(name = "user_nick", nullable = false, unique = true)
    private String nick;

    @Column(name = "user_pass", nullable = false)
    //@JsonIgnore
    private String pass;

    @Column(name = "user_tipo", nullable = false, columnDefinition = "character varying(1) DEFAULT 'C'")
    private String tipo;

    @Column(name = "user_activo", columnDefinition = "BOOLEAN DEFAULT 'true'")
    private boolean activo = true;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
