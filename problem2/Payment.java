import java.util.*;


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

class CustomerList {
	
}

class Transaction {
	private int id;
	private String email;
	private String phone;
	private String card;

	Transaction(int _id, String _email, String _phone, String _card) {
		id = _id;
		email = _email;
		phone = _phone;
		card = _card;
	}
}

public class Payment {
	private ArrayList<Transaction> transactions;

	Payment() {
		transactions = new ArrayList<Transaction>();
	}

	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}

	public void viewCustomer() {

	}

	public static void main(String[] args) {
		Payment payment = new Payment();

		Transaction t1 = new Transaction(1, 'e1', 'p1', 'c1');
		Transaction t1 = new Transaction(2, 'e2', 'p2', 'c2');
		Transaction t1 = new Transaction(3, 'e1', 'p3', 'c3');
		Transaction t1 = new Transaction(4, 'e4', 'p4', 'c4');

		payment.viewCustomer();
	}
}