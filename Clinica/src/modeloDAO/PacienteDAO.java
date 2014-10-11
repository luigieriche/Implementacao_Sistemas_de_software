package modeloDAO;

import BancoDeDados.Persistencia;
import modelo.Paciente;

/**
 *
 * @author Felippe
 */
public class PacienteDAO extends Persistencia {
    
    public boolean salvar(Paciente paciente){
        return super.salvar(paciente);
    }

    @Override
    public Object listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}