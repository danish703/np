/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Dipendra
 */
public class URIDemo {
    public static void main(String[] args) {
        try{
        
            URI u1 = new URI("mailto:abc@gmail.com");
            URI web = new URI("http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc");
            URI book = new URI("urn:isbn:1-565-92870-9"); 
        
            URI today= new URI("http", "www.ibiblio.org", "/javafaq/index.html", "today");
        
        }catch(URISyntaxException e){
            System.out.println(e.getMessage());
        }
    }
}
