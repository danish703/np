/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Dipendra
 */
public class HttpResponseCodeDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.asm.edu.np/");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        int code = http.getResponseCode();
        String msg = http.getResponseMessage();
        System.out.println("Code="+code);
        System.out.println("Message = "+msg);
        System.out.println(http.usingProxy());
        
    }
   
}
