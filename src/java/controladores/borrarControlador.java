/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import modelos.conexion.Conectar;
import modelos.vo.UsuarioVo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hells
 */
public class borrarControlador {

    private JdbcTemplate jdbcT;

    public borrarControlador() {
        Conectar conn = new Conectar();
        this.jdbcT = new JdbcTemplate(conn.conectar());
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView usuarioDelete(HttpServletRequest request) {

        ModelAndView mav = new ModelAndView();
        int idusuario = Integer.parseInt(request.getParameter("idusuario"));
        mav.setViewName("borrar");
        mav.addObject("usuario", traeUsuario(idusuario));
        return mav;

    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView usuarioDelete(UsuarioVo u, HttpServletRequest request) {

        int idusuario = Integer.parseInt(request.getParameter("idusuario"));
        this.jdbcT.update("DELETE FROM usuario WHERE idusuario =?", idusuario);

        return new ModelAndView("redirect:/lista.htm");

    }

    public UsuarioVo traeUsuario(int idusuario) {
        UsuarioVo u = new UsuarioVo();

        String sql = "SELECT * FROM usuario WHERE idusuario= " + idusuario;
        return (UsuarioVo) jdbcT.query(sql, (ResultSet rs) -> {
            if (rs.next()) {
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setLogin(rs.getString("login"));
                u.setClave(rs.getString("clave"));
                u.setPerfil(rs.getInt("perfil"));

            }
            return u;
        });
    }
}

