package exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static int countChars(List<String> list) {
		int amount = 0;
		for (String word : list) {
			try {
				amount += word.length();
			} catch (NullPointerException e){
				amount += 0;
			}
		}
		return amount;
	}

	public static boolean isPrime(int n){
		if(n == 1){
			return true;
		}
		for(int i = 2; i < n / 2; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		char res = 'z';
		boolean flag = false;
		for(char c : letters) {
			if(c > target && c <= res) {
				res = c;
				flag = true;
			}
		}
		if(flag == false) {
			return letters[0];
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(6));
		List<String> list = new ArrayList<String>();
		list.add("tenis");
		list.add("fotbal");
		list.add(null);
		list.add("volei");

		System.out.println(countChars(list));

	}

}
