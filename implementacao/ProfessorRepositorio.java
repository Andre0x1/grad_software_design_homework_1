import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepositorio extends BaseRepositorio {


    private Professor Base;

    public void adicionarObjeto(List<?> element) {

        Base = (Professor) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Professor.csv", true);
            myWriter.write(String.valueOf(this.getId("Professor.csv")+1)+ ";");
            myWriter.write(Base.getLogin() + ";");
            myWriter.write(Base.getSenha() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Professor> recuperarObjeto() {

        List<Professor> Professores = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Professor.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Professor lista = new Professor(attributes);
                Professores.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Base de Dados de Alunos Vazia");
            e.printStackTrace();
        }

        return Professores;
    }

    public void encontrarObjeto(String id) {

        List<Professor> Professores = new ArrayList<>();
        Professores = this.recuperarObjeto();

        System.out.println("Professor encontrado " + Professores.get(Integer.parseInt(id) - 1));

    }

    public void carregarCsv() {

    }

    public void salvarCsv() {

    }
}


