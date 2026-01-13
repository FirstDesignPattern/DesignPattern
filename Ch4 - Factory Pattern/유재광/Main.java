package ch04;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.create("dog");
        System.out.println(animal.sound());
    }
}
