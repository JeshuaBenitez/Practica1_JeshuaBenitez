import java.io.*;
import java.util.*;
import java.nio.file.Paths;

public class Logic {
    private String data;
    private String [] arrData;

    public Logic() {}

    public void ejecutarProceso() {
	    Input myInput = new Input();
	    Data myData = new Data();
	    Media media = new Media();
	    DesvEst output = new OutPuT();

	    String currentPath = Paths.get("").toAbsolutePath().toString();
	    String projectName = new File(currentPath).getName();

	    System.out.println("Proyecto en ejecución:  " + proyectName);
	    System.out.println("Leyendo datos desde 'input.txt'...");

	    List<Double> listaColumna1 = myInput.getColumna1();
	    List<Double> listaColumna2 = myInput.gerColumna2();

	    System.out.println("Datos leídos:");
	    System.out.println("Columna 1: " + listaColumna1);
            System.out.println("Columna 2: " + listaColumna2);

	    double media1 = media.calcularMedia(listaColumna1);
	    double desv1 = desvESt.calcularDesviacion(media1, listaColumna1);

            double media2 = media.calcularMedia(listaColumna2);
            double desv2 = desvESt.calcularDesviacion(media1, listaColumna2);

	    System.out.println("\n Resultados:");
	    Syetem.out.println("Media Columna 1: " + String.format("%.2f", media1));
	    System.out.println("Desviación estándar de la Columna 1: " +  String.format("%.2f",desv1));
	    System.out.println("Media Columna 2: " + String.format("%.2f", media2));
	    System.out.println("Desviacion estándar Columna 2: " + String.format("%.2f", desv2));

	    String resultado = " Proyecto en ejecución: " + projectName +
                "\n Resultados:\n" +
                " Media Columna 1: " + String.format("%.2f", media1) + "\n" +
                " Desviación estándar Columna 1: " + String.format("%.2f", desv1) + "\n" +
                " Media Columna 2: " + String.format("%.2f", media2) + "\n" +
                " Desviación estándar Columna 2: " + String.format("%.2f", desv2);

            output.guardarResultado("output.txt", resultado);
            System.out.println(" Resultados guardados en 'output.txt'");
