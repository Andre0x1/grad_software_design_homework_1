public class Professor extends Usuario{


    public  void fazerLogin(){ }
    public  void fazerLogout(){ }

    public Professor (String login,String senha){
        this.login = login;
        this.senha = senha;
    }

    public Professor (String [] repo){
        this.login = repo[1];
        this.senha = repo[2];
    }

    public Professor (String line){
        String[] attributes = line.split(",");

        this.login = attributes[1];
        this.senha = attributes[2];

    }

    @Override
    public String toString() {
        return(String.valueOf(login+","+senha));
    }
}