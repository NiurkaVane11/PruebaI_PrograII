
/**
 * Clase TestLibreria, clase principal 
 *  
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

import java.util.ArrayList;

public class TestLibreria {
    public static void main(String[] args) {

        // Instanciacion de objetos
        LibreriaBean libreria = new LibreriaBean(new ArrayList<>());
        LibroBean libro1 = new LibroBean("Poemas del corazon", "Ana Maria Noguera", "12222222200259");
        LibroBean libro2 = new LibroBean("Petalos Azules", "Violet Pollux", "236666666669");
        LibroBean libro3 = new LibroBean("De la Tierra a la Luna", "Julio Verne", "500099999692");
        LibroBean libro4 = new LibroBean("Amorcida", "Manolo Cruz", "125000000007");

        // Anadiendo libros a lista de la libreria
        libreria.getLibros().add(libro1);
        libreria.getLibros().add(libro2);
        libreria.getLibros().add(libro3);
        libreria.getLibros().add(libro4);

        // Eliminando libros de lista de la libreria
        libreria.getLibros().remove(libro1);
        libreria.getLibros().remove(libro2);

        // Invocando el metodo imprimirLibros()
        libreria.imprimirLibros();
    }
}