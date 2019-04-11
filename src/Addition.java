import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Addition extends UnicastRemoteObject implements AdditionInterface{

	protected Addition() throws RemoteException {
		super();
	}

	@Override
	public int add(int a, int b) throws RemoteException {
		return a+b;
	}

}
