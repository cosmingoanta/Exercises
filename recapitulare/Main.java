package recapitulare;

import java.util.ArrayList;

public class Main {
	
	public static boolean canType(String word, String row) {
		word = word.toLowerCase();
		row = row.toLowerCase();
		for(int i = 0; i < word.length(); i++) {
			if(!row.contains(Character.toString(word.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
	
	 public static String[] findWords(String[] words) {
	       ArrayList<String> res = new ArrayList<String>();
	        for(String s : words) {
	        	if(canType(s, "qwertyuiop") || canType(s, "asdfghjkl") || canType(s, "zxcvbnm")){
	        		res.add(s);
	        	}
	        }
	        String[] result = new String[res.size()];
	        for(int i = 0; i < res.size(); i++) {
	        	result[i] = res.get(i);
	        }
	        return result;
	       
	    }
	 
	 public static int rob(int[] nums) {
		 int res1 = 0;
		 int res2 = 0;
		 for(int i = 0; i < nums.length; i = i + 2) {
			 res1 += nums[i];
			 if(i + 2 > nums.length - 1) {
				 break;
			 }
		 }
		 for(int i = 1; i < nums.length; i = i + 2) {
			 res2 += nums[i];
			 if(i + 2 > nums.length - 1) {
				 break;
			 }
		 }
		 return Integer.max(res1, res2);
	 }

	public static void main(String[] args) {
		int dim = 5;
		int[][] heights = new int[dim][dim];
		int[] row = {1, 2, 3, 4, 5};
		 
		for (int i=0; i<heights.length; i++) {
		  heights[i] = row; 
		}
		
		for (int i=0; i<heights.length; i++) {
			System.out.println(heights[2][i]);
			
			} 
		for (int i=0; i<row.length; i++) {
		  heights[0][i] = i%2;
		}
		 
		for (int i=0; i<heights.length; i++) {
		  for (int j=0; j<heights[i].length; j++) {
		    System.out.print(heights[i][j] + " ");
		  }
		  System.out.println();
		}
	
	}

}
