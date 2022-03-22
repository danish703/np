
import com.sun.source.tree.Scope;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dipendra
 */
public class SocketWithNoConnection {
    public static void main(String[] args) {
        try{
            Socket sc = new Socket("time.nist.gov",13);
            //sc.close();
            if(!sc.isClosed()&&sc.isConnected()){
                System.out.println("connection is open");
            }else{
                System.out.println("connection is closed");
            }
            System.out.println(sc.toString());
        }catch(UnknownHostException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
                
    }
}
