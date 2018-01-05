package org.chromium.net;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

public abstract class C7938k extends C7931e {
    public abstract C7944n mo6601b(String str, aw awVar, Executor executor);

    public URLConnection mo6603a(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    public /* synthetic */ av mo6600a(String str, aw awVar, Executor executor) {
        return mo6601b(str, awVar, executor);
    }
}
