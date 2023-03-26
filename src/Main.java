import Datos.Persona;
import Metodos.CalculadoraIMC;
import Metodos.InterfazRegistro;
import Metodos.UnidadesMedida;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Registro de usuario
        System.out.println("Bienvenido a la calculadora de IMC");
        Persona usuario = InterfazRegistro.registrar();

        // Elección de unidades de medida
        System.out.print("¿Quieres utilizar el sistema métrico o el imperial? (Métricas/Inglesas/Americanas): ");
        String unidadesMedida = scanner.nextLine();

        // Introducción de peso y altura
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introduce tu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduce tu altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // consumir el salto de línea

        // Calcula el IMC y el porcentaje de grasa corporal
        UnidadesMedida unidades = new UnidadesMedida(unidadesMedida);
        char sexo = usuario.getSexo();
        double imc = CalculadoraIMC.calcularIMC(peso, altura, unidades );
        double porcentajeGrasa = CalculadoraIMC.calcularPorcentajeGrasa(imc, usuario.getEdad(), sexo);

        // Impresión de resultados
        System.out.printf("Tu IMC es %.2f\n", imc);
        System.out.printf("Tu porcentaje de grasa es %.2f%%\n", porcentajeGrasa);

    }
}
