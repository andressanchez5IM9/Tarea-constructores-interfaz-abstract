package album;

/**
 *
 * @author Sánchez Rosas Andrés
 * @version 1.0
 */
public abstract class AbstractC {
    abstract void buscarAlbum();
    abstract void comprarAlbum();
    abstract void reproducirAlbum();
    abstract void escucharAlbum();
    abstract void venderAlbum();
    String name;
    String artista;
    int anio;
    float precio;
    int score;
}
