package com.google.android.libraries.performance.primes.p333b;

import java.nio.ByteBuffer;

public final class C5964c extends C5962e {
    public final int f29725a;
    public int[] f29726b;
    public int[] f29727c;
    public int[] f29728d;
    public int[] f29729e;
    public int f29730f;
    public C5964c f29731g;
    public int f29732h = -1;

    public C5964c(int i, int i2) {
        super(i);
        this.f29725a = i2;
    }

    public final int mo5235a(C5970j c5970j) {
        return this.f29726b.length;
    }

    public final int mo5236a(C5970j c5970j, int i) {
        return this.f29726b[i];
    }

    public final String mo5237b(C5970j c5970j, int i) {
        return c5970j.m27707a(this.f29727c[i]);
    }

    public final String mo5238c(C5970j c5970j, int i) {
        String str;
        String valueOf;
        if (i < 0 || i >= this.f29726b.length) {
            str = "static ";
            valueOf = String.valueOf(m27691b(c5970j));
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } else {
            valueOf = m27691b(c5970j);
            str = mo5237b(c5970j, i);
            return new StringBuilder((String.valueOf(valueOf).length() + 8) + String.valueOf(str).length()).append("static ").append(valueOf).append("#").append(str).toString();
        }
    }

    final void m27690a() {
        if (this.f29732h == -1) {
            this.f29732h = this.f29728d.length;
            if (this.f29731g != null) {
                this.f29731g.m27690a();
                this.f29732h += this.f29731g.f29732h;
                if ((this.f29731g.k & 2) != 0) {
                    this.k |= 2;
                }
            }
        }
    }

    public final String m27691b(C5970j c5970j) {
        return c5970j.m27707a(this.f29725a);
    }

    final int m27689a(C5970j c5970j, int i, int i2) {
        while (i2 >= this.f29728d.length) {
            i += this.f29730f;
            i2 -= this.f29728d.length;
            this = this.f29731g;
        }
        return c5970j.m27710d(this.f29729e[i2] + i);
    }

    static void m27686c(C5970j c5970j) {
        ByteBuffer byteBuffer = c5970j.f29752a;
        int i = 65535 & byteBuffer.getShort();
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.getShort();
            c5970j.m27709c(c5970j.m27708b(byteBuffer.get()));
        }
    }
}
