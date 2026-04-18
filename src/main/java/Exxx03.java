public class Exxx03 {
    public static void main(String[] args){
        for (int k = 1; k <= 7; k+=2) {
            for (int r=5; r >= k; r-=2){
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
