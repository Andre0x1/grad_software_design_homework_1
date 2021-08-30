import java.util.Scanner;

public class AlunoView extends BaseView{

    @Override
    public void show() {
        Scanner in = new Scanner(System.in);

        System.out.println("!!!BEM VINDO ALUNO!!!!!");
        System.out.println("Digite a opção desejada:");
        System.out.println("1) Cadastrar Disciplina" + "\n");
        System.out.println("2) Fazer logout" + "\n");
        String op = in.nextLine();
    }
}
