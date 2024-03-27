package animalSounds;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());
        animals.add(new Bird());
        
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " makes sound: " + animal.makeSound());
        }

	}

}
