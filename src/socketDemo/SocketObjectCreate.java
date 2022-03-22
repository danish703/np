/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Dipendra
 */
public class SocketObjectCreate {
    public static void main(String[] args) throws IOException {
       try{
           Socket sc = new Socket("nist.gov",13); //direct host string
           InetAddress add = InetAddress.getByName("time.nist.gov");
           
           Socket sc2 = new Socket(add,13); // by passing the object of Inetaddress class
           
       }catch(UnknownHostException ex){
           System.out.println(ex);
       }
        
    }
}
