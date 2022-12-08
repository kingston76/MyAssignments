package week1.day1;

import java.util.Scanner;

public class IsPrime {
	
	public static void main(String[] args) {
		Scanner kingston = new Scanner(System.in);
		int num = kingston.nextInt();
		int printedNotPrime = 0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Not Prime");
				printedNotPrime = 1;
				break;
			} 
		}
		if(printedNotPrime == 0 ) System.out.println("Prime");
	}

}
