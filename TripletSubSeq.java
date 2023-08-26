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
    public boolean increasingTriplet(int[] nums) {
        int small=Integer.MAX_VALUE,big=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=small)
                small=num;
            else if(num<=big)
                big=num;
            else
                return true;
        }
        return false;
    }
}