/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 * @author Dipendra
 */
public class NetworkInterfaceGetterDemo {
    public static void main(String[] args) throws SocketException {
        NetworkInterface eth0 = NetworkInterface.getByName("lo");
        System.err.println(eth0.getName());
        System.err.println(eth0.getDisplayName());
        Enumeration addresses = eth0.getInetAddresses();
        while (addresses.hasMoreElements()) {
            System.out.println(addresses.nextElement());
        } 
    }
}
