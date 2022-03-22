/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Dipendra
 */
public class URLDemo2 {
    public static void main(String[] args) {
        try{
           
            URL url4 = new URL("http://asm.edu.np");
            URL url3 = new URL("https","asm.edu.np",443,"/index.html?k=abc");
            URL url2 = new URL(url4,"about.html"); //http://asm.edu.np/about.html
            // https://asm.edu.np:80/index.html
            System.out.println(url3.getProtocol());
            System.out.println(url3.getHost());
            System.out.println(url3.getAuthority());
            System.out.println(url3.getPort());
            System.out.println(url3.getFile());
            System.out.println(url3.getDefaultPort());
            System.out.println(url3.getQuery());
            System.out.println(url3.toString());
            System.out.println(url4.equals(url3));
        }catch(MalformedURLException ex){
          System.out.println(ex.getMessage());
        }
        
    }
}
