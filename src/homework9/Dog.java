package homework9;

import java.util.HashSet;
import java.util.Set;

public class Dog extends Animal{
    String name;

    public Dog() {
        this.name = "Dep";
    }

    public String toString() {
        return name;
    }

    Set<Dog> createDogs(){
        HashSet newDog = new HashSet();
        for(int i = 0;i < 3; i++){
            newDog.add(new Dog());
        }
        return newDog;
    }
}
