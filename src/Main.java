import java.time.LocalDate;

public class Main {
    //метод к заданию 1
    public static boolean checkYear(int year) {
        boolean checkYear = ((year % 4 == 0) & (year % 100 != 0)) || (year % 400 == 0);
        return checkYear;
    }

    //метод к заданию 2
    public static String checkPhone(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear) {
            if (clientOS == 1) {
                String checkPhoneResult = "Установите версию приложения для iOS по ссылке";
                return checkPhoneResult;
            } else {
                String checkPhoneResult = "Установите версию приложения для Android по ссылке";
                return checkPhoneResult;
            }
        } else {
            if (clientOS == 1) {
                String checkPhoneResult = "Установите облегченную версию приложения для iOS по ссылке";
                return checkPhoneResult;
            } else {
                String checkPhoneResult = "Установите облегченную версию приложения для Android по ссылке";
                return checkPhoneResult;
            }
        }
    }
    //метод к заданию 3
    public static int calculateDeliveryDay(int deliveryDistance) {
        int deliveriDayIndex = (int)Math.ceil((deliveryDistance-20)/40d);
        int deliveryDay = 1+deliveriDayIndex;
        return deliveryDay;
    }
    // методы к дополнительному заданию
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        return sum;
    }
    public static double calculateMid(int sum, int[] arr){
    double mid = sum/arr.length;
    return mid;
}
    public static void printResult(double mid){
    System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей.");
}


    public static void main(String[] args) {

        //первое задание
        int year = 2024;
        boolean checkResult = checkYear(year);
        if (checkResult == true) {
            System.out.println(year + " - это високосный год");
        } else {
            System.out.println(year + " - это НЕ високосный год");
        }

        //второе задание
        int clientDeviceYear = 2021;
        int clientOS = 1;
        String checkPhoneResult = checkPhone(clientDeviceYear, clientOS);
        System.out.println(checkPhoneResult);

        //третье задание
        int deliveryDistance = 95;
        int deliveryDay = calculateDeliveryDay(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDay);

        //дополнительное задание
        //Снова вспоминаем домашнее задание по массивам.
        // В нем была задача, которая требовала высчитать среднюю выплату за день.
        //Был дан сгенерированный массив из 30 значений от 100 до 200 тысяч, для его генерации допускается использовать
        // метод из прошлого домашнего задания.
        //Нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
        // «Средняя сумма трат за месяц составила … рублей».
        int[] arr = generateRandomArray();
        printResult (calculateMid (calculateSum (arr), arr));
    }
}