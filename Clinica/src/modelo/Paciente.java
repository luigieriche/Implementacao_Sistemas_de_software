package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import javax.persistence.Entity;

/**
 *
 * @author Felippe
 */
@Entity
public class Paciente extends Pessoa {
   
    @OneToMany(cascade={CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE}
            , mappedBy="pacienteProntuario")
    private List<Prontuario> prontuarios;
    
    @Column
    private String convenio;
    
    @OneToMany(cascade={CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE}
            , mappedBy="pacienteConsulta")
    private List<Consulta> consultas;
    
    @Embedded
    private DadosAdicionais dadosAdicionais;

    public DadosAdicionais getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(DadosAdicionais dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }

    public List<Prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
}