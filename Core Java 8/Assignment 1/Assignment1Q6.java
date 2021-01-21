import java.util.Scanner;
class Login{
    String userId = "Ajay",password = "password";
    static int count =2;
    public String loginUser(String user, String pass) {
    	Scanner scan = new Scanner(System.in);
    	while(count>0) {
    		if(user.equals(userId) && pass.equals(password)) {
    			scan.close();
    			return "Welcome Ajay";
    		}
    		else {
    			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    			count--;
    			user = scan.nextLine();
    			pass = scan.nextLine();
    		}
    		
    	}
    	scan.close();
    	System.out.println("You have entered wrong credentials 3 times");
    	return "Contact Admin";
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	Login login = new Login();
    	Scanner scan = new Scanner(System.in);
    	String user = "",pass = "";
    	user = scan.nextLine();
    	pass = scan.nextLine();
    	scan.close();
    	System.out.println(login.loginUser(user, pass));	
    }
}