import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by LG on 2015-09-08.
 */
public class InetAddressMainClass {
    public static void main(String[] args) throws UnknownHostException{
        //내 컴퓨터
        System.out.println("내 컴퓨터");
        //get InetAddress from 127.0.0.1
        InetAddress myip = InetAddress.getLocalHost();
        //IP 주소
        System.out.println("IP 주소 : " + myip.getHostAddress());
        //도메인 이름
        System.out.println("도메인 이름 : " + myip.getHostName());

        System.out.println("------------------------------");

        //미림 홈페이지
        System.out.println("미림 홈페이지");
        InetAddress mirimip = InetAddress.getByName("www.e-mirim.hs.kr");
        //IP 주소
        System.out.println("IP 주소 : " + mirimip.getHostAddress());
        //도메인 이름
        System.out.println("도메인 이름 : " + mirimip.getHostName());
    }
}
