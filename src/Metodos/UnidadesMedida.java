package Metodos;

public class UnidadesMedida {
    private double factorPeso;
    private double factorAltura;

    public UnidadesMedida(String tipoUnidades) {
        if (tipoUnidades.equals("Métricas")) {
            factorPeso = 1.0;
            factorAltura = 1.0;
        } else if (tipoUnidades.equals("Inglesas")) {
            factorPeso = 0.453592;
            factorAltura = 0.0254;
        } else if (tipoUnidades.equals("Americanas")) {
            factorPeso = 2.20462;
            factorAltura = 0.0254;
        } else {
            throw new IllegalArgumentException("Tipo de unidades no válido");
        }
    }

    public double convertirPeso(double peso) {
        return peso * factorPeso;
    }

    public double convertirAltura(double altura) {
        return altura * factorAltura;
    }
}
