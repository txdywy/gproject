package com.google.android.gms.clearcut;

import java.util.Collection;

public class C5043r extends C5020h {
    public final C5021i f25604g;

    protected C5043r(C5019g c5019g, C5043r c5043r) {
        super(c5019g, (C5020h) c5043r);
        this.f25604g = c5043r.f25604g;
    }

    protected C5043r(C5019g c5019g, String str, C5021i c5021i) {
        super(c5019g, str);
        this.f25604g = c5021i;
    }

    protected void mo4532c(long j) {
        int i = 0;
        long a = this.f25604g.mo4531a(j);
        this.f25575f.f25564i.readLock().lock();
        try {
            int i2;
            boolean z;
            if (this.f25575f.f25567l == null) {
                i2 = 1;
                z = false;
            } else {
                z = super.m23214b(a);
                i2 = 0;
            }
            this.f25575f.f25564i.readLock().unlock();
            if (i2 != 0) {
                z = super.m23213a(a);
            }
            if (z) {
                C5019g c5019g = this.f25575f;
                C5042o e = this.f25575f.f25561f;
                C5019g a2 = c5019g.m23211a();
                Collection<byte[]> keySet = a2.f25568m.keySet();
                C5016d[] c5016dArr = new C5016d[keySet.size()];
                i2 = 0;
                for (byte[] c5046s : keySet) {
                    int i3 = i2 + 1;
                    c5016dArr[i2] = new C5046s(a2, c5046s);
                    i2 = i3;
                }
                i2 = c5016dArr.length;
                while (i < i2) {
                    C5014b c5014b = new C5014b(a2.f25563h, c5016dArr[i]);
                    c5014b.f25539b = a2.f25557b;
                    if (e != null) {
                        c5014b = e.m23255a();
                    }
                    c5014b.m23195a();
                    i++;
                }
            }
        } catch (Throwable th) {
            this.f25575f.f25564i.readLock().unlock();
        }
    }
}
