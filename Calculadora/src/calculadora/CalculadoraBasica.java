package calculadora;

import java.util.ArrayList;
public class CalculadoraBasica extends Calculadora{
    @Override
    public void calcular(Operador operador, ArrayList<Double> lista){
        double resultadoDaOperacao = operador.calcular(lista);
        setResultado(resultadoDaOperacao);
    }
}
