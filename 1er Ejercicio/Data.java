import java.io.*;
import java.util.*;

public class Data {
    public Data() {}

    public List<String> saveData(String cadena) {
        return Arrays.asList(cadena.split(";"));
    }

    public List<Double> convertToDouble(String[] arrData) {
        List<Double> listaNumeros = new ArrayList<>();
        for (String valor : arrData) {
            try {
                listaNumeros.add(Double.parseDouble(valor.trim()));
            } catch (NumberFormatException e) {
                System.err.println(" Error al convertir el valor a double: " + valor);
            }
        }
        return listaNumeros;
    }
}
