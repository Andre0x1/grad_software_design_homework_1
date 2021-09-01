import java.util.ArrayList;
import java.util.List;

public class Secretaria extends Usuario{

        public  void fazerLogin(){}
        public  void fazerLogout(){}
        public void  cadastrarUsuario(String data,String op){
                AlunoRepositorio AR = new AlunoRepositorio();
                Aluno Aux = new Aluno(data);
                List<Aluno> alunos = new ArrayList<>();
                alunos.add(Aux);
                AR.adicionarObjeto(alunos);
        }
        public void cadastrarDisciplina(){

        }

        public Secretaria (){
                this.login = "0";
                this.senha = "1";
        }

        public Secretaria (String login,String senha){
                this.login = login;
                this.senha = senha;
        }

        public  Secretaria (String [] repo){
                this.login = repo[1];
                this.senha = repo[2];
        }

}