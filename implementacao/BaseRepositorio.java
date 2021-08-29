import java.util.ArrayList;
import java.util.List;


public abstract class BaseRepositorio implements java.io.Serializable{



    public abstract void adicionarObjeto(List<?> Objetos);

    public  abstract List<?> recuperarObjeto();

    public abstract void encontrarObjeto(String id);

    public abstract void carregarCsv();

    public abstract void salvarCsv();


}
