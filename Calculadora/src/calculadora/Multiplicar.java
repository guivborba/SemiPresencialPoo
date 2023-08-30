package calculadora;

import java.util.ArrayList;

public class Multiplicar implements Operador {
    @Override
    public double calcular(ArrayList<Double> valores) {
        double result = 1.0;
        for (int i = 0; i < valores.size(); i++) {
            result *= valores.get(i);
        }
        return result;
    }
}