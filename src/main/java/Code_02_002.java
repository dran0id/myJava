import java.util.Scanner;

public class Code_02_002 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt(), b=sc.nextInt();

        System.out.printf("%d / %d = %.1f\n", a, b, (double) a / b);
        sc.close();
    }
}
