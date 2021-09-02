import java.util.ArrayList;
import java.util.List;

public class Secretaria extends Usuario{

        public  void fazerLogin(){}
        public  void fazerLogout(){}
        public void  cadastrarUsuario(String data,String op){

                switch(op){
                        case "1":
                                AlunoRepositorio AR = new AlunoRepositorio();
                                Aluno Al = new Aluno(data);
                                List<Aluno> alunos = new ArrayList<>();
                                alunos.add(Al);
                                AR.adicionarObjeto(alunos);
                                break;
                        case "2":
                                ProfessorRepositorio PR = new ProfessorRepositorio();
                                Professor Pr = new Professor(data);
                                List<Professor> professores = new ArrayList<>();
                                professores.add(Pr);
                                PR.adicionarObjeto(professores);
                                break;
                        case "3":
                                SecretariaRepositorio SR = new SecretariaRepositorio();
                                Secretaria Sec = new Secretaria(data);
                                List<Secretaria> secretarias = new ArrayList<>();
                                secretarias.add(Sec);
                                SR.adicionarObjeto(secretarias);
                                break;

                }

        }
        public void cadastrarDisciplina(String data){

                DisciplinaRepositorio DR= new DisciplinaRepositorio();
                Disciplina Dis = new Disciplina(data);
                List<Disciplina> disciplinas = new ArrayList<>();
                disciplinas.add(Dis);
                DR.adicionarObjeto(disciplinas);
        }

        public void cadastrarCurso(){

        }

        public Secretaria (){
                this.login = "0";
                this.senha = "1";
                this.nome = "Admin";

        }

        public Secretaria (String login,String senha,String nome){
                this.login = login;
                this.senha = senha;
                this.nome = nome;
        }

        public  Secretaria (String [] repo){
                this.login = repo[1];
                this.senha = repo[2];
                this.nome = repo[3];
        }

        public Secretaria (String line){
                String[] attributes = line.split(",");

                this.login = attributes[0];
                this.senha = attributes[1];
                this.nome = attributes[2];

        }



}