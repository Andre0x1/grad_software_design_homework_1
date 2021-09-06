import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatriculaRepositorio extends BaseRepositorio {


    private Matricula Base;

    public void adicionarObjeto(List<?> element) {

        Base = (Matricula) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Matricula.csv", true);
            myWriter.write(String.valueOf(this.getId("Matricula.csv")+1)+ ";");
            myWriter.write(Base.getAluno().getNome()+ ";");
            myWriter.write(Base.getDisciplina().getNome()+ "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Matricula> recuperarObjeto() {

        List<Matricula> Matriculas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Matricula.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Matricula lista = new Matricula(attributes);
                Matriculas.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Base de Dados de Secretaria Vazia");
            e.printStackTrace();
        }

        return Matriculas;
    }

    public String encontrarObjeto(String id) {

        List<Matricula> Matriculas = new ArrayList<>();
        Matriculas = this.recuperarObjeto();

       return Matriculas.get(Integer.parseInt(id) - 1).toString();

    }

    public void carregarCsv() {

    }

    public void salvarCsv() {

    }
}