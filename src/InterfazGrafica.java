/*
import Metodos.UnidadesMedida;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfazGrafica extends JFrame implements ActionListener {
    private JTextField nombreField, apellidosField, correoField, edadField, pesoField, alturaField;
    private JCheckBox esMujer;
    private JComboBox<String> unidadesBox;
    private JLabel resultadoIMCLabel, resultadoPorcentajeGrasaLabel;

    public InterfazGrafica() {
        // Configurar la ventana principal
        setTitle("Calculadora de IMC y porcentaje de grasa corporal");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear los elementos gráficos
        crearPanelDatosPersonales();
        crearPanelMedidas();
        crearPanelResultados();
        crearPanelBotones();

        // Mostrar la ventana principal
        setVisible(true);
    }

    private void crearPanelDatosPersonales() {
        // Crear el panel para los datos personales
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Datos personales"));

        // Crear los elementos gráficos para los datos personales
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField(20);

        JLabel apellidosLabel = new JLabel("Apellidos:");
        apellidosField = new JTextField(20);

        JLabel correoLabel = new JLabel("Correo electrónico:");
        correoField = new JTextField(20);

        JLabel edadLabel = new JLabel("Edad:");
        edadField = new JTextField(3);

        esMujer = new JCheckBox("Mujer");

        // Añadir los elementos al panel
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(apellidosLabel);
        panel.add(apellidosField);
        panel.add(correoLabel);
        panel.add(correoField);
        panel.add(edadLabel);
        panel.add(edadField);
        panel.add(esMujer);

        // Añadir el panel a la ventana principal
        add(panel, BorderLayout.NORTH);
    }

    private void crearPanelMedidas() {
        // Crear el panel para las medidas
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Medidas"));

        // Crear los elementos gráficos para las medidas
        JLabel unidadesLabel = new JLabel("Unidades de medida:");
        unidadesBox = new JComboBox<String>(new String[]{"Métrico", "Imperial"});

        JLabel pesoLabel = new JLabel("Peso:");
        pesoField = new JTextField(5);

        JLabel alturaLabel = new JLabel("Altura:");
        alturaField = new JTextField(5);

        // Añadir los elementos al panel
        panel.add(unidadesLabel);
        panel.add(unidadesBox);
        panel.add(pesoLabel);
        panel.add(pesoField);
        panel.add(alturaLabel);
        panel.add(alturaField);

        // Añadir el panel a la ventana principal
        add(panel, BorderLayout.CENTER);
    }

    private void crearPanelResultados() {
        // Crear el panel para los resultados
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Resultados"));

        // Crear los elementos gráficos para los resultados
        JLabel resultadoIMC = new JLabel("IMC:");
        resultadoIMCLabel = new JLabel("");

        JLabel resultadoPorcentajeGrasa = new JLabel("Porcentaje de grasa corporal:");
        resultadoPorcentajeGrasaLabel = new JLabel("");

        // Añadir los elementos al panel
        panel.add(resultadoIMC);
        panel.add(resultadoIMCLabel);
        panel.add(resultadoPorcentajeGrasa);
        panel.add(resultadoPorcentajeGrasaLabel);

        // Añadir el panel a la ventana principal
        add(panel, BorderLayout.SOUTH);
    }

    private void crearPanelBotones() {
        // Crear el panel para los botones
        JPanel panel = new JPanel(new FlowLayout());

        // Crear los botones
        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);

        JButton limpiarButton = new JButton("Limpiar");
        limpiarButton.addActionListener(this);

        // Añadir los botones al panel
        panel.add(calcularButton);
        panel.add(limpiarButton);

        // Añadir el panel a la ventana principal
        add(panel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.equals("Calcular")) {
            // Obtener los datos ingresados por el usuario
            String nombre = nombreField.getText();
            String apellidos = apellidosField.getText();
            String correo = correoField.getText();

            int edad;
            double peso, altura;

            try {
                edad = Integer.parseInt(edadField.getText());
                peso = Double.parseDouble(pesoField.getText());
                altura = Double.parseDouble(alturaField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // calcular el IMC y el porcentaje de grasa corporal
            UnidadesMedida unidades = new UnidadesMedida((String) unidadesBox.getSelectedItem());
            double imc = CalculadoraIMC.calcularIMC(peso, altura, unidades);
            double porcentajeGrasa = CalculadoraIMC.calcularPorcentajeGrasa(imc, edad, esMujer.isSelected());


            // Mostrar los resultados en la interfaz gráfica
            resultadoIMCLabel.setText(String.format("%.1f", imc));
            resultadoPorcentajeGrasaLabel.setText(String.format("%.1f%%", porcentajeGrasa));
        } else if (action.equals("Limpiar")) {
            // Limpiar los campos de la interfaz gráfica
            nombreField.setText("");
            apellidosField.setText("");
            correoField.setText("");
            edadField.setText("");
            esMujer.setSelected(false);
            unidadesBox.setSelectedIndex(0);
            pesoField.setText("");
            alturaField.setText("");
            resultadoIMCLabel.setText("");
            resultadoPorcentajeGrasaLabel.setText("");
        }
    }
}
*/