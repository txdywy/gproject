package com.android.p2putils;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class com.android.p2putils.a implements com.android.p2putils.b
{

    public final ByteBuffer a;

    a(ByteBuffer p0) {
        this.a = p0.slice();
    }

    public final long a() {
        return (long)this.a.capacity();
    }

    public final void a(MessageDigest[] p0, long p1, int p3) {
        enter this.a;
        try {
            this.a.position((int)p1);
            this.a.limit((int)p1 + p3);
            v3 = this.a.slice();
            exit this.a;
        }
        catch (Throwable ex) {
            try {
                exit this.a;
            }
            catch (Throwable ex) {
                exit this.a;
                throw ex;
            }
            throw ex;
        }
        v0 = 0;
        while (v0 < p0.length) {
            v3.position(0);
            p0[v0].update(v3);
            v0 = v0 + 1;
        }
    }

}
