package Controle;
// Generated 26/09/2014 13:57:54 by Hibernate Tools 3.6.0



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private String usuarioUser;
     private String usuarioPassword;

    public Usuario() {
    }

    public Usuario(String usuarioUser, String usuarioPassword) {
       this.usuarioUser = usuarioUser;
       this.usuarioPassword = usuarioPassword;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public String getUsuarioUser() {
        return this.usuarioUser;
    }
    
    public void setUsuarioUser(String usuarioUser) {
        this.usuarioUser = usuarioUser;
    }
    public String getUsuarioPassword() {
        return this.usuarioPassword;
    }
    
    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }




}


