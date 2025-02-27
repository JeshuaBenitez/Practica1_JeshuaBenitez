import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del archivo .java: ");
        String nombreArchivo = scanner.nextLine();

        ContarLineas contarLineas = new ContarLineas();
        contarLineas.contarLineas(nombreArchivo);

        ContarMetodos contarMetodos = new ContarMetodos();
        contarMetodos.contarMetodos(nombreArchivo);
    }
}
