import javax.swing.JOptionPane;

public class CalculadoraMRU {

    public static void calcularMRU() {
        try {
            // Pedimos los datos necesarios para MRU: distancia y tiempo
            double distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduce la distancia recorrida (en metros):"));
            double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tiempo transcurrido (en segundos):"));

            // Calculamos la velocidad
            double velocidad = distancia / tiempo;

            // Mostramos el resultado
            JOptionPane.showMessageDialog(null, "La velocidad en el MRU es: " + velocidad + " m/s");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce valores numéricos válidos.");
        }
    }
}
