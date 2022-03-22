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
public class HttpURLRequestDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL u = new URL("https://www.asm.edu.np/");
        HttpURLConnection http = (HttpURLConnection) u.openConnection();
        http.setRequestMethod("OPTIONS");
        System.out.println(http.getHeaderField("Allow"));
        http.disconnect();
      
    }
}
