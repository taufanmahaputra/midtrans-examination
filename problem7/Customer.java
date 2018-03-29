import java.util.*;

class CustomerNode {
    private HashMap<Character, CustomerNode> root;
    public int size;

    CustomerNode() {
        root = new HashMap<>();
    }

    public void addCharacter(char ch) {
        root.putIfAbsent(ch, new CustomerNode());
    }

    public CustomerNode getChild(char ch) {
        return root.get(ch);
    }
}

class Customers {
    private CustomerNode customerNode;

    Customers() {
        customerNode = new CustomerNode();
    }

    public void addCustomer(String name) {
        CustomerNode tempCustomerNode = customerNode;
        for(int i = 0; i < name.length(); i++) {
            Character ch = name.charAt(i);
            tempCustomerNode.addCharacter(ch);
            tempCustomerNode = tempCustomerNode.getChild(ch);
            tempCustomerNode.size++;
        }
    }

    public int findPartial(String prefix) {
        CustomerNode tempCustomerNode = customerNode;
        for(int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            tempCustomerNode = tempCustomerNode.getChild(ch);
            if(tempCustomerNode == null)
                return 0;
        }

        return tempCustomerNode.size;
    }
}

public class Customer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input N : ");
        int count = in.nextInt();

        Customers customer = new Customers();

        for(int idx = 0; idx < count; idx++){
           String op = in.next();
           String name = in.next();
           
           if(op.equals("add")) 
            customer.addCustomer(name);
           else if(op.equals("find"))
            System.out.println(customer.findPartial(name));
        }
    }
}