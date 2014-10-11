package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 *
 * @author Felippe
 */
@Embeddable
public class DadosAdicionais implements Serializable {
    
    @Transient
    private Paciente paciente;
    @Column
    private Boolean fuma;
    @Column
    private Boolean bebe;
    @Column
    private Boolean colesterol;
    @Column
    private Boolean diabete;
    @Column
    private Boolean doencaCardiaca;
    @Column
    private String cirurgias;
    @Column
    private String alergias;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Boolean getFuma() {
        return fuma;
    }

    public void setFuma(Boolean fuma) {
        this.fuma = fuma;
    }

    public Boolean getBebe() {
        return bebe;
    }

    public void setBebe(Boolean bebe) {
        this.bebe = bebe;
    }

    public Boolean getColesterol() {
        return colesterol;
    }

    public void setColesterol(Boolean colesterol) {
        this.colesterol = colesterol;
    }

    public Boolean getDiabete() {
        return diabete;
    }

    public void setDiabete(Boolean diabete) {
        this.diabete = diabete;
    }

    public Boolean getDoencaCardiaca() {
        return doencaCardiaca;
    }

    public void setDoencaCardiaca(Boolean doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }

    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}