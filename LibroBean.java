
/**
 * Clase LibroBean, tiene una relacion de composicion con la clase LibreriaBean.
 *
 * @author Niurka Vanesa Yupanqui Valente
 * @version 1.0
 * @since 23/11/2024
 */

import java.io.Serializable;

public class LibroBean implements Serializable {
    // Atributos
    private String titulo;
    private String autor;
    private String ISBN;

    // metodo constructor sin parametros
    public LibroBean() {
    }

    /**
     * 
     *
     * metodo constructor con parametros
     * 
     * @param titulo
     * @param autor
     * @param ISBN
     * 
     */
    public LibroBean(String titulo, String autor, String ISBN) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
    }

    // generar Gett y sett
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Muestra la informacion del libro
     * 
     * @return Un String con la informacion del libro (título, autor e ISBN).
     */
    public String mostrarInformacion() {
        return "El libro es : " + getTitulo() + "\n" + "Su autor es: " + getAutor() + "\n"
                + "Su ISBN es : " + getISBN();
    }

}