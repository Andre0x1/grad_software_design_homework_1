import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OfertaRepositorio extends BaseRepositorio {

    private Oferta Base;
    private List<Disciplina> disc;
    private List<Aluno> al;

    public void adicionarObjeto(List<?> element) {

        Base = (Oferta) element.get(0);
        DisciplinaRepositorio DR = new DisciplinaRepositorio();
        AlunoRepositorio AR = new AlunoRepositorio();

        disc = DR.recuperarObjeto();
        al = AR.recuperarObjeto();

        try {
            FileWriter myWriter = new FileWriter("Oferta.csv", true);
            myWriter.write(String.valueOf(this.getId("Oferta.csv") + 1) + ";");
            myWriter.write(Base.getMinAlunos() + ";");

            for (int i = 0; i < disc.size(); i++) {
                if (Base.getDisciplina().getNome().equals(disc.get(i).getNome())) {
                    myWriter.write(String.valueOf(i + 1) + ",");
                }
            }
            myWriter.write(";");
            if(!Base.getAlunos().isEmpty()){
                for (Aluno A : Base.getAlunos()) {
                    for (int i = 0; i < al.size(); i++) {
                        if (A.getLogin().equals(al.get(i).getLogin())) {
                            myWriter.write(String.valueOf(i + 1) + ",");
                        }
                    }
                }
            }
            myWriter.write(";");
            myWriter.write(Base.getSemestre() + ";");
            myWriter.write(Base.getStatus() + ";");
            myWriter.write(Base.getInicioOferta() + ";");
            myWriter.write(Base.getFimOferta() + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Oferta> recuperarObjeto() {

        List<Oferta> Ofertas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Oferta.csv"));
            String line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(";");

                Oferta lista = new Oferta(attributes);
                Ofertas.add(lista);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Base de Dados de Secretaria Vazia");
            e.printStackTrace();
        }

        return Ofertas;
    }

    public String encontrarObjeto(String id) {

        List<Oferta> Ofertas = this.recuperarObjeto();

        Oferta D = Ofertas.get(Integer.parseInt(id) - 1);

        return D.toString();

    }

    public void carregarCsv() {
        File f = new File("Oferta.csv");
        if(f.exists() && f.delete()){
            try {
                FileWriter myWriter = new FileWriter("Disciplina.csv",true);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public void salvarCsv() {

    }


}
