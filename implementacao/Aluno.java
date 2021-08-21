public class Aluno  extends  Usuario {

public double debitos;

public  void fazerLogin(){ }
public  void fazerLogout(){ }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }


    public Aluno (String login,String senha,double debito){
        this.login = login;
        this.senha = senha;
        this.debitos = debito;
    }

    public Aluno (String login,String senha){
        this.login = login;
        this.senha = senha;
        this.debitos = 0;
    }
}