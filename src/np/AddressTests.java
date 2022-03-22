/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Dipendra
 */
public class AddressTests {
    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) return 4;
        else if (address.length == 16) return 6;
        else return -1;
    }
    
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ad = InetAddress.getByName("192.168.1.1");
        System.out.println(getVersion(ad));
    }
}
