package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		// <- this needs changing
		int numberBroken = 0;

		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				numberBroken += 1;
			}
		}

		return numberBroken;
	}

	// Add other methods here

	public static int countPearls(List<Boolean> oysters) {
		int numberPearls = 0;

		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				numberPearls += 1;
			}
		}

		return numberPearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallestPeep = 0.0;

		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallestPeep) {
				tallestPeep = peeps.get(i);
			}
		}

		return tallestPeep;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = "";

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}

		return longestWord;
	}

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

	public static List<Double> sortScores(List<Double> results) {
		double swap = 0;
		int swapNum = 1;
		while (swapNum > 0) {
			swapNum = 0;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i + 1) < results.get(i)) {
					swapNum += 1;
					swap = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, swap);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String swap = "";
		int swapNum = 1;
		while (swapNum > 0) {
			swapNum = 0;
			for (int i = 0; i < unsortedSequences.size() - 1; i++) {
				if (unsortedSequences.get(i + 1).length() < unsortedSequences.get(i).length()) {
					swapNum += 1;
					swap = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i + 1));
					unsortedSequences.set(i + 1, swap);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		String swap = "";
		int swapNum = 1;
		while (swapNum > 0) {
			swapNum = 0;
			for (int i = 0; i < words.size() - 1; i++) {
				if (words.get(i).compareTo(words.get(i + 1)) > 0) {
					swapNum += 1;
					swap = words.get(i);
					words.set(i, words.get(i + 1));
					words.set(i + 1, swap);
				}
			}
		}
		return words;
	}
}