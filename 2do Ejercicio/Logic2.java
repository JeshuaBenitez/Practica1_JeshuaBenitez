import java.util.Scanner;

public class Logic2 {

    public void procesarArchivo(String nombreArchivo) {
        ContarLineas contarLineas = new ContarLineas();
        contarLineas.contarLineas(nombreArchivo);

        ContarMetodos contarMetodos = new ContarMetodos();
        contarMetodos.contarMetodos(nombreArchivo);
    }
}
