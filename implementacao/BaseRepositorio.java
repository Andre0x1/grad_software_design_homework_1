public abstract class BaseRepositorio implements java.io.Serializable{

    public Object elementos;

    public abstract void adicionarObjeto(Object elementos);

    public  abstract void recuperarObjeto();

    public abstract void encontrarObjeto(String id);

    public abstract void carregarCsv();

    public abstract void salvarCsv();


}
