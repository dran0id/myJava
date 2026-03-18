import java.util.Scanner;

public class Code02_002 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("숫자 입력");

        String inputPrice = sc.nextLine();

        try{
            double price = Double.parseDouble(inputPrice);
            double finalPrice = price * 0.9;

            System.out.println("결제하실 금액은"+ finalPrice +"원입니다.");

        } catch(NumberFormatException e) {
            System.out.println("숫자 형식이 아닙니다!");
        }
        sc.close();
    }
}
