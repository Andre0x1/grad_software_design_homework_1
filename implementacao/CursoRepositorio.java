import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CursoRepositorio extends BaseRepositorio {

    private Curso Base;
    private List<Disciplina> disc ;

    public void adicionarObjeto(List<?> element) {

        Base = (Curso) element.get(0);
        DisciplinaRepositorio DR = new DisciplinaRepositorio();

        disc = DR.recuperarObjeto();

        try {
            FileWriter myWriter = new FileWriter("Curso.csv", true);
            myWriter.write(String.valueOf(this.getId("Curso.csv") + 1) + ";");
            myWriter.write(Base.getNome() + ";");
            for(Disciplina D : Base.getDisc()){
                for (int i = 0 ;i <disc.size();i++){
                    if(D.getNome().equals(disc.get(i).getNome())){
                        myWriter.write(String.valueOf(i+1) + ",");
                    }
                }
            }
            myWriter.write("\n");
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

        File f = new File("Curso.csv");
        if(!f.exists()){
            try {
                FileWriter myWriter = new FileWriter("Curso.csv",true);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public void salvarCsv() {

    }


}
