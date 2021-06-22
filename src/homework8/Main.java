package homework8;

public class Main  {
    public static void main(String[] args) {
        MyStringArrayList myStringArrayList = new MyStringArrayList();

        myStringArrayList.arrayAdd("Слива", 0);
        myStringArrayList.arrayAdd("Яблоко", 1);
        myStringArrayList.arrayAdd("Груша",2);
        System.out.println("Array: " + myStringArrayList);

        System.out.println("Get index Array: " + myStringArrayList.getStrings(2));

        myStringArrayList.setStrings("S", 1);
        System.out.println("Set Element: " + myStringArrayList.toString());

        myStringArrayList.arrayRemove(2);
        System.out.println("Remove element: " + myStringArrayList);

        myStringArrayList.arrayAdd("Апельсин", 1);
        System.out.println("Add element: " + myStringArrayList.toString());

        System.out.println("Array.toString: " + myStringArrayList.toString());
    }



}
