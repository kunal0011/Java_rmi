import java.rmi.Naming;

public class AdditionServer {

	public static void main(String[] args) {

		try {
			AdditionInterface stub = new Addition();
			Naming.rebind("rmi://localhost:5000/addition", stub);
			System.out.println("Addition Server is Ready");
		} catch (Exception e) {
			System.out.println("Addition Server failed" + e);
		}
	}

}
