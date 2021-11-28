package valdes.com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter length of array --->>> ");
        int length = readNumber();
        readArr(length);
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

    private static void readArr(int length){
        Scanner scanner = new Scanner(System.in);
        String arr;
        int[] array = new int[length];
        List<Integer> elementsOfArray = new ArrayList<>();

        System.out.println("Enter elements of array --->>> ");

        for (int i = 0; i < length; i++){
            int arrayElement;
            arrayElement = readNumber();
            elementsOfArray.add(arrayElement);
        }
        System.out.println(elementsOfArray);
    }
}
