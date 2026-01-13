package ch04;

public class AnimalFactory {

    public static Animal create(String type) {
        if (type.equals("dog")) {
            return new Dog();
        }
        if (type.equals("cat")) {
            return new Cat();
        }
        throw new IllegalArgumentException("Unknown type");
    }
}