package datatype;

public class enum_0420 {
    public static void main(String[] args) {
        // Enum
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println(season.name());
        System.out.println(season.ordinal());
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s);
        }
        Season season1 = Season.valueOf("SPRING");
        System.out.println(season1);
    }
}

enum Season {
    SPRING, SUMMER, FALL, WINTER;
}  // 내가 설정한 고유의 묶음

// enum + 이름
// 중괄호 안에 enum의 옵션으로 들어갈 값들
// 통상 대문자로 표현