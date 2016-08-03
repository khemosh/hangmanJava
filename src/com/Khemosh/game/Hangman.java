package com.Khemosh.game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.Khemosh.utils.Helper;

public class Hangman {

	public static void main(String[] args) {
		Hangman h = new Hangman();
		h.playGame();

	}
	
	
	public void playGame() {
		Helper help = new Helper();
		
		// doesn't work with uppercase 
		String wordToGuess = "game of thrones";
		String[] word = help.stringToArray(wordToGuess);
		Boolean correctGuess = false;
		String[] array = help.blankArray(wordToGuess);
		
		help.printArray(array);
		while (!correctGuess) {

			if (!Arrays.equals(word, array)) {
				System.out.println("\nGuess a letter");
				Scanner input = new Scanner(System.in);
				String guess = input.nextLine();

				for (int i = 0; i < word.length; i++) {
					if (word[i].equalsIgnoreCase(guess)) {
						array[i] = guess;
					}

				}
			
				help.printArray(array);
			} else {
				System.out.println("\nGZ!");
				correctGuess = true;
			}

		}
	}

	

}
