package Classes;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pessoa implements Serializable{
  //Dados
    // Nome
      private String fristName;
      private String lastName;
    // Idade
      private Date nascimento;//y-m-d
    // CPF
      private String cpf;
    // Sexo
      private String sexo;
    // Endereço
      private String estado;
      private String cidade;
      private String bairro;
      private String rua;
      private String numeroCasa;
  // Construct
    public Pessoa(){}
    public Pessoa(String fristName, String lastName, String nascimento, String cpf, String sexo, String estado, String cidade, String bairro, String rua, String numero) throws ParseException{
      this.fristName = fristName;
      this.lastName = lastName;
      this.cpf = cpf;
      this.sexo = sexo;
      this.estado = estado;
      this.cidade = cidade;
      this.bairro = bairro;
      this.rua = rua;
      this.numeroCasa = numero;

      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      this.nascimento = sdf.parse(nascimento); 

    }
  // Sets
      public void setNome(String fristName, String lastName){
        this.fristName = fristName;
        this.lastName = lastName;
      }
      public void setNascimento(String nascimento) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.nascimento = sdf.parse(nascimento);
      }
      public void setSexo(String sexo){
        this.sexo = sexo;
      }
      public void setEndereco(String estado, String cidade, String bairro, String rua, String numero){
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numero;
      }
      public void setCPF(String cpf){
        this.cpf = cpf;
      }
  // Gets
      public String getNome(){
        return this.fristName + " " + this.lastName;
      }
      public String getNascimento(){
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(this.nascimento);
        
        return nascimento.get(Calendar.DAY_OF_MONTH)+"/"+(nascimento.get(Calendar.MONTH)+1)+"/"+nascimento.get(Calendar.YEAR);
      }
      public int getIdade() throws ParseException{
        Calendar hoje = Calendar.getInstance();
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(this.nascimento);

        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < nascimento.get(Calendar.MONTH)) {
          idade--;  
        }
        else {
          if (hoje.get(Calendar.MONTH) == nascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < nascimento.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
          }
        }

        return idade;
      }
      public String getCPF(){
        return this.cpf;
      }
      public String getSexo(){
        return this.sexo;
      }
      public ArrayList getEndereco(){
        ArrayList a = new ArrayList();
        a.add(this.estado);
        a.add(this.cidade);
        a.add(this.bairro);
        a.add(this.rua);
        a.add(this.numeroCasa);
        return a;
      }
  // Outros

  @Override
  public String toString() {
    String msm = "";
    msm += "Nome: "+this.getNome() + "\n";
        try {
          msm += "Idade: "+this.getIdade() + "\n";
        } catch (ParseException ex) {
          Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    msm += "Sexo: "+this.getSexo() + "\n";
    msm += "CPF: "+this.getCPF() + "\n";
    ArrayList list = this.getEndereco();
    msm += "==Endereço==" + "\n";
    msm += "  Estado: "+list.get(0) + "\n";
    msm += "  Cidade: "+list.get(1) + "\n";
    msm += "  Bairro: "+list.get(2) + "\n";
    msm += "  Rua: "+list.get(3) + "\n";
    msm += "  Numero da Casa: "+list.get(4) + "\n";
    return msm;
  }
    
}
