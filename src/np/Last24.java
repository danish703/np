/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 *
 * @author Dipendra
 */
public class Last24 {
    
    public static void main(String[] args) {
        Date today = new Date();
        long millisecondsPerDay = 24*60*60*1000;
        try{
            URL url = new URL("http://wwww.orielly.com");
            URLConnection uc = url.openConnection();
            System.out.println("Orginal if modified since:"+new Date(uc.getIfModifiedSince()));
            uc.setIfModifiedSince((new Date(today.getTime()-millisecondsPerDay)).getTime());
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
        
    }
    
}
