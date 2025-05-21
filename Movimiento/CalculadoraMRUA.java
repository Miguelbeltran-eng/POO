import javax.swing.JOptionPane;

public class CalculadoraMRUA {

    public static void calcularMRUA() {
        try {
            // Pedimos los datos necesarios para MRUA: velocidad inicial, aceleración y tiempo
            double velocidadInicial = Double.parseDouble(JOptionPane.showInputDialog("Introduce la velocidad inicial (en m/s):"));
            double aceleracion = Double.parseDouble(JOptionPane.showInputDialog("Introduce la aceleración (en m/s²):"));
            double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tiempo transcurrido (en segundos):"));

            // Calculamos la distancia recorrida en MRUA: d = vi * t + (1/2) * a * t^2
            double distancia = velocidadInicial * tiempo + 0.5 * aceleracion * Math.pow(tiempo, 2);

            // Mostramos el resultado
            JOptionPane.showMessageDialog(null, "La distancia recorrida en el MRUA es: " + distancia + " metros");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce valores numéricos válidos.");
        }
    }
}
