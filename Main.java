package M;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	int row = sc.nextInt();
	int col = sc.nextInt();
	
	int[] arr= new int[row*col];
	
	for (int i =0; i<arr.length; i++) {
		arr[i] = random.nextInt(row*col)+1;
		for (int j=0; j<i; j++) {
			if(arr[i]==arr[j]) {
				i--;
				}
			}
		}
	for (int i=0; i<arr.length; i++) {
		System.out.printf("%5d",arr[i]);
		if (i!=0 && (i+1)%col==0) {
			System.out.println();
			}
		}
	}
}

