package view;

import Classes.Pessoa;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DadosUser extends javax.swing.JInternalFrame {

  public String FristName;
  public String LastName;
  public String Nascimento;
  public String CPF;
  public String Sexo;
  public String Estado;
  public String Cidade;
  public String Bairro;
  public String Rua;
  public String NumCasa;
  
  public DadosUser() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    Nome = new javax.swing.JPanel();
    FName9 = new javax.swing.JLabel();
    LName9 = new javax.swing.JLabel();
    FristNameText8 = new javax.swing.JTextField();
    LastNameText8 = new javax.swing.JTextField();
    jSeparator41 = new javax.swing.JSeparator();
    jSeparator42 = new javax.swing.JSeparator();
    DataNascimento9 = new javax.swing.JLabel();
    FormatoDN9 = new javax.swing.JLabel();
    jSeparator43 = new javax.swing.JSeparator();
    CPF9 = new javax.swing.JLabel();
    jSeparator44 = new javax.swing.JSeparator();
    Estado9 = new javax.swing.JLabel();
    Cidade9 = new javax.swing.JLabel();
    Bairro9 = new javax.swing.JLabel();
    Rua9 = new javax.swing.JLabel();
    NCasa9 = new javax.swing.JLabel();
    EstadoNameText8 = new javax.swing.JTextField();
    CidadeNameText8 = new javax.swing.JTextField();
    BairroNameText8 = new javax.swing.JTextField();
    NumCasaNumberText8 = new javax.swing.JTextField();
    RuaNameText8 = new javax.swing.JTextField();
    Ok8 = new javax.swing.JButton();
    jSeparator45 = new javax.swing.JSeparator();
    jLabel9 = new javax.swing.JLabel();
    SexoSelect8 = new javax.swing.JComboBox<>();
    NascimentoDate8 = new javax.swing.JFormattedTextField();
    CPFNumber8 = new javax.swing.JFormattedTextField();

    setClosable(true);

    Nome.setBackground(new java.awt.Color(204, 204, 204));
    Nome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados"));
    Nome.setToolTipText("");
    Nome.setOpaque(false);

    FName9.setBackground(new java.awt.Color(255, 255, 255));
    FName9.setText("Primeiro Nome:");

    LName9.setText("Ultimo Nome: ");

    FristNameText8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FristNameTextActionPerformed(evt);
      }
    });

    LastNameText8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        LastNameTextActionPerformed(evt);
      }
    });

    jSeparator41.setOrientation(javax.swing.SwingConstants.VERTICAL);

    DataNascimento9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    DataNascimento9.setText("Data de Nascimento:");

    FormatoDN9.setText("DD/MM/YYYY");

    CPF9.setText("CPF: ");

    Estado9.setText("Estado: ");

    Cidade9.setText("Cidade: ");

    Bairro9.setText("Bairro: ");

    Rua9.setText("Rua: ");

    NCasa9.setText("Numero da Casa: ");

    NumCasaNumberText8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NumCasaNumberTextActionPerformed(evt);
      }
    });

    RuaNameText8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        RuaNameTextActionPerformed(evt);
      }
    });

    Ok8.setText("Ok");
    Ok8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        OkActionPerformed(evt);
      }
    });

    jSeparator45.setOrientation(javax.swing.SwingConstants.VERTICAL);

    jLabel9.setText("Sexo: ");

    SexoSelect8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino" }));

    try {
      NascimentoDate8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    NascimentoDate8.setHorizontalAlignment(javax.swing.JTextField.LEFT);

    try {
      CPFNumber8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    javax.swing.GroupLayout NomeLayout = new javax.swing.GroupLayout(Nome);
    Nome.setLayout(NomeLayout);
    NomeLayout.setHorizontalGroup(
      NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(NomeLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(NomeLayout.createSequentialGroup()
            .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jSeparator42)
              .addComponent(jSeparator43)
              .addComponent(jSeparator44)
              .addGroup(NomeLayout.createSequentialGroup()
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(NomeLayout.createSequentialGroup()
                    .addComponent(FName9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(FristNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LName9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LastNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(NomeLayout.createSequentialGroup()
                    .addComponent(CPF9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(CPFNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator45, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(SexoSelect8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
          .addGroup(NomeLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(DataNascimento9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(FormatoDN9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(NascimentoDate8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(85, 85, 85))
          .addGroup(NomeLayout.createSequentialGroup()
            .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addGroup(NomeLayout.createSequentialGroup()
                .addComponent(Cidade9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CidadeNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NomeLayout.createSequentialGroup()
                .addComponent(Estado9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstadoNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addGroup(NomeLayout.createSequentialGroup()
                .addComponent(Rua9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RuaNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(NomeLayout.createSequentialGroup()
                .addComponent(NCasa9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumCasaNumberText8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(NomeLayout.createSequentialGroup()
            .addComponent(Bairro9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(BairroNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NomeLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(Ok8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    NomeLayout.setVerticalGroup(
      NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(NomeLayout.createSequentialGroup()
        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jSeparator41, javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(FristNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(FName9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(LName9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LastNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
          .addComponent(FormatoDN9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(NascimentoDate8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(DataNascimento9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator43, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(CPF9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(CPFNumber8))
          .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(SexoSelect8))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator44, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(Estado9, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
            .addComponent(EstadoNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(RuaNameText8))
          .addComponent(Rua9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(NumCasaNumberText8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(NCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(CidadeNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Cidade9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(NomeLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(Bairro9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(BairroNameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NomeLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
            .addComponent(Ok8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed

    Pessoa p = null;
    try {
      p = new Pessoa(FristNameText.getText(), LastNameText.getText(), NascimentoDate.getText(), CPFNumber.getText(), SexoSelect.getSelectedItem().toString(), EstadoNameText.getText(), CidadeNameText.getText(), BairroNameText.getText(), RuaNameText.getText(), NumCasaNumberText.getText());
    } catch (ParseException ex) {
      Logger.getLogger(DadosUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(FristNameText.getText().equals("") || LastNameText.getText().equals("") || NascimentoDate.getText().equals("") || CPFNumber.getText().equals("") || SexoSelect.getSelectedItem().equals("") || EstadoNameText.getText().equals("") || CidadeNameText.getText().equals("") || BairroNameText.getText().equals("") || RuaNameText.getText().equals("") || NumCasaNumberText.getText().equals("")){
      JOptionPane.showMessageDialog(null, "Todos os campos obrigatorios");
    }else{
      JOptionPane.showMessageDialog(null, p.toString());
      FristName = FristNameText.getText();
      LastName = LastNameText.getText();
      Nascimento = NascimentoDate.getText();
      CPF = CPFNumber.getText();
      Sexo = SexoSelect.getSelectedItem().toString();
      Estado = EstadoNameText.getText();
      Cidade = CidadeNameText.getText();
      Bairro = BairroNameText.getText();
      Rua = RuaNameText.getText();
      NumCasa = NumCasaNumberText.getText();
      this.dispose();
    }
  }//GEN-LAST:event_OkActionPerformed

  private void RuaNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaNameTextActionPerformed

  }//GEN-LAST:event_RuaNameTextActionPerformed

  private void NumCasaNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumCasaNumberTextActionPerformed

  }//GEN-LAST:event_NumCasaNumberTextActionPerformed

  private void LastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextActionPerformed

  }//GEN-LAST:event_LastNameTextActionPerformed

  private void FristNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FristNameTextActionPerformed

  }//GEN-LAST:event_FristNameTextActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel Bairro1;
  private javax.swing.JLabel Bairro2;
  private javax.swing.JLabel Bairro3;
  private javax.swing.JLabel Bairro4;
  private javax.swing.JLabel Bairro5;
  private javax.swing.JLabel Bairro6;
  private javax.swing.JLabel Bairro7;
  private javax.swing.JLabel Bairro8;
  private javax.swing.JLabel Bairro9;
  private javax.swing.JTextField BairroNameText;
  private javax.swing.JTextField BairroNameText1;
  private javax.swing.JTextField BairroNameText2;
  private javax.swing.JTextField BairroNameText3;
  private javax.swing.JTextField BairroNameText4;
  private javax.swing.JTextField BairroNameText5;
  private javax.swing.JTextField BairroNameText6;
  private javax.swing.JTextField BairroNameText7;
  private javax.swing.JTextField BairroNameText8;
  private javax.swing.JLabel CPF1;
  private javax.swing.JLabel CPF2;
  private javax.swing.JLabel CPF3;
  private javax.swing.JLabel CPF4;
  private javax.swing.JLabel CPF5;
  private javax.swing.JLabel CPF6;
  private javax.swing.JLabel CPF7;
  private javax.swing.JLabel CPF8;
  private javax.swing.JLabel CPF9;
  private javax.swing.JFormattedTextField CPFNumber;
  private javax.swing.JFormattedTextField CPFNumber1;
  private javax.swing.JFormattedTextField CPFNumber2;
  private javax.swing.JFormattedTextField CPFNumber3;
  private javax.swing.JFormattedTextField CPFNumber4;
  private javax.swing.JFormattedTextField CPFNumber5;
  private javax.swing.JFormattedTextField CPFNumber6;
  private javax.swing.JFormattedTextField CPFNumber7;
  private javax.swing.JFormattedTextField CPFNumber8;
  private javax.swing.JLabel Cidade1;
  private javax.swing.JLabel Cidade2;
  private javax.swing.JLabel Cidade3;
  private javax.swing.JLabel Cidade4;
  private javax.swing.JLabel Cidade5;
  private javax.swing.JLabel Cidade6;
  private javax.swing.JLabel Cidade7;
  private javax.swing.JLabel Cidade8;
  private javax.swing.JLabel Cidade9;
  private javax.swing.JTextField CidadeNameText;
  private javax.swing.JTextField CidadeNameText1;
  private javax.swing.JTextField CidadeNameText2;
  private javax.swing.JTextField CidadeNameText3;
  private javax.swing.JTextField CidadeNameText4;
  private javax.swing.JTextField CidadeNameText5;
  private javax.swing.JTextField CidadeNameText6;
  private javax.swing.JTextField CidadeNameText7;
  private javax.swing.JTextField CidadeNameText8;
  private javax.swing.JLabel DataNascimento1;
  private javax.swing.JLabel DataNascimento2;
  private javax.swing.JLabel DataNascimento3;
  private javax.swing.JLabel DataNascimento4;
  private javax.swing.JLabel DataNascimento5;
  private javax.swing.JLabel DataNascimento6;
  private javax.swing.JLabel DataNascimento7;
  private javax.swing.JLabel DataNascimento8;
  private javax.swing.JLabel DataNascimento9;
  private javax.swing.JLabel Estado1;
  private javax.swing.JLabel Estado2;
  private javax.swing.JLabel Estado3;
  private javax.swing.JLabel Estado4;
  private javax.swing.JLabel Estado5;
  private javax.swing.JLabel Estado6;
  private javax.swing.JLabel Estado7;
  private javax.swing.JLabel Estado8;
  private javax.swing.JLabel Estado9;
  private javax.swing.JTextField EstadoNameText;
  private javax.swing.JTextField EstadoNameText1;
  private javax.swing.JTextField EstadoNameText2;
  private javax.swing.JTextField EstadoNameText3;
  private javax.swing.JTextField EstadoNameText4;
  private javax.swing.JTextField EstadoNameText5;
  private javax.swing.JTextField EstadoNameText6;
  private javax.swing.JTextField EstadoNameText7;
  private javax.swing.JTextField EstadoNameText8;
  private javax.swing.JLabel FName1;
  private javax.swing.JLabel FName2;
  private javax.swing.JLabel FName3;
  private javax.swing.JLabel FName4;
  private javax.swing.JLabel FName5;
  private javax.swing.JLabel FName6;
  private javax.swing.JLabel FName7;
  private javax.swing.JLabel FName8;
  private javax.swing.JLabel FName9;
  private javax.swing.JLabel FormatoDN1;
  private javax.swing.JLabel FormatoDN2;
  private javax.swing.JLabel FormatoDN3;
  private javax.swing.JLabel FormatoDN4;
  private javax.swing.JLabel FormatoDN5;
  private javax.swing.JLabel FormatoDN6;
  private javax.swing.JLabel FormatoDN7;
  private javax.swing.JLabel FormatoDN8;
  private javax.swing.JLabel FormatoDN9;
  private javax.swing.JTextField FristNameText;
  private javax.swing.JTextField FristNameText1;
  private javax.swing.JTextField FristNameText2;
  private javax.swing.JTextField FristNameText3;
  private javax.swing.JTextField FristNameText4;
  private javax.swing.JTextField FristNameText5;
  private javax.swing.JTextField FristNameText6;
  private javax.swing.JTextField FristNameText7;
  private javax.swing.JTextField FristNameText8;
  private javax.swing.JLabel LName1;
  private javax.swing.JLabel LName2;
  private javax.swing.JLabel LName3;
  private javax.swing.JLabel LName4;
  private javax.swing.JLabel LName5;
  private javax.swing.JLabel LName6;
  private javax.swing.JLabel LName7;
  private javax.swing.JLabel LName8;
  private javax.swing.JLabel LName9;
  private javax.swing.JTextField LastNameText;
  private javax.swing.JTextField LastNameText1;
  private javax.swing.JTextField LastNameText2;
  private javax.swing.JTextField LastNameText3;
  private javax.swing.JTextField LastNameText4;
  private javax.swing.JTextField LastNameText5;
  private javax.swing.JTextField LastNameText6;
  private javax.swing.JTextField LastNameText7;
  private javax.swing.JTextField LastNameText8;
  private javax.swing.JLabel NCasa1;
  private javax.swing.JLabel NCasa2;
  private javax.swing.JLabel NCasa3;
  private javax.swing.JLabel NCasa4;
  private javax.swing.JLabel NCasa5;
  private javax.swing.JLabel NCasa6;
  private javax.swing.JLabel NCasa7;
  private javax.swing.JLabel NCasa8;
  private javax.swing.JLabel NCasa9;
  private javax.swing.JFormattedTextField NascimentoDate;
  private javax.swing.JFormattedTextField NascimentoDate1;
  private javax.swing.JFormattedTextField NascimentoDate2;
  private javax.swing.JFormattedTextField NascimentoDate3;
  private javax.swing.JFormattedTextField NascimentoDate4;
  private javax.swing.JFormattedTextField NascimentoDate5;
  private javax.swing.JFormattedTextField NascimentoDate6;
  private javax.swing.JFormattedTextField NascimentoDate7;
  private javax.swing.JFormattedTextField NascimentoDate8;
  private javax.swing.JPanel Nome;
  private javax.swing.JTextField NumCasaNumberText;
  private javax.swing.JTextField NumCasaNumberText1;
  private javax.swing.JTextField NumCasaNumberText2;
  private javax.swing.JTextField NumCasaNumberText3;
  private javax.swing.JTextField NumCasaNumberText4;
  private javax.swing.JTextField NumCasaNumberText5;
  private javax.swing.JTextField NumCasaNumberText6;
  private javax.swing.JTextField NumCasaNumberText7;
  private javax.swing.JTextField NumCasaNumberText8;
  private javax.swing.JButton Ok;
  private javax.swing.JButton Ok1;
  private javax.swing.JButton Ok2;
  private javax.swing.JButton Ok3;
  private javax.swing.JButton Ok4;
  private javax.swing.JButton Ok5;
  private javax.swing.JButton Ok6;
  private javax.swing.JButton Ok7;
  private javax.swing.JButton Ok8;
  private javax.swing.JPanel Painel;
  private javax.swing.JPanel Painel1;
  private javax.swing.JPanel Painel2;
  private javax.swing.JPanel Painel3;
  private javax.swing.JPanel Painel4;
  private javax.swing.JPanel Painel5;
  private javax.swing.JPanel Painel6;
  private javax.swing.JPanel Painel7;
  private javax.swing.JLabel Rua1;
  private javax.swing.JLabel Rua2;
  private javax.swing.JLabel Rua3;
  private javax.swing.JLabel Rua4;
  private javax.swing.JLabel Rua5;
  private javax.swing.JLabel Rua6;
  private javax.swing.JLabel Rua7;
  private javax.swing.JLabel Rua8;
  private javax.swing.JLabel Rua9;
  private javax.swing.JTextField RuaNameText;
  private javax.swing.JTextField RuaNameText1;
  private javax.swing.JTextField RuaNameText2;
  private javax.swing.JTextField RuaNameText3;
  private javax.swing.JTextField RuaNameText4;
  private javax.swing.JTextField RuaNameText5;
  private javax.swing.JTextField RuaNameText6;
  private javax.swing.JTextField RuaNameText7;
  private javax.swing.JTextField RuaNameText8;
  private javax.swing.JComboBox<String> SexoSelect;
  private javax.swing.JComboBox<String> SexoSelect1;
  private javax.swing.JComboBox<String> SexoSelect2;
  private javax.swing.JComboBox<String> SexoSelect3;
  private javax.swing.JComboBox<String> SexoSelect4;
  private javax.swing.JComboBox<String> SexoSelect5;
  private javax.swing.JComboBox<String> SexoSelect6;
  private javax.swing.JComboBox<String> SexoSelect7;
  private javax.swing.JComboBox<String> SexoSelect8;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator10;
  private javax.swing.JSeparator jSeparator11;
  private javax.swing.JSeparator jSeparator12;
  private javax.swing.JSeparator jSeparator13;
  private javax.swing.JSeparator jSeparator14;
  private javax.swing.JSeparator jSeparator15;
  private javax.swing.JSeparator jSeparator16;
  private javax.swing.JSeparator jSeparator17;
  private javax.swing.JSeparator jSeparator18;
  private javax.swing.JSeparator jSeparator19;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator20;
  private javax.swing.JSeparator jSeparator21;
  private javax.swing.JSeparator jSeparator22;
  private javax.swing.JSeparator jSeparator23;
  private javax.swing.JSeparator jSeparator24;
  private javax.swing.JSeparator jSeparator25;
  private javax.swing.JSeparator jSeparator26;
  private javax.swing.JSeparator jSeparator27;
  private javax.swing.JSeparator jSeparator28;
  private javax.swing.JSeparator jSeparator29;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JSeparator jSeparator30;
  private javax.swing.JSeparator jSeparator31;
  private javax.swing.JSeparator jSeparator32;
  private javax.swing.JSeparator jSeparator33;
  private javax.swing.JSeparator jSeparator34;
  private javax.swing.JSeparator jSeparator35;
  private javax.swing.JSeparator jSeparator36;
  private javax.swing.JSeparator jSeparator37;
  private javax.swing.JSeparator jSeparator38;
  private javax.swing.JSeparator jSeparator39;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator40;
  private javax.swing.JSeparator jSeparator41;
  private javax.swing.JSeparator jSeparator42;
  private javax.swing.JSeparator jSeparator43;
  private javax.swing.JSeparator jSeparator44;
  private javax.swing.JSeparator jSeparator45;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JSeparator jSeparator6;
  private javax.swing.JSeparator jSeparator7;
  private javax.swing.JSeparator jSeparator8;
  private javax.swing.JSeparator jSeparator9;
  // End of variables declaration//GEN-END:variables
}
