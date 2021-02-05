package co.in.CoreJava;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner num= new Scanner(System.in);
       int a=num.nextInt();
       if(a%2==0) {
    	   if(a>6 && a<20) {
    	   System.out.println("weird");}
    	   System.out.println("not weird");
       }else
    	   System.out.println("Weird");
	}

}
