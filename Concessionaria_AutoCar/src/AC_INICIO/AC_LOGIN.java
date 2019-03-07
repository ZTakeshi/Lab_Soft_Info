/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC_INICIO;

import AC_DAO.AC_DAOLOGIN;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class AC_LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form AC_LOGIN
     */
    public AC_LOGIN() {
        initComponents();
        setTitle("Login");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 530);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_fundo = new javax.swing.JPanel();
        painel_logar = new javax.swing.JPanel();
        lbl_senha = new javax.swing.JLabel();
        lbl_login1 = new javax.swing.JLabel();
        txt_logar = new javax.swing.JTextField();
        pass_senha = new javax.swing.JPasswordField();
        combo_catg = new javax.swing.JComboBox();
        btn_sair = new javax.swing.JButton();
        btn_logar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_fundo.setBackground(new java.awt.Color(70, 113, 197));
        painel_fundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        painel_fundo.setLayout(null);

        painel_logar.setBackground(new java.awt.Color(255, 255, 255));
        painel_logar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painel_logar.setLayout(null);

        lbl_senha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(0, 0, 0));
        lbl_senha.setText("SENHA :");
        painel_logar.add(lbl_senha);
        lbl_senha.setBounds(10, 200, 60, 10);

        lbl_login1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_login1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_login1.setText("LOGIN :");
        painel_logar.add(lbl_login1);
        lbl_login1.setBounds(10, 140, 60, 10);

        txt_logar.setBackground(new java.awt.Color(255, 255, 255));
        txt_logar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_logar.setForeground(new java.awt.Color(0, 0, 0));
        txt_logar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        painel_logar.add(txt_logar);
        txt_logar.setBounds(70, 130, 200, 30);

        pass_senha.setBackground(new java.awt.Color(255, 255, 255));
        pass_senha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pass_senha.setForeground(new java.awt.Color(0, 0, 0));
        pass_senha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        painel_logar.add(pass_senha);
        pass_senha.setBounds(70, 190, 200, 30);

        combo_catg.setBackground(new java.awt.Color(255, 255, 255));
        combo_catg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combo_catg.setForeground(new java.awt.Color(0, 0, 0));
        combo_catg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerente", "Funcionário" }));
        combo_catg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        combo_catg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_catgActionPerformed(evt);
            }
        });
        painel_logar.add(combo_catg);
        combo_catg.setBounds(10, 70, 260, 27);

        btn_sair.setBackground(new java.awt.Color(255, 51, 51));
        btn_sair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(0, 0, 0));
        btn_sair.setText("SAIR");
        btn_sair.setBorder(new javax.swing.border.MatteBorder(null));
        btn_sair.setOpaque(false);
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        painel_logar.add(btn_sair);
        btn_sair.setBounds(170, 250, 80, 40);

        btn_logar.setBackground(new java.awt.Color(51, 255, 51));
        btn_logar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_logar.setForeground(new java.awt.Color(0, 0, 0));
        btn_logar.setText("LOGAR");
        btn_logar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_logar.setOpaque(false);
        btn_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logarActionPerformed(evt);
            }
        });
        painel_logar.add(btn_logar);
        btn_logar.setBounds(30, 250, 80, 40);

        painel_fundo.add(painel_logar);
        painel_logar.setBounds(60, 80, 280, 330);

        jLabel1.setText("Desenvolvido por JJEL");
        painel_fundo.add(jLabel1);
        jLabel1.setBounds(140, 470, 130, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_catgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_catgActionPerformed
        
    }//GEN-LAST:event_combo_catgActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logarActionPerformed
        
        AC_DAOLOGIN dao = new AC_DAOLOGIN();
        String catg = ((String)combo_catg.getSelectedItem());
        
       if(dao.VerificarLogin(txt_logar.getText(), pass_senha.getText())){
         
            switch (catg) {
                case "Gerente":
                    JOptionPane.showMessageDialog(null, "Seja bem vindo, gerente!");
                    new AC_PGERENTE().setVisible(true);
                    dispose();
                    break;
                case "Funcionário":
                    JOptionPane.showMessageDialog(null, "Seja bem vindo, Funcionário!");
                    new AC_PFUNCIONARIO().setVisible(true);
                    dispose();
                    break;
            }
       }else{
           
           JOptionPane.showMessageDialog(null, "Login ou/e Senha incorreto!");
       
       }
        
    }//GEN-LAST:event_btn_logarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AC_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AC_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AC_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AC_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AC_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JComboBox combo_catg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_login1;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JPanel painel_fundo;
    private javax.swing.JPanel painel_logar;
    private javax.swing.JPasswordField pass_senha;
    private javax.swing.JTextField txt_logar;
    // End of variables declaration//GEN-END:variables
}
