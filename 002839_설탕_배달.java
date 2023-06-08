import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		int s5 = (sugar / 5) * 5;
		
		int temp = 0;
		
		while(s5 >= 0) {
			temp  = (sugar - s5) % 3;
			if(temp == 0) {
				System.out.println((s5 / 5) + ((sugar - s5) / 3));
				break;
			}
			s5 -= 5;
		}
		if(temp != 0) {
			System.out.println(-1);
		}
		sc.close();
	}
}
