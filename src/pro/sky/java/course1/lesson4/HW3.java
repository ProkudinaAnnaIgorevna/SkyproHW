package pro.sky.java.course1.lesson4;

public class HW3 {
    public static void main(String[] args) {
        task1();

        task2();

        task3();

    }

    private static void task3() {
        System.out.println("\ntask3");
        int currentYear = 2021;
        int yearsAgo = currentYear - 200;
        int lastYear = currentYear + 79;
        System.out.println("Список годов, когда комета пролетала рядом с Землей за последние 200 лет:");
        for(currentYear = 2021; currentYear > yearsAgo-1; currentYear -= 79) {
            System.out.println(currentYear);
        }
        System.out.println("В следующий раз мы увидим ее в " + lastYear + " году.");
    }

    private static void task2() {
        System.out.println("task2");
        System.out.println("Давайте посмотрим, в какие дни августа сдаём отчет;) Сейчас 1.08 ВС" +
                "\nОтчёты, пжлста, присылайте в эти даты:");
        int day;
        for (day = 6; day < 32; day += 7) {
            System.out.println(day + ".08");
        }
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
