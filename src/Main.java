import java.util.Scanner;

// -문제파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력값은 (0 < A, B < 10) 따라야한다.

// -유추파악
// 두 정수를 입력해 합을 출력.

// -주요 단어 영문 이름 선정
// 입력 input
// 정수 decimal
// 출력 output
// 합 hap

// -테스트 케이스
// 3 +5 =8
// 20 + 50 = 70 
// -1 +5 = error

// -프로그래밍 순서
// 입력
// 처리
// 출력
public class Main {
public static void main(String[] args) {

/*  
-테스트 케이스
3 +5 =8
20 + 50 = 70 
-1 +5 = error
 */
// -프로그래밍 순서
// 입력
Scanner scanner = new Scanner(System.in);
int input_first = scanner.nextInt();
int input_second = scanner.nextInt();
scanner.close();


// 처리
int output_plus = input_first + input_second;

//출력
System.out.println(output_plus);
    }
}

