package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Disciplina implements Serializable{
  // Dados
    private ArrayList<Nota> notas;
    private String professor;
    private String nome;
  // Constructs
    public Disciplina(String nome, String professor){
      this.nome = nome;
      this.professor = professor;
      this.notas = new ArrayList<Nota>();
    }
    public Disciplina(String nome, String professor, ArrayList<Nota> notas){
      this.nome = nome;
      this.professor = professor;
      this.notas = notas;
    }
  // Sets
    public void setProfessor(String professor){
      this.professor = professor;
    }
    public void setNotas(ArrayList<Nota> notas){
      this.notas = notas;
    }
    public void setNome(String nome){
      this.nome = nome;
    }
  // Gets
    public ArrayList<Nota> getNotas(){
      return this.notas;
    }
    public String getProfessor(){
      return this.professor;
    }
    public String getNome(){
      return this.nome;
    }
  // Outros
    public void addNota(Nota nota){
      this.notas.add(nota);
    }
    public void delNota(Nota nota){
      this.notas.remove(nota);
    }
    public void limparNotas(){
      this.notas.clear();
    }
}
