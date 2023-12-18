package com.sunita;

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String args[])
    {
         //Fibonacci series==0 1 1 2 3 5 8 14 22 36
         int i=0,j=1,k=0,n,term=1;//avoid initialize term if u dont want to terms
         System.out.print("Enter number for fibonacci series:");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         while(term<=n)//if u dont want terms means fibonacci series 1 to 10 then used while(z<=n)
         {
             System.out.println(k);
             i=j;
             j=k;
             k=i+j;
             term++;//skip if u dont want to terms
         }//while loop end
    }//main end
}//class end
