/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheResponse;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Dipendra
 */
public class SimpleCacheResponse extends CacheResponse {
    public final Map<String,List<String>> headers;
    public final SimpleCacheRequest request;
    public final CacheControl cacheControl;
    public final Date expire;
    
    public SimpleCacheResponse(SimpleCacheRequest request,CacheControl control,URLConnection uc){
        this.request= request;
        this.cacheControl = control;
        this.expire = new Date(uc.getExpiration());
        this.headers = Collections.unmodifiableMap(uc.getHeaderFields());
    }

    @Override
    public Map<String, List<String>> getHeaders() throws IOException {
       return this.headers;
    }

    @Override
    public InputStream getBody() throws IOException {
       return new ByteArrayInputStream(request.getData());
    }
    
    public CacheControl getControl(){
        return this.cacheControl;
    }
    
    public boolean isExpired(){
        Date now = new Date();
        if(cacheControl.getMaxAge().before(now)) return true;
                else if (expire!=null && cacheControl.getMaxAge()!=null) 
                    return expire.before(now);
        else
                    return false;
    }
    
}
