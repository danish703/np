package np;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPCharacteristics {
    public static void main(String[] args) {
        //String ip = "127.0.0.1";
        //String ip = "192.168.254.32";
        //String ip = "www.google.com";
        //String ip = "224.0.2.1";
        //String ip = "FF01:0:0:0:0:0:0:1";
        //String ip = "FF05:0:0:0:0:0:0:101";
        //String ip ="0::1";
        //String ip ="FEC0:0000:0000:0000:FF70:0000:1012:0000";
        String ip = "FF05:000:1111::00";
        try {
            InetAddress address = InetAddress.getByName(ip);
            
            if (address.isAnyLocalAddress()) {
                System.out.println(address + " is a wildcard address.");
            }
            
            
            if (address.isLoopbackAddress()) {
                System.out.println(address + " is loopback address.");
            }
            if (address.isLinkLocalAddress()) {
                System.out.println(address + " is a link-local address.");
            } else if (address.isSiteLocalAddress()) {
                System.out.println(address + " is a site-local address.");
            } else {
                System.out.println(address + " is a global address.");
            }
            if (address.isMulticastAddress()) {
                if (address.isMCGlobal()) {
                    System.out.println(address + " is a global multicast address.");
                } else if (address.isMCOrgLocal()) {
                    System.out.println(address+ " is an organization wide multicast address.");
                } else if (address.isMCSiteLocal()) {
                    System.out.println(address + " is a site wide multicast address.");
                } else if (address.isMCLinkLocal()) {
                    System.out.println(address + " is a subnet wide multicast address.");
                } else if (address.isMCNodeLocal()) {
                    System.out.println(address + " is an interface-local multicast address.");
                } else {
                    System.out.println(address + " is an unknown multicast address type.");
                }
            } else {
                System.out.println(address + " is a unicast address.");
            }
        } catch (UnknownHostException ex) {
            System.err.println("Could not resolve ");
        }
    }
}