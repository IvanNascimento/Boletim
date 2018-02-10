package Classes;

import java.io.Serializable;

public class Usuario implements Serializable{
  private String login;
  private char[] senha;
  private Aluno dados;
  
  public Usuario(String login, char[] senha){
    this.login = login;
    this.senha = senha;
    this.dados = new Aluno();
  }
  public void setLogin(String login){
    this.login = login;
  }
  public void setSenha(char[] senha){
    this.senha = senha;
  }
  public String getLogin(){
    return this.login;
  }
  public char[] getSenha(){
    return this.senha;
  }
  public void setDados(Aluno a){
    this.dados = a;
  }
  public Aluno getDados(){
    return this.dados;
  }

}
