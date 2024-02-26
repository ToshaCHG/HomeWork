import java.util.Arrays;

public class base {
    private static void sequenceOutput() {
        final int BEGIN_RANGE = 7;
        final int END_RANGE = 98;
        final int STEP = 7;
        for (int sequenceElement = BEGIN_RANGE; sequenceElement <= END_RANGE; sequenceElement += STEP) {
            System.out.printf("%d ", sequenceElement);
        }
        System.out.println();
    }

    private static void maxAndAverArray() {
        final int ARRAY_SIZE = 10;
        final double MAX_ARRAY;
        final double AVERAGE_ARRAY;
        double[] randomArray = new double[ARRAY_SIZE];
        for (int index = 0; index < ARRAY_SIZE; index++) {
            randomArray[index] = Math.random();
        }
        MAX_ARRAY = Arrays.stream(randomArray).max().getAsDouble();
        AVERAGE_ARRAY = Arrays.stream(randomArray).average().getAsDouble();
        System.out.println("Максимальный элемент массива = " + MAX_ARRAY);
        System.out.println("Среднее значение массива = " + AVERAGE_ARRAY);
    }

    private static boolean isPrime(int number) {
        final int BEGIN_RANGE = 1;
        boolean result = true;
        int count = 0;
        for (int divisor = BEGIN_RANGE; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                count++;
            }
        }
        if (count > 2) {
            result = false;
        }
        return result;
    }

    private static void searchPrimeNumbers() {
        final int BEGIN_RANGE = 2;
        final int END_RANGE = 100;
        for (int number = BEGIN_RANGE; number <= END_RANGE; number++) {
            if (isPrime(number)) {
                System.out.printf("%d ", number);
            }
        }
        System.out.println();
    }

    private static void drawStars() {
        final int WIDTH = 5;
        final int HEIGHT = 3;
        final int COUNT = 0;
        final char SYMBOL = '!';
        for (int repeat = COUNT; repeat < HEIGHT; repeat++) {
            for (int iteration = COUNT; iteration < WIDTH; iteration++) {
                System.out.print(SYMBOL);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1:");
        sequenceOutput();
        System.out.println();
        System.out.println("Задача 2:");
        maxAndAverArray();
        System.out.println();
        System.out.println("Задача 3:");
        searchPrimeNumbers();
        System.out.println();
        System.out.println("Задача 4:");
        drawStars();
        System.out.println();
    }
}
