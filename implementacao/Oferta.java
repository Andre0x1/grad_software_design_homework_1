import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Oferta {
    public int minAlunos;
    public List<Aluno> Alunos;
    public Disciplina Disciplina;
    public String semestre;
    public String status;
    public String inicioOferta;
    public String fimOferta;

    public int getMinAlunos() {
        return minAlunos;
    }

    public void setMinAlunos(int minAlunos) {
        this.minAlunos = minAlunos;
    }

    public List<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.Alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.Disciplina = disciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        semestre = semestre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInicioOferta() {
        return inicioOferta;
    }

    public void setInicioOferta(String inicioOferta) {
        this.inicioOferta = inicioOferta;
    }

    public String getFimOferta() {
        return fimOferta;
    }

    public void setFimOferrta(Date fimOferrta) {
        this.fimOferta = fimOferta;
    }

    public void addAluno(Aluno al) {
        this.Alunos.add(al);
    }

    public void removeAluno(Aluno al) {
        this.Alunos.remove(al);
    }

    public boolean verificaLimite() {
        if (this.Alunos.size() < this.getMinAlunos()) {
            return true;
        } else {
            return false;
        }
    }

    public Oferta(String data) {

        DisciplinaRepositorio DR = new DisciplinaRepositorio();
        String[] attributes = data.split(",");
        this.minAlunos = Integer.parseInt(attributes[0]);
        this.Disciplina = new Disciplina(DR.encontrarObjeto(attributes[1]));
        this.semestre = attributes[2];
        this.status = attributes[3];
        this.Alunos = new ArrayList<>();
        this.inicioOferta = attributes[4];
        this.fimOferta = attributes[5];

    }

    public void processaMatricula() {
        MatriculaRepositorio MR = new MatriculaRepositorio();
        List<Matricula> LM = new ArrayList<>();

        for (Aluno al : Alunos) {
            Matricula M = new Matricula(al, Disciplina);
            M.emitirCobranca();
            LM.add(M);
            MR.adicionarObjeto(LM);
        }
    }

    public  Oferta (String [] repo){
        DisciplinaRepositorio DR = new DisciplinaRepositorio();
        AlunoRepositorio AR = new AlunoRepositorio();
        String [] Disc =  repo[2].split(",");
        String [] Als =  repo[3].split(",");

        if (!Als[0].equals("")){
            for (String s : Als) {
                Aluno al = new Aluno(AR.encontrarObjeto(s));
                this.Alunos.add(al);
            }
        }else{
            Alunos = new ArrayList<>();
        }
        this.minAlunos = Integer.parseInt(repo[1]);
        this.Disciplina = new Disciplina(DR.encontrarObjeto(Disc[0]));
        this.semestre = repo[4];
        this.status = repo[5];
        this.inicioOferta = repo[6];
        this.fimOferta = repo[7];
    }

    @Override
    public String toString() {
        return minAlunos+","+Disciplina.getNome()+","+status+","+inicioOferta +","+fimOferta;
    }
}
