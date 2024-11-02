package com.interviewprep.leetcode.easy.assigncookies;

import java.util.Arrays;

public class FirstApproach {

	public static void main(String[] args) {
		
		
	//	int[] g = {1,2,3}, s = {1,1};
	//	int[] g = {1,2}, s = {1,2,3};
		
		int[] g = {1,2,3}, s = {3};
		
		FirstApproach fa = new FirstApproach();
		int match = fa.findContentChildren(g, s);

		System.out.println(match);
	}
	
	
	 public int findContentChildren(int[] g, int[] s) {
		 
		 int match = 0;
		 
		 Arrays.sort(g);
		 Arrays.sort(s);
		 
		 int i=0, j=0;
		 
		 while(i<g.length &&  j<s.length) {
			 
			 if(s[j] >= g[i]) {
				 
				 match++;
				 
				 // move to next child
				 i++;
			 }
			 
			// move to next cookie
			 j++;
		 }
		 
		 return match;
	 }
	
}
