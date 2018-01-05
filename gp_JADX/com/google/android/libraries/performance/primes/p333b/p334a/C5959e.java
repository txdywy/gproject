package com.google.android.libraries.performance.primes.p333b.p334a;

import android.support.v4.p037h.C0325v;
import com.google.android.libraries.p326c.p327a.C5916a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class C5959e {
    public final C5960f f29715a = new C5960f();

    public final Object m27668a(String str, Object obj) {
        int i = 0;
        C5916a.m27408a(str.length() > 0);
        C5916a.m27406a(obj);
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        C5960f c5960f = this.f29715a;
        int length = bytes.length;
        C5960f c5960f2 = c5960f;
        while (i < length) {
            byte b = bytes[i];
            if (c5960f2.f29717b == null) {
                c5960f2.f29717b = new C0325v();
            }
            c5960f = (C5960f) c5960f2.f29717b.m1709a(b);
            if (c5960f == null) {
                c5960f = new C5960f();
                c5960f2.f29717b.m1710a(b, c5960f);
            }
            i++;
            c5960f2 = c5960f;
        }
        if (c5960f2.f29716a != null) {
            return c5960f2.f29716a;
        }
        c5960f2.f29716a = obj;
        return null;
    }

    public final Object m27669a(ByteBuffer byteBuffer, int i, int i2) {
        C5960f c5960f = this.f29715a;
        int i3 = i + i2;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (c5960f.f29717b != null) {
                c5960f = (C5960f) c5960f.f29717b.m1709a(b);
                if (c5960f != null) {
                    i++;
                }
            }
            return null;
        }
        return c5960f.f29716a;
    }
}
