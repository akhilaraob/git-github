class NewException extends Exception{
	NewException(String message){
		System.out.println("your age is: " +message);
	}
}



public class UserDefinedException {
	
	int age=9;
	public void checkAge() throws NewException{
		if(age<10)
			throw new NewException("Not eligible for voting");
	}
		
	public static void main(String args[]) {
			try {
			UserDefinedException ud= new UserDefinedException();
			ud.checkAge();
			}
			catch(NewException e) {
				System.out.println(e);
			}
		}
}
