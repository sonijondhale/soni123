package com.sunita;

import java.util.Scanner;

public class VowelConsonantNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character");
        char ch=sc.next().charAt(0);
       // char ch1='i';
        if(ch=='a' ||ch=='e' ||ch=='i'||ch=='o'|ch=='u')
            System.out.println("vowel");
        else System.out.println("Consonant");

    }
}
