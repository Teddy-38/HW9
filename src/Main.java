public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] arr = new int[5];
        arr[0] = 15;
        arr[1] = 25;
        arr[2] = 35;
        arr[3] = 45;
        arr[4] = 55;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Task2");
        int[] weekend = {1000, 2000, 3000, 4000, 5000};
        int minAmount = weekend[0];
        int maxAmount = weekend[0];

        for (int i = 1; i < weekend.length; i++) {
            if (weekend[i] < minAmount) {
                minAmount = weekend[i];
            }
            if (weekend[i] > maxAmount) {
                maxAmount = weekend[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxAmount + " рублей.");
        System.out.println("Task3");
        int[] speed = {1000, 2000, 3000, 4000, 5000};
        int weeks = 4;
        int avg = 0;
        int sum1 = 0;
        for (int i : speed) {
            sum1 += i;
        }
        avg = sum1 / weeks;
        System.out.println("Средняя сумма трат за месяц составила "+ avg + " рублей");
        System.out.println("Task4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);}
    }
}