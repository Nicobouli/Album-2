
package albumes;

import java.util.List;


public class Album{
    
    private int id;
    private String nombreAlbum;
    private List<Cancion> canciones;

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombreAlbum=" + nombreAlbum + ", canciones=" + canciones + '}';
    }

    
    
}
