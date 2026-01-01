package Questions;

public class Q04_ArmstrongNumber {
    public static boolean armstrongNumber(int n) {
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if(sum == n) return true;
        return false;
    }
    public static void main(String[] args) {

    }
}

