package laboratorio;

import javax.swing.JOptionPane;

public class Principal {

	/*flecha1, flecha2, flecha3: Variables que representan instancias de la clase Flecha.*/
    Flecha flecha1, flecha2, flecha3;

/*El método main es el punto de entrada del programa. Aquí se crea una instancia de la clase Principal y se almacena en la variable miPrincipal*/
    public static void main(String[] args) {
        Principal miPrincipal = new Principal();
    }

//El constructor .
    public Principal() {

/*Se crea un metodo Flecha y se asigna a la variable flecha1.*/
        flecha1 = new Flecha();
        //se pide color y longitud de la flecha 
        flecha1.longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha 1:"));
        flecha1.color = JOptionPane.showInputDialog("Ingrese el color de la flecha 1:");
/*Se llama al método construirFlecha.*/
        flecha1.construirFlecha();

 
//se solicitan nuevamente la longitud y color de la flecha.*/
     flecha2 = new Flecha();
     flecha2.longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha 2:"));
     flecha2.color = JOptionPane.showInputDialog("Ingrese el color de la flecha 2:");
     flecha2.construirFlecha();

//se solicita nuevamente la longitud y color de la flecha 
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha 3:"));
        String color = JOptionPane.showInputDialog("Ingrese el color de la flecha 3:");
        flecha3 = new Flecha(longitud, color);
        flecha3.construirFlecha();
    }
}
