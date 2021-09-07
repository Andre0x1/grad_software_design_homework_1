
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SecretariaView extends BaseView{


    @Override
    public String show() {
        Scanner in = new Scanner(System.in);
        System.out.println("!!!BEM VINDO A SECRETARIA!!!!!");
        System.out.println("Digite a opção desejada:");
        System.out.println("1) Para cadastrar  usuario");
        System.out.println("2) Para cadastrar  disciplina");
        System.out.println("3) Para cadastrar curso");
        System.out.println("4) Para ofertar disciplna");
        System.out.println("5) Para listar  usuarios");
        System.out.println("6) Para listar  disciplinas");
        System.out.println("7) Para listar cursos");
        System.out.println("8) Fazer logout" + "\n");
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
        ProfessorRepositorio PR = new ProfessorRepositorio();

        String data = "";
        System.out.println("Digite o nome da disciplina: ");
        String nome = in.nextLine();
        System.out.println("Digite o tipo da disciplina: ");
        String tipo = in.nextLine();
        System.out.println("digite o login do professor atual da disciplina");
        String Prof =  PR.encontrarObjeto(in.nextLine());
        System.out.println("digite o preco  da disciplina");
        String preco = in.nextLine();
        System.out.println("digite o o limite de alunos da disciplina");
        String limite = in.nextLine();
        data = nome + "," + tipo + "," + Prof + "," + preco + "," + limite;

        return data;
    }

    public String criarCadastroCurso() {


        Scanner in = new Scanner(System.in);
        String data = "";
        System.out.println("Digite o nome do curso: ");
        String nome = in.nextLine();
        System.out.println("Digite o id das displinas vinculadas ao curso (separadas por espaço) ");
        String limite = in.nextLine();
        data = nome + "," + limite;

        return data;
    }

    public String ofertarDisciplina() {


        Scanner in = new Scanner(System.in);
        String data = "";
        System.out.println("Digite o limite dos alunos para essa disciplina: ");
        String limite = in.nextLine();
        System.out.println("Digite o id das displina vinculadas a oferta");
        String idDisc = in.nextLine();
        System.out.println("Digite o semestre da oferta");
        String sem = in.nextLine();
        System.out.println("Digite o nome do status");
        String status = in.nextLine();
        System.out.println("Digite o inicio da oferta da oferta (dd/mm/aaaa)");
        String dateIni = in.nextLine();
        System.out.println("Digite o fim da oferta da oferta (dd/mm/aaaa)");
        String dateFim = in.nextLine();
        data = limite + "," + idDisc + "," + sem + "," + status + "," + dateIni + "," + dateFim;

        return data;
    }


}
