package app;

import factory.GenreFactory;
import jdbc.*;
import jpa.entity.GenresEntity;
import jpa.entity.MoviesEntity;
import jpa.repo.AbstractRepository;
import jpa.repo.GenreRepository;
import jpa.repo.MovieRepository;
import jpa.util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.List;

public class Main {
    private static Database database;

    private static void init(String type) throws SQLException, ClassNotFoundException {
        if (type.equals("jdbc"))
            database = Database.getInstance();
    }

    public static Database getDatabase() {
        return database;
    }

    private static String getType() {
        String type = "";
        try {
            FileReader fileReader = new FileReader("file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            type = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        EntityManagerFactory entityManagerFactory = PersistenceUtil.getInstance();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        MovieRepository movieRepository = new MovieRepository();

        // how to add a movie into the database jpa
//        MoviesEntity movie = new MoviesEntity();
//        movie.setId(5L);
//        movie.setTitle("Test");
//        movie.setReleaseDate(null);
//        movie.setDuration(150L);
//        movie.setScore((long) 8.9);
//        movieRepository.create(entityManager, movie);
        MoviesEntity movie1 = MovieRepository.findById(4);
        System.out.println(movie1);

        List<MoviesEntity> movie2 = MovieRepository.findByTitle("The Godfather");
        System.out.println(movie2);

        String param = getType();
        init(param);

        // how to add a genre into the database jdbc
//        GenreFactory genreFactory = new GenreFactory();
//        AbstractRepository<GenresEntity> genreRepository = genreFactory.createRepository(param);
//        GenresEntity genre = new GenresEntity();
//        genre.setId(3L);
//        genre.setName("CRIME");
//        genreRepository.create(entityManager, genre);
        GenresEntity genre1 = GenreRepository.findById(2);
        System.out.println(genre1);

        List<GenresEntity> genre2 = GenreRepository.findByName("CRIME");
        System.out.println(genre2);

    }
}
