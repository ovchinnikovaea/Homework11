import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checksOfLeepYearAndPrintResult(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2000;
        checksOfLeepYearAndPrintResult(year);
    }

    public static void checksUsersOptionsAndPrintResult(int clientOS, int currentYear) {
        if (clientOS == 0) {
            if (currentYear < LocalDate.now().getYear()) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (currentYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2023;
        checksUsersOptionsAndPrintResult(clientOS, clientDeviceYear);
    }

    public static String calculateNumbersOfDays(int distance) {
        if (distance < 20) {
            return "Потребуется дней: 1";
        } else if (distance > 20 && distance <= 60) {
            return "Потребуется дней: 2";
        } else if (distance > 60 && distance <= 100) {
            return "Потребуется дней: 3";
        } else {
            return "Доставка невозможна";
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 50;
        String deliveryTime = calculateNumbersOfDays(deliveryDistance);
        System.out.println(deliveryTime);
    }
}