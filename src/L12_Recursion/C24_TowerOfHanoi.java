package L12_Recursion;

public class C24_TowerOfHanoi {
    static int count = 0;
    public static int towerOfHanoi(int n, char from, char to, char aux) {
        if(n == 0)
            return count;

        towerOfHanoi(n-1 , from , aux , to);

        System.out.println("Disk " + n +" moved from Rod " + from + " to " + to);
        count++;

        towerOfHanoi(n-1,aux,to,from);

        return count;
    }

    public static void main(String[] args) {
        int ans = towerOfHanoi(3,'A','C','B');
        System.out.println("Total number of steps : " + ans);
    }
}
