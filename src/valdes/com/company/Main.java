package valdes.com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws TestNotPassedException {

        TestProgram test = new TestProgram();
        TestResult testResult = test.testProgram();

        if (!testResult.getTestResult()) {
            throw new TestNotPassedException();
        }

        System.out.println("Введите длину массива --->>> ");
        int length = readNumber();
        int[] array = new int[length];

        System.out.println("Введите элементы массива --->>> ");
        fillArray(array);
        System.out.println(Arrays.toString(array));

        PositionOfLastNumInSeq positionOfLastNumInSubSeq = new PositionOfLastNumInSeq();

        int maxIndex = positionOfLastNumInSubSeq.findMaxIndOfArray(array);
        int minIndex = positionOfLastNumInSubSeq.findMinIndOfArray(array);

        int last = positionOfLastNumInSubSeq.findPositionOfLastNum(maxIndex, minIndex, array);
        System.out.println("позиция(индекс) последнего элемента массива, который \n" +
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

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.printf("Введите %d элемент массива: ", i + 1);
                arr[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Error. Incorrect data entered. You entered string or not correct symbols");
            }
        }
    }
}