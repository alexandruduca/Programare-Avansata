package com.company;

import catalog.Catalog;
import items.Image;
import items.Song;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Year;

public class Main {

    public static void main(String[] args) throws IOException {
        Catalog catalog = new Catalog("C:\\Users\\Alex\\IdeaProjects\\Lab5Compulsory\\Catalog\\catalog.ser");
        Image image =new Image("Sunflower", Path.of("C:\\Users\\Alex\\IdeaProjects\\Lab5Compulsory\\Catalog\\Sunflower-field-Fargo-North-Dakota.jpg"), "Marcel");
        Song song = new Song("Save your tears", Path.of("C:\\Users\\Alex\\IdeaProjects\\Lab5Compulsory\\Catalog\\save-your-tears-official-music-video.mp3"), Year.of(2021), "The Weeknd");
        catalog.addItemsList(image);
        catalog.play(image);
        catalog.addItemsList(song);
        catalog.play(song);

        catalog.save(catalog);
        catalog.list();

    }
}
