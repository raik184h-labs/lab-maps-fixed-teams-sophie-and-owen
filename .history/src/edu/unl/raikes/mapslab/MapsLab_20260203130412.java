package edu.unl.raikes.mapslab;

import java.util.Map;
import java.util.Set;

public class MapsLab {

	/**
	 * Prints the map to the console in a clear, easy-to-understand format.
	 * 
	 * @param map
	 *            the map whose keys and values you want to print.
	 */
	public static void printAMap(Map<? extends Object, ? extends Object> map) {
		// TODO: do the things (you may not use map's toString function)
	}

	/**
	 * Creates a map, with words as keys and the number of times the word appears as
	 * values. The keys do not need to be sorted in any specific order.
	 * 
	 * @param input
	 *            the String of words whose frequencies we want to count
	 * @return a Map of words and their frequencies
	 */
	public static Map<String, Integer> getWordFrequencies(String input) {
		String[] words = input.split(" +");

		// TODO: do the things
		return null;
	}

	/**
	 * Creates a map, with word lengths as keys and a Set of words that have that
	 * length as values. E.g. the Integer 4 would map to the list:
	 * {dogs,love,toad,goat,pets}, assuming those five words were the only unique
	 * words with 4 letters included in the input. 
	 * 
	 * @param input
	 *            the String of words whose lengths we want to consider
	 * @return a Map of words and their frequencies
	 */
	public static Map<Integer, Set<String>> getWordsOfLengths(String input) {
		String[] words = input.split(" +");

		// TODO: do the things
		return null;
	}

	/**
	 * Creates a map, with characters as keys and a Set of words that include that
	 * character as values. E.g. if the input consisted of the single word "peace",
	 * the returned map would include a key "p" with {peace} as its value, a key "e"
	 * with {peace} as its value, a key "a" with {peace} as its value, and a key "c"
	 * with {peace} as its value. The keys of the returned Map should be sorted
	 * alphabetically.
	 * 
	 * @param input
	 *            the String of words whose lengths we want to consider
	 * @return a Map of words and their frequencies
	 */
	public static Map<Character, Set<String>> getWordsThatIncludeChars(String input) {
		String[] words = input.split(" +");

		// TODO: do the things
		return null;
	}

	/**
	 * Main function. Controls the program.
	 * @param args this program does not accept any args
	 */
	public static void main(String[] args) {
		// word frequencies
		Map<String, Integer> frequencies = getWordFrequencies("my name is george and i was a"
				+ " president and my dad was a president too and his name is also george"
				+ " are you a president too");
		printAMap(frequencies);
		System.out.println("\n--------------------------\n");

		// word lengths
		Map<Integer, Set<String>> wordLengths = getWordsOfLengths("For Nebraska and the scarlet "
				+ "For Nebraska and the cream " 
				+ "Tho' they go thru many a battle " 
				+ "Our colors still are seen "
				+ "So in contest and in vict'ry " 
				+ "We will wave them for the team "
				+ "And 'twill always stir a Cornhusker " 
				+ "The old scarlet and the cream");
		printAMap(wordLengths);
		System.out.println("\n--------------------------\n");

		// words that contain given letters
		Map<Character, Set<String>> wordsForChars = getWordsThatIncludeChars(
				"One day, a zebra found a xylophone on the sidewalk. He quickly ran over, "
						+ "picked it up, and gave it to his pet mule. Just then, he found another "
						+ "xylophone. He kept that one for himself.");
		printAMap(wordsForChars);
		System.out.println("\n--------------------------\n");
	}
}
