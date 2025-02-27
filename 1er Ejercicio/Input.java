import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class Input {
    private List<Double> columna1;

    public Input() {
    	columna1 = new ArrayList<>();
    }

    public void cargarContenido(String rutaArchivo) {
       File file = new File(rutaArchivo);
       if (!file.exists()) {
           System.err.println("El archivo no existe.");
           return;
       }

       try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
           String linea;
           // Leemos cada línea del archivo
           while ((linea = lector.readLine()) != null) {
	       System.out.println("Leyendo línea: " + linea); // Imprimir cada linea que se lee
               if (!linea.trim().isEmpty()) {
                   try {
                       // Convertir el valor a DOuble y añadirlo a columna1
                       columna1.add(Double.parseDouble(linea.trim()));
                   } catch (NumberFormatException e) {
                       System.err.println("Error al convertir valores: " + linea);
                   }
               }
           }
       } catch (IOException e) {
           System.err.println("Error al leer el archivo: " + e.getMessage());
       }
    }

    public List<Double> getColumna1() {
	return columna1;
    }
}
