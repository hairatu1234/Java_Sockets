
 
package udpsocket;


import java.net.*;
public class UDPClient {
    
    public static void main(String []args)throws Exception{
     DatagramSocket aSocket= new DatagramSocket();
     InetAddress ip=InetAddress.getByName("localhost");
     String name="Nagawa Hairatu";
     byte[] buffer= new byte[1000];
     buffer=name.getBytes();
     DatagramPacket dp= new DatagramPacket(buffer,buffer.length,ip,4000);
     aSocket.send(dp);
     System.out.println("Message sent, Check the server");
     
    }
    
}
