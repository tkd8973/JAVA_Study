import java.sql.SQLOutput;
import java.text.MessageFormat;
import java.util.Arrays;

public class StringSolution1 {
    public static void main(String[] args)
{
        String str = "Hello World";
        System.out.println(str);

        String str2 = "12345";
        System.out.println(str2);

        String str3 = new String( "Hello World");  // new : 특정한 클래스를 바탕으로 객체를 생성하는 키워드
        // 키워드 -> 특정한 기능을 위해 미리 빼놓은 단어
        System.out.println(str3);

        // 인스턴스 -> 속성이라는 '변수'와 메소드라는 '함수'
        // Kotlin이나 최신 자바를 제외하고는, 함수가 없고 method만 존재

        String str4 = "Hello World"; // 리터럴 -> 메모리 낭비를 막기 위해 같은 주소값의 캐시 메모리 사용
        // 같은 주소값 -> 참조하는 메모리 상의 위치가 같음

        // 생성자의 경우 -> 만들 때 마다 주소값 을 새롭게 생성 따라서 같은값 X
        // 자바에서 생성자를 통해 만들어진 객체 비교 시, 주소값을 비교
        String str5 = new String( "Hello World"); // 생성자
        String str6 = new String( "Hello World"); // 생성자

        System.out.print("str4 == str5 : ");
        System.out.println(str4 == str5);

        System.out.print("str5 == str6 : ");
        System.out.println(str5 == str6);

        // 주소값이 아닌 문자열 리터릴이 일치하는지 비교하는 메소드
        System.out.print("str4.equals(str6) : ");
        System.out.println(str4.equals(str6));
        System.out.print("str5.equals(str6) : ");
        System.out.println(str5.equals(str6));

        String str7 = "Hello World";
        // 최초로 발견되는 인덱스 반환
        System.out.println(str7.indexOf("l"));  // 2
        System.out.println(str7.indexOf("World"));  // 6
        // 없을 때
        System.out.println(str7.indexOf("JAVA"));  // -1

        // A.contains(B) : A안에 B가 포함 되어있는가
        // contains : 문자열이 특정 문자열에 포함이 되어 있는지

        System.out.print("str7.contains(\"Hello\") : ");
        System.out.println(str7.contains("Hello"));  // true;
        System.out.print("str7.contains(\"JAVA\") : ");
        System.out.println(str7.contains("JAVA")); // false;

        // charAt : character + at
        // 특정 인덱스에 있는 문자 반환
        System.out.println(str7.charAt(0)); // H;
        System.out.println(str7.charAt(1)); // e;
        System.out.println(str7.charAt(2)); // l;
        System.out.println(str7.charAt(3)); // l;

        System.out.println(str7.charAt(str7.length()-1)); // d;

        // replaceAll : 문자열에서 특정 문자열을 검색하여 대체
        String str8 = "Hello World";
        System.out.println(str8.replaceAll("World","Java"));  // 정규표현식, 단어
        System.out.println(str8.replace("l","L"));  // 단어만

        // substring(sub-string) : 슬라이싱
        String str9 = "Hello SW";
        System.out.println(str9.substring(str9.length()-2,str9.length()));

        // upper, lower
        String str10 = "Stop Hello";
        System.out.println(str10.toUpperCase());
        System.out.println(str10.toLowerCase());

        // String split
        String split = "a:b:c:d";
        String[] result = split.split(":");

        System.out.println(Arrays.toString(result));

        // Formatting
        System.out.println(String.format("나의 오늘 %d걸음을 걸었다",5000));
        System.out.println(String.format("나는 오늘 %s를 먹었다","닭갈비"));
        System.out.println(MessageFormat.format("My name is {0}","SW"));

        System.out.println(String.format("내이름은 %s,나이는 %d","SW",24));
    }
}