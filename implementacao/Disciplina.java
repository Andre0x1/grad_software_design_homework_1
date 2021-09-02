public class Disciplina {

    public String nome;
    public String Tipo;
    public Professor professorAtual;
    public double preco;
    public int limiteAlunos;

    public int getLimiteAlunos() {
        return limiteAlunos;
    }

    public void setLimiteAlunos(int limiteAlunos) {
        this.limiteAlunos = limiteAlunos;
    }

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
        this.limiteAlunos = 30;
    }

    public Disciplina (String nome,String tipo,Professor professor,double preco,int limite){

        this.nome = nome;
        this.Tipo = tipo;
        this.professorAtual = professor;
        this.preco = preco;
        this.limiteAlunos = limite;
    }

    public Disciplina (String nome,String tipo,double preco){

        this.nome = nome;
        this.Tipo = tipo;
        this.professorAtual = null;
        this.preco = preco;
        this.limiteAlunos = 30;
    }

    public  Disciplina (String [] repo){
        this.nome = repo[0];
        this.Tipo = repo[1];
        this.professorAtual = new Professor(repo[2]);
        this.preco = Double.parseDouble(repo[3]);
        this.limiteAlunos = Integer.parseInt(repo[4]);
    }

    public Disciplina (String line){
        String[] attributes = line.split(",");

        this.nome = attributes[0];
        this.Tipo = attributes[1];
        this.professorAtual = new Professor(attributes[2]);
        this.preco = Double.parseDouble(attributes[3]);
        this.limiteAlunos = Integer.parseInt(attributes[4]);

    }

    @Override
    public String toString() {
        return(String.valueOf(nome+","+Tipo+","+professorAtual.toString()+","+preco));
    }
}