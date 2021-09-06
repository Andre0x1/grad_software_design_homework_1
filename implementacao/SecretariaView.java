import java.util.Scanner;

public class SecretariaView extends BaseView{


    @Override
    public String show() {
        Scanner in = new Scanner(System.in);

        System.out.println("!!!BEM VINDO SECRETARIA!!!!!");
        System.out.println("Digite a opção desejada:");
        System.out.println("1) Para cadastrar  usuario");
        System.out.println("2) Para cadastrar  disciplina");
        System.out.println("3) Fazer logout" + "\n");
        String op = in.nextLine();
        return op;
    }


    public String resCadastroUsuario(){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite O tipo de usuario a ser cadastrado :");
        System.out.println("1) Para cadastrar  Aluno");
        System.out.println("2) Para cadastrar  Professor");
        System.out.println("3) Para cadastrar  Secretaria");
        System.out.println("4) Para sair" + "\n");
        String op = in.nextLine();
        return op;
    }

    public String criarCadastroUsuario() {

        Scanner in = new Scanner(System.in);
        String data = "";
        System.out.println("Digite Login: ");
        String login = in.nextLine();
        System.out.println("Digite Senha: ");
        String senha = in.nextLine();
        data = login + "," + senha;

        return data;
    }

}
