import java.util.Arrays;

public class solution1 {
    public static void main(String[] args) {
        // 0개 이상의 같은 Type을 공유하는 값들의 묶음
        // [] : 대괄호(brakets), {} : 중괄호(brace), () : 소괄호(parentheses)
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr = " + Arrays.toString(arr));

        String[] arr2 = {"hello", "world", "java"};
        System.out.println("arr2 = " + Arrays.toString(arr2));

        // Array의 길이는 고정
        String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println("weeks = " + Arrays.toString(weeks));
        String[] days = new String[7]; // 7개의 빈 문자열 배열 생성
        System.out.println("days = " + Arrays.toString(days));
        days[0] = "Mon";
        days[1] = "Tue";
        days[2] = "Wed";
        days[3] = "Thu";
        days[4] = "Fri";
        days[5] = "Sat";
        days[6] = "Sun";
        System.out.println("days = " + Arrays.toString(days));

//        String[] weeks2 = new String[]; // 배열의 길이를 정의 하지 않으면 생성자로 배열을 생성 불가
        System.out.println("Sat :" + weeks[5]);

        System.out.println("weeks.length = " + weeks.length);

        int[] arr3 = new int[5];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;

        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("length = " + arr3.length);


    }
}
