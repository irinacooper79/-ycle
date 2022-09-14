public class Main {
    public static void main(String[] args) {

        // задача 1 (циклы -1)
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
       System.out.println(i);
        }

        // задача 2 (циклы-1)
        System.out.println("Задание 2");
        for (int i = 10; i <= 1; i--) {
            System.out.println(i);
    }

        // задача 3 (циклы 1)
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // задача 4 (циклы 1)
        System.out.println("Задание 4");
        for (int i = 10; i <= -10; i--) {
            System.out.println(i);
        }

        // Задача 1 (циклы 2 )
        System.out.println("Задание 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "Год является високосным");
            }

            // Задача 2 (циклы 2)
            System.out.println("Задание 6");
            for (int i= 7; i <= 98; i += 7 ){
                System.out.println(i + " ");
            }

            // Задача 3 (циклы 2)
            System.out.println("Задание 7");
            int number = 1;
            System.out.println(number + " ");
            if (int i = 0; i < 9; i++){
                number = number * 2;
                System.out.println(number + " ");
            }

            // Задача 1 (циклы 3)
            System.out.println("Задание 8");
            int salary = 29000;
            int total = 0;
            for (int i = 1; i < 12; i++) {
                total = total + salary;
                System.out.println("Месяц" + i + "сумма накоплений рана" + total + "рублей");
            }
             // Задача 2 (циклы 3)
            System.out.println("Задание 9");
            int part = 29000;
            double sumWithPercent = 0;
            double percent = 0,01;
            for ( int i=1; i<=12; i++){
                sumWithPercent = ( sumWithPercent+ part) * (1 + percent);
                System.out.println("Месяц" +i+ "сумма накоплений равна" + sumWithPercent + "рублей");
            }
