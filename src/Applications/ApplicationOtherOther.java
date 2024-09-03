package Applications;

import java.util.Arrays;import java.util.Random;
import java.util.Scanner;
public class ApplicationOtherOther {
    public static void main(String[] args) {
        int[] numberArreyOne;
        int[] numberArreyTwo;
        int arreyLength;
        int numToFind;
        System.out.printLn("Введите размер массивов");
        Scanner scan = new Scanner(System.in);
        arreyLength =scan.nextInt();
        numberArreyOne =new int[arreyLength];
        numberArreyTwo =new int[arreyLength];
        Random random = new Random();
        for(
                int i = 0;
                i<numberArreyOne.length;i++)

        {
            numberArreyOne[i] = random.nextInt(-10, 10);
        }
        for(
                int i = 0;
                i<numberArreyTwo.length;i++)

        {
            numberArreyTwo[i] = random.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(numberArreyOne));
        System.out.println(Arrays.toString(numberArreyTwo));
        Arrays.sort(numberArreyOne);
        Arrays.sort(numberArreyTwo);
        System.out.println(Arrays.toString(numberArreyOne));
        System.out.println(Arrays.toString(numberArreyTwo));
        for(
                int i = 0;
                i<numberArreyOne.length;i++)

        {
            for (int j = 0; j < numberArreyTwo.length; j++) {
                if (numberArreyOne[i] == numberArreyTwo[j]) {
                    System.out.print(numberArreyOne[i]);
                    System.out.print(" ");
                }
            }
        }
    }

}

