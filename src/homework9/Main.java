package homework9;

public class Main {
    public static void main(String[] args) {
        MyIntegerLinkedList myIntegerLinkedList = new MyIntegerLinkedList();

        myIntegerLinkedList.linkedAdd(20, 0);
        myIntegerLinkedList.linkedAdd(10, 1);
        myIntegerLinkedList.linkedAdd(95, 2);
        System.out.println("LinkedList: " + myIntegerLinkedList);

        System.out.println("Get index: " + myIntegerLinkedList.getIntegers(1));

        myIntegerLinkedList.setIntegers(30, 1);
        System.out.println("Set number: " + myIntegerLinkedList.toString());

        myIntegerLinkedList.linkedRemove(2);
        System.out.println("After remove: " + myIntegerLinkedList);

        myIntegerLinkedList.linkedAdd(99, 2);
        System.out.println("After add: " + myIntegerLinkedList.toString());

        myIntegerLinkedList.linkedAddFirst(1);
        System.out.println("Add first number: " + myIntegerLinkedList.toString());

        System.out.println("toString: " + myIntegerLinkedList.toString());


    }
}
