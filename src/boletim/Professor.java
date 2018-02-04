package boletim;

import java.text.ParseException;

public class Professor extends Pessoa{
  // Dados
  // Constructs
    Professor(){}
    Professor(String fristName, String lastName, String nascimento, int cpf, String estado, String cidade, String bairro, String rua, int numero) throws ParseException{
      this.setNome(fristName, lastName);
      this.setCPF(cpf);
      this.setEndereco(estado, cidade, bairro, rua, numero);

      this.setNascimento(nascimento);}
  // Sets
  // Gets
  // Outros
}
