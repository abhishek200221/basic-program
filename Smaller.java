package co.in.CoreJava;

import java.util.Scanner;

public class Smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,a,b;
       Scanner  scan =  new Scanner(System.in);
       System.out.println("enter a first number");
      a=scan.nextInt();
       System.out.println("enter a second number");
        b= scan.nextInt();
         temp=a<b?a:b;
         System.out.println("smallest number is" +temp);
	}

}
