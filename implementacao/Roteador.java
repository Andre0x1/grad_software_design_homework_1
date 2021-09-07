import java.util.Scanner;

public class Roteador {

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

    public void exibirMenu() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite Login: ");
        String login = in.nextLine();
        System.out.println("Digite Senha: ");
        String senha = in.nextLine();

        logar(login, senha);

    }

    public void logar(String login, String senha) {
        usuario.setLogin(login);
        usuario.setSenha(senha);
    }

    public void deslogar() {
        this.usuario.setLogin("null");

    }

    public void run(AlunoRepositorio Aluno, ProfessorRepositorio Professor, SecretariaRepositorio Secretaria) {
        this.deslogar();
        while (usuario.getLogin().equals("null")) {
            exibirMenu();

            if (Aluno.exist(usuario)) {
                Aluno Al = new Aluno(usuario.getLogin(), usuario.getSenha(), usuario.getNome());
                AlunoView AV = new AlunoView();
                String aop = AV.show();
                while ((!aop.equals("2"))) {
                    if (aop.equals("1")) {
                        String Ad = AV.entraOferta();
                        Al.ingressarEmOferta(Ad,Al);
                    } else {
                        System.out.println("Opção invalida");
                    }
                    aop = AV.show();
                }

            } else {
                if (Professor.exist(usuario)) {
                    ProfessorView PV = new ProfessorView();
                    PV.show();
                } else {
                    if (Secretaria.exist(usuario)) {
                        Secretaria Sec = new Secretaria(usuario.getLogin(), usuario.getSenha(), usuario.getNome());
                        SecretariaView SV = new SecretariaView();
                        String op = SV.show();
                        while ((!op.equals("8"))) {
                            switch (op) {
                                case "1":
                                    String resp = SV.resCadastroUsuario();
                                    if (!resp.equals("4")) {
                                        String data = SV.criarCadastroUsuario();
                                        Sec.cadastrarUsuario(data, resp);
                                    }
                                    break;
                                case "2":
                                    String data = SV.criarCadastroDisciplina();
                                    Sec.cadastrarDisciplina(data);
                                    break;
                                case "3":
                                    String aux = SV.criarCadastroCurso();
                                    Sec.cadastrarCurso(aux);
                                    break;
                                case "4":
                                    String offer = SV.ofertarDisciplina();
                                    Sec.criarOferta(offer);
                                    break;
                                default:
                                    System.out.println("Opção invalida");
                            }
                            op = SV.show();
                        }
                        this.deslogar();
                    }
                }
            }
        }
    }
}
