package strings;

import java.util.Scanner;

public class WithoutVowelsConsonantsWhitespaces
{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();
	        
	        inputString=inputString.toLowerCase();

	        // Remove vowels, consonants, and whitespace
	        String withoutVowels = removeVowels(inputString);
	        String withoutConsonants = removeConsonants(inputString);
	        String withoutWhitespace = removeWhitespace(inputString);

	        // Output
	        System.out.println("String without vowels: " + withoutVowels);
	        System.out.println("String without consonants: " + withoutConsonants);
	        System.out.println("String without whitespace: " + withoutWhitespace);

	        scanner.close();
	    }

	     static String removeVowels(String input) {
	        return input.replaceAll("[aeiou]", "");
	    }

	     static String removeConsonants(String input) {
	        return input.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
	    }

	     static String removeWhitespace(String input) {
	        return input.replaceAll("\\s", "");
	    }
	}
