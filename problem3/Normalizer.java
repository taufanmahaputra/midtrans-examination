import java.util.*;


public class Normalizer {
	static String Normalizer(String phone) {
		String result = "";
		int lengthPhone = phone.length();
		boolean firstDigit = true;

		if (lengthPhone == 1) {
			if (phone.equals("-"))
				return "-";
			else if (phone.equals("0"))
				return "0";
		}
		else if (phone.equals("(null)")) {
			return "(null)";
		}
		else {
			for (int i = 0; i < lengthPhone; i++) {
				char ch = phone.charAt(i);
				if (Character.isDigit(ch)) {
					if (firstDigit && ch == '0') 
						result += "62";
					else
						result += ch;

					firstDigit = false;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your phone number below: ");

		String phone = sc.nextLine();

		System.out.println("Normalizing...");
		System.out.println("Normalized phone: ");

		System.out.println(Normalizer(phone));

	}
}