import java.util.*;
import java.io.*;

public class HelloWOrld {

    public static void main(String[] args) throws IOException {

        new HelloWOrld().go();
    }

    public void go() {
       ArrayList<Dog> dogs = new ArrayList<>();
       dogs.add(new Dog());
       dogs.add(new Dog());
       dogs.add(new Dog());
       takeAnimal(dogs);
    }

    public void takeAnimal(ArrayList<? extends Animal> animals) {
        for(Animal a: animals) {
            a.eat();
        }
    }
}


abstract class Animal {
    void eat() {
        System.out.println("The animal eat");
    }
}

class Dog extends Animal {
    void bark() {

    }
}

class Cat extends Animal {
    void meow() {

    }
}
