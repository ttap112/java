package M;

public class Main {

	public static void main(String[] args) {
		
		int total=0;
		
		for (int i =1; i<=20; i++) {
			System.out.println(i+" : "+total);
			
			if (i%3==0) total+=i;
		}
	
		
	}
}
