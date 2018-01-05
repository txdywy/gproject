package com.google.android.finsky.verifier.impl;

import android.net.Uri;
import com.google.android.finsky.verifier.p259a.p260a.C4702f;
import com.google.android.finsky.verifier.p259a.p260a.C4703g;
import com.google.android.finsky.verifier.p259a.p260a.C4704h;
import com.google.android.finsky.verifier.p259a.p260a.C4709m;
import com.google.android.finsky.verifier.p259a.p260a.C4710n;
import com.google.android.finsky.verifier.p259a.p260a.C4711o;
import java.net.InetAddress;
import java.util.List;

public final class am {
    static C4710n m22059a(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        C4710n c4710n = new C4710n();
        c4710n.f24226b = new C4702f[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            C4702f c4702f = new C4702f();
            C4703g c4703g = new C4703g();
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                throw new NullPointerException();
            }
            c4703g.f24190b |= 1;
            c4703g.f24191c = bArr2;
            c4702f.f24188b = new C4703g[]{c4703g};
            c4710n.f24226b[i] = c4702f;
        }
        return c4710n;
    }

    static C4709m m22058a(Uri uri, InetAddress inetAddress, Uri uri2, int i) {
        C4709m c4709m = new C4709m();
        c4709m.f24221c = uri.toString();
        c4709m.f24222d = i;
        if (uri2 != null) {
            String uri3 = uri2.toString();
            if (uri3 == null) {
                throw new NullPointerException();
            }
            c4709m.f24220b |= 2;
            c4709m.f24224f = uri3;
        }
        if (inetAddress != null) {
            try {
                byte[] bytes = inetAddress.getHostAddress().getBytes("UTF-8");
                if (bytes == null) {
                    throw new NullPointerException();
                }
                c4709m.f24220b |= 1;
                c4709m.f24223e = bytes;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return c4709m;
    }

    static C4704h m22057a(byte[] bArr) {
        C4704h c4704h = new C4704h();
        c4704h.m21900a(bArr);
        return c4704h;
    }

    static C4711o[] m22060a(List list) {
        C4711o[] c4711oArr = new C4711o[list.size()];
        for (int i = 0; i < list.size(); i++) {
            c4711oArr[i] = new C4711o();
            c4711oArr[i].f24229b = m22057a((byte[]) list.get(i));
        }
        return c4711oArr;
    }

    static byte[][] m22061a(C4710n c4710n) {
        if (c4710n == null) {
            return null;
        }
        byte[][] bArr = new byte[c4710n.f24226b.length][];
        for (int i = 0; i < c4710n.f24226b.length; i++) {
            bArr[i] = c4710n.f24226b[i].f24188b[0].f24191c;
        }
        return bArr;
    }

    static C4710n m22062b(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        C4710n c4710n = new C4710n();
        c4710n.f24226b = new C4702f[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            C4702f c4702f = new C4702f();
            C4703g c4703g = new C4703g();
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                throw new NullPointerException();
            }
            c4703g.f24190b |= 16;
            c4703g.f24195g = bArr2;
            c4702f.f24188b = new C4703g[]{c4703g};
            c4710n.f24226b[i] = c4702f;
        }
        return c4710n;
    }
}
