package valdes.com.company;

public class PositionOfLastNumInSeq {

    public int findMaxIndOfArray(int[] arr) {
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

     public int findMinIndOfArray(int[] arr) {
        int min = arr[0];
        int minInd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
                minInd = i;
        }

        return minInd;
    }

    public int findPositionOfLastNum(int maxInd, int minInd, int arr[]) {
        int lastNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i > maxInd && arr[i] < arr[maxInd]) || (i > minInd && arr[i] > arr[minInd] )) {
                lastNum = i;
                break;
            }
        }

        return lastNum;
    }
}