public class Exx01_5 {
    public static void main(String [] args){
        int num=0;
        for(int i=1;i<=100;i+=2){
            num=(num+i);
        }
        System.out.print("1부터 100까지 홀수의 합:"+num);
    }
}
