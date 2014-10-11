package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Felippe
 */
@Entity
public class Admin extends Pessoa implements Serializable{

    @Column
    private String usuario;
    @Column
    private String senha;
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
       this.usuario = usuario;
    }
   
}
