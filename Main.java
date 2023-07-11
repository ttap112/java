package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		BigInteger i = Sc.nextBigInteger();
		BigInteger j = Sc.nextBigInteger();
		
		
		System.out.println(i.divide(j));
		System.out.println(i.remainder(j));
		

	}

}
