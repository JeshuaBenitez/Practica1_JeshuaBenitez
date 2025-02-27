import java.io.*;
import java.util.*;
import java.util.List;

public class Media {
     public double calcularMedia(List<Double> datos) {
	    double suma = 0;
	    for (double valor : datos) {
		suma += valor;
	    }
	    return suma / datos.size();
     }
}
