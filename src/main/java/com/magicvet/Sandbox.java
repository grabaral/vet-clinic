package main.java.com.magicvet;

import main.java.com.magicvet.comparator.DogAgeComparator;
import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.model.Dog;

import java.util.Arrays;

public class Sandbox {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.XL,5),
                new Dog(Dog.L,2),
                new Dog(Dog.XL,8),
                new Dog(Dog.M,4),
                new Dog(Dog.S,3),
                new Dog(Dog.XS,4),
        };
        Arrays.sort(dogs, new DogSizeComparator());

        for (Dog dog:dogs){
            System.out.println(dog.getSize());
        }

        Arrays.sort(dogs, new DogAgeComparator());

        for (Dog dog:dogs){
            System.out.println(dog.getAge());
        }

    }
}
