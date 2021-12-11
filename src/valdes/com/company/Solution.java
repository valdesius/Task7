package valdes.com.company;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int fight(int arr[], int a){
        List<Integer> tempSequence = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++){
            int f = i + 1;

            if (Math.abs(arr[i] - arr[f]) == a){
                tempSequence.add(arr[i]);
                tempSequence.add(arr[f]);
            }
        }
        System.out.println(tempSequence);
        return 0;
    }

}
