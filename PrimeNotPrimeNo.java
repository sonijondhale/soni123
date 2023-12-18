package com.sunita;
/*
Prime numbers= 1,2,3,5,7,11,13,17,19........
 */
import java.util.Scanner;

public class PrimeNotPrimeNo
{
    public static void main(String args[])
    {
        int count = 0;
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        /*// System.out.println("----------------Print in between prime no.--------------");
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                 count++;
                }//first else loop end
            }//first for loop end

            if (count == 2)
            {
                System.out.println(i+" is a prime number");
            } else
            {
                System.out.println(i+" is not a prime number");
            }//second else loop end
         }//second for loop end
*/
        System.out.println("----------------Print only one prime no.--------------");
       for(int i=1;i<=n;i++)
       {
           if (n % i == 0)
           {
               count++;
           }
       }
        if(count==2)
            System.out.println(n+" is prime no.");
        else
            System.out.println(n+" is not a prime no.");
        }//psvmain end
    }//Main class end
