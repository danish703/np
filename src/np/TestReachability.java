
package np;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestReachability {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress ip = InetAddress.getByName("www.jpayotaiddasd.com");
        if(ip.isReachable(5000)){
            System.out.println("is reachable");
        }else{
            System.out.println("not reach");
        }
    }
    
}
