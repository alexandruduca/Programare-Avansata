package commands;

import catalog.Catalog;
import items.Image;
import items.Song;

import java.time.Year;

public class AddCommand{
    public static void addImage(Catalog catalog, String name, String path, String author) {
        Image image = new Image(name, path, author);
        catalog.add(image);
    }
    public static void addSong(Catalog catalog, String name, String path, Year releaseYear, String author) {
        Song song = new Song(name, path, releaseYear, author);
        catalog.add(song);
    }
}
