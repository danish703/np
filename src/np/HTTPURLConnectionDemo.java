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
import java.net.URLConnection;

/**
 *
 * @author Dipendra
 */
public class HTTPURLConnectionDemo {
    public static void main(String[] args)throws MalformedURLException, IOException {
        URL url = new URL("http://www.asm.edu.np");
        URLConnection con = url.openConnection();
        
        HttpURLConnection htpcon = (HttpURLConnection) con;
        // option 2
        HttpURLConnection h = (HttpURLConnection) url.openConnection();
    }
}
