/**
 * Clase Cuadrilatero, clase madre. Tiene relacion de composicion con Punto
 * 
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

public class Cuadrilatero {

    // Atributo
    private Punto puntos;

    /**
     * Metodo constructor con parametros
     *
     * @param x
     * @param y
     */
    public Cuadrilatero(int x, int y) {
        this.puntos = new Punto(x, y);
    }

    // Metodos Gett y Sett
    public Punto getPuntos() {
        return puntos;
    }

    public void setPuntos(Punto puntos) {
        this.puntos = puntos;
    }

    // Metodo para mostrar informacion, utilizando toString
    @Override
    public String toString() {
        return "-----------------" + "\n " + " Cuadrilátero" + "\n" + getPuntos();
    }

}
