/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;

/**
 *
 * @author Dipendra
 */
public class LastModiedURL {
    public static void main(String[] args) throws MalformedURLException,IOException,ProtocolException {
        URL url = new URL("https://www.asm.edu.np");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("HEAD");
        System.out.println("Last modied "+new Date(con.getLastModified()));
    }
}
