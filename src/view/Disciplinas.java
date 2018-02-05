package view;

import Classes.Disciplina;
import Classes.Nota;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Disciplinas extends javax.swing.JInternalFrame {

  public Disciplinas() {
    initComponents();
//    DefaultTableModel modeloDisciplina = (DefaultTableModel) Tabela.getModel();;
//    ArrayList<Nota> medias = new ArrayList<Nota>();
//    Disciplina d = new Disciplina(NomeDisciplina.getText(), NomeProfessor.getText(), medias);
//    Object[] dados = {NomeDisciplina.getText(), NomeProfessor.getText(), medias.get(0).getNota(), medias.get(1).getNota(), medias.get(2).getNota(), medias.get(3).getNota()};
//    modeloDisciplina.addRow(dados);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane2 = new javax.swing.JScrollPane();
    jPanel1 = new javax.swing.JPanel();
    Materias = new javax.swing.JScrollPane();
    Tabela = new javax.swing.JTable();
    Painel = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    NomeDisciplina = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel2 = new javax.swing.JLabel();
    NomeProfessor = new javax.swing.JTextField();
    jSeparator2 = new javax.swing.JSeparator();
    jScrollPane1 = new javax.swing.JScrollPane();
    Notas = new javax.swing.JTable();
    jLabel3 = new javax.swing.JLabel();
    Nota = new javax.swing.JFormattedTextField();
    jSeparator3 = new javax.swing.JSeparator();
    jLabel4 = new javax.swing.JLabel();
    Bimestre = new javax.swing.JFormattedTextField();
    AddNota = new javax.swing.JButton();
    AddDisciplina = new javax.swing.JButton();
    Atualizar = new javax.swing.JButton();
    Excluir = new javax.swing.JButton();
    close = new javax.swing.JButton();

    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Materias");
    setPreferredSize(new java.awt.Dimension(650, 610));

    Tabela.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Nome", "Professor", "Nota 1° Bim", "Nota 2° Bim", "Nota 3° Bim", "Nota 4° Bim"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    Materias.setViewportView(Tabela);

    Painel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adicionar Disciplina"));

    jLabel1.setText("Nome da Disciplina: ");

    NomeDisciplina.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NomeDisciplinaActionPerformed(evt);
      }
    });

    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

    jLabel2.setText("Professor: ");

    NomeProfessor.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NomeProfessorActionPerformed(evt);
      }
    });

    Notas.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Nota", "Bimentre"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(Notas);

    jLabel3.setText("Média:");

    Nota.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
    Nota.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NotaActionPerformed(evt);
      }
    });
    Nota.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        NotaKeyPressed(evt);
      }
    });

    jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

    jLabel4.setText("Bimestre:");

    Bimestre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
    Bimestre.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        BimestreKeyPressed(evt);
      }
    });

    AddNota.setText("Adicionar Nota");
    AddNota.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AddNotaActionPerformed(evt);
      }
    });

    AddDisciplina.setText("Adicionar Disciplina");
    AddDisciplina.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AddDisciplinaActionPerformed(evt);
      }
    });

    Atualizar.setText("Atualizar Nota");
    Atualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AtualizarActionPerformed(evt);
      }
    });

    Excluir.setText("Excluir Nota");
    Excluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ExcluirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
    Painel.setLayout(PainelLayout);
    PainelLayout.setHorizontalGroup(
      PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PainelLayout.createSequentialGroup()
        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(PainelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddDisciplina)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(PainelLayout.createSequentialGroup()
            .addContainerGap(22, Short.MAX_VALUE)
            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jSeparator2)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(NomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(NomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nota, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane1))))
        .addContainerGap(24, Short.MAX_VALUE))
      .addGroup(PainelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(AddNota, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    PainelLayout.setVerticalGroup(
      PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PainelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(NomeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
          .addComponent(jSeparator1)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(NomeProfessor))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(Bimestre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
          .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(Nota, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(AddNota, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
          .addComponent(Atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(AddDisciplina)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    close.setText("Fechar");
    close.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        closeActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(Materias))
            .addContainerGap(15, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(14, Short.MAX_VALUE)
        .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(Materias, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    jScrollPane2.setViewportView(jPanel1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane2)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
    this.dispose();
  }//GEN-LAST:event_closeActionPerformed

  private void AddDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDisciplinaActionPerformed
    DefaultTableModel modeloDisciplina = (DefaultTableModel) Tabela.getModel();
    DefaultTableModel modeloNota = (DefaultTableModel) Notas.getModel();
    ArrayList<Nota> medias = new ArrayList<Nota>();
    for(int i=0;i<Notas.getRowCount();i++){
      if(Notas.getModel().getValueAt(i, 0).getClass() == "".getClass()){
        medias.add(new Nota(Integer.parseInt((String) Notas.getModel().getValueAt(i, 1)), Integer.parseInt((String) Notas.getModel().getValueAt(i, 0))));
      }else{
        medias.add(new Nota(Integer.parseInt((String) Notas.getModel().getValueAt(i, 1)), (int)(long) Notas.getModel().getValueAt(i, 0)));
      }
    }
    Disciplina d = new Disciplina(NomeDisciplina.getText(), NomeProfessor.getText(), medias);
    Object[] dados = {NomeDisciplina.getText(), NomeProfessor.getText(), medias.get(0).getNota(), medias.get(1).getNota(), medias.get(2).getNota(), medias.get(3).getNota()};
    modeloDisciplina.addRow(dados);
  }//GEN-LAST:event_AddDisciplinaActionPerformed

  private void AddNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNotaActionPerformed
    DefaultTableModel modeloNota = (DefaultTableModel) Notas.getModel();
    Object[] dados = {Nota.getValue(), Bimestre.getText()};
    modeloNota.addRow(dados);
  }//GEN-LAST:event_AddNotaActionPerformed

  private void NotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_NotaActionPerformed

  private void NomeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeDisciplinaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_NomeDisciplinaActionPerformed

  private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
    if(Notas.getSelectedRow() != -1){
      Notas.setValueAt(Nota.getText(), Notas.getSelectedRow(), 0);
      Notas.setValueAt(Bimestre.getText(), Notas.getSelectedRow(), 1);
    }
  }//GEN-LAST:event_AtualizarActionPerformed

  private void NomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeProfessorActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_NomeProfessorActionPerformed

  private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
    if(Notas.getSelectedRow() != -1){
      DefaultTableModel modeloNota = (DefaultTableModel) Notas.getModel();
      modeloNota.removeRow(Notas.getSelectedRow());
    }
  }//GEN-LAST:event_ExcluirActionPerformed

  private void BimestreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BimestreKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      DefaultTableModel modeloDisciplina = (DefaultTableModel) Tabela.getModel();
      DefaultTableModel modeloNota = (DefaultTableModel) Notas.getModel();
      ArrayList<Nota> medias = new ArrayList<Nota>();
      for(int i=0;i<Notas.getRowCount();i++){
        if(Notas.getModel().getValueAt(i, 0).getClass() == "".getClass()){
          medias.add(new Nota(Integer.parseInt((String) Notas.getModel().getValueAt(i, 1)), Integer.parseInt((String) Notas.getModel().getValueAt(i, 0))));
        }else{
          medias.add(new Nota(Integer.parseInt((String) Notas.getModel().getValueAt(i, 1)), (int)(long) Notas.getModel().getValueAt(i, 0)));
        }
      }
      Disciplina d = new Disciplina(NomeDisciplina.getText(), NomeProfessor.getText(), medias);
      Object[] dados = {NomeDisciplina.getText(), NomeProfessor.getText(), medias.get(0).getNota(), medias.get(1).getNota(), medias.get(2).getNota(), medias.get(3).getNota()};
      modeloDisciplina.addRow(dados);
    }
  }//GEN-LAST:event_BimestreKeyPressed

  private void NotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NotaKeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
      DefaultTableModel modeloDisciplina = (DefaultTableModel) Tabela.getModel();
      DefaultTableModel modeloNota = (DefaultTableModel) Notas.getModel();
      ArrayList<Nota> medias = new ArrayList<Nota>();
      for(int i=0;i<Notas.getRowCount();i++){
        if(Notas.getModel().getValueAt(i, 0).getClass() == "".getClass()){
          medias.add(new Nota(Integer.parseInt((String) Notas.getModel().getValueAt(i, 1)), Integer.parseInt((String) Notas.getModel().getValueAt(i, 0))));
        }else{
          medias.add(new Nota(Integer.parseInt((String) Notas.getModel().getValueAt(i, 1)), (int)(long) Notas.getModel().getValueAt(i, 0)));
        }
      }
      Disciplina d = new Disciplina(NomeDisciplina.getText(), NomeProfessor.getText(), medias);
      Object[] dados = {NomeDisciplina.getText(), NomeProfessor.getText(), medias.get(0).getNota(), medias.get(1).getNota(), medias.get(2).getNota(), medias.get(3).getNota()};
      modeloDisciplina.addRow(dados);
    }
  }//GEN-LAST:event_NotaKeyPressed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton AddDisciplina;
  private javax.swing.JButton AddNota;
  private javax.swing.JButton Atualizar;
  private javax.swing.JFormattedTextField Bimestre;
  private javax.swing.JButton Excluir;
  private javax.swing.JScrollPane Materias;
  private javax.swing.JTextField NomeDisciplina;
  private javax.swing.JTextField NomeProfessor;
  private javax.swing.JFormattedTextField Nota;
  private javax.swing.JTable Notas;
  private javax.swing.JPanel Painel;
  private javax.swing.JTable Tabela;
  private javax.swing.JButton close;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  // End of variables declaration//GEN-END:variables
}
