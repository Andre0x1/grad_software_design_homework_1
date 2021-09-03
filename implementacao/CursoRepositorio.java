import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CursoRepositorio extends BaseRepositorio {

    private Curso Base;

    public void adicionarObjeto(List<?> element) {

        Base = (Curso) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Curso.csv", true);
            myWriter.write(String.valueOf(this.getId("Curso.csv") + 1) + ";");
            myWriter.write(Base.getDisc().toString() + ";");
            myWriter.write(Base.getNome() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Curso> recuperarObjeto() {

        List<Curso> Cursos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Curso.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Curso lista = new Curso(attributes);
                Cursos.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Base de Dados de Secretaria Vazia");
            e.printStackTrace();
        }

        return Cursos;
    }

    public String encontrarObjeto(String id) {
        List<Curso> Cursos = new ArrayList<>();
        Cursos = this.recuperarObjeto();
        return Cursos.get(Integer.parseInt(id) - 1).toString();
    }

    public void carregarCsv() {

    }

    public void salvarCsv() {

    }


}
