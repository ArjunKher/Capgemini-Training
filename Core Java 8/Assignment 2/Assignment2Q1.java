class SingletonInheritanceCheck{ 
	private static SingletonInheritanceCheck instance =null;
	public String test;
	private SingletonInheritanceCheck() {
		test = "go away";
	}
	public static SingletonInheritanceCheck getInstance() {
		if(instance == null) {
			instance = new SingletonInheritanceCheck();
		}
		return instance;
	}
	
}

public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}