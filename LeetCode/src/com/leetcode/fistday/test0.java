package com.leetcode.fistday;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/19 - 11 - 19 - 20:00
 * @Description: com.leetcode.fistday
 * @version: 1.0
 */
public class test0 {

    public static int[] twoSum(int[] nums, int target) {
        //定义数组
        int a = 0;
        int b = 0;

        outer:
        for(int i = 0;i<(nums.length-1);i++){
            inter:
            for(int j=i+1;j<=(nums.length-1);j++){
                if(nums[i]+nums[j]==target){
                    a = i;
                    b = j;
                    break outer;
                }
            }
        }
        int[] result = new int[]{a,b};
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        for (int i : ints ){
            System.out.println(i);
        }

    }

}
