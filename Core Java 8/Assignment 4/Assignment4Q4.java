package a4assignments;

/*
 *  Remove the words that have odd lengths from the list. 
 *  HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface.
 *  */

import java.util.ArrayList;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(s->(s.length()%2 !=0));
    	return employeeList;
    }
    public static void main(String[] args) {
    	
    }
}