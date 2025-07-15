package tests;
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

    public static String[] cities = {"Delhi", "Gurgaon", "Noida"};

    public static String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

    public static String[] gender = {"Male", "Female", "Other"};

    public static String file = "summer.jpg";

}