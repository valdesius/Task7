package valdes.com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter length of array --->>> ");
        int length = readNumber();
        int[] array = new int[length];
        System.out.println("Enter elements of array --->>> ");
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter a --->>> ");
        int a = readNumber();
        Solution solution = new Solution();
        solution.fight(array, a);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int length = 0;

        try {
            length = scanner.nextInt();
            if (length < 1) {
                System.err.print("Error. Length of array can't be greater than 1...");
            }
            return length;
        } catch (InputMismatchException e) {
            System.err.println("Error. Incorrect data entered. You entered string or not correct symbols");
            return 0;
        }
    }

    private static void fillArray(int[] arr){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Enter %d element of array: ", i + 1);
            arr[i] = scanner.nextInt();
        }
    }
}