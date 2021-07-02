package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();

		words.add("thank");
		words.add("god");
		words.add("it's");
		words.add("Friday  - Woo");
		words.add("!");

		System.out.println(words);

		words.remove(0);

		System.out.println(words);

		words.remove("!");

		System.out.println(words);

		words.add("!");
		words.add("!");
		words.add("!");

		words.remove("!");

		while (words.contains("!")) {
			words.remove("!");
		}
		System.out.println(words);

		Collections.sort(words); // sorts alphabetically/numerically/etc

		System.out.println(words);

		int i = 5;
		Integer integer = 12;
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7); // new java 8

		List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5); // old and nasty
	}

}
