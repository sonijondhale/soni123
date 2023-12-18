package com.sunita;

import java.util.Scanner;

public class MaxMinNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();

        System.out.println("Enter num2");
        int num2=sc.nextInt();
        if(num1==num2)
        {
            System.out.println("Both Number is Equal:: n1="+num1+" And n2="+num2);
        }
        else if(num1>num2)
        {
            System.out.println("num1 is max:"+num1);
        }
        else
        {
            System.out.println("num2 is max:"+num2);
        }

    }

}
