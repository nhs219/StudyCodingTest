package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hash01 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {0,2,4,6,8};
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : array1) {
            map.put(i, true);
        }

        for (int j : array2) {
            if (map.containsKey(j)) {
                result.add(j);
            }
        }

        System.out.println(result);
    }
}
