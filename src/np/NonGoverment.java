/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

/**
 *
 * @author Dipendra
 */
public class NonGoverment implements CookiePolicy {

    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
       if(uri.getAuthority().toLowerCase().endsWith(".gov") ||
               cookie.getDomain().toLowerCase().endsWith(".gov")){
           return false;
       }
       return true;
    }
    
}
