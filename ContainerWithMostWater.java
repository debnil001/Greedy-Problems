/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyAlgo;

/**
 *
 * @author HP
 */
class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int curWater,maxWater=0;
        while(lp<rp){
            int ht=Math.min(height[lp],height[rp]);
            int wth=rp-lp;
            curWater=ht*wth;
            maxWater=Math.max(maxWater,curWater);
            if(height[lp]<height[rp])
                lp++;
            else
                rp--;
        }
        return maxWater;
    }
}
