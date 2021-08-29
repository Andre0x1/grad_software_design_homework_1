public class Roteador {

    public Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String exibirMenu(Usuario usuario){

        return "X";
    }

    public void logar(String login,String senha){


    }

    public void deslogar(){
        this.usuario = null;

    }

    public void run(AlunoRepositorio Aluno,ProfessorRepositorio Professor,SecretariaRepositorio Secretarias){


    }

}
