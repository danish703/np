/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Dipendra
 */
public class NetworkInterfaceClassDemo {
    public static void main(String[] args) {
        
        try {
            InetAddress local = InetAddress.getByName("127.0.0.1");
            NetworkInterface ni = NetworkInterface.getByInetAddress(local);
            if (ni == null) {
                System.err.println("That's weird. No local loopback address.");
            }else{
                System.err.println(ni.getDisplayName());
            }
        }catch(SocketException ex) {
            System.err.println("Could not list network interfaces." );
        }catch(UnknownHostException ex) {
            System.err.println("That's weird. Could not lookup 127.0.0.1.");
        }

    }
}
