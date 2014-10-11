
package view;

//import BancoDeDados.DAOHibernateUtil;
import Controle.Usuario;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modeloDAO.DAOHibernateUtil;
import org.hibernate.Session;


public class Login extends javax.swing.JFrame {  
    
    
    public Login() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagem = new javax.swing.JOptionPane();
        loginText = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        passwordText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFocusCycleRoot(false);
        setName("login"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        loginText.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        loginText.setText("teste");
        loginText.setName("textUsuario"); // NOI18N
        loginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextActionPerformed(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        okButton.setText("Login");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        passwordText.setText("123");

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\dodo\\logomenor.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginText)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("frmLogin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextActionPerformed
        
    }//GEN-LAST:event_loginTextActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        boolean encontrou = false;
        Usuario usuario = new Usuario();
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        List<Usuario> lista = (List<Usuario>)session.createQuery("From Usuario").list();
        
        for(Usuario u : lista){
                if ((loginText.getText().equals(u.getUsuarioUser())) && passwordText.getText().equals(u.getUsuarioPassword()) ){
                   encontrou = true;
                }
        }
        
        if (encontrou == true){
            this.dispose();
            TelaPrincipalAdmin TelaInicial = new TelaPrincipalAdmin();
            TelaInicial.setVisible(true);
        }
        /*else
            mensagem.showMessageDialog(NULL, "O Usuáiro ou Senha está incorreto", "Inane error",JOptionPane.ERROR_MESSAGE);*/
               
       
        session.getTransaction().commit();
        
      /*  for(Usuario u : lista){
            if ((loginText.getText().equals(u.getUsuarioUser())) && (u.getUsuarioPassword()== passwordText.getText())){
                this.dispose();
                TelaPrincipalAdmin TelaInicial = new TelaPrincipalAdmin();
                TelaInicial.setVisible(true);
            }
         
         
        } */ 
        
        /* Usuario usuario = new Usuario();
        usuario.setUsuarioUser("Agnaldo");
        usuario.setUsuarioPassword("12345");
        
        Session session = DAOHibernateUtil.getSessionFactory().getCurrentSession();
        
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();
        
        session.close();*/
        
    }//GEN-LAST:event_okButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         this.setLocationRelativeTo(null);
       
    }//GEN-LAST:event_formComponentShown


    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
                
               
            }
        });
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField loginText;
    private javax.swing.JOptionPane mensagem;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField passwordText;
    // End of variables declaration//GEN-END:variables

}
