package animalSounds;

public abstract class Animal {
	private String type;

    public Animal(String type) {
        this.type = type;
    }

    public abstract String makeSound();

    public String getType() {
        return type;
    }
}
