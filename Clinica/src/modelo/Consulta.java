package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Entity;

/**
 *
 * @author Felippe
 */
@Entity
@Table(schema = "clinica")
public class Consulta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int consultaId;

    @ManyToOne(cascade=CascadeType.REFRESH)
    private Medico medico;
    
    @ManyToOne(cascade=CascadeType.REFRESH)
    private Paciente pacienteConsulta;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    
    @Column
    private boolean reconsulta;

    public int getConsultaId() {
        return consultaId;
    }
 
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return pacienteConsulta;
    }

    public void setPaciente(Paciente paciente) {
        this.pacienteConsulta = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isReconsulta() {
        return reconsulta;
    }

    public void setReconsulta(boolean reconsulta) {
        this.reconsulta = reconsulta;
    }
    
}
