import java.io.*;
import java.util.regex.*;

public class Logic2 {
    public void procesarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        // Verificar si el archivo existe
        if (!archivo.exists()) {
            System.err.println("El archivo no existe.");
            return;
        }

        int lineasCodigo = 0;
        int cantidadMetodos = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            Pattern patronMetodo = Pattern.compile("(public|private|protected)\\s+[\\w\\<\\>\\[\\]]+\\s+\\w+\\s*\\(.*\\)");  // Expresión regular para métodos
            while ((linea = lector.readLine()) != null) {
                // Limpiar la línea de espacios y saltos de línea
                String lineaLimpia = linea.trim();

                // Contar líneas de código (no vacías y no solo llaves)
                if (!lineaLimpia.isEmpty() && !lineaLimpia.equals("{") && !lineaLimpia.equals("}")) {
                    lineasCodigo++;
                }

                // Contar métodos usando expresión regular
                Matcher matcher = patronMetodo.matcher(lineaLimpia);
                if (matcher.find()) {
                    cantidadMetodos++;
                }
            }

            System.out.println("El archivo tiene " + lineasCodigo + " líneas de código.");
            System.out.println("El archivo tiene " + cantidadMetodos + " métodos.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
