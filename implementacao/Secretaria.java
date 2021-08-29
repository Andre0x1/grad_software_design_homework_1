public class Secretaria extends Usuario{

        public  void fazerLogin(){}
        public  void fazerLogout(){}
        public void  cadastrarUsuario(){

        }
        public void cadastrarDisciplina(){

        }
        public Secretaria (String login,String senha){
                this.login = login;
                this.senha = senha;
        }

        public  Secretaria (String [] repo){
                this.login = repo[0];
                this.senha = repo[1];
        }

}