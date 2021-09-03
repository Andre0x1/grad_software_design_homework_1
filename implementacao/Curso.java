import java.util.List;

public class Curso {

   public List <Disciplina> disc;
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
        this.nome = repo[0];
    }

    public Curso (String line){
        String[] attributes = line.split(",");
        String Disciplina = attributes[1] + "," + attributes[2] +  "," + attributes[3]+  "," + attributes[4]+  "," + attributes[5];
        this.nome = attributes[0];

    }




}
