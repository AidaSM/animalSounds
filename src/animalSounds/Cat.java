package animalSounds;

public class Cat extends Animal{
	public Cat() {
        super("Cat");
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
