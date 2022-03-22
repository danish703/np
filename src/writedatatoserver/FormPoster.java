
package writedatatoserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FormPoster {
    private URL url;
    
    private QueryString query = new QueryString();
    public FormPoster(URL url){
     if(!url.getProtocol().toLowerCase().startsWith("http")){
       throw new IllegalArgumentException("Posting only works on http");
     }
     this.url = url;
    }
    
    public void add(String name,String value){
      query.add(name,value);
    }
    
    public URL getURL(){
        return this.url;
    }
    
    public InputStream post() throws IOException{
      URLConnection uc = url.openConnection();
      uc.setDoOutput(true);
      try(OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream(),"UTF-8")){
        out.write(query.toString());
        out.write("\r\n");
        out.flush();
      }
      return uc.getInputStream();
    }
   
    public static void main(String[] args) {
        URL url;
        try{
          url = new URL("http://localhost/asmtphp/db/insert.php");
        }catch(MalformedURLException ex){
            System.out.println(ex.getMessage());
            return;
        }
        FormPoster poster = new FormPoster(url);
        poster.add("name","ram kumar");
        poster.add("email","ram@gmail.com");
        poster.add("contactno","34354");
        try(InputStream in = poster.post()){
          Reader r = new InputStreamReader(in);
          int c;
          while((c=r.read())!=-1){
              System.out.print((char) c);
          }
            System.out.println();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
