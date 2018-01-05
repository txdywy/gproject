package com.google.android.finsky.by.p132a;

import android.util.Base64;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2229h;
import java.util.Iterator;

final class C2218q implements Runnable {
    public final /* synthetic */ C2217p f11070a;

    C2218q(C2217p c2217p) {
        this.f11070a = c2217p;
    }

    public final void run() {
        Iterator it;
        C2217p c2217p = this.f11070a;
        if (c2217p.f11069f == 0) {
            c2217p.f11067d.m11516d();
            String str = c2217p.f11067d.f10992f.name;
            it = c2217p.f11066c.iterator();
            while (it.hasNext()) {
                C2227g c2227g = (C2227g) it.next();
                if (str.equals(c2227g.f11101h)) {
                    c2217p.f11067d.m11517d(c2227g);
                }
            }
            for (String str2 : C2229h.f11126g) {
                String str3 = (String) C0954a.m5747a(str2, str).m5760a();
                c2217p.f11067d.m11506a(str2, str3 != null ? Base64.decode(str3, 0) : null);
            }
            c2217p.f11069f = 2;
            c2217p.f11067d.m11519e();
        }
        synchronized (c2217p) {
            for (Runnable post : c2217p.f11068e) {
                c2217p.f11065b.post(post);
            }
            c2217p.f11068e.clear();
        }
    }
}
