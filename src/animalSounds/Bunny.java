package animalSounds;

public class Bunny extends Animal {
    public Bunny() {
        super("Bunny");
    }

    @Override
    public String makeSound() {
        return "Squeak";
    }
}