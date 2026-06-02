// class Solution 
// {
//     public double findMaxAverage(int[] nums, int k) 
//     {
//         // double sum;
//         // double maxSum = Integer.MIN_VALUE;

//         // for(int i = k - 1; i < nums.length; i++)
//         // {
//         //     sum = 0;

//         //     for(int j = i; j > i - k; j--)
//         //     {
//         //         sum += nums[j];
//         //     }

//         //     maxSum = Math.max(maxSum, sum);
//         // }

//         // return maxSum / k;


//         double sum = 0;
//         double maxSum = Double.NEGATIVE_INFINITY;

//         // first window
//         for (int i = 0; i < k; i++) {
//             sum += nums[i];
//         }

//         maxSum = sum;

//         // sliding window
//         for (int i = k; i < nums.length; i++) {
//             sum = sum - nums[i - k] + nums[i];
//             maxSum = Math.max(maxSum, sum);
//         }

//         return maxSum / k;
//     }
// }

class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }
}