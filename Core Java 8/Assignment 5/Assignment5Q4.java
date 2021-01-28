package a5assignments.p2;
/*
		Setup:
		
		Create the following classes:
		
		class Trader { String name; String city; }
		
		class Transaction { Trader trader; int year; int value; } 
		
		1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		2. Print all transactions� values from the traders living in Delhi.
		
		3. What�s the highest value of all the transactions?
		
		4. Find the transaction with the smallest value.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader{name=" + "'"+name+"'" + ", city=" + "'"+city +"'"+ "}";
	}
    
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction{trader=" + trader + ", year=" + year + ", value=" + value + "}";
	}
    
}
public class Assignment5Q4 {
	//1. Find all transactions in the year 2011 and sort them by value (small to high).
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
    	List<Transaction> stage1 = new ArrayList<Transaction>();
    	List<Transaction> stage2 = new ArrayList<Transaction>();
    	stage1 = transactions.stream().filter(i->i.getYear()==2011).collect(Collectors.toList());
    	stage2 = stage1.stream().sorted((t1,t2)->t1.getValue()-t2.getValue()).collect(Collectors.toList());
    	return stage2;
    }

    //2. Print all transactions� values from the traders living in Delhi.
    public static List<Integer> transaction3sValuesDelhi(List<Transaction> transactions) {
    	List<Transaction> seg = new ArrayList<>();
    	List<Integer> dTrans = new ArrayList<>();
    	seg = transactions.stream().filter(i->i.getTrader().getCity().contentEquals("Delhi")).collect(Collectors.toList());
    	seg.stream().forEach(i->dTrans.add(i.getValue()));
    	return dTrans;
    }
    //3. What�s the highest value of all the transactions?
    public static int highestTransaction2(List<Transaction> transactions){
    	Optional<Transaction> sG = transactions.stream().max(Comparator.comparing(Transaction::getValue));
    	Transaction obj = sG.stream().findFirst().get();
    	return obj.getValue();
    }

    public static int smallestTransaction1(List<Transaction> transactions){
    	Optional<Transaction> sG = transactions.stream().min(Comparator.comparing(Transaction::getValue));
    	Transaction obj = sG.stream().findFirst().get();
    	return obj.getValue();
    }

    public static void main(String[] args) {}
}













