import calculadora.*;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Double> lista = new ArrayList<>();
        lista.add(100.0);
        lista.add(5.0);

        Soma soma = new Soma();
        Subtração subtração = new Subtração();
        Multiplicar multiplicar = new Multiplicar();
        Divisao divisao = new Divisao();

        CalculadoraBasica calculadora = new CalculadoraBasica();

        calculadora.calcular(soma, lista);
        System.out.println(calculadora.getResultado());
        calculadora.calcular(subtração, lista);
        System.out.println(calculadora.getResultado());
        calculadora.calcular(multiplicar, lista);
        System.out.println(calculadora.getResultado());
        calculadora.calcular(divisao, lista);
        System.out.println(calculadora.getResultado());
    }
}