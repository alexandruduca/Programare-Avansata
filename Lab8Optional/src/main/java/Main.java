import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void scanLinesFromIMDB() throws FileNotFoundException {
        File in = new File("C:\\Users\\Alex\\Downloads\\IMDb.csv");
        Scanner scanner = new Scanner(in);
        int lineNumber=1;
        String line = scanner.nextLine();
        while (scanner.hasNextLine() && lineNumber<6)
        {
            line = scanner.nextLine();
            String[] field = line.split(",");
            String title = field[2];
            Date releaseDate = Date.valueOf(field[4]);
            System.out.println("Movie " + lineNumber + " : " + title + ", " + releaseDate + ".");
            lineNumber++;
        }
        scanner.close();
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {
        Database database = Database.getInstance();
        DaoMovie daoMovie = new DaoMovie(database);
        DaoGenre daoGenre = new DaoGenre(database);
        DaoActor daoActor = new DaoActor(database);
        DaoDirector daoDirector = new DaoDirector(database);

        // How to add movies into the database
//        Movie movie1 = new Movie(1, "Spider-Man", Date.valueOf("2002-06-07"), 121, 7.3);
//        Movie movie2 = new Movie(2, "Avatar", Date.valueOf("2009-12-18"), 162, 7.8);
//        Movie movie3 = new Movie(3, "The Godfather", Date.valueOf("1972-03-24"), 175, 9.2);
//        Movie movie4 = new Movie(4, "The Dark Knight", Date.valueOf("2008-07-25"), 173, 9.0);
//        daoMovie.create(movie1);
//        daoMovie.create(movie2);
//        daoMovie.create(movie3);
//        daoMovie.create(movie4);

        // How to add genres into the database
//        Genre genre1 = new Genre(1, "ACTION");
//        Genre genre2 = new Genre(2, "DRAMA");
//        daoGenre.create(genre1);
//        daoGenre.create(genre2);

        //how to add actors into the database
//        Actor actor1 = new Actor(1, 3, "Al Pacino", "Michael Corleone");
//        Actor actor2 = new Actor(2, 3, "Marlon Brando", "Don Vito Corleone");
//        Actor actor3 = new Actor(3, 3, "James Caan", "Sonny Corleone");
//        daoActor.create(actor1);
//        daoActor.create(actor2);
//        daoActor.create(actor3);

        // How to add directors into the database
//        Director director1 = new Director(1, 3, "Francis Ford Coppola");
//        daoDirector.create(director1);


//        System.out.println();
//        daoMovie.findById(3);
//        daoMovie.findById(5);
//        daoMovie.findByTitle("Avatar");
//        daoMovie.findByTitle("Benjamin Button");
//
//        daoGenre.findById(1);
//        daoGenre.findById(3);
//        daoGenre.findByName("DRAMA");
//        daoGenre.findByName("CRIME");
//
//        List<String> actors = daoMovie.getActors("The Godfather");
//        System.out.println("The actors of the movie 'The GodFather': " + actors + ".");
//
//        List<String> directors = daoMovie.getDirectors("The Godfather");
//        System.out.println("The directors of the movie 'The Godfather': " + directors + ".");
//        scanLinesFromIMDB();

        Movie movie = daoMovie.findById(3);
        System.out.println(movie);
        Movie movie1 = daoMovie.findByTitle("Avatar");
        System.out.println(movie1);

        Genre genre = daoGenre.findById(1);
        System.out.println(genre);
        Genre genre1 = daoGenre.findByName("DRAMA");
        System.out.println(genre1);

    }
}
