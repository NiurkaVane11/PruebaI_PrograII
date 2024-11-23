/**
 * Clase TestCuadrilatero, clase principal
 * 
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

public class TestCuadrilatero {
    public static void main(String[] args) {

        // Instanciacion de objetos
        Cuadrilatero cuadrilatero = new Cuadrilatero(2, 06);
        Trapezoide trapezoide = new Trapezoide(5, 10, 8);
        Paralelogramo paralelogramo = new Paralelogramo(5, 5, 30, 10);
        Rectangulo rectangulo = new Rectangulo(5, 2, 4, 1);
        Cuadrado cuadrado = new Cuadrado(8, 8, 5, 6);

        // Imprimir toString, para mostrar la informacion de cada objeto
        System.out.println(cuadrilatero.toString());
        System.out.println(trapezoide.toString());
        System.out.println(paralelogramo.toString());
        System.out.println(rectangulo.toString());
        System.out.println(cuadrado.toString());

    }
}
