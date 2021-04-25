package factory;

import jdbc.DaoMovie;
import jpa.repo.AbstractRepository;
import jpa.repo.MovieRepository;

public class MovieFactory implements AbstractFactory{

    public AbstractRepository createRepository(String type) {
        if (type.equals("jdbc")) {
            return new DaoMovie(app.Main.getDatabase());
        }
        else if (type.equals("jpa"))
            return new MovieRepository();
        else return null;
    }

}
