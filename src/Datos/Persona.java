package Datos;

public class Persona {
    private String nombre;
    private String apellidos;
    private String correoElectronico;
    private String contrasena;
    private int edad;
    private char sexo;

    public Persona(String nombre, String apellidos, String correoElectronico, String contrasena, int edad, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo ;
    }
}
