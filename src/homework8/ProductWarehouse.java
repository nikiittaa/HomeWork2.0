package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProductWarehouse {
    private Product product;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String inputMethod;

    public static void main(String[] args) throws IOException {
        ListProduct listProduct = new ListProduct();
        ProductWarehouse  productWarehouse = new ProductWarehouse();

        while(true){
            productWarehouse.product = new Product();
            System.out.println("Введите действие add, remove или exit для выхода");
            productWarehouse.inputMethod = productWarehouse.bufferedReader.readLine();
            if (productWarehouse.inputMethod.equals("exit")){
                break;
            }
            switch (productWarehouse.inputMethod) {
                case("add"):
                    System.out.println("Введите название продукта");
                    productWarehouse.inputMethod = productWarehouse.bufferedReader.readLine();
                    productWarehouse.product.setName(productWarehouse.inputMethod);
                    System.out.println("Введите кол-во продукта");
                    productWarehouse.inputMethod = productWarehouse.bufferedReader.readLine();
                    productWarehouse.product.setNumber(Integer.parseInt(productWarehouse.inputMethod));
                    System.out.println("Введите цену продукта");
                    productWarehouse.inputMethod = productWarehouse.bufferedReader.readLine();
                    productWarehouse.product.setPrice(Integer.parseInt(productWarehouse.inputMethod));
                    System.out.println("Введите вес продукта");
                    productWarehouse.inputMethod = productWarehouse.bufferedReader.readLine();
                    productWarehouse.product.setWeight(Integer.parseInt(productWarehouse.inputMethod));
                    listProduct.add(productWarehouse.product);
                    break;
                case("remove"):
                    System.out.println("Введите название продукта");
                    productWarehouse.inputMethod = productWarehouse.bufferedReader.readLine();
                    listProduct.removeProduct(productWarehouse.inputMethod);
                    break;
                default:
                    break;
            }
        }
    }
}
