package BancoDeDados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class HibernateUtil {

    public static final Session session;
    static {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ClinicaProjectPU");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            session = (Session) entityManager.getDelegate();
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        return session;
    }

}
