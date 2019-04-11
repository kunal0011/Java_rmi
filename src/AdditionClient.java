import java.rmi.Naming;

public class AdditionClient {

	public static void main(String[] args) {
AdditionInterface hello;
		
		try {
			hello = (AdditionInterface)Naming.lookup("rmi://localhost:5000/addition");
			int result=hello.add(9,10);
			System.out.println("Result is :"+result);
			}catch (Exception e) {
				System.out.println("AdditionClient exception: " + e);
				}
		

	}

}
