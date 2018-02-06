package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
      Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    try {
      output.writeObject(a);
    } catch (IOException ex) {
      Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
    }

    try {
      output.flush();
    } catch (IOException ex) {
      Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
      output.close();
    } catch (IOException ex) {
      Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  public ArrayList<Usuario> Carregar() {
    try {
      this.input = new ObjectInputStream(new FileInputStream(new File(this.caminho)));
    } catch (IOException ex) {
      Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
      ArrayList a = new ArrayList();
      a.add(new Usuario("Admim", "admim"));
      this.Salvar(a);
      this.Carregar();
    }
    try {
      while(true){
        ArrayList<Usuario> objeto = (ArrayList<Usuario>) input.readObject();
        this.dados = objeto;
        if(input.read() == -1) break;
      }
    } catch (ClassNotFoundException | IOException ex) {
      this.dados = new ArrayList<Usuario>();
      Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
      input.close();
    } catch (IOException ex) {
      Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return this.dados;
  }
  public void addUsuario(Usuario u){
    ArrayList<Usuario> list = this.Carregar();
    list.add(u);
    this.Salvar(list);
    System.out.println(this.Carregar());
  }
  public void editUser(int i, Usuario user){
    ArrayList<Usuario> list = this.Carregar();
    list.set(i, user);
    this.Salvar(list);
  }
}
