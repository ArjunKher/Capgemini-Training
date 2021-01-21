class SiCi {

    public double simpleInterest(double principalAmount,int time,double interestRate){
    	
    	return (principalAmount*interestRate*time)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double p = principalAmount;
    	double r = interestRate/100;
    	int t = time;
    	double interest = (p * Math.pow(1 + (r), t)) - p;

        return interest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	
    	SiCi myInterest = new SiCi();
    	System.out.println(myInterest.simpleInterest(1000,2,10));
    	System.out.println(myInterest.compoundInterest(1000,2,10));
    }
}