package Classes;

public class Usuario {
  private String login;
  private String senha;
  private Aluno dados;
  
  public Usuario(){}
  public Usuario(String login, String senha){
    this.login = login;
    this.senha = senha;
    this.dados = new Aluno();
  }
  public void setLogin(String login){
    this.login = login;
  }
  public void setSenha(String senha){
    this.senha = senha;
  }
  public String getLogin(){
    return this.login;
  }
  public String getSenha(){
    return this.senha;
  }
}
