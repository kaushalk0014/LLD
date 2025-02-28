import com.movie.booking.system.Search;

public class Catlog implements Search{

    HashMap<string, Movie>  movieTitle;
     HashMap<String, Movie> movieLanguage;
     HashMap<String, List<movie>> movieGenres;
     HashMap<String, List<Movie>> releaseDate;
     HashMap<String, List<Movie>> movieCity;

     public List<Movie> searchByTitle(String title){
         return movieTitle.get(title);
     }

     public List<Movie> searchByActor(String actor){
         return movieActor.get(actor);
     }

     public List<Movie> searchByLanguage(String language){
         return movieLanguage.get(language);
     }
     public List<Movie> searchByCity(String cityName){
         return movieCity.get(cityName);
     }
}
