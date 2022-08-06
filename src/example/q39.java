package example;

import java.util.Scanner;

public class q39 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[1000001];

        for(int i = 2; i < 1000001; i++) {
            array[i] = i;
        }

        //소수 구하는 공식은 그냥 외우는 게 좋을 듯
        for(int i = 2; i < Math.sqrt(array.length); i++) {
            if(array[i] == 0) {
                continue;
            }

            for(int j = i+i; j < array.length; j = j + i) {
                array[j] = 0;
            }
        }

        int count = n;
        while(true) {
            if(array[count] != 0) {
                int result = array[count];
                if(isPalindrome(result)) {
                    System.out.println(result);
                    break;
                }
            }
            count++;
        }
    }

    private static boolean isPalindrome(int target) {
        char temp[] = String.valueOf(target).toCharArray();
        int s = 0;
        int e = temp.length - 1;
        while(s < e) {
            if(temp[s] != temp[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
