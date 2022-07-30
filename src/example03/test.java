package example03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String m = br.readLine();
        
        System.out.println("n = " + n);
        System.out.println("m = " + m);
    }
}
