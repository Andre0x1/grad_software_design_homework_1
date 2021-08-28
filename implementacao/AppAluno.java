import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class AppAluno {
    public static void main(String[] args) {
        Aluno al = new Aluno("89","32112369",0);
        try {
            File myObj = new File("filename.csv");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("filename.csv");
            myWriter.write(al.getLogin() + ";");
            myWriter.write(al.getSenha() + ";");
            myWriter.write(String.valueOf(al.getDebitos()) + "\n");
            myWriter.write("112233"+ ";");
            myWriter.write(al.getSenha() + ";");
            myWriter.write(String.valueOf(al.getDebitos()) + "\n");

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        List<Aluno> alunos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("filename.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Aluno lista = new Aluno(attributes);
                alunos.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    for (Aluno x : alunos){
        System.out.println("login: "+ x.getLogin() + " senha :" + x.getSenha());
    }

    }
}