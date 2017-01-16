package Config.General;

import com.github.javafaker.Faker;

/**
 * Created by admin on 1/16/2017.
 */
public class DataStore {

    Faker faker = new Faker();

    public String getLastName() {

        return faker.name().firstName();

    }


}
