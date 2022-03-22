/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Dipendra
 */
public class ProxySystemProperties {

    public static void main(String[] args) throws MalformedURLException, IOException {
        System.setProperty("http.proxyHost", "192.185.110.228");
        System.out.println(System.getProperty("http.proxyHost"));
        URL url = new URL("http://www.iitnepal.edu.np/");
        URLConnection con = url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream()));

// Read it ...
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

        in.close();
    }
}
