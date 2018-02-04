package boletim;

import java.util.ArrayList;

public class Disciplina {
  // Dados
    private ArrayList<Nota> notas;
    private Professor professor;
  // Constructs
    Disciplina(){}
    Disciplina(Professor professor){
      this.professor = professor;
    }
    Disciplina(Professor professor, ArrayList<Nota> notas){
      this.professor = professor;
      this.notas = notas;
    }
  // Sets
    public void setProfessor(Professor professor){
      this.professor = professor;
    }
    public void setNotas(ArrayList<Nota> notas){
      this.notas = notas;
    }
  // Gets
    public ArrayList<Nota> getNotas(){
      return this.notas;
    }
    public Professor getProfessor(){
      return this.professor;
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
