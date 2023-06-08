import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> xywh = new ArrayList<>(4);
		xywh.add(0, sc.nextInt());
		xywh.add(1, sc.nextInt());
		xywh.add(2, sc.nextInt() - xywh.get(0));
		xywh.add(3, sc.nextInt() - xywh.get(1));
		
		System.out.println(Collections.min(xywh));
		
		
		sc.close();
	}
}
