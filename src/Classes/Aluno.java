package Classes;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;

public class Aluno extends Pessoa implements Serializable{
  // Dados
    // Ano
      private int ano;
    // Diciplinas
      ArrayList<Disciplina> disciplinas;
    // Escola
      private String escola;
    // Curso
      private String curso;
  // Construct
    public Aluno(){}
    public Aluno(int ano, String escola){
      this.ano = ano;
      this.escola = escola;
      this.curso = "Não definido";
      this.disciplinas = new ArrayList<>();
    }
    public Aluno(int ano, String escola, String curso){
      this.ano = ano;
      this.escola = escola;
      this.curso = curso;
      this.disciplinas = new ArrayList<>();
    }
    public Aluno(int ano, String escola, ArrayList<Disciplina> list){
      this.ano = ano;
      this.escola = escola;
      this.curso = "Não definido";
      this.disciplinas = list;
    }
    public Aluno(int ano, String escola, String curso, ArrayList<Disciplina> list, String fristName, String lastName, String nascimento, String cpf, String sexo, String estado, String cidade, String bairro, String rua, String numero) throws ParseException{
      this.setNome(fristName, lastName);
      this.setCPF(cpf);
      this.setSexo(sexo);
      this.setEndereco(estado, cidade, bairro, rua, numero);

      this.setNascimento(nascimento);

      this.ano = ano;
      this.escola = escola;
      this.curso = curso;
      this.disciplinas = list;
    }
  // Sets
    public void setAno(int ano){
      this.ano = ano;
    }
    public void setDisciplinas(ArrayList list){
      this.disciplinas = list;
    }
    public void setEscola(String escola){
      this.escola = escola;
    }
    public void setCurso(String curso){
      this.curso = curso;
    }
  // Gets
    public int getAno(){
      return this.ano;
    }
    public String getEscola(){
      return this.escola;
    }
    public String getCurso(){
      return this.curso;
    }
    public ArrayList getDisciplinas(){
      return this.disciplinas;
    }
  // Outros
    public void addDisciplina(Disciplina disciplina){
      this.disciplinas.add(disciplina);
    }
    public void delDisciplina(Disciplina disciplina){
      this.disciplinas.remove(disciplina);
    }
    public void limparDisciplinas(){
      this.disciplinas.clear();
    }
}
