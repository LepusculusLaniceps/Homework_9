import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] arrSpending = generateRandomArray();
        int commonSpending = 0;

        System.out.println(Arrays.toString(arrSpending));

        for (int spending : arrSpending) {
            commonSpending += spending;
        }
        System.out.println("Сумма трат за месяц составила " + commonSpending + " рублей.");
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");

        int[] arrSpending = generateRandomArray();

        System.out.println(Arrays.toString(arrSpending));

        int minSpending = arrSpending[0];
        int maxSpending = arrSpending[0];

        for (int spending : arrSpending) {
            if (spending < minSpending) {
                minSpending = spending;
            }
            if (spending > maxSpending) {
                maxSpending = spending;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей.");
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");

        int[] arrSpending = generateRandomArray();
        int commonSpending = 0;

        System.out.println(Arrays.toString(arrSpending));

        for (int spending : arrSpending) {
            commonSpending += spending;
        }
        double spendingAverage = commonSpending / arrSpending.length;

        System.out.println("Средняя сумма трат за месяц составила " + spendingAverage + " рублей.");
    }


    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}




