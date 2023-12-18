package com.sunita;

import java.util.Scanner;

/*Armstrong no. means: e.g 153=(1*1*1)+(5*5*5)+(3*3*3)=(1+125+27=153)*/
public class ArmstrongNumber
{
    public static void main(String args[])
    {
        int num,rem,n,armstrong=0;
        System.out.println("Enter num:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        n=num;
        while(num>0)
        {
            rem=num%10;
            armstrong=(rem*rem*rem)+armstrong;
            num=num/10;
        }
        if(n==armstrong)
            System.out.println(n+" is a armStrog number");
        else
            System.out.println(n+" is not a armStrog number");

    }
}
