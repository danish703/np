
package np;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;

public class CookieManagerDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(manager);
        URL u = new URL("http://www.abc.edu.np");
        u.openConnection();
    }
}
