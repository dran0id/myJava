import java.util.Scanner;

public class Cwd07_13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int hap = 0;

        System.out.print("합계의 시작값 ==>");
        int a =s.nextInt();
        System.out.print("합계의 끝값 ==>");
        int b = s.nextInt();
        System.out.print("배수");
        int c = s.nextInt();

        for (int i=a; i<=b; i++){
            if(i % c == 0){
                hap = hap+i;
            }
        }
        System.out.printf("%d 부터 %d까지의 %d배수의 합계 ==> %d\n",a,b,c,hap);
    }
}
