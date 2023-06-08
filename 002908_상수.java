import java.util.Scanner;

public class Main {
	private static int reverse(int n) {
		int result = 0;
		for(int i = 0; i < 3; i++) {
			result *= 10;
			result += n % 10;
			n /= 10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int reverseA = reverse(a);
		int reverseB = reverse(b);
		
		if(reverseA > reverseB)
			System.out.println(reverseA);
		else
			System.out.println(reverseB);
	}
}
