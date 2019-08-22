/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.conexion.Conectar;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hells
 */
public class listaControlador {
    
     private JdbcTemplate jdbcT;
    
     public listaControlador(){
          Conectar conn= new Conectar();
        this.jdbcT=new JdbcTemplate(conn.conectar());
     }
     
         @RequestMapping("lista.htm")
    public ModelAndView usuarios(){
        ModelAndView mav=new ModelAndView();
        String sql= "select u.*, (select count(*) from usuario WHERE idusuario = u.idusuario) as inscritos FROM usuario as u ";
        List datos=this.jdbcT.queryForList(sql);
        mav.addObject("datos", datos);
        mav.setViewName("lista");
      
        return mav;
    }
}
