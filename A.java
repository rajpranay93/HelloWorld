package Factorial;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter A Number");
		
		int num=scan.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorail is ..."+fact);
	}

}
