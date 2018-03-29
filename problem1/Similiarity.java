import java.util.*;


public class Similiarity {
 	
 	static float[] fillCharBuffer(String address) {
 		float[] charBuffer = new float[26];

 		for (char ch : address.toCharArray()) {
 			if (Character.isLetter(ch)) {
				charBuffer[ch-'a']++;
			}
 		}

		return charBuffer;
 	}

	static float sumArray(float[] arrayBuffer) {
		float result = 0;	
		for (float i : arrayBuffer)
			result += i;

		return result;
	}

	static float measureSimiliarity(String addressOne, String addressTwo) {
		float[] charBufferOne = new float[128]; //menampung huruf A-Z
		float[] charBufferTwo = new float[128];

		charBufferOne = fillCharBuffer(addressOne);
		charBufferTwo = fillCharBuffer(addressTwo);

		float sumBufferOne = sumArray(charBufferOne);
		float sumBufferTwo = sumArray(charBufferTwo);

		//Measure!
		float result = (sumBufferOne > sumBufferTwo) ? (sumBufferTwo / sumBufferOne) : (sumBufferOne / sumBufferTwo);

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first address below: ");
		String addressOne = sc.nextLine();
		addressOne = addressOne.toLowerCase(); // all lower case
		addressOne = addressOne.replaceAll("\\s+",""); // remove space

		System.out.println();
		System.out.println("Enter the second address below: ");
		String addressTwo = sc.nextLine();
		addressTwo = addressTwo.toLowerCase();
		addressTwo = addressTwo.replaceAll("\\s+","");

		System.out.println();
		System.out.println("Processing...");
		System.out.println("Answer will be 0 - 1 meaning 0 is not identical, and 1 is exactly match.");
		System.out.println();

		float result = measureSimiliarity(addressOne, addressTwo);
		System.out.println("Result similiarity : " + result);

	}
}