import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapHandler {

    public HashMap<Integer, String> createHashMap(){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1112, "Budapest");
        map.put(8800, "Nagykanizsa");
        map.put(2116,"Zsámbok");
        map.put(2746, "Jászkarajenő");
        map.put(3925, "Prügy");
        map.put(2347, "Bugyi");
        map.put(6344, "Hajós");
        map.put(8157, "Füle");
        map.put(4495, "Dege");
        map.put(5527, "Bucsa");
        return map;

    }
    public void showHashMap(HashMap<Integer, String> map) {
        DateHandler dateHandler = new DateHandler();
        for (Map.Entry<Integer, String> set :
                map.entrySet()) {
            Timestamp ts1 = new Timestamp(System.currentTimeMillis());
            System.out.println(ts1 + " - " + set.getKey() + " - " + set.getValue());
        }
    }
}
