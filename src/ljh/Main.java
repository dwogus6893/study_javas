package ljh;

import java.util.*;
// -문제파악
// 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자

// -유추파악
// 총 금액 = X 입력 후 물건의 종류의 수 N 입력만큼 반복
// 물건의 가격a x 개수 b를 더한 총값이 총금액 X와 같은지 비교

// -주요 단어 영문 이름 선정
// X = 총금액
// N = 구매 종류의 수
// A = 물건의 가격
// B = 물건의 개수
// SUM = 물건의 가격 * 개수를 더한값

// -테스트 케이스
// 250000
// 2
// 5000 10
// 5000 10
// NO

// -프로그래밍 순서
// 입력
// 처리
// 출력

// Try-on
class Product{
        int a, b;
        static int sum = 0;
        
        Product(int a, int b){
            this.a = a;
            this.b = b;
            productSum();
        }
        private void productSum() {
            sum+= a *b;
        }
    }

    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 총 금액
        int n = sc.nextInt(); // 구매한 물건이 종류의 수

        Product[] p = new Product[n];

        for(int i=0; i < n; i++)
        p[i] = new Product(sc.nextInt(),sc.nextInt());

        String result = (x == Product.sum) ? "YES" : "No";
        System.out.println(result);
        sc.close();
        }
    }
        
   
    