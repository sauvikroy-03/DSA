package Arrays.Medium;

public class StockBuyandSell {

    public static void main(String[] args) {
        int[]nums={1,2,0,100};
        maxProfit(nums);
    }

    public static void maxProfit(int[]nums){

        if(nums.length<=0)return;
        int buy=nums[0];
        int profit=0;

    for (int i = 0; i < nums.length; i++) {

        if (nums[i] < buy) {
            buy = nums[i];
        } else if (nums[i] > buy && nums[i] - buy > profit) {
            profit = nums[i] - buy;
        }

    }
    System.out.println(profit);



    }
}
