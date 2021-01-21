import java.util.ArrayList;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	int[] list;
    	ArrayList<Integer> raw = new ArrayList<Integer>();
    	for(int i=min+1;i<max;i++) {
    		int num=i,backup=i,sum =0;
    		while(num>0) {
    			int t = num%10;
    			sum+=t*t*t;
    			num /=10;
    		}
    		if(backup == sum) {
    			raw.add(backup);
    		}
    	}
    	list = new int[raw.size()];
    	for(int i=0;i<raw.size();i++){
    		list[i] = raw.get(i);
    	}
    	return list;
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

       int min = 100;int max = 999;
       ArmstrongNumBetweenRange getList = new ArmstrongNumBetweenRange();
       int[] list = getList.armstrongNumbersInRange(min, max);
       for(int i=0;i<list.length;i++) {
    	   System.out.print(list[i]+" ");
       }

    }
}