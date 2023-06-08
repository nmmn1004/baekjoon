import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if((i + sum) == n) {
				System.out.println(i);
				break;
			}
			else if(i == n) {
				System.out.println(0);
			}
		}
		
		sc.close();
	}
}
