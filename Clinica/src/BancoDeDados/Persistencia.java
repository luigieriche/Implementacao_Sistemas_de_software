package BancoDeDados;

import org.hibernate.*;

public abstract class Persistencia {
   
    public boolean salvar(Object obj) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.save(obj);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de inserção, Mensagem: " + e.getMessage());
            }
        }
        return false;
    }
    
    public boolean atualizar(Object obj) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.update(obj);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir. Erro: "
                    + e.getMessage());
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de inserção, Mensagem: "
                        + e.getMessage());
            }
        }
        return false;
    }

    public boolean excluir(Object obj) {
        Session sessao = null;
        try {
            sessao = HibernateUtil.getSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.delete(obj);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir. Erro: "
                    + e.getMessage());
        } finally {
            try {
                sessao.close();
                return true;
            } catch (Throwable e) {

                System.out.println("Erro ao fechar operação de exclusão. Mensagem: "
                        + e.getMessage());
            }
        }
        return false;
    }
    
    public abstract Object listar();
    
    public Object buscarPorChave(String classe, String PrimaryKey) {
        Object obj = null;
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        try {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from "+classe+" where login :parametro");
            consulta.setString("parametro", PrimaryKey);
            obj = consulta.uniqueResult();
            transacao.commit();
            return obj;
        } catch (HibernateException e) {
            System.out.println("Não foi possível buscar consulta. Erro: "
                    + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de buscar. Mensagem: "
                        + e.getMessage());
            }
        }
        return obj;
    }
}
