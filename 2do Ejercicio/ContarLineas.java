import java.io.*;

public class ContarLineas {
    public void contarLineas(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        // Verificar si el archivo existe
        if (!archivo.exists()) {
            System.err.println("El archivo no existe.");
            return;
        }

        int lineasCodigo = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                // Limpiar la línea de espacios y saltos de línea
                String lineaLimpia = linea.trim();

                // Contar líneas de código (no vacías y no solo llaves)
                if (!lineaLimpia.isEmpty() && !lineaLimpia.equals("{") && !lineaLimpia.equals("}")) {
                    lineasCodigo++;
                }
            }

            System.out.println("El archivo tiene " + lineasCodigo + " líneas de código.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
