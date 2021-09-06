import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;

public class Curso {

   public List <Disciplina> disc = new ArrayList<>();
   public String nome;


    public List<Disciplina> getDisc() {
        return disc;
    }

    public void setDisc(List<Disciplina> disc) {
        this.disc = disc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso(){

    }

    public Curso(List<Disciplina> Disciplinas,String nome){
        this.disc = Disciplinas;
        this.nome = nome;
    }


    public  Curso (String [] repo){
        String Disciplina = repo[1] + "," + repo[2] +  "," + repo[3]+  "," + repo[4]+  "," + repo[5];
        this.disc.add(new Disciplina(Disciplina));
        this.nome = repo[1];
    }

    public Curso (String line){
        String[] attributes = line.split(",");

        DisciplinaRepositorio DR = new DisciplinaRepositorio();
        String[] discs = attributes[1].split(" ");

        this.nome = attributes[0];
        for(String id : discs){
            Disciplina D = new Disciplina(DR.encontrarObjeto(id));
            this.disc.add(D);
        }
    }
}
