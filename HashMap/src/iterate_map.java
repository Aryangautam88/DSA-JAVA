import java.util.HashMap;

public class iterate_map {

    public static void main(String[] args) {

        HashMap<String,Integer> map  = new HashMap<>();

        map.put("Aryan",44);
        map.put("Ayush",24);
        map.put("kishan",49);

        for(String key : map.keySet()){

            System.out.println(key+" "+map.get(key ));
        }

    }
}
