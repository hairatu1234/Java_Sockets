
package trial;


// Server class
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String []args)throws Exception{
//        Create the MathService object
       MathService mathService = new  MathServiceImp();
//       Create RMI registry port
Registry registry=LocateRegistry.createRegistry(1099);
//Bind the MathService object to registry
registry.bind("MathService", mathService);
    System.out.println("Serve ready");
    }
    
}
