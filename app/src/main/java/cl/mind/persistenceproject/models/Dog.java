package cl.mind.persistenceproject.models;

import com.orm.SugarRecord;

/**
 * Created by Gabriel on 09-08-2017.
 */

// POJO = plane old java object

    // modelo = representa un objeto en la base de datos.

public class Dog extends SugarRecord {

    private String name,breed;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
