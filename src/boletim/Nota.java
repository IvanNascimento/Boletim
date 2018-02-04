package boletim;

public class Nota {
  // Dados
    private int nota;
    private int peso;
    private int bimestre;
  // Constructs
    Nota(){}
    Nota(int bimestre, int nota){
      this.bimestre = bimestre;
      this.nota = nota;
      this.peso = 0;
    }
    Nota(int bimestre, int nota, int peso){
      this.bimestre = bimestre;
      this.nota = nota;
      this.peso = peso;
    }
  // Sets
    public void setBimestre(int bimestre){
      this.bimestre = bimestre;
    }
    public void setNota(int nota){
      this.nota = nota;
    }
    public void setPeso(int peso){
      this.peso = peso;
    }
  // Gets
    public int getBimestre(){
      return this.bimestre;
    }
    public int getNota(){
      return this.nota;
    }
    public int getPeso(){
      return this.peso;
    }
}
