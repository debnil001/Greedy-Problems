/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author HP
 */
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=s.length();
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            map.put(c,i);
        }

        HashSet<Character>hs=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        int partition=0;
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            int lastIndex=map.get(c);
            hs.add(c);
            if(lastIndex==i)    hs.remove(c);
            partition++;
            if(hs.size()==0){
                res.add(partition);
                partition=0;
            }
        }

        return res;
    }
}
