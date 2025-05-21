import javax.swing.JOptionPane;

public class CalculadoraCaidaLibre {

    public static void calcularCaidaLibre() {
        try {
            // Pedimos el tiempo de caída
            double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tiempo de caída (en segundos):"));

            // La fórmula para la distancia en caída libre es: d = (1/2) * g * t^2
            // Aceleración de la gravedad (g) es 9.81 m/s²
            double g = 9.81;
            double distancia = 0.5 * g * Math.pow(tiempo, 2);

            // Mostramos el resultado
            JOptionPane.showMessageDialog(null, "La distancia recorrida en la caída libre es: " + distancia + " metros");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce un valor numérico válido.");
        }
    }
}
