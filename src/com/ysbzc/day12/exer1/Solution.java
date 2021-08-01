package com.ysbzc.day12.exer1;

public class Solution {
    /**
     * @param s0: the number s[0]
     * @param n: the number n
     * @param k: the number k
     * @param b: the number b
     * @param m: the number m
     * @param a: area
     * @return: the way can paint the ceiling
     */
    public long painttheCeiling(int s0, int n, int k, int b, int m, long a) {
        int[] s= new int[s0];
        long area = a;
        for(int i =0;i<s.length;i++ ){
            for(int j =0;j<s.length;j++){
                area = s[i]*s[j];
            }
        }
        if(area < 15){
             return area;
        }else {
            return -1;
        }
       
    }
    
    public static void main(String[] args){
        Solution s1= new Solution();
        System.out.println(s1.painttheCeiling(1, 1, 2, 3, 4, 15));
        
    }
}
