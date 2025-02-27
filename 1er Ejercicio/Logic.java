import java.io.*;
import java.util.*;
import java.nio.file.Paths;

public class Logic {
    private String data;
    private String [] arrData;

    public Logic() {}

    public void ejecutarProceso() {
	    Input myInput = new Input();
	    myInput.cargarContenido("input.txt");
	    Data myData = new Data();
	    Media media = new Media();
	    DesvEst desvEst = new DesvEst();

	    String currentPath = Paths.get("").toAbsolutePath().toString();
	    String projectName = new File(currentPath).getName();

	    System.out.println("Proyecto en ejecución: " + projectName);

	    List<Double> listaColumna1 = myInput.getColumna1();
	    System.out.println("Datos leídos: " + listaColumna1); // Para verificar el contenido de la lista

	    System.out.println("Datos leídos:");
	    System.out.println("Columna 1: " + listaColumna1);

	    // Calculando medias y desviaciones estándar
	    double media1 = media.calcularMedia(listaColumna1);
	    double desv1 = desvEst.calcularDesviacion(media1, listaColumna1);

	    System.out.println("\n Resultados:");
	    System.out.println("Media Columna 1: " + String.format("%.2f", media1));
	    System.out.println("Desviación estándar de la Columna 1: " +  String.format("%.2f",desv1));

	    String resultado = " Proyecto en ejecución: " + projectName +
                "\n Resultados:\n" +
                " Media Columna 1: " + String.format("%.2f", media1) + "\n" +
                " Desviación estándar Columna 1: " + String.format("%.2f", desv1) + "\n";

            // Guardando el resultado en un archivo
	    OutPuT output = new OutPuT();
	    output.guardarResultado("output.txt", resultado);
            System.out.println("Resultados guardados en 'output.txt'");
    }
}
