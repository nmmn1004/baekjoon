import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int total = 1;
		
		for(int i = 0; i < 3; i++) {
			total *= sc.nextInt();
		}
		
		int[] num = new int[10];
		
		while(total != 0) {
			int f = total % 10;
			
			num[f]++;
			
			total /= 10;
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		sc.close();
	}
}
