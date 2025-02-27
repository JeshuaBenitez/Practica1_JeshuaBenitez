import java.io.*;
import java.util.*;
import java.util.List;

public class DesvEst {
    public double calcularDesviacion(double media, List<Double> datos) {
	    double sumaDiferenciasCuadradas = 0;
	    int n = datos.size();
	    for (double valor : datos) {
		sumaDiferenciasCuadradas += Math.pow(valor - media, 2);
	    }
	    return Math.sqrt(sumaDiferenciasCuadradas / (n - 1));
    }
}
