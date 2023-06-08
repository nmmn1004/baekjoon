import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print(s.indexOf(i));
// 			(StringType).indexOf(char); 
// 			char 문자형이 처음으로 나오는 인덱스 번호를 반환, 없으면 -1 반환
			if(i < 'z') {
				System.out.print(" ");
			}
		}
		
		sc.close();
	}
}
