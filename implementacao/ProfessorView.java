import java.util.Scanner;

public class ProfessorView extends BaseView{

    @Override
    public String show() {
        Scanner in = new Scanner(System.in);

        System.out.println("!!!BEM VINDO Professor!!!!!");
        System.out.println("Digite a opção desejada:");
        System.out.println("1) Listar Alunos");
        System.out.println("2) Fazer logout" + "\n");
        String op = in.nextLine();
        return op;
    }

}
