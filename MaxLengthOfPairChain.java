/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author HP
 */
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        int chainEnd=pairs[0][1];
        int chainLength=1;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLength++;
                chainEnd=pairs[i][1];
            }
        }
        return chainLength;
    }
}
