package homework8;

import java.util.ArrayList;

public class MyStringArrayList {

    private ArrayList<String> strings = new ArrayList<>();

    public String getStrings(int indexArray) {
        return strings.get(indexArray);
    }

    public void setStrings(String str, int indexArray) {
        strings.set(indexArray, str);
    }

    @Override
    public String toString() {
        return strings.toString();
    }

    public void arrayAdd(String str, int indexArray){
        strings.add(indexArray, str);
    }

    public void arrayRemove(int indexArray){
        strings.remove(indexArray);
    }


}
