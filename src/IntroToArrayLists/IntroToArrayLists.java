package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> stringArray = new ArrayList<String>();
		// 2. Add five Strings to your list
		stringArray.add("String #1");
		stringArray.add("String #2");
		stringArray.add("String #3");
		stringArray.add("String #4");
		stringArray.add("String #5 e");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stringArray.size(); i++) {
			System.out.println(stringArray.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : stringArray) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < stringArray.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(stringArray.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = stringArray.size() - 1; i > - 1; i--) {
			System.out.println(stringArray.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (String s : stringArray) {
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
