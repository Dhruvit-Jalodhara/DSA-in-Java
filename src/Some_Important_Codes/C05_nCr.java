package Some_Important_Codes;

public class C05_nCr {
    public static int nCr(int n, int r){
        r = Math.min(r, n - r);
        long res = 1;

        for(int i = 1; i <= r; i++){
            res = res * (n - i + 1) / i;
        }
        return (int)res;
    }
}
