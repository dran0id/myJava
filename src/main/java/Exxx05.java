public class Exxx05 {
    public static void main(String[] args) {
        int sum = 0; // sum값을 0으로 지정 0으로 지정하지 않는다면 안에 값이 뭐가 있는 모르기 때문에 값이 이상하게 나올 수 있다
        for(int i=100; i<=300; i++){ // i는 100부터 시작해서 300까지 1씩 증가를 하는데
            if( i % 5 == 0 && i % 7==0){ //만약 i를 5로 나눴을 때랑 i를 7로 나눴을때 0이된다면
                sum = sum + i; // sum값에 걸러낸 i값 을 더한다
            }
        }
        System.out.print("결과:"+sum); //위 결과값을 프린트로 출력한다
    }
}
