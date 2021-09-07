import java.util.Scanner;

public class AlunoView extends BaseView{

    @Override
    public String show() {
        Scanner in = new Scanner(System.in);

        System.out.println("!!!BEM VINDO ALUNO!!!!!");
        System.out.println("Digite a opção desejada:");
        System.out.println("1) Cadastrar  em Disciplina Disciplina" + "\n");
        System.out.println("2) Fazer logout" + "\n");
        String op = in.nextLine();
        return op;
    }

    public String entraOferta() {
        Scanner in = new Scanner(System.in);

        System.out.println("1) Digite o Id da disciplina" + "\n");
        String op = in.nextLine();
        return op;
    }
}
