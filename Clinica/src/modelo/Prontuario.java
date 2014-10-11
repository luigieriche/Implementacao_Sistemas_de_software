package modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Felippe
 */
@Entity
@Table(schema = "clinica")
public class Prontuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int prontuarioId;
    
    @ManyToOne(cascade=CascadeType.REFRESH)
    private Paciente pacienteProntuario;

    public int getProntuarioId() {
        return prontuarioId;
    }

    public Paciente getPaciente() {
        return pacienteProntuario;
    }

    public void setPaciente(Paciente paciente) {
        this.pacienteProntuario = paciente;
    }
}
