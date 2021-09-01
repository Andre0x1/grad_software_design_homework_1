import java.util.Scanner;

public class Roteador{

    public Usuario usuario = new Usuario() {
        @Override
        public void fazerLogin() {

        }

        @Override
        public void fazerLogout() {

        }
    };

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void exibirMenu(){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite Login: ");
        String login = in.nextLine();
        System.out.println("Digite Senha: ");
        String senha = in.nextLine();

        logar(login,senha);

    }

    public void logar(String login,String senha){
        usuario.setLogin(login);
        usuario.setSenha(senha);
    }

    public void deslogar(){
        this.usuario = null;

    }

    public void run(AlunoRepositorio Aluno,ProfessorRepositorio Professor,SecretariaRepositorio Secretaria){

        exibirMenu();

            if (Aluno.exist(usuario)) {
                AlunoView AV = new AlunoView();
                AV.show();
            } else {
                if (Professor.exist(usuario)) {
                    ProfessorView PV = new ProfessorView();
                    PV.show();
                }else{
                    if(Secretaria.exist(usuario)){
                        Secretaria Sec = new Secretaria (usuario.getLogin(),usuario.getSenha());
                        SecretariaView SV = new SecretariaView();
                        String op = SV.show();
                        do {
                            switch (op) {
                                case "1":
                                    String resp = SV.resCadastroUsuario();
                                    if (!resp.equals("4")) {
                                        String data = SV.criarCadastroUsuario();
                                        Sec.cadastrarUsuario(data, resp);
                                    }
                                    break;
                                case "2":
                                    break;
                                default:
                                    System.out.println("Opção invalida");
                            }
                            op = SV.show();
                        }while(!op.equals("3"))  ;
                    }
                }
            }
    }
}