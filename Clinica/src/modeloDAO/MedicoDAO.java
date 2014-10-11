/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import BancoDeDados.HibernateUtil;
import BancoDeDados.Persistencia;
import java.util.ArrayList;
import java.util.List;
import modelo.Medico;
import org.hibernate.Session;

/**
 *
 * @author Felippe
 */
public class MedicoDAO extends Persistencia{
    
    public Medico buscaMedicoPorUsuario(String usuario) {
        Session sessao = HibernateUtil.getSession();
        Medico medico = (Medico) sessao.createQuery("SELECT * FROM Medico WHERE usuario = ?").
                setEntity(0, usuario).uniqueResult();
        sessao.close();
        return medico;
    }
    
    public Boolean cadastrar(Medico medico){
        return super.salvar(medico);
    }
    
    public Boolean alterar(Medico medico){
        return super.atualizar(medico);
    }
    
    public Boolean excluir(Medico medico){
        return super.excluir(medico);
    }
    
    @Override
    public ArrayList<Medico> listar() {
        Session sessao = HibernateUtil.getSession();
        List<Medico> medicos = sessao.createSQLQuery("SELECT * FROM Medico").list();
        sessao.close();
        return (ArrayList) medicos;
    }
    
}
