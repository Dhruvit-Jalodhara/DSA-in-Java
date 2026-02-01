package L06_Arrays;

public class C23_SubArrays {
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static int countSubarrays(int n) {
        return n * (n + 1) / 2;
    }
    public static void sumOfAllSubarrays(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int sum = 0;

            for(int j = i; j < n; j++) {
                sum += arr[j];
                System.out.println("Sum: " + sum);
            }
        }
    }

    // sub array with sum k
    public static boolean subarraySumK(int[] arr, int k) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int sum = 0;

            for(int j = i; j < n; j++) {
                sum += arr[j];

                if(sum == k)
                    return true;
            }
        }

        return false;
    }

    // Kadane's Algorithm : for max sum subarray
    public static int maxSubarraySum(int[] arr) {

        int current = arr[0];   // current → sum of current running subarray
        int maxSum = arr[0];    // maxSum → best (maximum) sum found so far

        for(int i = 1; i < arr.length; i++) {
            int startNew = arr[i];                  // Start new subarray from arr[i]
            int extendOld = current + arr[i];       // Extend previous subarray (current + arr[i])

            current = Math.max(startNew, extendOld);    // choose better option

            maxSum = Math.max(maxSum, current);     // Update global maximum if current is better
        }

        return maxSum;       // Return best contiguous subarray sum
    }


    // Sliding window
    // max sum of size K
    public static int maxSumFixedWindow(int[] arr, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++)
            sum += arr[i];

        int max = sum;

        for(int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i-k];
            max = Math.max(max, sum);
        }

        return max;
    }

    // smallest subarray ≥ target
    public static int minLengthSubarray(int[] arr, int target) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while(sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        printAllSubarrays(arr);
        sumOfAllSubarrays(arr);
    }

}
