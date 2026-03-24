import java.util.Scanner;

public class Hello9 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("a값 입력하세요->");
        int a=sc.nextInt();

        System.out.print("b값 입력하세요->");
        int b=sc.nextInt();

        int temp=a;

        a=b;

        b=temp;

        System.out.printf("바뀐 결과-> a: " +a+",b:"+b);
        sc.close();
    }
}
