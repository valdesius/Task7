package valdes.com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SolutionTest solutionTest = new SolutionTest();
        solutionTest.testProgram();

        System.out.println("Enter length of array --->>> ");
        int length = readNumber();
        int[] array = new int[length];

        System.out.println("Enter elements of array --->>> ");
        fillArray(array);
        System.out.println(Arrays.toString(array));

        Solution solution = new Solution();

        int maxIndex = solution.findMaxIndOfArray(array);
        int minIndex = solution.findMinIndOfArray(array);

        int last = solution.findPositionOfLastNum(maxIndex, minIndex, array);
        System.out.println("позиция последнего элемента массива, который \n" +
                "граничит с максимальным элементом массива: " + last);
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

    private static void fillArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Enter %d element of array: ", i + 1);
            arr[i] = scanner.nextInt();
        }
    }
}