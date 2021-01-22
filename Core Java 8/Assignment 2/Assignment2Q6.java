abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "DatabasePersistence";
    }
}
class client{
	Persistence p1;
	/*
	p1 = new DatabasePersistence();
	//Do some Database work
	p1 = new FilePersistence();
	//Do some File work
	*/
	
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    }
}