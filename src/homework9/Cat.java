package homework9;

import java.util.HashSet;
import java.util.Set;

public class Cat extends Animal{

    String name;

    public Cat() {
        this.name = "Barsik";
    }

    public String toString() {
        return name;
    }

    Set<Cat> createCats(){
        HashSet newCat = new HashSet();
        for(int i = 0;i < 4; i++){
            newCat.add(new Cat());
        }
        return newCat;
    }
}

