import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepositorio extends BaseRepositorio {


    private Professor Base;

    public ProfessorRepositorio(){
        this.carregarCsv();
    }

    public void adicionarObjeto(List<?> element) {

        Base = (Professor) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Professor.csv", true);
            myWriter.write(String.valueOf(this.getId("Professor.csv")+1)+ ";");
            myWriter.write(Base.getLogin() + ";");
            myWriter.write(Base.getSenha() + ";");
            myWriter.write(Base.getNome() + "\n");
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
            System.out.println("Base de Dados de Professores Vazia");
            e.printStackTrace();
        }

        return Professores;
    }

    public String encontrarObjeto(String id) {

        List<Professor> Professores = new ArrayList<>();
        Professores = this.recuperarObjeto();

       return(Professores.get(Integer.parseInt(id) - 1).toString());

    }

    public boolean exist(Usuario user) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("Professor.csv"));
            List<Professor> professores = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Professor lista = new Professor(attributes);
                professores.add(lista);
                line = br.readLine();

            }
            for (Professor ex : professores){
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
        File f = new File("Professor.csv");
        if(!f.exists()){
            try {
                FileWriter myWriter = new FileWriter("Professor.csv",true);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    }

    public void salvarCsv() {

    }
}


