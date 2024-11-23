/**
 * Clase Rectangulo, hereda de la clase Paralelogramo
 * 
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

public class Rectangulo extends Paralelogramo {

    /**
     * Metodo constructor con parametros
     *
     * @param ancho
     * @param altura
     * @param x
     * @param y
     */
    public Rectangulo(double ancho, double altura, int x, int y) {
        super(ancho, altura, x, y);
    }

    // Metodo para mostrar informacion, utilizando toString
    @Override
    public String toString() {
        return "-----------------------" + "\n" +
                "Rectángulo" + "\n"
                + getPuntos() + "\n" + "Ancho: " + getAncho() + "\n" + "Altura: "
                + getAltura() + "\n" + "Área: " + getArea();
    }

}
