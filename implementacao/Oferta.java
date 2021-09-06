import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Oferta {
    public int minAlunos;
    public List<Aluno> alunos;
    public Disciplina disciplina;
    public String Semestre;
    public String status;
    public Date inicioOferta;
    public Date fimOferrta;

    public int getMinAlunos() {
        return minAlunos;
    }

    public void setMinAlunos(int minAlunos) {
        this.minAlunos = minAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getInicioOferta() {
        return inicioOferta;
    }

    public void setInicioOferta(Date inicioOferta) {
        this.inicioOferta = inicioOferta;
    }

    public Date getFimOferrta() {
        return fimOferrta;
    }

    public void setFimOferrta(Date fimOferrta) {
        this.fimOferrta = fimOferrta;
    }

    public void addAluno(Aluno al){
        this.alunos.add(al);
    }

    public void removeAluno(Aluno al){
        this.alunos.remove(al);
    }

    public boolean verificaLimite(){
        if(this.alunos.size() < this.getMinAlunos()){
            return true;
        }else{
            return false;
        }
    }

    public void processaMatricula(){
        MatriculaRepositorio MR = new MatriculaRepositorio();
        List<Matricula> LM = new ArrayList<>();

        for(Aluno al : alunos ){
            Matricula M = new Matricula(al,disciplina);
            M.emitirCobranca();
            LM.add(M);
            MR.adicionarObjeto(LM);
        }
    }




}
