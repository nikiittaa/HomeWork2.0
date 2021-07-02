package homework8;

import java.util.ArrayList;

public class ListProduct {
    ArrayList<Product> strings = new ArrayList<>();

    public void add(Product product){
        strings.add(product);
    }

    public void nameProduct(int index){
        System.out.println(strings.get(index).getName());
    }

    public void removeProduct(String nameProduct){
        String str= "";
        for (int i= 0; i< strings.size(); i++){
            if (strings.get(i).getName().equals(nameProduct)){
                strings.remove(i);
                str = "продукт удален";
            }
        }
        if (str.length() > 0){
            System.out.println(str);
        }else {
            System.out.println("продукт не найден");
        }
    }
}
