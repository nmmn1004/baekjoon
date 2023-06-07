import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int cycle = 1;
		
		int s = sc.nextInt();
		
		int a = s / 10;
		int b = s % 10;
		
		int c = ((a + b) % 10) + (b * 10);
		
		while(s != c) {
			a = c / 10;
			b = c % 10;
			
			c = ((a + b) % 10) + (b * 10);
			
			cycle++;
		}
		System.out.println(cycle);
		sc.close();
	}
}
