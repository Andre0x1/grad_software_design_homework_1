import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SecretariaRepositorio extends BaseRepositorio {


    private Secretaria Base;

    public void adicionarObjeto(List<?> element) {

        Base = (Secretaria) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Secretaria.csv", true);
            myWriter.write(Base.getLogin() + ";");
            myWriter.write(Base.getSenha() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Secretaria> recuperarObjeto() {

        List<Secretaria> Secretarias = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Secretaria.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Secretaria lista = new Secretaria(attributes);
                Secretarias.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Base de Dados de Secretaria Vazia");
            e.printStackTrace();
        }

        return Secretarias;
    }

    public void encontrarObjeto(String id) {

        List<Secretaria> Secretarias = new ArrayList<>();
        Secretarias = this.recuperarObjeto();

        System.out.println("Secretaria encontrado " + Secretarias.get(Integer.parseInt(id) - 1));

    }

    public void carregarCsv() {

    }

    public void salvarCsv() {

    }
}