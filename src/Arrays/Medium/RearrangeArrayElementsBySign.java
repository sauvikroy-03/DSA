package Arrays.Medium;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {-1, -4, 2, -5, 6, 3};
        int[] res = rearrange(nums);
        System.out.println(Arrays.toString(res));
        // Output: [2, -1, 6, -4, 3, -5]
    }

    public static int[] rearrange(int[] nums) {
        int[] res = new int[nums.length];
        int posIndex = 0; // Positives go to even indices: 0, 2, 4, ...
        int negIndex = 1; // Negatives go to odd indices:  1, 3, 5, ...

        for (int num : nums) {
            if (num > 0) {
                res[posIndex] = num;
                posIndex += 2;
            } else {
                res[negIndex] = num;
                negIndex += 2;
            }
        }

        return res;
    }
}