/**
 * Clase Trapezoide, hereda de la clase Cuadrilatero
 * 
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */
public class Trapezoide extends Cuadrilatero {

    // Atributo
    private double altura;

    /**
     * Metodo constructor con parametros
     *
     * @param altura
     * @param x
     * @param y
     */
    public Trapezoide(double altura, int x, int y) {
        super(x, y);
        this.altura = altura;
    }

    // Metodos Gett y Sett
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Metodo calcular la area llamada getArea()
    public double getArea() {
        double a = 2;
        double b = 8;
        double area = (a + b) * getAltura() / 2;
        return area;
    }

    // Metodo para mostrar informacion, utilizando toString
    @Override
    public String toString() {
        return "-----------------" + "\n" +
                "Trapezoide" + "\n"
                + getPuntos() + "\n" + "Altura: " + getAltura() + "\n"
                + "Área: " + getArea();
    }

}
