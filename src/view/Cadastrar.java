package view;

public class Cadastrar extends javax.swing.JInternalFrame {

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
    jPasswordField1 = new javax.swing.JPasswordField();

    setClosable(true);
    setTitle("Cadastrar");

    Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    Ok.setText("Ok");
    Ok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel1.setText("User Name: ");

    jLabel2.setText("Senha: ");

    UserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    jLabel3.setText("Confirmar Senha: ");
    jLabel3.setMaximumSize(new java.awt.Dimension(37, 14));
    jLabel3.setMinimumSize(new java.awt.Dimension(37, 14));
    jLabel3.setPreferredSize(new java.awt.Dimension(37, 14));

    jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(111, 111, 111)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(UserName)
          .addComponent(Password)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGap(57, 57, 57)
            .addComponent(Ok))
          .addComponent(jPasswordField1))
        .addContainerGap(125, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(Ok)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton Ok;
  private javax.swing.JPasswordField Password;
  private javax.swing.JTextField UserName;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPasswordField jPasswordField1;
  // End of variables declaration//GEN-END:variables
}
