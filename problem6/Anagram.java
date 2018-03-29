import java.util.*;


public class Anagram {

	static int makeAnagram(String stringOne, String stringTwo) {
		int[] charBuffer = new int[26]; //menampung huruf A-Z
		int result = 0;

		for (char ch : stringOne.toCharArray())
			charBuffer[ch-'a']++;
		
		for (char ch : stringTwo.toCharArray())
			charBuffer[ch-'a']--;
		

		for (int i : charBuffer)
			result += Math.abs(i);

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string below: ");
		String stringOne = sc.nextLine();

		System.out.println();
		System.out.println("Enter the second string below: ");
		String stringTwo = sc.nextLine();

		System.out.println();
		System.out.println("Counting...");

		int result = makeAnagram(stringOne, stringTwo);
		System.out.println("You need " + result + " char need to be removed in both string.");
		System.out.println("output = " + result);
	}
}