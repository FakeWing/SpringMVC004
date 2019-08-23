/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.conexion.Conectar;
import modelos.vo.UsuarioVo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.Errors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hells
 */
public class crearControlador {

    private JdbcTemplate jdbcT;
    private listaControlador lista;

    public crearControlador() {
        Conectar conn = new Conectar();
        this.jdbcT = new JdbcTemplate(conn.conectar());
    }

    @RequestMapping( method = RequestMethod.GET)
    public ModelAndView usuarioCrear() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("usuario", new UsuarioVo());
        mav.setViewName("crear");
        return mav;
    }

    @RequestMapping( method = RequestMethod.POST)
    public ModelAndView usuarioCrear(UsuarioVo u, Errors errors) {
        ModelAndView mav = new ModelAndView();
        List logins = jdbcT.queryForList("select login from usuario where login = ? ", u.getLogin());

        if (logins.size() > 0) {
            errors.rejectValue("login", "login.incorrect",
                    "Login existente");
            mav.setViewName("crear");
            mav.addObject("usuario", u);
            return mav;
        } else {
            this.jdbcT.update("INSERT INTO usuario (nombre, apellido, login, clave, perfil) VALUES (?,?,?,?,?)",
                    u.getNombre(), u.getApellido(), u.getLogin(), u.getClave(), u.getPerfil());
            return new ModelAndView("redirect:/lista.htm");
        }
    }

}
