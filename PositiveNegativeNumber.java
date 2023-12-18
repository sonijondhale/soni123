package com.sunita;

import java.util.Scanner;

public class PositiveNegativeNumber
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        // int num=5;
        if (!(num % 2 == 0))
            System.out.println("Weired");

        else if (num % 2 == 0 && num >= 2 && num <= 5)
            System.out.println("Not Weired ");

        else if (num % 2 == 0 && num >= 6 && num <= 20)
            System.out.println("Weired");
        else if(num%2==0 && num>=20)
            System.out.println("Not Weired");

        else
            System.out.println("Not Weired");

    }

    }

