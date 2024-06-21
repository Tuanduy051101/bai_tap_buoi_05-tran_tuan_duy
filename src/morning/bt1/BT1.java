package morning.bt1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BT1 {

    public static Integer[] removeDuplicates(Integer[] arr) {
        Set<Integer> mySet = new HashSet<>(Arrays.asList(arr));
        return mySet.toArray(new Integer[0]);
    }

    public static int sum(Integer[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] myArray = {5, 1, 8, 4, 9, 1, 5};
        System.out.println("Tổng các phần tử riêng biệt từ mảng là: " + sum(removeDuplicates(myArray)));
    }
}

