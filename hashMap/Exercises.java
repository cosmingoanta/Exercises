package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Exercises {

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Integer> res = new HashMap<>(s.length() * 2, 0.7f);
		for(char c : s.toCharArray()) {
			if(!res.containsKey(c)) {
				res.put(c, 0);
				System.out.println(res.get(c));
			} else {
				int aux = res.get(c);
				res.put(c, aux + 1);
				System.out.println("For 1 aux =: " + aux);
				System.out.println(res.get(c));
			}
		}
		for(char c : t.toCharArray()) {
			if(!res.containsKey(c)) {
				System.out.println("error");
				return false;
			} else {
				int aux = res.get(c);
				System.out.println("For 2 aux is: " + aux);
				res.put(c, aux - 1);
				if(res.get(c) == 0) {
					res.remove(c);
				}
			}
		}
		if(res.size() == 0) {
			return true;
		} else {
			return true;
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		if(nums.length == 2) {
			return nums;
		}
		int[] res = new int[2];
		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}

	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> aux = new HashMap<>();
		int res = 0;
		int auxRes = 0;
		char[] auxChar = s.toCharArray();
		for(int i = 0; i < auxChar.length; i++) {
			if(!aux.containsKey(auxChar[i])) {
				auxRes++;
				if(auxRes > res) {
					res = auxRes;
				}
				aux.put(auxChar[i], i);
			} else {
				auxRes = 0;
				i = aux.get(auxChar[i]);
				aux.clear();
			}
		}
		return res;
	}
	
	public static boolean isDiv(int n) {
		if(n == 0) {
			return false;
		}
		int aux = n;
		while(aux != 0) {
			int lastDigit = aux % 10;
			if(lastDigit == 0 || n % lastDigit != 0){
				return false;
			}
			aux = aux / 10;
		}
		return true;
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<Integer>();
		for(int i = left; i <= right; i++) {
			if(isDiv(i)) {
				res.add(i);
			}
		}
		return res;
	}
	
	 public static int singleNumber(int[] nums) {
	        HashSet<Integer> set = new HashSet<>(nums.length, 0.5f);
	        for(int i : nums) {
	        	if(!set.add(i)) {
	        		set.remove(i);
	        	}
	        }
	       return set.iterator().next();
	    }

	public static void main(String[] args) {
		System.out.println(isDiv(128));
		
	}

}
