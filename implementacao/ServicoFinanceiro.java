public class ServicoFinanceiro {
    public void emitirCobranca(Aluno aluno , Disciplina disciplina){
        aluno.setDebitos(aluno.getDebitos() + disciplina.getPreco());
    }
    public void quitarDebitos(){}
}
