/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GreedyAlgo;

/**
 *
 * @author HP
 */
import java.util.* ;
import java.io.*; 

class Solution {
	public static int minRooms(int[][] intervals) {
		// Write your code here.
		int n=intervals.length;
		int[]startTime=new int[n];
		int[]endTime=new int[n];

		for(int i=0;i<n;i++){
			startTime[i]=intervals[i][0];
			endTime[i]=intervals[i][1];
		}
		Arrays.sort(startTime);
		Arrays.sort(endTime);

		int room=1;
		int lastEndTime=endTime[0];
		int j=1;
		int i=0;
		while(j<n){
			if(startTime[j]<lastEndTime){
				room++;
			}
			else{
				lastEndTime=endTime[++i];
			}
			j++;
		}
		return room;
	}
}