
package np;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NP {

    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress inetAddress = InetAddress.getByName("www.facebook.com");
        byte addr[]={72, 3, 2, 12};  
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getLocalHost());
        System.out.println(inetAddress.getByAddress(addr));
        System.out.println(inetAddress.isReachable(5000));
    }
    
}
