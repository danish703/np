/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketDemo;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Dipendra
 */
public class PortScanner {
    public static void main(String[] args) {
        String host = "smtp.gmail.com";
        for(int i=1;i<1024;i++){
           try{
               Socket sc = new Socket(host,i);
               sc.setSoTimeout(1000);
               System.out.println("Ther is a server port on "+i+" of "+host);
               sc.close();
           }catch(UnknownHostException ex){
               System.out.println(ex);
               break;
           }catch(IOException ex){
           }
            
            
        }
    }
}
