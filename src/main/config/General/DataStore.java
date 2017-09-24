package config.General;

import com.github.javafaker.Faker;

/**
 * Created by admin on 1/16/2017.
 */
public class DataStore {

    Faker faker = new Faker();

    public static void main(String[] args) {

        DataStore ds = new DataStore();
        System.out.println(ds.getTitle());

    }

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getName() {
        return faker.name().name();
    }

    public String getNameWithMiddle() {
        return faker.name().nameWithMiddle();
    }

    public String getUserName() {
        return faker.name().username();
    }

    public String getTitle() {
        return faker.name().title();
    }


//----------------------------------Address Section ----------

    public String getCity() {
        return faker.address().cityName();
    }

    public String getState() {
        return faker.address().state();
    }

    public String getCountry() {
        return faker.address().country();
    }

    public String getZipCode() {
        return faker.address().zipCode();
    }

    //---------------------------Date Section ----------






    public String getEmail() {
        return faker.internet().emailAddress();
    }








}
