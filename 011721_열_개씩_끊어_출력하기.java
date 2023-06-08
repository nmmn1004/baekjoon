import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while(true) {
			if(s.length() <= 10) {
				System.out.println(s);
				break;
			}
//       (StringType).substring(startNum, endNum);
//       (StringType).substring(startNum);
//       startNum <= index < endNum
			System.out.println(s.substring(0, 10));
			s = s.substring(10);
		}
		sc.close();
	}
}
