package datatype;

public class TypeCast_0420 {
    public static void main(String[] args) {
        // TypeCasting(형 변환)
        // String to Int
        String str = "100";
        System.out.println("str = " + str);
        System.out.println("str.getClass() = " + str.getClass()); // getClass -> 타입확인
        int num = Integer.parseInt(str);  // parsing - 분석
        // int wrapper -> wrap -> primitive(원시형) -> 메소드 속성 X -> 도우미
        System.out.println("num = " + num);

        // "100" -> 100
        // "-100" -> -100 or "100.5" -> 100.5
        // "백","hundred"

        // String to Double
        System.out.println("integer.parseInt(\"-100\" = " + Integer.parseInt("-100"));
        int num2 = Integer.parseInt("-100");
        System.out.println("num2 + num = " + num2 + num);

        // String to Float
        System.out.println("Double.parseDouble(\"100.5\") = " + Double.parseDouble("100.5"));
        double num3 = Double.parseDouble("100.5");
        System.out.println("num3 + num = " + num3 + num);

        // "백" -> 100
        // System.out.println("integer.parseInt(\"백\") = " + Integer.parseInt("백"));
        // NumberFormatException : "백" 이나 "hundred" 는 변환할 수 없음

        // Int to String
        int num4 = 100;
        String str2 = String.valueOf(num4);
        String str3 = new Integer(num4).toString();
        System.out.println("String.valueOf(num4) = " + str2);
        System.out.println("Integer(num4).toString() = " + str3);

        // 2. 강제 변환
        int num5 = 100;
        double num6 = (double) num5;
        System.out.println("num6 = " + num6);
        int num7 = (int) num6;
        System.out.println("num7 = " + num7);

    }
}
