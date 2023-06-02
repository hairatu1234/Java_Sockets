
package udpsocket;



import java.net.*;

public class UDPServer {
    public static void main(String []args)throws Exception{
    DatagramSocket aSocket= new DatagramSocket(4000);
    byte[] buffer= new byte[1000];
    DatagramPacket dp= new DatagramPacket(buffer,buffer.length);
     aSocket.receive(dp);
     String ac= new String(dp.getData(),0,dp.getLength());
     System.out.println(ac);
    }
}
