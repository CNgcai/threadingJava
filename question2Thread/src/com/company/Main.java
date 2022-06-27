package com.company;
import java.lang.Thread;
import java.io.File;
import java.util.Scanner;


public class Main implements Runnable {

    static Scanner input = new Scanner(System.in);
    static char letter;
    static void firstLetter(char a)
    {
        System.out.println("Please enter one letter only");
        letter = input.next().charAt(0);
    }
    public static void main(String[] args) {
	// write your code here
        firstLetter(letter);
        Main run = new Main();
        Thread thr = new Thread(run);

        for (int x= 0; x <25; x++ )
        {
         System.out.println(letter);
        }
        thr.start();

    }
    public void run(){
        char c = letter;
        c++;
        for (int i = 0; i < 25; i++){
            System.out.println(c);
        }
    }
}
