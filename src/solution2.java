import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class solution2 {
    public static void main(String[] args) {
        // List
        // ArrayList -> 길이가 가변적, 인덱스로 요소 조회, 공통된타입, 유사한 메소드
        // Array -> 길이가 고정적이다.
        ArrayList menu = new ArrayList();
        menu.add("pizza");
        menu.add("hamburger"); // add: 맨끝에 추가 -> menu.add(menu.size(), "hotdog");
        System.out.println(menu);
        menu.add(0,"chicken");
        System.out.println("menu = " + menu);
        menu.add(1);
        System.out.println("menu = " + menu);

        // <type> : 지정할 타입 설정 (type을 제외한 다른 자료형이 들어갈 경우 에러)
        ArrayList<String> menu2 = new ArrayList<>();
        menu2.add("pizza");
        menu2.add("hamburger");
        System.out.println(menu2);
        menu2.add(0,"chicken");
        System.out.println("menu2 = " + menu2);
//        menu2.add(1);

        System.out.println(menu.get(1));  // get(index) : index의 값 반환
        menu.set(1,"salad");  // set(index, value) : index의 값을 value로 바꾼다
        System.out.println("menu = " + menu);

        System.out.println(menu.size());  // length-X, size-O

        // contains == Python의 in
        System.out.println("menu.contains(\"pizza\") = " + menu.contains("pizza"));
        System.out.println("menu.contains(\"chicken\") = " + menu.contains("chicken"));

        // remove(index) -> Array의 index에 해당하는 값을 삭제
        // 메소드 오버로딩(over-loading), 메소드 오버라이딩(over-riding)
        // 오버로딩 : 이름이 같고 파라미터 구조가 다르면 다른기능을 함
        // 오버라이딩 : 이름이 같고 파라미터 구조가 같은 상황이면, 상속받은 상위 클래스의 메소드를 재정의
        System.out.println("menu.remove(\"salad\") = " + menu.remove("salad"));  // 오버로딩
        System.out.println("menu.remove(0) = " + menu.remove(0));  // 오버라이딩

        // 1. add를 통해 만드는 방법 -> 위의 방법
        // 2. Array를 ArrayList로 변환
        String[] menu3 = {"pizza", "hamburger", "hotdog"};
        ArrayList<String> menu4 = new ArrayList<>(Arrays.asList(menu3));
        menu4.add("beer");
        System.out.println("menu4 = " + menu4);

        // join
        // String.join(delimiter, list) -> delimiter : 구분자, list : 배열 혹은 나열된 데이터
        String result = String.join(", ", menu4);
        System.out.println("result = " + result);
        result = String.join("; ", menu4);
        System.out.println("result = " + result);

        // sort
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(31,23,42)
        );

        numbers.sort(null);  // null -> 오름차순(ascending)
        System.out.println("numbers = " + numbers);
        numbers.sort(Comparator.naturalOrder());  // == sort.(null)
        System.out.println("naturalOrder / numbers = " + numbers);

        numbers.sort(Comparator.reverseOrder());  // -> 내림차순(descending)
        System.out.println("reverseOrder / numbers = " + numbers);
    }
}