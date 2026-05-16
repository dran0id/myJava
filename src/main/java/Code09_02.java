import java.util.Scanner;

public class Code09_02 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("숫자입력 : ");
            numAry[i] = ss.nextInt();
        }
        for (int j = 0; j < 4; j++) {
            hap = hap + numAry[j];
        }
        System.out.println("합계:" + hap);
        ss.close();
    }
}