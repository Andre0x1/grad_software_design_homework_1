import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaRepositorio extends BaseRepositorio{

    private Disciplina Base;

    public void adicionarObjeto(List<?> element) {

        Base = (Disciplina) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Disciplina.csv", true);
            myWriter.write(String.valueOf(this.getId("Disciplina.csv")+1)+ ";");
            myWriter.write(Base.getProfessorAtual().toString() + ";");
            myWriter.write(String.valueOf(Base.getPreco()) + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Disciplina> recuperarObjeto() {

        List<Disciplina> Disciplinas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Disciplina.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Disciplina lista = new Disciplina(attributes);
                Disciplinas.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Base de Dados de Secretaria Vazia");
            e.printStackTrace();
        }

        return Disciplinas;
    }

    public void encontrarObjeto(String id) {

        List<Disciplina> Disciplinas = new ArrayList<>();
        Disciplinas = this.recuperarObjeto();

        System.out.println("Disciplina encontrado " + Disciplinas.get(Integer.parseInt(id) - 1));

    }

    public void carregarCsv() {

    }

    public void salvarCsv() {

    }

}
