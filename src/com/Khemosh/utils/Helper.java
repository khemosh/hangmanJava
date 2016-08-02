package com.Khemosh.utils;

public class Helper {

	public void printArray(String[] array) {
		for (String letter : array) {
			System.out.print(letter + " ");
		}
	}

	public String[] stringToArray(String word) {
		String[] array = word.split("");
		String[] array2 = new String[word.length()];

		for (int i = 0; i < word.length(); i++) {
			array2[i] = array[i + 1];
		}

		return array2;
	}

	public String[] blankArray(String word) {
		String[] array = new String[word.length()];

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				array[i] = " ";
			} else {
				array[i] = "_";
			}
		}

		return array;
	}
}
