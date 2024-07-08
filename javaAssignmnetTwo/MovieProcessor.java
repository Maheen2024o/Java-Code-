package javaAssignmnetTwo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieProcessor {
    private List<Movie> movies;  //creating a movie list

    public MovieProcessor(String jsonFilePath) {
        try {
            Gson gson = new Gson();
            Type movieListType = new TypeToken<List<Movie>>(){}.getType();
            movies = gson.fromJson(new FileReader(jsonFilePath), movieListType); //json file that need to be parsed 
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage()); //using exception handling 
        }
    }

    // Display data of all movies ---------------------------------------------------
    public void displayAllMovies() {
        movies.forEach(Movie::displayMovieInfo);
    }
    
    // Find movies by director -------------------------------------------------
    public void findMoviesByDirector(String director) {
        List<Movie> moviesByDirector = movies.stream()
                .filter(movie -> movie.getDirector().equalsIgnoreCase(director))
                .collect(Collectors.toList());
        moviesByDirector.forEach(Movie::displayMovieInfo);
    }

    // Calculate average price of movies using streams -------------------------------
    public void calculateAveragePrice() {
        double averagePrice = movies.stream()
                .mapToDouble(movie -> movie.getMetadata().getPrice())
                .average()
                .orElse(0.0);
        System.out.println("Average Price: " + averagePrice);
    }

    // Display movie with highest price ---------------------------------------------------
    public void displayMovieWithHighestPrice() {
        Movie maxPricedMovie = movies.stream()
                .max(Comparator.comparingDouble(movie -> movie.getMetadata().getPrice()))
                .orElse(null);
        if (maxPricedMovie != null) {
            System.out.println("Movie with Highest Price:");
            maxPricedMovie.displayMovieInfo();
        }
    }
    
    // Finding movies by their categories using streams and collections -----------
    public void findMoviesByCategory(String category) {
        List<Movie> moviesInCategory = movies.stream()
                .filter(movie -> movie.getMetadata().getCategories().contains(category))
                .collect(Collectors.toList());
        moviesInCategory.forEach(Movie::displayMovieInfo);
    }
}