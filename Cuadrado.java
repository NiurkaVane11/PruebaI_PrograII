/**
 * Clase Cuadrado, hereda de la clase Rectangulo
 * 
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

public class Cuadrado extends Rectangulo {

    /**
     * Metodo constructor con parametros heredados
     *
     * @param ancho
     * @param altura
     * @param x
     * @param y
     */
    public Cuadrado(double ancho, double altura, int x, int y) {
        super(ancho, altura, x, y);
    }

    /*
     * Metodo calcularLado(), calcula el lado del cuadrado
     * 
     * @return el valor del lado del cuadrado.
     */

    public double calcularLado() {
        double lado = Math.sqrt(getArea());
        return lado;

    }

    // Metodo mostrar informacion con toString
    @Override
    public String toString() {
        return "------------------" + "\n" + "Cuadrado" + "\n"
                + getPuntos() + "\n" + "Área: " + getArea() + "\n"
                + "Valor de lado: " + calcularLado();
    }

}
