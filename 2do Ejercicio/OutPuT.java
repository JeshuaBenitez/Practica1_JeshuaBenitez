import java.io.*;
import java.util.*;

public class OutPuT {
    public OutPuT(){}

    public void guardarResultado(String rutaSalida, String contenido) {
	    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaSalida))) {
		escritor.write(contenido);
	    } catch (IOException e) {
		System.err.println("Error al escribir en el archivo: " + e.getMessage());
	    }
    }
}
