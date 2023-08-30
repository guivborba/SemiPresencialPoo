package calculadora;

import java.util.ArrayList;
public class Soma implements Operador {
    @Override
    public double calcular(ArrayList<Double> valores) {
        double result = 0.0;
        for (int i = 0; i < valores.size(); i++) {
            result += valores.get(i);
        }
        return result;
    }
}

