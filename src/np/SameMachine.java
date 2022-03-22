
package np;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SameMachine {
public static void main (String args[]) {
    try {
        InetAddress ip1 = InetAddress.getByName("www.fb.com");
        InetAddress ip2 = InetAddress.getByName("www.facebook.com");
        System.out.println(ip1.hashCode());
        System.out.println(ip2.hashCode());
        
        
        
        System.out.println(ip2.toString());
        if (ip1.equals(ip2)) {
            System.out.println("same machine");
        } else {
            System.out.println("not in same machine");
        }
    }catch (UnknownHostException ex) {
        System.out.println("Host lookup failed.");
    }
}

}
