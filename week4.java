import java.util.*;
public class week4 
{
    public static String complement(String sum, int m) 
    {
        char bits[] = sum.toCharArray();
        for (int i = 0; i < m; i++) 
        {
            if (bits[i] == '1')
                bits[i] = '0';
            else
                bits[i] = '1';
        }
        return new String(bits);
    }

    public static String calcheck(String data[], int k, int m) 
    {
        int a = Integer.parseInt(data[0], 2);
        int b = 0;
        int c = 0;
        for (int i = 1; i < k; i++) 
        {
            b = Integer.parseInt(data[i], 2);
            c = a + b;
            String temp = Integer.toBinaryString(c);
            if (temp.length() > m) 
            {
                temp = temp.substring(1);
                c = Integer.parseInt(temp, 2);
                c = c + 1;
            }
            a = c;
        }
        String sum = Integer.toBinaryString(c);
        String t = sum;
        if (sum.length() < m) 
        {
            int dif = m - sum.length();
            for (int i = 0; i < dif; i++) 
            {
                t = "0" + t;
            }
        }
        sum = t;
        return sum;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of segments: ");
        int k = sc.nextInt();
        System.out.println("Number of bits per segment :");
        int m = sc.nextInt();
        String data[] = new String[k];
        System.out.println("Enter Dataword in three phases :");
        for (int i = 0; i < k; i++)
        {
            data[i] = sc.next();
        }
        String checksum = complement(calcheck(data, k, m), m);
        System.out.println("Check sum : " + checksum);
        System.out.println("Codeword : ");
        for (int i = 0; i < k; i++) 
        {
            System.out.print(data[i]);
        }
        System.out.print(checksum);
        sc.close();
    }
}