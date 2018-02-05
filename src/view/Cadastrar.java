package view;

import Classes.Dados;
import Classes.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cadastrar extends javax.swing.JInternalFrame {
  public String login;
  public String senha;
  public Cadastrar() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Password = new javax.swing.JPasswordField();
    Ok = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    UserName = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    PasswordConfirm = new javax.swing.JPasswordField();

    setClosable(true);
    setTitle("Cadastrar");

    Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    Ok.setText("Ok");
    Ok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Ok.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        OkActionPerformed(evt);
      }
    });

    jLabel1.setText("User Name: ");

    jLabel2.setText("Senha: ");

    UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    UserName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        UserNameActionPerformed(evt);
      }
    });

    jLabel3.setText("Confirmar Senha: ");
    jLabel3.setMaximumSize(new java.awt.Dimension(37, 14));
    jLabel3.setMinimumSize(new java.awt.Dimension(37, 14));
    jLabel3.setPreferredSize(new java.awt.Dimension(37, 14));

    PasswordConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(111, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(UserName)
          .addComponent(Password)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
            .addComponent(Ok, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
          .addComponent(PasswordConfirm))
        .addContainerGap(144, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, Short.MAX_VALUE)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(PasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, Short.MAX_VALUE)
        .addComponent(Ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
    if(Password.getText().equals(PasswordConfirm.getText())){
      
      login = UserName.getText();
      senha = Password.getText();
      
      Dados dados = new Dados("C:\\Users\\Admin\\Documents\\ivan_luis\\ProjetosGitHub\\Boletim\\teste.db");
      Usuario usuario = new Usuario(login, senha);
      dados.addUsuario(usuario);
      
      this.dispose();
    }
    
  }//GEN-LAST:event_OkActionPerformed

  private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_UserNameActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Ok;
  private javax.swing.JPasswordField Password;
  private javax.swing.JPasswordField PasswordConfirm;
  private javax.swing.JTextField UserName;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  // End of variables declaration//GEN-END:variables
}
