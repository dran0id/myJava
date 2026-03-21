import java.util.Scanner;

public class Hello8 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 공백에 구분하여 입력하세요: ");

        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.printf("%d,%d를 입력하셨네요.\n", a, b);

        sc.close();
    }
}
