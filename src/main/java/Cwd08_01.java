import java.util.Scanner;

public class Cwd08_01 {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        System.out.print("1번째 숫자를 입력하시오:");
        int a = ss.nextInt();
        System.out.print("2번째 숫자를 입력하시오:");
        int b = ss.nextInt();
        System.out.print("3번째 숫자를 입력하시오:");
        int c = ss.nextInt();
        System.out.print("4번째 숫자를 입력하시오:");
        int d = ss.nextInt();

        int hap= a+b+c+d;
        System.out.printf("합계: %d",hap);
        ss.close();
    }
}
