package com.sunita;

import java.util.Scanner;

public class PalindromNumber
{
    public static void main(String args[])
    {
        int num,n,rem,sum=0;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        n=num;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(n==sum)
            System.out.println(n+" is a palindrome number");
        else
            System.out.println(n+" is not a palindrome number");
    }
}
