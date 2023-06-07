package laboratorio;

public class Flecha {
	int longitud;
    String color;

 /*Un constructor  que inicializa la longitud de la flecha y el color".*/
    public Flecha() {
        longitud = 18;
        color = "negro";
    }

/*Un constructor con argumentos que permite al usuario especificar la longitud y color de la flecha*/
    public Flecha(int longitud, String color) {
        this.longitud = longitud;
        this.color = color;
    }

/*Un método que imprime el símbolo especificado. Si el color de la flecha es "negro", se imprime el símbolo 
  normalmente con System.out.print(). Si el color no es "negro", se imprime el símbolo en rojo utilizando System.err.print().*/
    public void imprimir(String simbolo) {
        if (color.equals("negro")) {
            System.out.print(simbolo);
        } else {
            System.err.print(simbolo);
        }
    }

    /*Un método construir flecha que mediante un ciclo y la longitud solicitada
     * imprimi su largo y termina con un simbolo ">" al final, dejandonos como resultado una flecha .*/
    public void construirFlecha() {
        for (int i = 0; i < longitud; i++) {
            imprimir("-");
        }
        imprimir("> \n");
    }


}
