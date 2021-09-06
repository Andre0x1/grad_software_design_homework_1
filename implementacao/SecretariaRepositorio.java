import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SecretariaRepositorio extends BaseRepositorio {


    private Secretaria Base;


    public SecretariaRepositorio(){
        this.carregarCsv();
    }

    public void adicionarObjeto(List<?> element) {

        Base = (Secretaria) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Secretaria.csv", true);
            myWriter.write(String.valueOf(this.getId("Secretaria.csv")+1)+ ";");
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

    public boolean exist(Usuario user) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("Secretaria.csv"));
            List<Secretaria> secretarias = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Secretaria lista = new Secretaria(attributes);
                secretarias.add(lista);
                line = br.readLine();

            }
            for (Secretaria ex : secretarias){
                if (user.getLogin().equals(ex.getLogin()) && user.getSenha().equals(ex.getSenha())){
                    return  true;
                }
            }
        }catch (IOException e) {
            System.out.println("Base de Dados de Professor Vazia");
            e.printStackTrace();
        }
        return false;
    }

    public void carregarCsv() {
        File f = new File("Secretaria.csv");
        Base =  new Secretaria();
        if(!f.exists()){
            try {
                FileWriter myWriter = new FileWriter("Secretaria.csv",true);
                myWriter.write(String.valueOf(this.getId("Secretaria.csv")+1)+ ";");
                myWriter.write(Base.getLogin() + ";");
                myWriter.write(Base.getSenha() + "\n");
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public void salvarCsv() {

    }
}