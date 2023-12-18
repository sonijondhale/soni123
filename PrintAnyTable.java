package com.sunita;

import java.util.Scanner;

public class PrintAnyTable {
    public static void main(String args[]) {
        System.out.print("Enter any number which you want to print:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

      // System.out.println("----------------Using while loop--------------");
       /* int j=1;
        while(j<=10)
        {
            System.out.println(+i+ "*" +j+ "="+i*j);
            j++;

        }*/
        System.out.println("----------------Using for loop--------------");
        for (int j = 1; j <= 10; j++)

            System.out.println(+i + "*" + j + "=" + i * j);


    }
}
