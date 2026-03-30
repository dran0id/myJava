import java.util.Scanner;

public class Code03_12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt( );

        System.out.println((s>100) && (s<200));
        System.out.println((s==99)||(s==100));
        System.out.println(!(s==100));
        sc.close();
    }
}
