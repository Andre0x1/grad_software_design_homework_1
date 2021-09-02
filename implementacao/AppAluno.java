import java.util.ArrayList;
import java.util.List;

public class AppAluno {
    public static void main(String[] args) {
        Roteador application = new Roteador();
        AlunoRepositorio AR = new AlunoRepositorio();
        ProfessorRepositorio PR = new ProfessorRepositorio();
        SecretariaRepositorio SR = new SecretariaRepositorio();

        application.run(AR,PR,SR);

    }
}