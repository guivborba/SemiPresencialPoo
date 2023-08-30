package calculadora;

import java.util.ArrayList;

public class Divisao implements Operador{
    @Override
    public double calcular(ArrayList<Double> valores) {
        double result = 0.0;
        for (int i = 1; i < valores.size(); i++) {
            result /= valores.get(i);
        }
        return result;
    }
}
