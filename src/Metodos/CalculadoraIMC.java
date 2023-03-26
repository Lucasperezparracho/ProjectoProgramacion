package Metodos;

import Metodos.UnidadesMedida;

public class CalculadoraIMC {
    public static double calcularIMC(double peso, double altura, UnidadesMedida unidades) {
        double alturaConvertida = unidades.convertirAltura(altura);
        return peso / (alturaConvertida * alturaConvertida);
    }

    public static double calcularPorcentajeGrasa(double imc, int edad, char sexo) {
        double porcentajeGrasa;
        if (Character.toUpperCase(sexo) == 'M') {
            porcentajeGrasa = 1.2 * imc + 0.23 * edad - 5.4 - 10.8;
        } else {
            porcentajeGrasa = 1.2 * imc + 0.23 * edad - 16.2;
        }
        return porcentajeGrasa;
    }
}
