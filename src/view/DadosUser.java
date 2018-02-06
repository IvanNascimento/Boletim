package view;

import Classes.Aluno;
import Classes.Dados;
import Classes.Usuario;
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
  public Usuario User;
  public int UserId;

  private void init(Usuario user){
      Aluno dados = user.getDados();
      
      FristNameText.setText((String )dados.getNome()[0]);
      LastNameText.setText((String)dados.getNome()[1]);
      NascimentoDate.setText(dados.getNascimento());
      CPFNumber.setText(dados.getCPF());
      EstadoNameText.setText((String) dados.getEndereco().get(0));
      CidadeNameText.setText((String) dados.getEndereco().get(1));
      BairroNameText.setText((String) dados.getEndereco().get(2));
      RuaNameText.setText((String) dados.getEndereco().get(3));
      NumCasaNumberText.setText((String) dados.getEndereco().get(4));
  }
  
  public DadosUser(Usuario user, int userId) {
    initComponents();
    this.User = user;
    this.UserId = userId;
    this.init(user);
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JPanel();
        FName9 = new javax.swing.JLabel();
        LName9 = new javax.swing.JLabel();
        FristNameText = new javax.swing.JTextField();
        LastNameText = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        DataNascimento = new javax.swing.JLabel();
        FormatoDN9 = new javax.swing.JLabel();
        jSeparator43 = new javax.swing.JSeparator();
        CPF9 = new javax.swing.JLabel();
        jSeparator44 = new javax.swing.JSeparator();
        Estado9 = new javax.swing.JLabel();
        Cidade9 = new javax.swing.JLabel();
        Bairro9 = new javax.swing.JLabel();
        Rua9 = new javax.swing.JLabel();
        NCasa9 = new javax.swing.JLabel();
        EstadoNameText = new javax.swing.JTextField();
        CidadeNameText = new javax.swing.JTextField();
        BairroNameText = new javax.swing.JTextField();
        NumCasaNumberText = new javax.swing.JTextField();
        RuaNameText = new javax.swing.JTextField();
        Ok = new javax.swing.JButton();
        jSeparator45 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        SexoSelect = new javax.swing.JComboBox<>();
        NascimentoDate = new javax.swing.JFormattedTextField();
        CPFNumber = new javax.swing.JFormattedTextField();

        Nome.setBackground(new java.awt.Color(204, 204, 204));
        Nome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados"));
        Nome.setToolTipText("");
        Nome.setOpaque(false);

        FName9.setBackground(new java.awt.Color(255, 255, 255));
        FName9.setText("Primeiro Nome:");

        LName9.setText("Ultimo Nome: ");

        FristNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FristNameTextActionPerformed(evt);
            }
        });

        LastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextActionPerformed(evt);
            }
        });

        jSeparator41.setOrientation(javax.swing.SwingConstants.VERTICAL);

        DataNascimento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DataNascimento.setText("Data de Nascimento:");

        FormatoDN9.setText("DD/MM/YYYY");

        CPF9.setText("CPF: ");

        Estado9.setText("Estado: ");

        Cidade9.setText("Cidade: ");

        Bairro9.setText("Bairro: ");

        Rua9.setText("Rua: ");

        NCasa9.setText("Numero da Casa: ");

        NumCasaNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumCasaNumberTextActionPerformed(evt);
            }
        });

        RuaNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaNameTextActionPerformed(evt);
            }
        });

        Ok.setText("Ok");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        jSeparator45.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("Sexo: ");

        SexoSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Masculino", "Feminino" }));

        try {
            NascimentoDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        NascimentoDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        try {
            CPFNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
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
                                        .addComponent(FristNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LName9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(NomeLayout.createSequentialGroup()
                                        .addComponent(CPF9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CPFNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator45, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SexoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(NomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FormatoDN9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NascimentoDate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(NomeLayout.createSequentialGroup()
                        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(NomeLayout.createSequentialGroup()
                                .addComponent(Cidade9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CidadeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NomeLayout.createSequentialGroup()
                                .addComponent(Estado9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EstadoNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(NomeLayout.createSequentialGroup()
                                .addComponent(Rua9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RuaNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NomeLayout.createSequentialGroup()
                                .addComponent(NCasa9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NumCasaNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(NomeLayout.createSequentialGroup()
                        .addComponent(Bairro9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BairroNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NomeLayout.setVerticalGroup(
            NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NomeLayout.createSequentialGroup()
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator41, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FristNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FName9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LName9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FormatoDN9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NascimentoDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator43, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CPF9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SexoSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator44, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Estado9, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(EstadoNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RuaNameText))
                    .addComponent(Rua9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CidadeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NumCasaNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cidade9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bairro9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BairroNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    Aluno dados = this.User.getDados();
    Dados d = new Dados();
    if(FristNameText.getText().equals("") || LastNameText.getText().equals("") || NascimentoDate.getText().equals("") || CPFNumber.getText().equals("") || SexoSelect.getSelectedItem().equals("") || EstadoNameText.getText().equals("") || CidadeNameText.getText().equals("") || BairroNameText.getText().equals("") || RuaNameText.getText().equals("") || NumCasaNumberText.getText().equals("")){
      JOptionPane.showMessageDialog(null, "Todos os campos obrigatorios");
    }else{
      dados.setNome(FristNameText.getText(), LastNameText.getText());
      dados.setNascimento(NascimentoDate.getText());
      dados.setCPF(CPFNumber.getText());
      dados.setSexo(SexoSelect.getSelectedItem().toString());
      dados.setEndereco(EstadoNameText.getText(), CidadeNameText.getText(), BairroNameText.getText(), RuaNameText.getText(), NumCasaNumberText.getText());
      this.User.setDados(dados);
      
      d.editUser(UserId, User);
      
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
    private javax.swing.JLabel Bairro9;
    private javax.swing.JTextField BairroNameText;
    private javax.swing.JLabel CPF9;
    private javax.swing.JFormattedTextField CPFNumber;
    private javax.swing.JLabel Cidade9;
    private javax.swing.JTextField CidadeNameText;
    private javax.swing.JLabel DataNascimento;
    private javax.swing.JLabel Estado9;
    private javax.swing.JTextField EstadoNameText;
    private javax.swing.JLabel FName9;
    private javax.swing.JLabel FormatoDN9;
    private javax.swing.JTextField FristNameText;
    private javax.swing.JLabel LName9;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JLabel NCasa9;
    private javax.swing.JFormattedTextField NascimentoDate;
    private javax.swing.JPanel Nome;
    private javax.swing.JTextField NumCasaNumberText;
    private javax.swing.JButton Ok;
    private javax.swing.JLabel Rua9;
    private javax.swing.JTextField RuaNameText;
    private javax.swing.JComboBox<String> SexoSelect;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    // End of variables declaration//GEN-END:variables
}
