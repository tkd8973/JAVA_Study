package datatype;

import java.util.HashSet;
import java.util.Set;

public class Set_0420 {
    public static void main(String[] args) {
        // Set :중복되지 않은 값들의 묶음 (집합)
        // HashSet 생성
       Set<String> set = new HashSet<>();
        // Set<String> set0420 = new HashSet<>(length);
        // -> 상속, 다형성, interface

        // 5개 길이의 HashSet 생성
        Set<String> set1 = new HashSet<>(5);  // Capaciti : 용량

        // 원소를 넣어 HashSet 생성
        HashSet<String> set2 = new HashSet<>(
                Set.of("C++","Python","Java","Script" )
        );
        System.out.println("set2 = " + set2);

        set.add("C++");
        set.add("Python");
        set.add("Java");
        set.add("Script");

        System.out.println("set = " + set);

        // Empty
        System.out.println("set.isEmpty() = " + set.isEmpty());
        // Size
        System.out.println("set.sized() = " + set.size());

        // Contains
        System.out.println("set.contains(\"Java\") = " + set.contains("Java"));
        // Remove
        System.out.println("set.remove(\"Java\") = " + set.remove("Java"));
        // Clear
//        System.out.println("set.clear() = " + set.clear());
        // Iterator
        System.out.println("set.iterator() = " + set.iterator());
        System.out.println("set = " + set);

    }
}
