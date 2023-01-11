public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            total += 15000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        i--;
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPopulation = 12000000;
        int deathPerYear = totalPopulation / 1000 * 8;
        int birthPerYear = totalPopulation / 1000 * 17;
        for (int i = 1; i <= 10; i++) {
            totalPopulation = totalPopulation - deathPerYear + birthPerYear;
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double contribution = 15000;
        double bet = 1.07;
        int month = 0;
        while (contribution < 12000000) {
            contribution *= bet;
            month++;
            System.out.println("Меясц " + month + ", сумма накоплений " + contribution);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double contribution = 15000;
        double bet = 1.07;
        int month = 0;
        while (contribution < 12000000) {
            contribution *= bet;
            month++;
            if (month % 6 == 0) {

                System.out.println("Меясц " + month + ", сумма накоплений " + contribution);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double contribution = 15000;
        double bet = 1.07;
        int month = 0;
        for (; month <= 9 * 12; month++) {
            contribution *= bet;
            if (month % 6 == 0) {

                System.out.println("Меясц " + month + ", сумма накоплений " + contribution);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dayOfMonth = 1;
        int dayOfWeek = 1;
        while (dayOfMonth <= 31) {
            dayOfMonth++;
            dayOfWeek++;
            dayOfWeek = dayOfWeek == 7 ? 0 : dayOfWeek;
            if (dayOfWeek == 5) {
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет");
            }
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        for (int i = 1823; i <= 2123; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

    }
}