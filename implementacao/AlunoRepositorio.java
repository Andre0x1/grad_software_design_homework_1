import sun.util.resources.cldr.chr.CalendarData_chr_US;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepositorio extends BaseRepositorio {

    private Aluno Base;

    public void adicionarObjeto(List<?> element) {

        Base = (Aluno) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Alunos.csv",true);
            myWriter.write(String.valueOf(this.getId("Alunos.csv")+1)+ ";");
            myWriter.write(Base.getLogin() + ";");
            myWriter.write(Base.getSenha() + ";");
            myWriter.write(String.valueOf(Base.getDebitos()) + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Aluno> recuperarObjeto() {

        List<Aluno> alunos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Alunos.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Aluno lista = new Aluno(attributes);
                alunos.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Base de Dados de Alunos Vazia");
            e.printStackTrace();
        }

        return alunos;
    }

    public void encontrarObjeto(String id) {

        List<Aluno> alunos = new ArrayList<>();
        alunos = this.recuperarObjeto();

        System.out.println("Aluno encontradao " + alunos.get(Integer.parseInt(id)-1));

    }

    public void carregarCsv() {

    }

    public void salvarCsv() {

    }
}
