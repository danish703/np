/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Dipendra
 */
public class URLConfigureDemo {
    public static void main(String[] args) {
        try{
            URL u = new URL("http://www.oreilly.com/");
            URLConnection uc = u.openConnection();
            System.out.println(uc.getURL());
            System.out.println(uc.getDoInput());
            uc.setDoInput(false);
            System.out.println(uc.getInputStream());
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
