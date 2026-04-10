public class Exxx01 {
    public static void main(String[]args){

        int i, k;
        for(i =1; i<=9; i++)
        {
            for(k=2; k<=9; k++)
            {
                System.out.printf("%dX%d=%-3d", i,k,k*i);
            }
            System.out.println();
        }
    }
}
