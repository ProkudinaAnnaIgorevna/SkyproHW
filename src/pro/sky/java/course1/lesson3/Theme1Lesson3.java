package pro.sky.java.course1.lesson3;

import org.w3c.dom.ls.LSOutput;

public class Theme1Lesson3 {
    public static void main(String[] args) {
//        Задание 1
        System.out.println("Задание 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

//        Задание 2
        System.out.println("Задание 2");

        int anotherClientOS = 0;
        int clientDeviceYear = 2015;
        if (anotherClientOS == 0) {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите lite-версию версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
        System.out.println();

//        Задание 3
        System.out.println("Задание 3");

        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год не високосный.");
        }
        System.out.println();

//        Задание 4
        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            days += 1;
            if (deliveryDistance > 60) {
                days += 1;
            }
        }
        System.out.println("Доставка на расстоянии " + deliveryDistance + " км займет " + days + " д.");
        System.out.println();

//        Задание 5
        System.out.println("Задание 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето.");
                break;
            default:
                System.out.println("Сейчас осень.");
                break;
        }
    }
}
