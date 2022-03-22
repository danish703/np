
package np;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;

public class URLConnectionDemo {
    public static void main(String[] args){
        try{
            URL url = new URL("https://iitnepal.edu.np/");
            URLConnection uc = url.openConnection();
           
            Permission pm = uc.getPermission();
            System.out.println(pm);
            
            System.out.println(URLConnection.guessContentTypeFromName("https://www.asm.edu.np/wp-content/uploads/2017/08/logo.png"));
            
            uc.setRequestProperty("cookie","username=ram;password=nepal123");
            String contenttype = uc.getContentType();
            System.out.println("content type="+contenttype);
            int l = uc.getContentLength();
            System.out.println("Length="+l);
            String ce = uc.getContentEncoding();
            System.out.println("Content encoding = "+ce);
            System.out.println(uc.getDate());
            
            System.out.println(uc.getExpiration());
            System.out.println(uc.getLastModified());
            System.out.println("Content-type="+uc.getHeaderField("content-type"));
            System.out.println(uc.getHeaderFieldKey(1));
            System.out.println(uc.getHeaderField(uc.getHeaderFieldKey(4)));
            System.out.println(uc.getHeaderFieldInt("content-length", -l));
            
            
            
            
            try(InputStream raw = uc.getInputStream()){
                System.out.println("-------------------------------");
                System.out.println(URLConnection.guessContentTypeFromStream(raw));
                System.out.println("----------------------------------------");
              InputStream buffer = new BufferedInputStream(raw);
              Reader reader = new InputStreamReader(buffer);
              int c;
              while((c=reader.read())!=-1){
                  System.out.print((char) c);
              }
            }
        }catch (MalformedURLException ex){
            System.out.println(ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }    
    }
}
