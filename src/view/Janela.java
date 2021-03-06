package view;

import Classes.Dados;
import Classes.Usuario;

public class Janela extends javax.swing.JFrame {
  
  private Usuario User;
  private int UserId;
  private final Dados dados = new Dados();

  public Janela() {
    initComponents();
    Desktop.setVisible(false);
    BarraDeMenu.setVisible(false);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Desktop = new javax.swing.JDesktopPane();
    jPanel1 = new javax.swing.JPanel();
    LoginButton = new javax.swing.JButton();
    Registrar = new javax.swing.JButton();
    BarraDeMenu = new javax.swing.JMenuBar();
    Opcoes = new javax.swing.JMenu();
    CadastrarUsuario = new javax.swing.JMenuItem();
    TrocarUsuario = new javax.swing.JMenuItem();
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
    setSize(new java.awt.Dimension(1000, 900));

    Desktop.setBackground(new java.awt.Color(51, 0, 204));
    Desktop.setFocusable(false);
    Desktop.setVerifyInputWhenFocusTarget(false);

    javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
    Desktop.setLayout(DesktopLayout);
    DesktopLayout.setHorizontalGroup(
      DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 700, Short.MAX_VALUE)
    );
    DesktopLayout.setVerticalGroup(
      DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 579, Short.MAX_VALUE)
    );

    LoginButton.setText("Login");
    LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    LoginButton.setMargin(new java.awt.Insets(20, 14, 20, 50));
    LoginButton.setPreferredSize(new java.awt.Dimension(100, 50));
    LoginButton.setRequestFocusEnabled(false);
    LoginButton.setRolloverEnabled(false);
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

    Registrar.setText("Registrar-se");
    Registrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        RegistrarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(25, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(LoginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(25, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(50, Short.MAX_VALUE)
        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(50, Short.MAX_VALUE))
    );

    Opcoes.setText("Opções");

    CadastrarUsuario.setText("Cadastra Usuario");
    CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CadastrarUsuarioActionPerformed(evt);
      }
    });
    Opcoes.add(CadastrarUsuario);

    TrocarUsuario.setText("Trocar Usuario");
    TrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TrocarUsuarioActionPerformed(evt);
      }
    });
    Opcoes.add(TrocarUsuario);

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
        .addGroup(layout.createSequentialGroup()
          .addGap(240, 240, 240)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGap(241, 241, 241)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(Desktop)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(183, 183, 183)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGap(176, 176, 176)))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarUsuarioActionPerformed
    Cadastrar cadastro = new Cadastrar(this, true);
    cadastro.setLocationRelativeTo(null);
    cadastro.setVisible(true);

    if(cadastro.ok){
      this.User = cadastro.User;
      this.UserId = cadastro.UserId;

      Desktop.setVisible(true);
      BarraDeMenu.setVisible(true);

      LoginButton.setVisible(false);
      Registrar.setVisible(false);
    }
  }//GEN-LAST:event_CadastrarUsuarioActionPerformed

  private void EditarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDadosActionPerformed
    DadosUser DadosUsuario = new DadosUser(dados.Carregar().get(this.UserId),this.UserId);
    Desktop.add(DadosUsuario);
    DadosUsuario.setVisible(true);
    this.User = DadosUsuario.User;
  }//GEN-LAST:event_EditarDadosActionPerformed

  private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
    Login login = new Login(this,true);
    login.setLocationRelativeTo(null);
    login.setVisible(true);
    
    if(login.ok){
      this.User = login.User;
      this.UserId = login.UserId;
      
      Desktop.setVisible(true);
      BarraDeMenu.setVisible(true);
      
      LoginButton.setVisible(false);
      Registrar.setVisible(false);
    }
  }//GEN-LAST:event_LoginButtonActionPerformed

  private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
    this.dispose();
  }//GEN-LAST:event_SairActionPerformed

  private void LoginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginButtonKeyPressed
    Login login = new Login(this,true);
    login.setVisible(true);
    
    if(login.ok){
      this.User = login.User;
      this.UserId = login.UserId;
      
      Desktop.setVisible(true);
      BarraDeMenu.setVisible(true);
      
      LoginButton.setVisible(false);
      Registrar.setVisible(false);
    }
  }//GEN-LAST:event_LoginButtonKeyPressed

  private void EditarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarMateriasActionPerformed
    Disciplinas disciplinas = new Disciplinas(dados.Carregar().get(this.UserId), this.UserId);
    Desktop.add(disciplinas);
    disciplinas.setVisible(true);
  }//GEN-LAST:event_EditarMateriasActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
      Cadastrar cadastro = new Cadastrar(this, true);
      cadastro.setLocationRelativeTo(null);
      cadastro.setVisible(true);

      if(cadastro.ok){
        this.User = cadastro.User;
        this.UserId = cadastro.UserId;

        Desktop.setVisible(true);
        BarraDeMenu.setVisible(true);

        LoginButton.setVisible(false);
        Registrar.setVisible(false);
      }
    }//GEN-LAST:event_RegistrarActionPerformed

  private void TrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrocarUsuarioActionPerformed
    
    Desktop.setVisible(false);
    BarraDeMenu.setVisible(false);
      
    LoginButton.setVisible(true);
    Registrar.setVisible(true);
    
    Login login = new Login(this,true);
    login.setLocationRelativeTo(null);
    login.setVisible(true);
    
    if(login.ok){
      this.User = login.User;
      this.UserId = login.UserId;
      
      Desktop.setVisible(true);
      BarraDeMenu.setVisible(true);
      
      LoginButton.setVisible(false);
      Registrar.setVisible(false);
    }
  }//GEN-LAST:event_TrocarUsuarioActionPerformed

  public static void main(String args[]) {
        
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
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
  private javax.swing.JButton Registrar;
  private javax.swing.JMenuItem Sair;
  private javax.swing.JMenuItem TrocarUsuario;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables
}
