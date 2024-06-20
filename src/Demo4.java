import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("0123456", "Nam");
        users.put("0123457", "Hoa");
        users.put("0123458", "Lan");

        System.out.println(users.get("0123456"));

        for (String key : users.keySet()) {
            System.out.println(key + " : " + users.get(key));
        }

        for (String value : users.values()) {
            System.out.println(value);
        }

        for (HashMap.Entry<String, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //stream API with lambda
        users.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        //Iterator
        Iterator<HashMap.Entry<String, String>> iterator = users.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
