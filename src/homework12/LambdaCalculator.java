package homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiFunction;

public class LambdaCalculator {

    private Map<Operation, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
    private int numberOne = 0;
    private int numberTwo = 0;
    private String command;

    public static void main(String[] args) throws IOException {
        LambdaCalculator lambdaCalculator = new LambdaCalculator();

        lambdaCalculator.putMap();
        System.out.println("input SUM, SUBTRACT, MULTIPLY,SPLIT ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        lambdaCalculator.numberOne = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        String strTmp = str.substring(str.indexOf(" ") + 1);

        lambdaCalculator.command = strTmp.substring(0, strTmp.indexOf(" ")).toUpperCase(Locale.ROOT);
        try {
            lambdaCalculator.numberTwo = Integer.parseInt(strTmp.substring(strTmp.indexOf(" ") + 1));
            System.out.println(Operation.valueOf(lambdaCalculator.command) + " = "
                    + lambdaCalculator.operations.get(Operation.valueOf(lambdaCalculator.command))
                    .apply(lambdaCalculator.numberOne, lambdaCalculator.numberTwo));
        } catch (IllegalArgumentException ex) {
//            ex.printStackTrace();
            System.out.println("write : SUM, SUBTRACT, MULTIPLY,SPLIT ");
        }

    }

    private void putMap(){
        operations.put(Operation.SUM, (x, y) -> x + y);
        operations.put(Operation.SUBTRACT, (x, y) -> x - y);
        operations.put(Operation.MULTIPLY, (x,y) -> x * y);
        operations.put(Operation.SPLIT, (x,y) -> x / y);
    }

}
