package boletim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
  //Dados
    // Nome
      private String fristName;
      private String lastName;
    // Idade
      private Date nascimento;//y-m-d
    // CPF
      private int cpf;
    // Endereço
      private String estado;
      private String cidade;
      private String bairro;
      private String rua;
      private int numeroCasa;
  // Construct
    Pessoa(){}
    Pessoa(String fristName, String lastName, String nascimento, int cpf, String estado, String cidade, String bairro, String rua, int numero) throws ParseException{
      this.fristName = fristName;
      this.lastName = lastName;
      this.cpf = cpf;
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
      public void setEndereco(String estado, String cidade, String bairro, String rua, int numero){
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numero;
      }
      public void setCPF(int cpf){
        this.cpf = cpf;
      }
  // Gets
      public String getNome(){
        return this.fristName + " " + this.lastName;
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
      public int getCPF(){
        return this.cpf;
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
}
