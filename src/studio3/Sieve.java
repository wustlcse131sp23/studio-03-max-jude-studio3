package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the max number you want to sort?");
		int n = in.nextInt();
		
		int[] itemsToBeSieved = new int[n-1];
		boolean[] notPrime = new boolean[n-1];
		
		
		for (int i = 0; i < n-1; i++) {
			itemsToBeSieved[i] = i+2;
		}
		
		int index = 0;
		int p = itemsToBeSieved[index];
		
		while (p < n) {
			for (int i = 2; i*p <= n; i++) {
				for (int j = 0; j < itemsToBeSieved.length; j++) {
					if (p*i == itemsToBeSieved[j]) 
					{
						notPrime[j] = true;
					}
				}
			}
			p = p+1;
		}
		
		for (int i = 0; i < itemsToBeSieved.length; i++) {
			if (notPrime[i] == false) {
				System.out.println(itemsToBeSieved[i]);
			}
		}
		

	}

}
