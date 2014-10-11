package controle;

import java.util.ArrayList;
import modelo.Paciente;

/**
 *
 * @author Felippe
 */
public class GerenciarPaciente {
    
    private ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
    
    
    

    
    
    public ArrayList<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public void setListaPaciente(ArrayList<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
    }
    
    void inserirPacientes(Paciente p){
        
        listaPaciente.add(p);
        
    }
    
    void listarPacientes(){
    
    }
    
    void buscarPacientes(){
    
    }
    
    void alterarPacientes(){
    
    }
    
    void excluirPacientes(){
    
    }
    
}
