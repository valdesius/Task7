package valdes.com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class SolutionTest {

    @Test
    public void testProgram(){
        Solution solution = new Solution();
        int[] arr1 = {3, 6, 9, 4, 5, 66, 7};
        int min = solution.findMinIndOfArray(arr1);
        int max = solution.findMaxIndOfArray(arr1);
        int ind = solution.findPositionOfLastNum(max, min, arr1);
        Assertions.assertEquals(6, ind);

        int[] arr2 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr2);
        max = solution.findMaxIndOfArray(arr2);
        ind = solution.findPositionOfLastNum(max, min, arr2);
        Assertions.assertEquals(7, ind);

        int[] arr3 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr3);
        max = solution.findMaxIndOfArray(arr3);
        ind = solution.findPositionOfLastNum(max, min, arr3);
        Assertions.assertEquals(7, ind);

        int[] arr4 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr4);
        max = solution.findMaxIndOfArray(arr4);
        ind = solution.findPositionOfLastNum(max, min, arr4);
        Assertions.assertEquals(7, ind);

        int[] arr5 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr5);
        max = solution.findMaxIndOfArray(arr5);
        ind = solution.findPositionOfLastNum(max, min, arr5);
        Assertions.assertEquals(7, ind);

        int[] arr6 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr6);
        max = solution.findMaxIndOfArray(arr6);
        ind = solution.findPositionOfLastNum(max, min, arr6);
        Assertions.assertEquals(7, ind);

        int[] arr7 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr7);
        max = solution.findMaxIndOfArray(arr7);
        ind = solution.findPositionOfLastNum(max, min, arr7);
        Assertions.assertEquals(7, ind);

        int[] arr8 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr8);
        max = solution.findMaxIndOfArray(arr8);
        ind = solution.findPositionOfLastNum(max, min, arr8);
        Assertions.assertEquals(7, ind);

        int[] arr9 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr9);
        max = solution.findMaxIndOfArray(arr9);
        ind = solution.findPositionOfLastNum(max, min, arr9);
        Assertions.assertEquals(7, ind);

        int[] arr10 = {4, 7,55, 33, 49, 86, 99, 11, 14};
        min = solution.findMinIndOfArray(arr10);
        max = solution.findMaxIndOfArray(arr10);
        ind = solution.findPositionOfLastNum(max, min, arr10);
        Assertions.assertEquals(7, ind);

    }
}
