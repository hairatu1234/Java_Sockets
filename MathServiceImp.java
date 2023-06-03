
package trial;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class MathServiceImp extends UnicastRemoteObject implements MathService {
 public MathServiceImp()throws RemoteException{
  super();}
 @Override
 public int add(int a, int b, int c){
     return c +(a*b);
 }
}

    
    
    

