package flow_control;

public class solution2 {
    public static void main(String[] args) {
        // switch case
        // int a = 2;
        int a = (int) (Math.random() *5)+1;
        System.out.println("a = " + a);
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:  // others case 옵션이라 없어도 상관없음
                System.out.println("default");
        }

        // python, java, c, c# 의 case
        // 4개 중 1개를 뽑아 lang이라는 변수 생성
        // 변수를 switch로 검사
        // defauslt : 해당 없음 출력
        String[] langs = {"python", "java", "c", "c#"};
        String lang = langs[(int) (Math.random() *4)];
        System.out.println("lang = " + lang);
        switch (lang) {
            case "python":
                System.out.println("python");
//                break;
            case "java":
                System.out.println("java");
                break;
            case "c":
                System.out.println("c");
                break;
            case "c#":
                System.out.println("c#");
                break;
            default:
                System.out.println("default");
                break;
        }

        // lunch 메뉴에서 하나를 랜덤으로 뽑고 switch case로 검사;
        lunch menu = lunch.values()[(int) (Math.random()* lunch.values().length)];
        switch (menu) {
            case Kimchi:
                System.out.println("Kimchi");
                break;
            case bulgogi:
                System.out.println("bulgogi");
                break;
            case ddeokbokki:
                System.out.println("ddeokbokki");
                break;
            case gimbab:
                System.out.println("gimbab");
                break;
            default:
                System.out.println(String.format("no %s menu",menu.toString().toLowerCase()));
        }
    }
}

enum lunch{
    Kimchi, bulgogi, ddeokbokki, gimbab, sushi, water, coke, jw;
}