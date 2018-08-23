package album;

/**
 *
 * @author Sánchez Rosas Andrés
 * @version 1.0
 */
public class Album {
    
    String name;
    String artista;
    int anio;
    float precio;
    int score;

    public Album(String name) {
        this.name=name;
    }
    
    public Album(String name, String artista) {
        this.name=name;
        this.artista= artista;
    }
    
    public Album(String name, String artista, int anio) {
        this.name=name;
        this.artista= artista;
        this.anio=anio;
    }
    
    public Album(String name, String artista, int anio, float precio) {
        this.name=name;
        this.artista= artista;
        this.anio=anio;
        this.precio=precio;
    }
    
    public Album(String name, String artista, int anio, float precio, int score) {
        this.name=name;
        this.artista= artista;
        this.anio=anio;
        this.precio=precio;
        this.score= score;
    }
    
    
    
    public static void main(String[] args) {
        
        Album album1 = new Album("Atom Heart Mother");
        Album album2 = new Album("Yield", "Pearl Jam");
        Album album3 = new Album("Days Of Future Passed", "The Moody Blues", 1967);
        Album album4 = new Album("The Stranger", "Billy Joel", 1977, 50);
        Album album5 = new Album("Revolver", "The Beatles", 1966, 60, 8);
        System.out.println(album1);
        System.out.println(album2);
        System.out.println(album3);
        System.out.println(album4);
        System.out.println(album5);
    }

    @Override
    public String toString() {
        return "Album{" + "name=" + name + ", artista=" + artista + ", anio=" + anio + ", precio=" + precio + ", score=" + score + '}';
    }

    
    
}
