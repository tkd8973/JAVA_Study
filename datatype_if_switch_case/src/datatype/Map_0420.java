package datatype;

import java.util.HashMap;

public class Map_0420 {
    public static void main(String[] args) {
        // map : dictionary

        // Java Map
        // HashMap
        HashMap<String,String> map = new HashMap<>();

        // HashMap : 타입 이름, 클래스 이름
        // <Key, Value>
        // new -> 생성

        // map CRUD (create, read, update, delete)

        // create
        map.put("name", "Kim");
        map.put("age", "20");
        map.put("gender", "male");
        map.put("address", "Seoul");
        map.put("phone", "010-0000-0000");

        // read
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("gender"));
        System.out.println(map.get("address"));
        System.out.println(map.get("phone"));

        // update
        map.put("name", "Lee");
        map.put("age", "21");
        map.put("gender", "female");

        // delete
        map.remove("address");
        map.remove("phone");

        // key list : 중복 허용x -> 키이자 값
        System.out.println("map.keySet() = "+map.keySet());
        // value list
        System.out.println("map.values() = "+map.values());
        // key value list
        System.out.println("map.entrySet() = "+map.entrySet());

        // containsKey : 키가 포함되어 있는지
        System.out.println("map.containsKey(\"name\" = )"+map.containsKey("name")); // true
        System.out.println("map.containsKey(\"Kim\" = )"+map.containsKey("Kim")); // false

        // containsValue :
        System.out.println("map.containsValue(\"Kim\" = )"+map.containsValue("Kim")); // false
        System.out.println("map.containsValue(\"male\" = )"+map.containsValue("male")); // true

        // LinkedHashMap
//        LinkedHashMap<String,String> linkedMap = new LinkedHashMap<>();

    }
}
