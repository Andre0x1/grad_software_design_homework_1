import java.util.ArrayList;
import java.util.List;

public class Aluno  extends  Usuario {

    public double debitos;

    public  void fazerLogin(){ }
    public  void fazerLogout(){ }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }

    @Override
    public String toString() {

        return  login + ","+senha+"," + debitos;
    }

    public void ingressarEmOferta(String var,Aluno Al){
        OfertaRepositorio OR = new OfertaRepositorio();
        List<Oferta> ofertas = OR.recuperarObjeto();
        OR.carregarCsv();

        for (int i = 0; i < ofertas.size(); i++) {
            if (String.valueOf(i+1).equals(var)) {
               ofertas.get(i).getAlunos().add(Al);
            }
        }

        for (Oferta aux : ofertas){
            List<Oferta> offers = new ArrayList<>();
            offers.add(aux);
            OR.adicionarObjeto(offers);
        }
    }

    public Aluno (String login,String senha,String nome,double debito){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.debitos = debito;
    }

    public Aluno (String login,String senha,String nome){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.debitos = 0;
    }

    public Aluno (String [] repo){
        this.login = repo[1];
        this.senha = repo[2];
        this.nome = repo[3];
        this.debitos = Double.parseDouble(repo[4]);
    }

    public Aluno (String line){
        String[] attributes = line.split(",");

        this.login = attributes[0];
        this.senha = attributes[1];
        this.nome = attributes[2];
        this.debitos = 0;

    }

}