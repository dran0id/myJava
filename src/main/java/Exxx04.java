public class Exxx04 {
    public static void main(String[] args) {

        String log= "127.0.0.1 - frank [10/oct/2000:13:55:360700] GET /apache_pb.gif HTTP/1.0 200";

        int space = log.indexOf(" /", log.indexOf(" "));

        System.out.println(space);
        String res = log.substring(space, log.indexOf(" ",space+4));

        System.out.println("접속한 페이지 :"+ res);

    }
}
