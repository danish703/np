
package np;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.sound.midi.SysexMessage;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException{
        // method 1 
        InetAddress ia1 = InetAddress.getLocalHost();
        System.out.println(ia1.getHostAddress());
        System.out.println(ia1.getHostName());
        
        //method 2
        InetAddress ia2 = InetAddress.getByName("142.250.182.4");
        System.out.println(ia2.getHostAddress());
        System.out.println(ia2.getHostName());
        System.out.println(ia2.getHostAddress());
        
     
        InetAddress[] address = InetAddress.getAllByName("www.google.com");
      
        for(int i=0;i<address.length;i++){
            System.out.println(address[i].getHostName());
        }
    }
}
