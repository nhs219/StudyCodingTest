package book;

import java.util.HashMap;

public class Hash03 {
    public static void main(String[] args) {
        String word = "minimum";
        char[] charWord = word.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : charWord) {
            if(map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, 0);
            }
        }

        for (char c : charWord) {
            if(map.get(c) == 0) {
                System.out.println(c);
                break;
            }
        }
    }
}
