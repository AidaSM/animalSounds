package animalSounds;

public class Bird extends Animal{
	public Bird() {
        super("Bird");
    }

    @Override
    public String makeSound() {
        return "Tweet";
    }
}
