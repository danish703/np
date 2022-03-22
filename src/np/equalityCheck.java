
package np;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public class equalityCheck {
    public static void main(String[] args) throws URISyntaxException, UnsupportedEncodingException {
        URI u = new URI("HTTPS://WWW.Abc.edu.np/A/èr");
        URI h = new URI("https://www.abc.edu.np/a");
        if(u.hashCode()==h.hashCode()){
            System.out.println("they are same uri");
        }else{
            System.out.println("they are not same uri");
        }
        System.out.println(u.toString());
        System.out.println(u.toASCIIString());
        
        String uri = URLEncoder.encode("https://www.Abc.edu.np/A/èr/#abc/a-xy!", "UTF-8");
        System.out.println(uri);
    }
   
}
