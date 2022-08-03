package book;

import java.util.Arrays;
import java.util.HashMap;

public class Hash02 {
    public static void main(String[] args) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String sentence = "the quick brown box jumps over a lazy dog";
        char[] charSen = sentence.replace(" ", "").toCharArray();

        HashMap<Character, Boolean> map = new HashMap<>();
        for(char c : charSen) {
            map.put(c, true);
        }

        for(char apb : alphabet) {
            if(!map.containsKey(apb)) {
                System.out.println(apb);
            }
        }
    }
}
