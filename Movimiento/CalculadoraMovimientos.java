import javax.swing.*;

public class CalculadoraMovimientos {


    public static void main(String[] args) {
        // Menú para seleccionar qué tipo de movimiento calcular
        String[] opciones = {"MRU", "MRUA", "Caída Libre"};
        String seleccion = (String) JOptionPane.showInputDialog(null, 
                "Selecciona el tipo de movimiento", 
                "Calculadora de Movimientos", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

        // Dependiendo de la selección, calculamos el tipo de movimiento
        switch (seleccion) {
            case "MRU":
                CalculadoraMRU.calcularMRU();
                break;
            case "MRUA":
                CalculadoraMRUA.calcularMRUA();
                break;
            case "Caída Libre":
                CalculadoraCaidaLibre.calcularCaidaLibre();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selección no válida");
                break;
        }
    }
}
