import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppAluno {
    public static void main(String[] args) {



        List<Aluno> alunos = new ArrayList<>();
        AlunoRepositorio X = new AlunoRepositorio();
        alunos.add(new Aluno("89","123",0));
        X.adicionarObjeto(alunos);
        alunos.clear();
        alunos.add(new Aluno("321","123",0));
        X.adicionarObjeto(alunos);
        alunos = X.recuperarObjeto();
        X.encontrarObjeto("2");



        for (Aluno x : alunos) {
            System.out.println(x);
        }
    }
}