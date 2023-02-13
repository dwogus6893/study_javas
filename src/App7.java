import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //반복횟수
        int X = 0;

        for(int i=0; i<T; i++){
        int A = sc.nextInt();
        int B = sc.nextInt();
        X = (A+B);
        System.out.println("Case #"+T+":"+X);   
        }    
    }
}