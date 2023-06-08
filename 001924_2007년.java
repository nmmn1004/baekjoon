import java.util.Scanner;

class Main {
    private static int Week(int mon, int day){
        int daySum = 0;
        
        for(int i = 1; i < mon; i++){
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daySum += 31;
                    break;
                case 2:
                    daySum += 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daySum += 30;
                    break;
            }
        }
        
        daySum += day;
        
        return daySum%7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        
        switch(Week(x, y)){
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
             case 6:
                System.out.println("SAT");
                break;
        }
        sc.close();
    }
}
