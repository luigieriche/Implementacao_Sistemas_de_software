/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Felippe
 */
public class GeradorDeBanco {
    public static void main(String[] args) {
        Properties properties = new Properties();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClinicaProjectPU", properties);
        factory.createEntityManager();
        factory.close();  
    } 
}
