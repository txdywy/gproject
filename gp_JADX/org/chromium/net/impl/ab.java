package org.chromium.net.impl;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.aw;

public final class ab extends C7939d {
    public final String f40752a;
    public final ExecutorService f40753b;

    public ab(C7942e c7942e) {
        int a = c7942e.m38058a(9);
        this.f40752a = c7942e.f40761e;
        this.f40753b = Executors.newCachedThreadPool(new ac(a));
    }

    public final bv mo6604a(String str, aw awVar, Executor executor, int i, boolean z, boolean z2, boolean z3) {
        return new af(awVar, this.f40753b, executor, str, this.f40752a, z3);
    }

    public final URLConnection mo6602a(URL url) {
        return url.openConnection();
    }

    public final URLConnection mo6603a(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }
}
