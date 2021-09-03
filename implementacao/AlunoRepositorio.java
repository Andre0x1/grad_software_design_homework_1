

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepositorio extends BaseRepositorio {

    private Aluno Base;

     public AlunoRepositorio(){
         this.carregarCsv();
     }

    public void adicionarObjeto(List<?> element) {

        Base = (Aluno) element.get(0);

        try {
            FileWriter myWriter = new FileWriter("Alunos.csv",true);
            myWriter.write(String.valueOf(this.getId("Alunos.csv")+1)+ ";");
            myWriter.write(Base.getLogin() + ";");
            myWriter.write(Base.getSenha() + ";");
            myWriter.write(Base.getNome() + ";");
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

    public String encontrarObjeto(String id) {

        List<Aluno> alunos = new ArrayList<>();
        alunos = this.recuperarObjeto();

        return alunos.get(Integer.parseInt(id)-1).toString();

    }

    public boolean exist(Usuario user) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("Alunos.csv"));
            List<Aluno> alunos = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Aluno lista = new Aluno(attributes);
                alunos.add(lista);
                line = br.readLine();

            }
            for (Aluno ex : alunos){
                if (user.getLogin().equals(ex.getLogin()) && user.getSenha().equals(ex.getSenha())){
                    return  true;
                }
            }
        }catch (IOException e) {
                System.out.println("Base de Dados de Alunos Vazia");
                e.printStackTrace();
            }
        return false;
    }

    public void carregarCsv() {
        File f = new File("Alunos.csv");
                if(!f.exists()){
                    try {
                        FileWriter myWriter = new FileWriter("Alunos.csv",true);
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
    }

    public void salvarCsv() {

    }
}
