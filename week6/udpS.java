package week6;
import java.net.*;
public class udpS
 {
    public static void main(String[] args) 
    {
        DatagramSocket socket = null;
        try 
        {
            socket = new DatagramSocket(1234);
            byte[] receiveData = new byte[1024];
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + message);
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String responseMessage = "Hello, client!";
                byte[] sendData = responseMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress,clientPort);
                socket.send(sendPacket);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            if (socket != null && !socket.isClosed()) 
            {
                socket.close();
            }
        }
    }
}
