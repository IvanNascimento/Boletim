package Classes;

import java.io.Serializable;

public class Nota implements Serializable{
  // Dados
    private int nota;
    private int bimestre;
  // Constructs
    public Nota(){}
    public Nota(int bimestre, int nota){
      this.bimestre = bimestre;
      this.nota = nota;
    }
  // Sets
    public void setBimestre(int bimestre){
      this.bimestre = bimestre;
    }
    public void setNota(int nota){
      this.nota = nota;
    }
  // Gets
    public int getBimestre(){
      return this.bimestre;
    }
    public int getNota(){
      return this.nota;
    }
}
