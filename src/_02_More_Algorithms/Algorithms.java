package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters) {
		int accumulator = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				accumulator++;
			}
		}
		return accumulator;
	}
	public static double findTallest(List<Double> peeps) {
		int position = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > peeps.get(position)) {
				position = i;
			}
		}
		return peeps.get(position);
	}
	public static String findLongestWord(List<String> words) {
		int position = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > words.get(position).length()) {
				position = i;
			}
		}
		return words.get(position);
	}
	public static Boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results) {
		boolean swap = true;
		while(swap) {
			swap = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if(results.get(i) > results.get(i + 1)) {
					double hold = results.get(i + 1);
					results.set(i + 1, results.get(i));
					results.set(i, hold);
					swap = true;
				}
			}
		}
		return results;
	}
	public static List<String> sortDNA(List<String> results) {
		boolean swap = true;
		while(swap) {
			swap = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if(results.get(i).length() > results.get(i + 1).length()) {
					String hold = results.get(i + 1);
					results.set(i + 1, results.get(i));
					results.set(i, hold);
					swap = true;
				}
			}
		}
		return results;
	}
	public static List<String> sortWords(List<String> results) {
		boolean swap = true;
		while(swap) {
			swap = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if(results.get(i).compareTo(results.get(i + 1)) > 0) {
					String hold = results.get(i + 1);
					results.set(i + 1, results.get(i));
					results.set(i, hold);
					swap = true;
				}
			}
		}
		return results;
	}
}
