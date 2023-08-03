public class Main {
    public static void main(String[] args) {
        isYearLeap(1800);
        appDependingOnTheYear(0, 2020);
        findOutDeliveryTime(10);
    }

    public static void isYearLeap(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }
    public static void appDependingOnTheYear(int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        // 0 — iOS, 1 — Android
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

    }
    public static void findOutDeliveryTime(int deliveryDistance) {
        System.out.println("Задача 3");
        int day = 1;
        if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: " + day);
    } else if (deliveryDistance > 20 && deliveryDistance < 60) {
        System.out.println("Потребуется дней: " + (day + 1));
    } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
        System.out.println("Потребуется дней: " + (day + 1 + 1));
    } else if (deliveryDistance >= 100) {
        System.out.println("Доставки нет.");
    }
}
}
