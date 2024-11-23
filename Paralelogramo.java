/**
 * Clase Paralelogramo, hereda de la clase Trapezoide
 * 
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

public class Paralelogramo extends Trapezoide {

    // Atributo
    private double ancho;

    /**
     * Metodo constructor con parametros
     *
     * @param ancho
     * @param altura
     * @param x
     * @param y
     */
    public Paralelogramo(double ancho, double altura, int x, int y) {
        super(altura, x, y);
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return ancho * getAltura();
    }
    // getAncho

    @Override
    public String toString() {
        return "----------------------" + "\n" + "Paralelogramo" + "\n" + getPuntos() + "\n" + "Ancho: " + getAncho()
                + "\n" + "Área: "
                + getArea();
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

}
