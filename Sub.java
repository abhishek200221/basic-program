package co.in.CoreJava;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c;
        Scanner  st=new Scanner(System.in);
        System.out.println("enter a first number");
        a=st.nextInt();
        System.out.println("enter a second number");
        b=st.nextInt();
        c=a-b;
        System.out.println("subtraction is" +c);
	}

}
