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
    public int maximumSwap(int num) {
        int[]occur=new int[10];
        StringBuilder n=new StringBuilder(String.valueOf(num));
        for(int i=0;i<n.length();i++){
            int digit=n.charAt(i)-48;
            occur[digit]=i;
        }
        for(int i=0;i<n.length();i++){
            int digit=n.charAt(i)-48;
            for(int j=9;j>digit;j--){
                if(occur[j]>i){
                    n.setCharAt(i,(char)(48+j));
                    n.setCharAt(occur[j],(char)(48+digit));
                    return Integer.parseInt(n.toString());
                }
            }
        }
        return num;
    }
}
