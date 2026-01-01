package Questions;

public class Q01_CountDigits {
    public static int countDigit(int n) {
        // METHOD 1:
//        int digits = 0;
//        while(n > 0){
//            digits++;
//            n /= 10;
//        }
//        return digits;

        // method 2
        int digits = (int)(Math.log10(n) + 1);
        return digits;
    }
    public static void main(String[] args) {

    }
}

