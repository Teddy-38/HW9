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
        for (int i = 1; i < weekend.length; i++) {
            if (weekend[i] < minAmount) {
                minAmount = weekend[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей.");
            }
        }
