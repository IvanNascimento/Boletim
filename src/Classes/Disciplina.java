package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Disciplina implements Serializable{
  // Dados
    private ArrayList<Nota> notas;
    private String professor;
    private String nome;
  // Constructs
    public Disciplina(){}
    public Disciplina(String nome, String professor){
      this.nome = nome;
      this.professor = professor;
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
    public ArrayList getMedia(){
      ArrayList medias = new ArrayList();
      for(int j=1;j<5;j++){
        double media = 0;
        int i = 0;
        for(Nota y: notas){
          if(y.getBimestre() == j){
            i++;
            media += y.getNota();
          }
          media /= i;
        }
        medias.add(media);
      }
      return medias;
    }
}
