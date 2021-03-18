package JavaProgrammingMasterclassforSoftwareDevelopers.Inheritance;

public class Main {
    private static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5,
                5);

        Dog dog = new Dog("Osito", 8, 20, 2, 2,
                1, 20, "Larga y peluda");
        //dog.eat();
        dog.walk();
        //dog.run();
    }
}
