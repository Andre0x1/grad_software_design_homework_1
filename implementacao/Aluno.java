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

    @Override
    public String toString() {
        return  "Aluno [login=" +  login + "senha="+senha+"debito=" + debitos + "]";
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

    public Aluno (String [] repo){
        this.login = repo[1];
        this.senha = repo[2];
        this.debitos = Double.parseDouble(repo[3]);
    }

    public Aluno (String line){
        String[] attributes = line.split(",");

        this.login = attributes[1];
        this.senha = attributes[2];
        this.debitos = Double.parseDouble(attributes[3]);

    }

}