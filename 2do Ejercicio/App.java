import java.util.Scanner;

public class App {
	public static void main(String [] args) {
	    Scanner scanner = new Scanner (System.in);

	    // Pedimos el nombre del archivo de .java
	    System.out.println("Ingresa el nombre del archivo .java: ");
	    String nombreArchivo = scanner.nextLine();

	    // Creamos una instancia de Logic2 y procesamos el archivo
	    Logic2 logic2 = new Logic2();
	    logic2.procesarArchivo(nombreArchivo);
	}
}
