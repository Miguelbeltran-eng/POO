import javax.swing.JFrame;

public class App {
    
    public static void main(String[] args){

        PanelDibujo panel = new PanelDibujo();
        JFrame application = new JFrame("Marco");


        //establece el marco para salir cuando se genera
        application.add(panel);
        application.setSize(4000, 350);
        application.setVisible(true);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}//fin de la clase App
