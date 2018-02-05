package view;

import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {
  
  public Janela() {
    initComponents();
    Desktop.setVisible(false);
    BarraDeMenu.setVisible(false);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Desktop = new javax.swing.JDesktopPane();
    LoginButton = new javax.swing.JButton();
    BarraDeMenu = new javax.swing.JMenuBar();
    Opcoes = new javax.swing.JMenu();
    CadastrarUsuario = new javax.swing.JMenuItem();
    Sair = new javax.swing.JMenuItem();
    Editar = new javax.swing.JMenu();
    EditarDados = new javax.swing.JMenuItem();
    EditarMaterias = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Boletim");
    setAutoRequestFocus(false);
    setBackground(new java.awt.Color(204, 204, 204));
    setLocationByPlatform(true);
    setMaximumSize(new java.awt.Dimension(1800, 1800));
    setMinimumSize(new java.awt.Dimension(700, 600));
    setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
    setPreferredSize(new java.awt.Dimension(700, 600));
    setSize(new java.awt.Dimension(700, 600));

    Desktop.setBackground(new java.awt.Color(51, 0, 204));

    javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
    Desktop.setLayout(DesktopLayout);
    DesktopLayout.setHorizontalGroup(
      DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 366, Short.MAX_VALUE)
    );
    DesktopLayout.setVerticalGroup(
      DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 323, Short.MAX_VALUE)
    );

    LoginButton.setText("Login");
    LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    LoginButton.setIconTextGap(1);
    LoginButton.setMargin(new java.awt.Insets(20, 14, 20, 50));
    LoginButton.setPreferredSize(new java.awt.Dimension(100, 50));
    LoginButton.setRequestFocusEnabled(false);
    LoginButton.setRolloverEnabled(false);
    LoginButton.setVerifyInputWhenFocusTarget(false);
    LoginButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        LoginButtonActionPerformed(evt);
      }
    });
    LoginButton.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        LoginButtonKeyPressed(evt);
      }
    });

    Opcoes.setText("Opções");

    CadastrarUsuario.setText("Cadastra Usuario");
    CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CadastrarUsuarioActionPerformed(evt);
      }
    });
    Opcoes.add(CadastrarUsuario);

    Sair.setText("Sair");
    Sair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SairActionPerformed(evt);
      }
    });
    Opcoes.add(Sair);

    BarraDeMenu.add(Opcoes);

    Editar.setText("Editar");

    EditarDados.setText("Dados");
    EditarDados.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        EditarDadosActionPerformed(evt);
      }
    });
    Editar.add(EditarDados);

    EditarMaterias.setText("Materias");
    EditarMaterias.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        EditarMateriasActionPerformed(evt);
      }
    });
    Editar.add(EditarMaterias);

    BarraDeMenu.add(Editar);

    setJMenuBar(BarraDeMenu);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Desktop)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addContainerGap(131, Short.MAX_VALUE)
          .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
          .addContainerGap(132, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Desktop)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addContainerGap(135, Short.MAX_VALUE)
          .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
          .addContainerGap(137, Short.MAX_VALUE)))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarUsuarioActionPerformed
    Cadastrar TelaCadastro = new Cadastrar();
    Desktop.add(TelaCadastro);
    TelaCadastro.setVisible(true);
  }//GEN-LAST:event_CadastrarUsuarioActionPerformed

  private void EditarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDadosActionPerformed
    DadosUser DadosUsuario = new DadosUser();
    Desktop.add(DadosUsuario);
    DadosUsuario.setVisible(true);
  }//GEN-LAST:event_EditarDadosActionPerformed

  private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    Login login = new Login(this,true);
    login.setVisible(true);
    
    if(login.ok){
      Desktop.setVisible(true);
      BarraDeMenu.setVisible(true);
      LoginButton.setVisible(false);
    }
  }//GEN-LAST:event_LoginButtonActionPerformed

  private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
    this.dispose();
  }//GEN-LAST:event_SairActionPerformed

  private void LoginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginButtonKeyPressed
    Login login = new Login(this,true);
    login.setVisible(true);
    
    if(login.ok){
      Desktop.setVisible(true);
      BarraDeMenu.setVisible(true);
      LoginButton.setVisible(false);
    }
  }//GEN-LAST:event_LoginButtonKeyPressed

  private void EditarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarMateriasActionPerformed
    Disciplinas disciplinas = new Disciplinas();
    Desktop.add(disciplinas);
    disciplinas.setVisible(true);
  }//GEN-LAST:event_EditarMateriasActionPerformed

  public static void main(String args[]) {
        
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Janela().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar BarraDeMenu;
  private javax.swing.JMenuItem CadastrarUsuario;
  private javax.swing.JDesktopPane Desktop;
  private javax.swing.JMenu Editar;
  private javax.swing.JMenuItem EditarDados;
  private javax.swing.JMenuItem EditarMaterias;
  private javax.swing.JButton LoginButton;
  private javax.swing.JMenu Opcoes;
  private javax.swing.JMenuItem Sair;
  // End of variables declaration//GEN-END:variables
}