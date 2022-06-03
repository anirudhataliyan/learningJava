package com.company; 
import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        System.out.println("HelloWorld!");
	System.out.println("Taking input from user: ");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number 1: ");
//	int a = sc.nextInt();
	float a = sc.nextFloat();
	System.out.print("Enter number 2: ");
	int b = sc.nextInt();
	float sum = a+b;
	System.out.print("The sum of these numbers is: ");
	System.out.println(sum);		
    }
}
