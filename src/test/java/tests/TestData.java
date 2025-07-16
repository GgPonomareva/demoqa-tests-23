package tests;
import com.github.javafaker.Faker;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Map;

import static tests.TestDateGenerator.faker;


public class TestData {
    public static String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    public static String[] subjects = {"Accounting", "Maths", "Arts", "English", "Physics", "Chemistry",
            "Computer Science", "Economics", "Social Studies", "History", "Civics", "Commerce", "Hindi", "Biology"};

    public static String[] hobbies = {"Reading", "Sports", "Music"};

    //public static String[] cities = {"Delhi", "Gurgaon", "Noida"};

    // public static String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

    public static String[] gender = {"Male", "Female", "Other"};

    public static String file = "summer.jpg";

    public static String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    public static String cities = getRandomCity(state);


    private static String getRandomCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> throw new IllegalArgumentException("Unknown state: " + state);

        };
    }
}