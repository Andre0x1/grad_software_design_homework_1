public class Matricula {
    public Aluno aluno;
    public Disciplina disciplina;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public  Matricula (Aluno aluno,Disciplina disciplina){
        this.aluno = aluno;
        this.disciplina = disciplina;
    }


    public Matricula (String [] repo){
        this.aluno = new Aluno(repo[0]);
        this.disciplina = new Disciplina(repo[1]);
    }

}
