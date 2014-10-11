package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Felippe
 */
@Entity
public class Medico extends Pessoa {
    
    @Column
    private String usuario;
    @Column
    private String senha;
    @Column
    private String crm;
    
    @OneToMany(cascade={CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE}
            ,mappedBy="medico")
    private List<Consulta> consultas;

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
