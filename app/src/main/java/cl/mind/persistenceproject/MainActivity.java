package cl.mind.persistenceproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import cl.mind.persistenceproject.models.Dog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog();
        dog.setName("Spike");
        dog.setBreed("German Sheppard");
        dog.save();

        Dog dog1 = new Dog();
        dog.setBreed("Chiguagua");
        dog1.save();


        List<Dog> dogs = Dog.listAll(Dog.class);

        Dog spike = Dog.findById(Dog.class, 1); // busco por id, pero tengo que conocer el ID

        if (spike != null) {

            Log.d("SPIKE", spike.getName());
        } else {

            Log.d("SPIKE", "NO HALLADO");

        }

        List<Dog> dogs2 = Dog.find(Dog.class, "name = ?", "Spike"); //busca por atributo
        Log.d("DOGS", String.valueOf(dogs2.size()));

        if (dogs2.size() > 0) {

            Log.d("DOG", dogs2.get(0).getName());

        } else {

            Log.d("DOG", "No hallado");

        }


    }
}
