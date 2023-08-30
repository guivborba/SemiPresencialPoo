package calculadora;

import java.util.ArrayList;

public class Subtração implements Operador {
    public double calcular(ArrayList<Double> valores) {
        double result = 0.0;
        for (int i = 0; i < valores.size(); i++) {
            if(i==0){
                result = valores.get(i);
            }else {
                result -= valores.get(i);
            }
        }
        return result;
    }
}
