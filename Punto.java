/**
 * Clase Punto, relacion de composicion con clase Cuadrilatero.
 * 
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

public class Punto {
    // Atributos
    private int x;
    private int y;

    /**
     * Metodo constructor con parametros
     *
     * @param x
     * @param y
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metodos Gett y Sett
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Metodo para mostrar informacion, utilizando toString
    @Override
    public String toString() {
        return "Puntos: " + "\n" + "X: " + getX() + "\n" + "Y: " + getY();
    }

}
