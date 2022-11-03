import java.util.Scanner;

//덧셈 함수
public class Main1 {
    public static int total(int A,int B){
        return A+B;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //입력
    int T = sc.nextInt();

    //출력
    for(int i=0; i<T; i++){
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(A+B);
     }
    sc.close();
    }
}