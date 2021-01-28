package a4assignments;

@FunctionalInterface
interface doit {
	public double getResult(int x, int y);
}
public class Assignment4Q1 {
    public double addition(int num1,int num2){
    	doit res = (x,y)->{return x+y;};
    	return res.getResult(num1,num2);
    }
    public double subtraction(int num1,int num2){
    	doit res = (x,y)->{return x-y;};
    	return res.getResult(num1,num2);
    }
    public double multiplication(int num1,int num2){
    	doit res = (x,y)->{return x*y;};
    	return res.getResult(num1,num2);
    }
    public double division(int num1,int num2){
    	doit res = (x,y)->{double re = (double)x/(double)y; return re;};
    	return res.getResult(num1,num2);
    }
    public static void main(String[] args) {
    	
    }
}