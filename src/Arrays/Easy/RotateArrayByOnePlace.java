package Arrays.Easy;

import java.util.Arrays;

public class RotateArrayByOnePlace {

    public static void main(String[] args) {
        int[]arr={1,2,7};

        rotate(arr);
    }
    public static void rotate(int []arr) {
        if (arr.length > 0 ) {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }

            System.out.println(Arrays.toString(arr));
        }
    }

