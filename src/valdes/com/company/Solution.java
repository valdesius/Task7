package valdes.com.company;

public class Solution {

    public int findMaxElementOfArray(int[] arr){
        int maxNumber = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxNumber <= arr[i]) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }


        return maxNumber;
    }

    public int findMaxIndOfArray(int[] arr){
        int maxNumber = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxNumber <= arr[i]) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public int findMinElementOfArray(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }

    public int findPositionOfLastNum(int maxInd, int arr[]) {
        int lastNum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i > maxInd && arr[i] < arr[maxInd] ) {
                    lastNum = i;
                    break;
                }
            }

        return lastNum;
    }
}