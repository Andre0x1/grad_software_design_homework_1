public class Professor extends Usuario{

    public  void fazerLogin(){ }
    public  void fazerLogout(){ }

    public Professor (String login,String senha,String nome){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }

    public Professor (String [] repo){
        this.login = repo[1];
        this.senha = repo[2];
        this.nome = repo[3];
    }

    public Professor (String line){
        String[] attributes = line.split(",");

        this.login = attributes[0];
        this.senha = attributes[1];
        this.nome = attributes[2];

    }

    @Override
    public String toString() {
        return(login+","+senha+","+nome);
    }
}