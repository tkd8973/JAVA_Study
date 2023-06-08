package flow_control;

public class solution1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i <= 30) {
                System.out.println("안녕");
            } else if (i<=50) {
                System.out.println("바부양");
            } else{
                System.out.println("Hello");
            }
        }
    }
}
