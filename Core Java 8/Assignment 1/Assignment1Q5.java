import java.util.Scanner;

/**
 * Slab a 0-1,80,000              Nil
 * Slab B 1,80,001-3,00,000       10%
 * Slab C 3,00,001-5,00,000       20%
 * Slab D 5,00,001-10,00,000      30% 
 *
 */


class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double slab = 0;
    	if(ctc<=180000) {
    		slab = 0;  //A
    	}else if(ctc >=180001 && ctc <= 300000){
    		slab = 0.1;  //B
    	}else if(ctc>=300001 && ctc<=500000) {
    		slab = 0.2; //C
    	}else if(ctc>=500001 && ctc<=1000000) {
    		slab = 0.3; //C
    	}
    	//calculate tax here
    	double tax = ctc*slab;
    	
    	return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
    	int ctc = scan.nextInt();
    	TaxAmount tax = new TaxAmount();
    	System.out.println(tax.calculateTaxAmount(ctc));
    	scan.close();
   }
}