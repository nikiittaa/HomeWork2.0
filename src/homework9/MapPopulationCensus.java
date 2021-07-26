package homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MapPopulationCensus {
    private BufferedReader reader;
    private HashMap<String, String> family = new HashMap<>();

    public static void main(String[] args) throws IOException {
        MapPopulationCensus mapPopulationCensus = new MapPopulationCensus();
        mapPopulationCensus.reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String city = mapPopulationCensus.reader.readLine();
            if(city.isEmpty()){
                mapPopulationCensus.printCity();
                break;
            }
            String surname = mapPopulationCensus.reader.readLine();
            if(surname.isEmpty()){
                mapPopulationCensus.printCity();
                break;
            }
            mapPopulationCensus.family.put(city, surname);

        }
    }

    private void printCity(){
        try {
            String city = reader.readLine();
            System.out.println(family.get(city));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
