/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.CacheRequest;

/**
 *
 * @author Dipendra
 */
public class SimpleCacheRequest extends CacheRequest {

    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Override
    public OutputStream getBody() throws IOException {
        return out;
    }

    @Override
    public void abort() {
        out.reset();
    }

    public byte[] getData() {
        if (out.size() == 0) {
            return null;
        } else {
            return out.toByteArray();
        }
    }
}
