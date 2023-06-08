import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int totalArr[] = new int[n];
		for(int i = 0; i < n; i++) {
			String s = sc.nextLine();
			int score = 1;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == 'O') {
					totalArr[i] += score;
					score++;
				}
				else {
					score = 1;
				}
			}
		}
		for(int i = 0; i < totalArr.length; i++) {
			System.out.println(totalArr[i]);
		}
		sc.close();
	}
}
