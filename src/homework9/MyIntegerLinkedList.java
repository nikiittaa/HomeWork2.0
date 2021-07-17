package homework9;

import java.util.LinkedList;

public class MyIntegerLinkedList {

    private LinkedList<Integer> integers = new LinkedList<>();

    public int getIntegers(int indexArray) {
        return integers.get(indexArray);
    }

    public void setIntegers(int numb, int indexArray) {
        integers.set(indexArray, numb);
    }

    public void linkedAdd(int numb, int indexArray) {
        integers.add(indexArray, numb);
    }

    public void linkedRemove(int indexArray){
        integers.remove(indexArray);
    }

    public void linkedAddFirst(int numb){
        integers.addFirst(numb);
    }

    @Override
    public String toString() {
        return integers.toString();

    }
}

