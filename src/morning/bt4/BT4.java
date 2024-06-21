package morning.bt4;

import java.util.LinkedHashSet;
import java.util.Set;

public class BT4 {

    public static void main(String[] args) {
        String str = "characters";
        char[] charArray = str.toCharArray();

        Set<Character> uniqueChars = new LinkedHashSet<>();

        // characters
        for (char c : charArray) {
            uniqueChars.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : uniqueChars) {
            sb.append(c);
        }

        String result = sb.toString();
        System.out.println("result: " + result);
    }
}

