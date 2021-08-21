public class Disciplina {

    public String nome;
    public String Tipo;
    public Professor professorAtual;
    public double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public Professor getProfessorAtual() {
        return professorAtual;
    }

    public void setProfessorAtual(Professor professorAtual) {
        this.professorAtual = professorAtual;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void removerProfessor(){

    }

    public Disciplina (){

        this.nome = "PADRAO";
        this.Tipo = "PADRAO";
        this.professorAtual = null;
        this.preco = 0;
    }

    public Disciplina (String nome,String tipo,Professor professor,double preco){

        this.nome = nome;
        this.Tipo = tipo;
        this.professorAtual = professor;
        this.preco = preco;
    }

    public Disciplina (String nome,String tipo,double preco){

        this.nome = nome;
        this.Tipo = tipo;
        this.professorAtual = null;
        this.preco = preco;
    }
}