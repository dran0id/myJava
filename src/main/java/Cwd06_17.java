public class Cwd06_17 {
    public static void main(String[] args) {

        for(int k=2;k<=9;k++){
            System.out.printf("#제%d단#     ",k);
        }
        System.out.println();

        for(int i=1; i<=9; i++){
            for(int j=2; j<=9; j++){
                System.out.printf("%d X %d = %2d ",j,i,j*i);
            }
            System.out.println();
        }
    }
}
