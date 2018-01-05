package org.chromium.net.impl;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.ay;

public final class bx extends ay {
    public final List f40895a;
    public final int f40896b;
    public final String f40897c;
    public final boolean f40898d;
    public final String f40899e;
    public final String f40900f;
    public final AtomicLong f40901g = new AtomicLong();
    public final by f40902h;

    public bx(List list, int i, String str, List list2, boolean z, String str2, String str3) {
        this.f40895a = Collections.unmodifiableList(list);
        this.f40896b = i;
        this.f40897c = str;
        this.f40902h = new by(Collections.unmodifiableList(list2));
        this.f40898d = z;
        this.f40899e = str2;
        this.f40900f = str3;
    }

    public final int mo6627a() {
        return this.f40896b;
    }

    public final String mo6628b() {
        return this.f40897c;
    }

    public final List mo6629c() {
        return this.f40902h.f40903a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), (String) this.f40895a.get(this.f40895a.size() - 1), this.f40895a.toString(), Integer.valueOf(mo6627a()), mo6628b(), mo6629c().toString(), Boolean.valueOf(this.f40898d), this.f40899e, this.f40900f, Long.valueOf(this.f40901g.get())});
    }

    public final void m38127a(long j) {
        this.f40901g.set(j);
    }
}
