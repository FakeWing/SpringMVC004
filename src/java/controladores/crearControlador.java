/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

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
public class crearControlador {
     private JdbcTemplate jdbcT;
     
     public crearControlador(){
        Conectar conn= new Conectar();
        this.jdbcT=new JdbcTemplate(conn.conectar());
     }
     
     
     
    @RequestMapping(value="crear.htm", method=RequestMethod.GET)
    public ModelAndView usuarioCrear(){
        ModelAndView mav= new ModelAndView();
        mav.addObject("usuario", new UsuarioVo());
        mav.setViewName("crear");
        return mav;
    }
    
     @RequestMapping(value="crear.htm", method=RequestMethod.POST)
     public ModelAndView usuarioCrear(UsuarioVo u){
         
         this.jdbcT.update("INSERT INTO usuario (nombre, apellido, login, clave, perfil) VALUES (?,?,?,?,?)",
         u.getNombre(),u.getApellido(),u.getLogin(),u.getClave(),u.getPerfil());
         return new ModelAndView("redirect:/lista.htm");
         
     }
    
    
    
    
}
