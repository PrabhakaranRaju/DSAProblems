package ArrayProblems;

import java.util.Arrays;

public class SearchElementInArrayAndReturnIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 13, 15, 19};
        int target = 13;
        System.out.println(searchElement(arr, target));
    }

    static  int searchElement(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
