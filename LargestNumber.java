/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyAlgo;

import java.util.Arrays;

/**
 *
 * @author HP
 */
class Solution {
    public String largestNumber(int[] nums) {
        String s[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=nums[i]+"";
        }

        Arrays.sort(s,(s1,s2)->{
            Long num1=Long.parseLong(s1+s2);
            Long num2=Long.parseLong(s2+s1);

            if(num1>num2)
                return 1;
            else if(num1<num2)
                return -1;
            else
                return 0;
        });

        StringBuilder ans=new StringBuilder("");

        for(int i=s.length-1;i>=0;i--){
            ans.append(s[i]);
        }
        if(ans.charAt(0)=='0')
            return "0";
        return ans.toString();
    }
}