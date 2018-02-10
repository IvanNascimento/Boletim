package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Dados {
  
  private String caminho;
  private ArrayList dados;
  
  private ObjectOutputStream output;
  
  private ObjectInputStream input;
  
  public Dados(){
    this.caminho = System.getProperty("user.dir")+"/teste.db";
    this.dados = new ArrayList();
  }
  
  public void setCaminho(String caminho){
    this.caminho = caminho;
  }
  
  public String getCaminho(){
    return this.caminho;
  }
  
  public void Salvar(ArrayList<Usuario> a) {
    try {
      this.output = new ObjectOutputStream(new FileOutputStream(new File(this.caminho)));
    } catch (IOException ex) {
      System.out.println("Base de dados não encontrada, criada uma nova");
    }
    
    try {
      output.writeObject(a);
      this.dados = a;
    } catch (IOException ex) {
      System.out.println("Erro ao salvar");
    }

    try {
      output.flush();
      output.close();
    } catch (IOException ex) {
      System.out.println("Erro ao fechar arquivo");
    }
  }
  public ArrayList<Usuario> Carregar() {
    try {
      this.input = new ObjectInputStream(new FileInputStream(new File(this.caminho)));
    } catch (IOException ex) {
      System.out.println("Base de dados não encontrada");
      ArrayList a = new ArrayList();
      a.add(new Usuario("Admim", "admim".toCharArray()));
      this.Salvar(a);
      
      return this.dados;
    }
    try {
      while(true){
        ArrayList<Usuario> objeto = (ArrayList<Usuario>) input.readObject();
        this.dados = objeto;
        if(input.read() == -1) break;
      }
    } catch (ClassNotFoundException | IOException ex) {
      System.out.println("Base de dados vazia");
      ArrayList a = new ArrayList();
      a.add(new Usuario("Admim", "admim".toCharArray()));
      this.Salvar(a);
      
      return this.dados;
    }
    try {
      input.close();
    } catch (IOException ex) {
      System.out.println("Erro ao fechar o arquivo");
    }
    
    return this.dados;
  }
  public void addUsuario(Usuario u){
    ArrayList<Usuario> list = this.Carregar();
    list.add(u);
    this.Salvar(list);
  }
  public void editUsuario(int i, Usuario user){
    ArrayList<Usuario> list = this.Carregar();
    list.set(i, user);
    this.Salvar(list);
  }
}
