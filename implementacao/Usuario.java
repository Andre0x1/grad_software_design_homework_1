public abstract class Usuario extends Object  implements Autentificavel
{
    public String login;
    public String senha;
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(){

    }

    @Override
    public abstract void fazerLogin();

    @Override
    public abstract void fazerLogout();



}