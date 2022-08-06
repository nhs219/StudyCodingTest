package example;

import java.util.Scanner;

public class q40 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long min = sc.nextLong();
        long max = sc.nextLong();

        boolean[] Check = new boolean[(int) (max - min + 1)];

        for(int i = 2; i < max; i++ ) {
            long pow = i * i;
            long startIndex = min / pow;

            if(min % pow != 0) {
                startIndex++;
            }

            
        }
    } 
}
