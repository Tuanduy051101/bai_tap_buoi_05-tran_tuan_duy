package morning.bt2;

public class BT2 {
    public static String mutipleCharInString(String str) {
        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            result.insert(i * 2, str.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Result: " + mutipleCharInString(str));
    }
}
