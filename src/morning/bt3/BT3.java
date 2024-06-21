package morning.bt3;

public class BT3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumOdd = 0, sumEven = 0;

        for (int value : arr) {
            if (value % 2 != 0) {
                sumOdd ++;
            } else {
                sumEven ++;
            }
        }

        System.out.println("Tổng các số lẻ trong mảng là: " + sumOdd);
        System.out.println("Tổng các số chẵn trong mảng là: " + sumEven);
    }
}
