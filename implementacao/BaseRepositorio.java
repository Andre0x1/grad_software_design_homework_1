import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public abstract class BaseRepositorio implements java.io.Serializable{



    public abstract void adicionarObjeto(List<?> Objetos);

    public  abstract List<?> recuperarObjeto();

    public abstract void encontrarObjeto(String id);

    public abstract void carregarCsv();

    public abstract void salvarCsv();

    public static long getId(String fileName) {

        long lines = 0;
        Path path = Paths.get(fileName);

        if (Files.exists(path)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.readLine() != null)
                    lines++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return lines;
    }



}
