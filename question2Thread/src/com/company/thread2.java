package com.company;

import java.util.Scanner;

public class thread2 extends Thread
{
    static Scanner input = new Scanner(System.in);
   static char letter;

    //static void firstLetter(char b)
    {
        System.out.println("Please enter a letter in CAPITAL LETTERS only");
        letter = input.next().charAt(0);
    }

}
