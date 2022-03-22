
package np;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URL;

public class SystemPropertiesSet {
    public static void main(String[] args) throws MalformedURLException, IOException {
        System.setProperty("http.proxyHost","198.125.124.1");
        System.setProperty("http.proxyPort","9000");
        System.setProperty("http.nonProxyHost","http://google.com|http://facebook.com|*.abc.com");
        URL url = new URL("http://asm.edu.np");
       
        SocketAddress address = new InetSocketAddress("198.125.124.1",9000);
        SocketAddress address2 = new InetSocketAddress("http://google.com",80);
        Proxy px = new Proxy(Proxy.Type.HTTP, address);
        Proxy px2 = new Proxy(Proxy.Type.DIRECT, address2);
        
        
        
    }
}
