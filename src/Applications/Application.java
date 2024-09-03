package Applications;
import java.util.Arrays;import java.util.Random;
import java.util.Scanner;
public class Application {
    public static void sortA(int[] numberArrey, int numToFind) {
        int low = 0;
        int high = numberArrey.length;
        int middle;
        int countIt = 0;
        while (low <= high) {
            countIt += 1;
            System.out.print(countIt);
            middle = (low + high) / 2;
            int num = numberArrey[middle];
            if (num == numToFind) {
                System.out.println("Значение найдено под индексом " + middle);
                return;
            } else if (num > numToFind) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        System.out.println("Искомого значения в массиве нет");
    }

    public static void main(String[] args) {
        int[] numberArrey;
        int arreyLength;
        int numToFind;
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        arreyLength = scan.nextInt();
        numberArrey = new int[arreyLength];
        Random random = new Random();
        for (int i = 0; i < numberArrey.length; i++) {
            numberArrey[i] = random.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(numberArrey));
        Arrays.sort(numberArrey);
        System.out.println(Arrays.toString(numberArrey));
        System.out.println("Введите число для поиска");
        numToFind = scan.nextInt();
        sortA(numberArrey, numToFind);
    }
}