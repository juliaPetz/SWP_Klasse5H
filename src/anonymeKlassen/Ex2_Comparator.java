package anonymeKlassen;

import java.util.Arrays;
import java.util.Comparator;

public class Ex2_Comparator {
	
	public static void main(String[] args) {
		String[] words = {"Banana", "Pear", "Apple", "Pineapple"};
		
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		System.out.println("Sortiertes Array:");
		for(String s : words) {
			System.out.println(s);
		}
	}

}
