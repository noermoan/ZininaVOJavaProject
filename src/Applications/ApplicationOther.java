package Applications;
import java.util.Arrays;import java.util.Random;
import java.util.Scanner;
public class ApplicationOther {
    public static void serch(int[] numberArreyTwo, int numToFind) {
        int low = 0;
        int high = numberArreyTwo.length;
        int middle;
        while(low <= high) {
            middle = (low + high) / 2;
            int num = numberArreyTwo[middle];
            if (num == numToFind) {
                System.out.print(numToFind);
                System.out.print(" ");
                break;
            }
            else if (num > numToFind) {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] numberArreyOne;
        int[] numberArreyTwo;
        int arreyLength;
        int numToFind;
        System.out.println("Введите размер массивов");
        Scanner scan = new Scanner(System.in);
        arreyLength = scan.nextInt();
        numberArreyOne = new int[arreyLength];
        numberArreyTwo = new int[arreyLength];
        Random random = new Random();
        for (int i = 0; i < numberArreyOne.length; i++) {
            numberArreyOne[i] = random.nextInt(-100, 100);
        }
        for (int i = 0; i < numberArreyTwo.length; i++) {
            numberArreyTwo[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(numberArreyOne));
        System.out.println(Arrays.toString(numberArreyTwo));
        Arrays.sort(numberArreyOne);
        Arrays.sort(numberArreyTwo);
        System.out.println(Arrays.toString(numberArreyOne));
        System.out.println(Arrays.toString(numberArreyTwo));
        for (int i = 0; i < numberArreyOne.length; i++) {
            serch(numberArreyTwo, numberArreyOne[i]);
        }
    }
}
