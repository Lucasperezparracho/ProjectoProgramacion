package Datos;

public class Persona {
    private String nombre;
    private String apellidos;
    private String correoElectronico;
    private String contrasena;
    private int edad;
    private boolean mujer;

    public Persona(String nombre, String apellidos, String correoElectronico, String contrasena, int edad, boolean mujer) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.edad = edad;
        this.mujer = mujer;
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

    public boolean getMujer() {
        return mujer;
    }
}
