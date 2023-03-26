package Metodos;

import Datos.Persona;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InterfazRegistro {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Persona> registro = new ArrayList<>();

    public static Persona registrar() {
        System.out.println("Por favor, introduce tus datos para registrarte:");

        // Pide los datos personales
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea
        System.out.print("Sexo(M/H): ");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);
        scanner.nextLine(); // consumir el salto de línea

        // Crea un nuevo usuario y lo añade al registro
        Persona usuario = new Persona(nombre, apellidos, correoElectronico, contraseña, edad, sexo);
        registro.add(usuario);

        // Escribe el registro en un fichero
        escribirRegistroEnFichero();

        System.out.println("Registro completado.");
        return usuario;
    }

    private static void escribirRegistroEnFichero() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("registro.txt"));

            for (Persona usuario : registro) {
                writer.write(usuario.toString());
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
