import java.util.*;

class Transaction {
	private int id;
	private String email;
	private String phone;
	private String card;
}

class Customer {
	private int id;
	private ArrayList<Transaction> transactions;
	private ArrayList<String> emails;
	private ArrayList<String> phones;
	private ArrayList<String> cards;

	Customer() {
		transactions = new ArrayList<Transaction>();
		emails = new ArrayList<String>();
		phones = new ArrayList<String>();
		cards = new ArrayList<String>();
	}

	Customer(Transaction transaction) {
		transactions.add(transactions);
	}
}

public class Payment {
	public static void main(String[] args) {
		
	}
}