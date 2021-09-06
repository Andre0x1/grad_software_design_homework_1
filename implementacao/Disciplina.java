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

        this.nome = repo[1];
        this.Tipo = repo[2];
        this.professorAtual = new Professor(repo[3]);
        this.preco = Double.parseDouble(repo[4]);
        this.limiteAlunos = Integer.parseInt(repo[5]);
    }


    public Disciplina (String line){
        String[] attributes = line.split(",");
        String prof = attributes[2] + "," + attributes[3] +  "," + attributes[4];
        this.nome = attributes[0];
        this.Tipo = attributes[1];
        this.professorAtual = new Professor(prof);
        this.preco = Double.parseDouble(attributes[5]);
        this.limiteAlunos = Integer.parseInt(attributes[6]);

    }

    @Override
    public String toString() {
        return(nome+","+Tipo+","+professorAtual.getLogin()+","+professorAtual.getSenha()+","+professorAtual.getNome()+","+preco+","+limiteAlunos);
    }
}