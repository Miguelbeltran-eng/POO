import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
//Uso del drawLine para conectar las esuqinas del panel
public class PanelDibujo extends JPanel {
    
//Dibuja una x desde las esquinas del panel
public void paintComponent(Graphics a){


    super.paintComponent(a);
    setBackground(Color.BLACK);
    int anchura = getWidth(); //Anchura total   
    int altura = getHeight(); //Altura total
//Dibujo linea inferior
//Añadimos color
    a.setColor(Color.RED);
    a.drawLine(0, 0, anchura, altura);
    //Dibujo de la linea superior
    //Añadimos otro color
    a.setColor(Color.BLUE);
    a.drawLine(0, altura, anchura, 0);
}
//fin de la clase PanelDibujo
}
