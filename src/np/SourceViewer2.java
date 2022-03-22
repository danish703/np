package np;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SourceViewer2 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String web = "https://merolagani.com/";
        if (web.length() > 0) {
            try {
                // Open the URLConnection for reading
                URL u = new URL(web);
                URLConnection uc = u.openConnection();
                System.out.println(uc.getContentType());
                System.out.println(uc.getContentLength());
                System.out.println(uc.getContentEncoding());
                try (InputStream raw = uc.getInputStream()) {
                    InputStream buffer = new BufferedInputStream(raw);
                    Reader reader = new InputStreamReader(buffer);
                    int c;
                    while ((c = reader.read()) != -1) {
                        System.out.print((char) c);
                    }
                }
            } catch (MalformedURLException ex) {
                System.err.println(web+ " is not a parseable URL");
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }
}
