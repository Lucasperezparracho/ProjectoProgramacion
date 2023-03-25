import Datos.Persona;
import Metodos.InterfazRegistro;
import Metodos.UnidadesMedida;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Registro de usuario
        System.out.println("Bienvenido a la calculadora de IMC");
        Persona usuario = InterfazRegistro.registrar();

        // Elección de unidades de medida
        System.out.print("¿Quieres utilizar el sistema métrico o el imperial? (metrico/imperial): ");
        String unidadesMedida = scanner.nextLine().toLowerCase();

        // Introducción de peso y altura
        System.out.print("Introduce tu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce tu altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // consumir el salto de línea

        // Calcula el IMC y el porcentaje de grasa corporal
        UnidadesMedida unidades = new UnidadesMedida(unidadesMedida);
        double imc = CalculadoraIMC.calcularIMC(peso, altura, unidades );
        double porcentajeGrasa = CalculadoraIMC.calcularPorcentajeGrasa(imc, usuario.getEdad(), usuario.getMujer());

        // Impresión de resultados
        System.out.printf("Tu IMC es %.2f\n", imc);
        System.out.printf("Tu porcentaje de grasa es %.2f%%\n", porcentajeGrasa);

    }
}
