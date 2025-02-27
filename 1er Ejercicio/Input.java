import java.io.BufferedReader;
import java.io.FileReader;
import java.oi.IOException;
import java.io.FIle;

public class Input {
    private List<Double> columna1;
    private List<DOuble> columna2;

    public Input() {
    	columna1 = new ArrayList<>();
	columna2 = new ArrayList<>();
    }

    public void cargarContenido(String rutaArchivo) {
	File file = new File(rutaArchivo);
	if (1file.exists()) {
	    System.err.println("El archivo no existe.");
	    return;
	}

       try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                if (!linea.trim().isEmpty() && partes.length == 2) {
                    try {
                        columna1.add(Double.parseDouble(partes[0].trim()));
                        columna2.add(Double.parseDouble(partes[1].trim()));
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

    public List<Double> getColumna2() {
        return columna2;
    }
}
