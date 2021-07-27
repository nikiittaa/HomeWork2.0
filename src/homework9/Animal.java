package homework9;

import java.util.HashSet;
import java.util.Set;

public class Animal {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Set<Cat> cats = cat.createCats();
        Dog dog = new Dog();
        Set<Dog> dogs = dog.createDogs();

        Set<Animal> pets = join(cats, dogs);


        removeCats(pets, cats);

        printPets(pets);

    }


    public static Set join(Set<Cat> cats, Set<Dog> dogs){
        Set<Animal> pets = new HashSet();

        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Animal> pets, Set<Cat> cats){
        pets.removeAll(cats);
    }

    public static void printPets(Set<Animal> pets){
        for (Object pet : pets) {
            System.out.println(pet);
        }

    }


}

