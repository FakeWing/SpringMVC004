/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.vo;

/**
 *
 * @author hells
 */
public class UsuarioVo {
    
    private int idusuario;
    private String nombre;
    private String apellido;
    private String login;
    private String clave;
    private int perfil;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public UsuarioVo() {
    }

    public UsuarioVo(String nombre, String apellido, String login, String clave, int perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.clave = clave;
        this.perfil = perfil;
    }
    
    
   
    
}
