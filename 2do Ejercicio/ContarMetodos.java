import java.io.*;
import java.util.regex.*;

public class ContarMetodos {
    public void contarMetodos(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            System.err.println("El archivo no existe.");
            return;
        }

        int cantidadMetodos = 0;

        Pattern patronMetodo = Pattern.compile("(public|private|protected)?\\s*([\\w\\<\\>\\[\\]]+)\\s+([\\w]+)\\s*\\(.*\\)");  // Detecta métodos y constructores

        Pattern patronMain = Pattern.compile("public\\s+static\\s+void\\s+main\\s*\\(.*\\)"); // Detecta el método main

        boolean dentroDeLaClaseApp = false;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String lineaLimpia = linea.trim();

                if (lineaLimpia.startsWith("public class App") || lineaLimpia.startsWith("class App")) {
                    dentroDeLaClaseApp = true; // Entramos en la clase App
                }

                if (dentroDeLaClaseApp && lineaLimpia.equals("}")) {
                    dentroDeLaClaseApp = false; // Terminamos de analizar la clase App
                }

                if (dentroDeLaClaseApp) {
                    Matcher matcherMain = patronMain.matcher(lineaLimpia);
                    if (matcherMain.find()) {
                        cantidadMetodos++;  // Contar el método main también
                    }

                    Matcher matcherMetodo = patronMetodo.matcher(lineaLimpia);
                    if (matcherMetodo.find()) {
                        cantidadMetodos++;
                    }
                }
            }
            System.out.println("El archivo tiene " + cantidadMetodos + " métodos.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
