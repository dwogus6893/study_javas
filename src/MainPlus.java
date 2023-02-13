import java.util.Scanner;
// -문제파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력값은 (0 < A, B < 10) 따라야한다.

// -유추파악
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 
//각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// -주요 단어 영문 이름 선정
// 입력 input
// 정수 decimal
// 출력 output
// 합 hap

// -테스트 케이스
// 1 1 = 2
// 2 3 = 5 
// 3 4 = 7

// -프로그래밍 순서
// 입력
// 처리
// 출력
public class MainPlus {
    //두 정수 합 구함
    public int plus(int A, int B){
        int total = A+B;
        return total;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int i=0; i<T; i++){
        int A = sc.nextInt();
        int B = sc.nextInt();
    //처리
    MainPlus main = new MainPlus();
        int total = main.plus(A,B);
        System.out.println(total);
     }
    sc.close();
    }
}


