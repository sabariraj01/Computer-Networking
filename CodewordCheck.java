// 1. Write a function "codewordCheck(codeword1, codeword2)" to check whether the given two codewords are equal or not.
// (i) If codewords are equal, your function has to return 0
// (ii) If codewords are not equal, your function must return an integer number  that is equal to how many corresponding bits are different.

import java.util.Scanner;
class  CodewordCheck
{
    public static void main(String [] ard)
    {
        Scanner i1=new Scanner(System.in);
        System.out.println("Enter codewords : ");
        System.out.println(codewordcheck(i1.next(),i1.next()));
        i1.close();
    }
    static int codewordcheck(String a,String b)
    {
        int c=0;
        if(a.length()!=b.length())
            return -1;
        else
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
                c=c+1;
        }
        return c;
    }
}
