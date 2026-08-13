package Arrays.Easy;

public class LongestSubArrayWithSumK {

    public static void main(String[] args) {
int[]arr={10,4,1,7,1,2,9};
int k=15;
findLongest(arr,k);
    }
    public static void findLongest(int[] arr, int k) {
        int left = 0;
        int currentSum = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            // 1. Expand window by adding current element
            currentSum += arr[right];

            // 2. Shrink window from left if sum exceeds K
            while (currentSum > k && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            // 3. Update max length if target sum is met
            if (currentSum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println("Longest length: " + maxLen);
    }

}
