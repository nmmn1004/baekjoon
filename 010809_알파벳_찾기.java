import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print(s.indexOf(i));
			if(i < 'z') {
				System.out.print(" ");
			}
		}
		
		sc.close();
	}
}
