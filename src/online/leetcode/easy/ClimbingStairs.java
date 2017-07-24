package online.leetcode.easy;

import java.util.Arrays;

/**
 https://www.youtube.com/watch?v=CFQk7OQO_xM
 https://leetcode.com/problems/climbing-stairs/
 70. Climbing Stairs
 You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 ------------------------------------------------------------------------------------------------------------------------
 Approach: Classic Dynamic Programming Problem
    T(n) = T(n-1) + T(n-2). Memoization by storing these two previous values

 */
public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        int n = 7;
        int result = obj.climbStairs(n);
        System.out.println(result);

        result = obj.climbStairs_1(n);
        System.out.println(result);
    }

    /**
     * Without memoization: Time complexity: O(2^n), Space complexity: O(n)
     * With Memoization: Time complexity: O(n), Space complexity: O(n)
     */
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        int result = climbStairsHelper(n, memo);
        return result;
    }

    public int climbStairsHelper(int n, int[] memo){
        if(n < 0){
            return 0;
        }else if(n == 0){
            return 1;
        }else if(memo[n] > -1){
            return memo[n];
        }else{
            memo[n] = climbStairsHelper(n-1, memo) + climbStairsHelper(n-2, memo);
            return memo[n];
        }
    }

    /**
     * More optimised, reduced space complexity to O(1). Time complexity is: O(n)
     */
    public int climbStairs_1(int n) {
        int n1 = 1, n2 = 1;         //used to store previous 2 values

        //check if n is 1
        if(n == n1 || n == n2){
            return n;
        }

        for(int i=2; i <= n; i++) {
            int temp = n1 + n2;

            n1 = n2;                //Memoization by storing previous two values in n1 and n2. We reduce space complexity to O(1)
            n2 = temp;
        }

        return n2;
    }
}
