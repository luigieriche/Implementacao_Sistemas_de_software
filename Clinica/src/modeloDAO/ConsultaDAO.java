/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import BancoDeDados.HibernateUtil;
import BancoDeDados.Persistencia;
import java.util.ArrayList;
import java.util.List;
import modelo.Consulta;
import org.hibernate.Session;

/**
 *
 * @author Felippe
 */
public class ConsultaDAO extends Persistencia{
    
    public Boolean cadastrar(Consulta consulta){
        return super.salvar(consulta);
    }
    
    public Boolean alterar(Consulta consulta){
        return super.atualizar(consulta);
    }
    
    public Boolean excluir(Consulta consulta){
        return super.excluir(consulta);
    }
    
    @Override
    public ArrayList<Consulta> listar() {
        Session sessao = HibernateUtil.getSession();
        List<Consulta> consultas = sessao.createSQLQuery("SELECT * FROM Consulta").list();
        sessao.close();
        return (ArrayList) consultas;
    }
}
