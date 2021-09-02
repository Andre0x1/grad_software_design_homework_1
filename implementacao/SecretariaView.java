import java.util.Scanner;

public class SecretariaView extends BaseView{


    @Override
    public String show() {
        Scanner in = new Scanner(System.in);

        System.out.println("!!!BEM VINDO A SECRETARIA!!!!!");
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
        System.out.println("Digite o nome: ");
        String nome = in.nextLine();
        data = login + "," + senha + "," + nome;

        return data;
    }


    public String criarCadastroDisciplina() {

        Scanner in = new Scanner(System.in);
        String data = "";
        System.out.println("Digite o nome da disciplina: ");
        String nome = in.nextLine();
        System.out.println("Digite o tipo da disciplina: ");
        String tipo = in.nextLine();
        System.out.println("digite o login do professor atual da disciplina");
        String idProf = in.nextLine();
        System.out.println("digite o preco  da disciplina");
        String preco = in.nextLine();
        System.out.println("digite o o limite de alunos da disciplina");
        String limite = in.nextLine();
        data = nome + "," + tipo + "," + idProf + "," + preco + "," + limite;

        return data;
    }

}
