import java.util.Scanner;

class Main {	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int result;
        
        int xw = plus(x - w);
        int yh = plus(y - h);
        
//        System.out.println(xw + " " + yh + " " + x  + " " + y);
        
        result = Min(new int[] {xw, yh, x, y});
        
        System.out.println(result);
        sc.close();
    }
    public static int plus(int a) {
    	if(a < 0) {
    		return a *= -1;
    	}
    	else
    		return a;
    }
    public static int Min(int[] a) {
    	int min = a[0];
    	for(int i = 1; i < a.length; i++) {
    		if(min > a[i]) {
    			min = a[i];
    		}
    	}
    	return min;
    }
}
