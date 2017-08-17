package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
//	public static int findBrokenEgg(List<String> eggs) {
//		//<- this needs changing
//		int numberBroken = 0;
//		
//		for (int i = 0; i < eggs.size(); i++) {
//			if (eggs.get(i).equals("cracked")) {
//				numberBroken += 1;
//			}
//		}
//		
//		return numberBroken;
//	}
	
	//Add other methods here
	
//	public static int countPearls(List<Boolean> oysters) {
//		int numberPearls = 0;
//		
//		for (int i = 0; i < oysters.size(); i++) {
//			if (oysters.get(i) == true) {
//				numberPearls += 1;
//			}
//		}
//		
//		return numberPearls;
//	}
	
//	public static double findTallest(List<Double> peeps) {
//		double tallestPeep = 0.0;
//		
//		for (int i = 0; i < peeps.size(); i++) {
//			if (peeps.get(i) > tallestPeep) {
//				tallestPeep = peeps.get(i);
//			}
//		}
//		
//		return tallestPeep;
//	}
	
//	public static String findLongestWord(List<String> words) {
//		String longestWord = "";
//		
//		for (int i = 0; i < words.size(); i++) {
//			if (words.get(i).length() > longestWord.length()) {
//				longestWord = words.get(i);
//			}
//		}
//		
//		return longestWord;
//	}
	
	public static boolean containsSOS(List<String> message) {
		boolean contains = false;
		
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				contains = true;
			}
		}
		
		if (contains == true) {
			return true;
		} else {
			return false;
		}
	}
}