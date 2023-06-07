import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String [] sArr = s.split(" ");
		
		int count = 0;
		
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i] != "") {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
