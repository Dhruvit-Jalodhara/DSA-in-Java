package Questions;

public class Q20_LeetCode121 {
    // method 1 :
//    public static int maxProfit(int[] prices) {
//        int profit = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            int min = prices[i];
//            for (int j = i+1; j < prices.length; j++) {
//                if((prices[j] > min) && (prices[j] - min > profit))
//                    profit = prices[j] - min;
//            }
//        }
//        return profit;
//    }

    // method 2 :
    public static int maxProfit(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }else{
                int profit = arr[i] - min ;
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
