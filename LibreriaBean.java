
/**
 * Clase LibreriaBean
 * 
 *
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

import java.io.Serializable;
import java.util.ArrayList;

public class LibreriaBean implements Serializable {

    // Atributo
    private ArrayList<LibroBean> libros;

    // Metodo constructor sin parametros
    public LibreriaBean() {
    }

    /**
     *
     * @param ArrayList<LibroBean>
     */
    public LibreriaBean(ArrayList<LibroBean> libros) {
        this.libros = libros;
    }

    // Metodos Gett y Setts
    public ArrayList<LibroBean> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<LibroBean> libros) {
        this.libros = libros;
    }

    /**
     * Agrega un libro a la lista de libros de la libreria.
     * 
     * @param libro
     */
    public void agregarLibroBean(LibroBean libro) {
        libros.add(libro);
    }

    /**
     * Elimina un libro de la lista de libros de la librera.
     * 
     * @param libro
     */
    public void eliminarLibroBean(LibroBean libro) {
        libros.remove(libro);
    }

    /**
     * Imprime la información de todos los libros en la librería.
     * Este método recorre la lista de libros y llama al método `mostrarInformacion`
     * de cada libro para imprimir sus detalles en la consola.
     */

    public void imprimirLibros() {
        System.out.println("Información de los Libros");
        for (LibroBean libro : libros) {
            System.out.println(libro.mostrarInformacion());

        }
    }

}
