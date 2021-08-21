public class Sessao {
    public Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sessao(Usuario user){
        this.usuario = user;
    }
}
