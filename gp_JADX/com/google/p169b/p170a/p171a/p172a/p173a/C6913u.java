package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import com.google.common.p416c.C6972g;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

final class C6913u {
    public final C6972g f34240a;
    public final Charset f34241b;
    public ByteBuffer f34242c;
    public byte[] f34243d;

    C6913u(C6972g c6972g, Charset charset) {
        this.f34240a = c6972g;
        this.f34241b = charset;
    }

    private final void m31569c() {
        if (this.f34242c == null || !this.f34242c.hasRemaining()) {
            int readInt = ((C6972g) C6937m.m31623a(this.f34240a)).readInt();
            C6937m.m31635b(readInt > 0);
            if (this.f34243d == null || this.f34243d.length < readInt) {
                this.f34243d = new byte[(readInt + MemoryMappedFileBuffer.DEFAULT_PADDING)];
            }
            this.f34240a.readFully(this.f34243d, 0, readInt);
            this.f34242c = ByteBuffer.wrap(this.f34243d, 0, readInt).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    final void m31570a() {
        boolean z;
        boolean z2 = true;
        if (this.f34242c.hasRemaining()) {
            z = false;
        } else {
            z = true;
        }
        C6937m.m31635b(z);
        if (this.f34240a.readInt() != 0) {
            z2 = false;
        }
        C6937m.m31635b(z2);
    }

    final void m31571a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m31569c();
            this.f34242c.position(this.f34242c.getShort() + this.f34242c.position());
        }
    }

    final String m31572b() {
        m31569c();
        short s = this.f34242c.getShort();
        String str = new String(this.f34242c.array(), this.f34242c.position(), s, this.f34241b);
        this.f34242c.position(s + this.f34242c.position());
        return str;
    }
}
