package tests;

import com.github.javafaker.Faker;

import java.util.Locale;

import static java.lang.String.format;
import static tests.TestData.file;

public class TestDateGenerator {
    public static Faker faker = new Faker(new Locale("en-GB"));

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().firstName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getGender() {
        return faker.options().option(TestData.gender);
    }

    public static String getUserNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public static String getSubjects() {
        return faker.options().option(TestData.subjects);
    }
    public static String getHobbies() {
        return faker.options().option(TestData.hobbies);
    }
    public static String getCurrentAdress() {
        return faker.address().city();
    }

public static String getState() {
    return faker.options().option(TestData.state);
}

    public static String getCities() {
        return faker.options().option(TestData.cities);
    }

    public static String getFile() {
        return file;
    }

    public static String getDate() {
        return format("%02d", faker.number().numberBetween(1, 9));
    }

    public static String getMonth() {
        return faker.options().option(TestData.months);
    }

    public static String getYear() {
        return format("%s", faker.number().numberBetween(1900, 2025));
    }


}
