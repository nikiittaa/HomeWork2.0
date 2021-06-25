package homework9;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;


public class MapRemovePeople {
    public static HashMap<String, LocalDate> createMap()
    {
        HashMap<String, LocalDate> map = new HashMap<>();
        map.put("Сталлоне", LocalDate.of(1111, 6, 1));
        map.put("Смирнов", LocalDate.of(1112, 1, 1));
        map.put("Иванов", LocalDate.of(1113, 12, 1));
        map.put("Ын Ха", LocalDate.of(1114, 8, 1));
        map.put("Соколов", LocalDate.of(1115, 4, 1));
        map.put("Макмиллан", LocalDate.of(1116, 5, 1));
        map.put("Лебедев", LocalDate.of(1117, 7, 1));
        map.put("Лейвин", LocalDate.of(1118, 2, 1));
        map.put("Де Эльджео Обелия", LocalDate.of(1119, 8, 1));
        map.put("Дэ Грандия Ла", LocalDate.of(1120, 5, 1));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, LocalDate> map){
        Iterator<HashMap.Entry<String,LocalDate>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            HashMap.Entry<String, LocalDate> it = iterator.next();
            LocalDate date = it.getValue();
            int month = date.getMonthValue();
            if(month < 9 && month > 5){
                iterator.remove();
            }
        }
        System.out.println(map.toString());
    }

    public static void main(String[] args)
    {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());
    }
}
