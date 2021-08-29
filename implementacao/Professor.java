public class Professor extends Usuario{


    public  void fazerLogin(){ }
    public  void fazerLogout(){ }

    public Professor (String login,String senha){
        this.login = login;
        this.senha = senha;
    }

    public Professor (String [] repo){
        this.login = repo[0];
        this.senha = repo[1];
    }

    public Professor (String line){

    }
}