import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
	int cost = 60;  //dollars to rupees according to given convention
	public int getCost() {
		return cost;
	}
    public int addCandies(int candies){
    	return candies;
    }
}
class Cookie extends DesertItem {
	int cost = 70;  //euros to rupees according to given convention
	public int getCost() {
		return cost;
	}
    public int addCookies(int candies){
    	return candies;
    }
}
class IceCream extends DesertItem {
	int cost = 1;
	public int getCost() {
		return cost;
	}
    public int addIceCreams(int candies){
    	return candies;
    }
}
public class Assignment2Q7 {
    public static void main(String[] args) {
    	Assignment2Q7 obj = new Assignment2Q7();
    	obj.selectRoles();
    	
    }
    private void selectRoles(){
    	System.out.println("Select 1 for owner\nSelect 2 for customer");
    	int choice = 2;
    	Scanner scan = new Scanner(System.in);
    	try {
    		choice = scan.nextInt();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		scan.close();
    	}
    	switch(choice){
    	case 1:
    		//owne0 role
    		roles("owner");
    		break;
    	case 2:
    		//customer role
    		roles("customer");
    		break;
    	default:
    		System.out.println("Invalid Choice");
    		break;
    	}
    	
    }
    private void roles(String role){
    	if(role.equalsIgnoreCase("owner")) {
    		//role is owner -> able to add desert Items
    		addItems();
    	}else if(role.equalsIgnoreCase("customer")) {
    		//role is customer -> able to place order
    		placeOrder();
    		
    	}
    }
    private void addItems() {
    	System.out.println("1. Candies\n 2. Cookies\n 3. Ice Cream");
    	int choice = 1;
    	Scanner scan = new Scanner(System.in);
    	try {
    		choice = scan.nextInt();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		scan.close();
    	}
    	switch(choice) {
    	case 1:
    		addItemsOperation(1);
    		break;
    	case 2:
    		addItemsOperation(2);
    		break;
    	case 3:
    		addItemsOperation(3);
    		break;
    	default:
    		System.out.println("Invalid choice");
    		break;
    	}
    }
    private void addItemsOperation(int choice) {
    	Scanner scan = new Scanner(System.in);
    	if(choice == 1) {
    		System.out.println("Enter number of candies");
    		int quantity = 0;
			if(scan.hasNext())
				quantity = scan.nextInt();
    		Candy can = new Candy();
    		System.out.println(can.addCandies(quantity));
    	}else if(choice == 2) {
    		System.out.println("Enter number of cookies");
    		int quantity = 0;
			if(scan.hasNext())
				quantity = scan.nextInt();
    		Cookie cok = new Cookie();
    		System.out.println(cok.addCookies(quantity));
    	}
    	else {
    		System.out.println("Enter number of ice creams");
    		int quantity = 0;
			if(scan.hasNext())
				quantity = scan.nextInt();
    		IceCream ice = new IceCream();
    		System.out.println(ice.addIceCreams(quantity));
    	}
    	scan.close();
    }
    private void placeOrder() {
    	System.out.println("1. Candies\n 2. Cookies\n 3. Ice Cream");
    	int choice = 1;
    	Scanner scan = new Scanner(System.in);
    	try {
    		if(scan.hasNext())
    			choice = scan.nextInt();
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		scan.close();
    	}
    	switch(choice) {
    	case 1:
    		placeOrderOperation(1);
    		break;
    	case 2:
    		placeOrderOperation(2);
    		break;
    	case 3:
    		placeOrderOperation(3);
    		break;
    	default:
    		System.out.println("Invalid choice");
    	}
    	
    }
    private void placeOrderOperation(int choice) {
    	Scanner scan = new Scanner(System.in);
    	DesertItem obj = null;
    	if(choice ==1) {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(scan.hasNext())
				quantity = scan.nextInt();
    			obj = new Candy();
    			int cash = quantity*obj.getCost();
    			System.out.println("Pay: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}else if(choice == 2) {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(scan.hasNext())
				quantity = scan.nextInt();
    			obj = new Cookie();
    			int cash = quantity*obj.getCost();
    			System.out.println("Pay: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}else {
    		System.out.println("Enter quantity");
    		try {
    			int quantity = 0;
    			if(scan.hasNext())
				quantity = scan.nextInt();
    			obj = new IceCream();
    			int cash = quantity*obj.getCost();
    			System.out.println("Pay: "+cash);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    		
    	}
    	scan.close();
    }
}