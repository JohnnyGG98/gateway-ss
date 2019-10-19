package com.shpshopista.gatewayss.repository;

import com.shpshopista.gatewayss.model.user.Usuario;
import com.shpshopista.gatewayss.pojos.UsuarioRP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Johnny
 */
public interface IUsuarioREPO extends JpaRepository<Usuario, Long> {

    Usuario findByNick(String nick);

    @Query(value = "SELECT "
            + "u.id_usuario AS id, "
            + "u.user_nick AS nick, "
            + "u.user_tipo AS tipo, "
            + "p.id_persona AS persona "
            + "FROM public.\"Usuarios\" u "
            + "JOIN human.\"Personas\" p ON p.id_usuario = u.id_usuario "
            + "WHERE u.user_nick = :nick",
            nativeQuery = true)
    UsuarioRP buscarPorNick(@Param("nick") String nick);

}
