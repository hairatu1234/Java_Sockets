
package trial;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String []args)throws Exception{
//    Get a refernce of to the remote MathService object
      Registry registry=LocateRegistry.getRegistry("localhost");
      MathService mathService= (MathService)registry.lookup("MathService");
//      Invoke the add()method on remote object
int result =mathService.add(21,78,32);
System.out.println("Result = " +result);
    }
    
}
