public class Code02_12 {
    public static void main(String [] args){
        int a;
        double b;
        String str;

        str = "1234";
        a = Integer.parseInt(str);
        System.out.println("문자열 ==> 실수 : " + a);

        str = "3.14";
        b = Double.parseDouble(str);
        System.out.println("문자열 ==> 실수 : " + b);
    }
}
