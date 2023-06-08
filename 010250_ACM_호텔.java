import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] tArr = new int[t];
		
		for(int i = 0; i < tArr.length; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			if(n % h == 0) {
				tArr[i] = (h * 100) + n / h;
			}
			else {
				tArr[i] = ((n % h) * 100) + ((n / h) + 1);
			}
		}
		for(int i = 0; i < tArr.length; i++) {
			System.out.println(tArr[i]);
		}
		sc.close();
	}
}
