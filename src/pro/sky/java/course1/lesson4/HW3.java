package pro.sky.java.course1.lesson4;

public class HW3 {
    public static void main(String[] args) {
        task1();

        System.out.println("task2");


    }

    private static void task1() {
        System.out.println("task1");
        int number = 1;
        String answer = " ";
        while (number < 11) {
            answer += number + " ";
            number ++;
        }
        String answer2 = " ";
        for (int i = 10; i != 0; i--) {
            answer2 += i + " ";
        }
        System.out.println(answer + "\n" + answer2 + "\n");
    }
}
