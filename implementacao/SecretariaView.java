import java.util.Scanner;

public class SecretariaView extends BaseView{


    @Override
    public void show() {
        Scanner in = new Scanner(System.in);

        System.out.println("!!!BEM VINDO SECRETARIA!!!!!");
        System.out.println("Digite a opção desejada:");
        System.out.println("1) Para cadastrar  usuario" + "\n");
        System.out.println("2) Para cadastrar  disciplina" + "\n");
        System.out.println("3) Fazer logout" + "\n");
        String op = in.nextLine();
    }
}
