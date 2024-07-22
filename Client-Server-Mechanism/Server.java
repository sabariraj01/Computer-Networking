package Client-Server-Mechanism;

//mYSERVER
import java.io.*;
import java.net.*;

public class Server 
{
    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket ss = new ServerSocket();
            ss.bind(new InetSocketAddress("192.168.56.1", 12345)); 
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
