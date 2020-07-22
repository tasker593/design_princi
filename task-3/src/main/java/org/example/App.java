package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the operation that you want to perform(+ or - or * or /) and the enter two numbers...");

        System.out.println(Calculator.operation(scr.next().charAt(0), scr.nextFloat(), scr.nextFloat()));
    }
}
