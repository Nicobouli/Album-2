
package album.test;

import albumes.Album;
import albumes.Artista;
import albumes.Cancion;
import albumes.Genero;
import java.util.ArrayList;
import java.util.List;


public class Albumes {


    public static void main(String[] args) {
        
        Genero genero1 = new Genero();
        genero1.setId(26);
        genero1.setNombreGenero("Rock");
        
        Genero genero2 = new Genero();
        genero2.setId(30);
        genero2.setNombreGenero("Rock");
        
        Genero genero3 = new Genero();
        genero3.setId(1);
        genero3.setNombreGenero("Indie");
        
        Artista artista1 = new Artista();
        artista1.setId(4);
        artista1.setNombre("Skrillex");
        artista1.setAlias("Bangarang");
        
        Artista artista2 = new Artista();
        artista2.setId(3);
        artista2.setAlias("Freddie mercurie");
        artista2.setNombre("Freddie mercurie");
        
        Artista artista3 = new Artista();
        artista3.setId(37);
        artista3.setAlias("Skrillex");
        artista3.setNombre("Sonny");
        
        Cancion cancion1 = new Cancion();
        cancion1.setId(34);
        cancion1.setNombreCancion("Butterflies");
        cancion1.setDuracion(256);
        cancion1.setArtista(artista1);
        cancion1.setGenero(genero2);
        
        Cancion cancion2 = new Cancion();
        cancion2.setId(34);
        cancion2.setNombreCancion("It Takes Two");
        cancion2.setDuracion(257);
        cancion2.setArtista(artista1);
        cancion2.setGenero(genero2);
        
        Cancion cancion3 = new Cancion();
        cancion3.setId(34);
        cancion3.setNombreCancion("niño,");
        cancion3.setDuracion(256);
        cancion3.setArtista(artista2);
        cancion3.setGenero(genero2);
        
        Cancion cancion4 = new Cancion();
        cancion4.setId(34);
        cancion4.setNombreCancion("SELECTA");
        cancion4.setDuracion(256);
        cancion4.setArtista(artista3);
        cancion4.setGenero(genero3);
        
        Cancion cancion5 = new Cancion();
        cancion5.setId(34);
        cancion5.setNombreCancion("Real Spring");
        cancion5.setDuracion(256);
        cancion5.setArtista(artista3);
        cancion5.setGenero(genero3);
        
         List<Cancion> albun = new ArrayList<>();
        albun.add(cancion1);
        albun.add(cancion2);
        
        List<Cancion> albun2 = new ArrayList<>();
        albun2.add(cancion3);
        
        List<Cancion> albun3 = new ArrayList<>();
        albun3.add(cancion4);
        albun3.add(cancion5);
        
        Album album = new Album ();
        album.setId(0);
        album.setNombreAlbum("Farewell");
        album.setCanciones(albun);
        
        Album album2 = new Album ();
        album2.setId(0);
        album2.setNombreAlbum("eduardo,");
        album2.setCanciones(albun2);
        
        Album album3 = new Album ();
        album3.setId(0);
        album3.setNombreAlbum("Dont Get to Close");
        album3.setCanciones(albun3);
        
       
        
        System.out.println(album);
        System.out.println(album2);
        System.out.println(album3);
    }
    
}
