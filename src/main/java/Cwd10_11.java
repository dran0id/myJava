import java.util.Scanner;

public class Cwd10_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("단 입력:");
        num = s.nextInt();


        int hap;

        for(int j=1;j<=9;j++){
            hap = num * j;
            System.out.printf("%2d X %2d = %2d\n",num,j,hap);
        }
    }
}
