
package trial;


import java.rmi.*;

public interface MathService extends Remote{
    int add(int a, int b,int c)throws RemoteException;
    
}
