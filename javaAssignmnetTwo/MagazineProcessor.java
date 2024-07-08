package javaAssignmnetTwo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MagazineProcessor {
    private List<Magazine> magazines;  // Use Magazine instead of Book
    private String jsonFilePath;

    public MagazineProcessor(String jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
        loadMagazinesFromJson();
    }

    // Load magazines from JSON file into List<Magazine>
    private void loadMagazinesFromJson() {
        try {
            Gson gson = new Gson();
            Type magazineListType = new TypeToken<List<Magazine>>(){}.getType();
            magazines = gson.fromJson(new FileReader(jsonFilePath), magazineListType);
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
            magazines = new ArrayList<>(); // Initialize an empty list if file doesn't exist
        }
    }

    // Method to display all magazines
    public void displayAllMagazines() {
        magazines.forEach(Magazine::displayMagazineInfo);
    }

    // Method to find magazines by author
    public void findMagazinesByAuthor(String author) {
        List<Magazine> magazinesByAuthor = magazines.stream()
                .filter(magazine -> magazine.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
        magazinesByAuthor.forEach(Magazine::displayMagazineInfo);
    }

    // Method to calculate average price of magazines
    public void calculateAveragePrice() {
        double averagePrice = magazines.stream()
                .mapToDouble(Magazine::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Average Price: " + averagePrice);
    }

    // Method to display magazine with highest price
    public void displayMagazineWithHighestPrice() {
        Magazine maxPricedMagazine = magazines.stream()
                .max(Comparator.comparingDouble(Magazine::getPrice))
                .orElse(null);
        if (maxPricedMagazine != null) {
            System.out.println("Magazine with Highest Price:");
            maxPricedMagazine.displayMagazineInfo();
        }
    }

    // Method to find magazines by category
    public void findMagazinesByCategory(String category) {
        List<Magazine> magazinesInCategory = magazines.stream()
                .filter(magazine -> magazine.getMetadata().getCategories().contains(category))
                .collect(Collectors.toList());
        magazinesInCategory.forEach(Magazine::displayMagazineInfo);
    }

    // Method to add a new magazine
    public void addMagazine(Magazine magazine) throws IOException {
        magazines.add(magazine);
        writeToJsonFile();
    }

    // Method to update the price of an existing magazine
    public void updateMagazinePrice(Magazine magazine, double newPrice) throws IOException {
        for (Magazine m : magazines) {
            if (m.equals(magazine)) {
                m.updatePrice(newPrice);
                break;
            }
        }
        writeToJsonFile();
    }

    // Method to write magazines list to JSON file
    private void writeToJsonFile() throws IOException {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(jsonFilePath)) {
            gson.toJson(magazines, writer);
        }
    }

    // Method to return the list of magazines
    public List<Magazine> getMagazines() {
        return magazines;
    }
}