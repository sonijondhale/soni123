package com.sunita;

import java.util.Scanner;

public class FactorialNum
{
    public static void main(String args[])
    {
        int num,fact=1;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of " +num+" is: "+fact);
        }
    }

