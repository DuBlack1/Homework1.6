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
    public static void task1 () {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2 () {
        int[] arr = generateRandomArray();
        int min = 1000000000;
        int max = 0;
//        Поиск минимального значения
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
//        Поиск максимального значения
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
//        Вывод результатов
        System.out.println("Минимальная сумма трат за день составила "+ min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task3 () {
        int[] arr = generateRandomArray();
        double mean = 0;
        double sum = 0;
//        Поиск суммы
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        mean = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");
    }
    public static void task4 () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}