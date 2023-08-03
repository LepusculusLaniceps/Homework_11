public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int year = 1800;
        var leap = year % 4f;
        var leapCheck1 = year % 100f;
        var leapCheck2 = year % 400f;
        if (leapCheck2 == 0) {
            System.out.println(year + " год является високосным");
        } else if (leap != 0 || leapCheck1 == 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }
    }
}