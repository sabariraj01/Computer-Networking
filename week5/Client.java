package week5;

//MYClient
import java.io.*;
import java.net.*;

public class Client 
{
    public static void main(String[] args) 
    {
        try 
        {
            String serverIpAddress = "192.168.56.1";
            Socket s = new Socket(serverIpAddress, 12345);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server from ssr");
            dout.flush();
            dout.close();
            s.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
