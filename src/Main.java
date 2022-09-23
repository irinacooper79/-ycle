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
                     for (int i = 7; i <= 98; i += 7) {
                         System.out.println(i + " ");
                     }

                     // Задача 3 (циклы 2)
                     System.out.println("Задание 7");
                     int number = 1;
                     System.out.println(number + " ");
                     for ( int i = 0; i < 9; i++){
                         number = number * 2;
                         System.out.println(number + " ");
                     }
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
                 double percent =0.01;
                 for (int i = 1; i <= 12; i++) {
                     sumWithPercent = (sumWithPercent + part) * (1 + percent);
                     System.out.println("Месяц" + i + "сумма накоплений равна" + sumWithPercent + "рублей");
                 }
             }
                  // Задача 1 (циклы)
                  System.out.println ("Задание 10");
                  int cash = 29000;
                  int totalSum = 0;
                  int i = 0;
                  while (totalSum <=2459000 ){
                  totalSum += totalSum / 100 //+1%;
                  totalSum += cash;
                  i++;
                  System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
             }
}
                  // Задача 2 (циклы)
                  int i = 1;
                  while (a <= 10){
                  a++;
                  System.out.println(i+"");
                  for(int i=10;i<=1;i--){
                  System.out.println(i);
                   }}

                 // Задача 3 (циклы)
                    int people = 12000000;
                    int newpeople = 17;
                    int dadpeople = 8;
                    int different = newpeople - dadpeople;
                    for (int i = 1; i <= 10; i++) {
                             people += people * different / 1000;
                             System.out.println("Год" + i + "численность населения состава" + people + "людей");
                 }

                    // Задача 4 (циклы)
                     int bak = 15000;
                     int allSumme = 0;
                     int = 0;
                     while (allSumma <= 12000000) {
                         allSumma += allSumma * 0.07;
                         allSumma += bak;
                         i++;
                         System.out.println("Месяц" + i + "Сумма накоплениц равна" + allSumma + "рублей");
                     }

                      // Задаяча 5 (цикла)
                       while (allSumma <= 12000000){
                             allSumma+=allSumma*0.07;
                             allSumma+=bak;
                             i++;
                             if(i%6==0){
                             System.out.println("Месяц"+i+"Сумма накоплениц равна"+allSumma+"рублей");
                             }
                             }


                      // Задача 6 (циклы)
                          while (allSumma <= 12000000) {
                          allSumma += allSumma * 0.07;
                          allSumma += bak;
                          i++;
                          for (i = 0; ) ;
                          for (i = 0; i <= 9; i = i + 6){
                             if( i%6 == 0){
                             System.out.println("Месяц"+i+"Сумма накоплениц равна"+allSumma+"рублей");
                             }
                             }

                          // Задача 6 (циклы)
                          int september = 31;
                          int friday;
                          for (friday = 2; friday <= 31; friday++) {
                              if (friday % 6 == 0) {
                                  System.out.println("Сегодня пятница" + friday + "число необходимо подготовить отчет");
                              }
                          }

                      // Задача 7 (циклы)
                 for (int year = 2022-200; year < 2022+79; year +79){
                 if (year % 79 ==0){
                 }
                 System.out.println("Комета прилетит в этот год");
                 }

                 //Задача
         int num = 2;
                 for (int i=1; i<=10; i ++){
                 for (int j=1; j <= 2; j++){
                     System.out.println(i+ "х" +j+ "=" + (i*j));
                 }
                 }