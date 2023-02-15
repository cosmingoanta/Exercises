package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode {

	public static int maxProfit(int[] prices) {
		int buyPoint = Integer.MAX_VALUE;
		int result = 0;
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < buyPoint) {
				buyPoint = prices[i];
			}
			if(prices[i] - buyPoint > result) {
				result = prices[i] - buyPoint;
			}
		}
		return result;
	}

	public static int numJewelsInStones(String jewels, String stones) {
		int res = 0;
		for(char c : stones.toCharArray()) {
			if(jewels.contains(Character.toString(c))) {
				res++;
			}
		}
		return res;
	}

	public static int numJewelsInStones2(String jewels, String stones) {
		int res = 0;
		HashSet<Character> set = new HashSet<>(jewels.length(), 0.5f);
		for(char c : jewels.toCharArray()) {
			set.add(c);
		}
		for(char c : stones.toCharArray()) {
			if(set.contains(c)) {
				res++;
			}
		}
		return res;
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>(Integer.max(nums1.length, nums2.length));
		for(int i : nums1) {
			set.add(i);
		}
		ArrayList<Integer> res = new ArrayList<>();
		for(int i : nums2) {
			if(set.contains(i) && !res.contains(i)){
				res.add(i);
			}
		}
		int[] res2 = new int[res.size()];
		for(int i = 0; i < res.size(); i++) {
			res2[i] = res.get(i);
		}
		return res2;
	}

	public static int distributeCandies(int[] candyType) {
		HashSet<Integer> set = new HashSet<>(candyType.length, 0.5f);
		for(int i : candyType) {
			set.add(i);
		}
		if(set.size() < candyType.length / 2) {
			return set.size();
		} else {
			return candyType.length / 2;
		}
	}

	public static int countOccurrences(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;

		int middle = left + right / 2;
		return 1;
	}

	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<>(s.length(), 0.5f);
		for(char c : s.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}

}
