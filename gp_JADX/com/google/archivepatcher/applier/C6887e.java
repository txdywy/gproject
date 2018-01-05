package com.google.archivepatcher.applier;

import com.google.archivepatcher.p406a.C6872h;
import com.google.archivepatcher.p406a.C6879o;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public final class C6887e extends FilterOutputStream {
    public final OutputStream f33999a;
    public Deflater f34000b = null;
    public DeflaterOutputStream f34001c = null;
    public final byte[] f34002d = new byte[1];
    public final int f34003e;
    public long f34004f;
    public final Iterator f34005g;
    public C6879o f34006h = null;
    public C6872h f34007i = null;

    public C6887e(List list, OutputStream outputStream) {
        super(outputStream);
        this.f33999a = outputStream;
        this.f34003e = 32768;
        this.f34005g = list.iterator();
        if (this.f34005g.hasNext()) {
            this.f34006h = (C6879o) this.f34005g.next();
        } else {
            this.f34006h = null;
        }
    }

    public final void write(int i) {
        this.f34002d[0] = (byte) i;
        write(this.f34002d, 0, 1);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            OutputStream outputStream;
            int i4 = i + i3;
            int i5 = i2 - i3;
            if (m31261b() == 0 && !m31260a()) {
                C6872h c6872h = (C6872h) this.f34006h.f33991c;
                if (this.f34000b == null) {
                    this.f34000b = new Deflater(c6872h.ac, c6872h.ae);
                } else if (this.f34007i.ae != c6872h.ae) {
                    this.f34000b.end();
                    this.f34000b = new Deflater(c6872h.ac, c6872h.ae);
                }
                this.f34000b.setLevel(c6872h.ac);
                this.f34000b.setStrategy(c6872h.ad);
                this.f34001c = new DeflaterOutputStream(this.f33999a, this.f34000b, this.f34003e);
            }
            if (m31260a()) {
                i5 = (int) Math.min((long) i5, m31262c());
                outputStream = this.f34001c;
            } else {
                outputStream = this.f33999a;
                if (this.f34006h != null) {
                    i5 = (int) Math.min((long) i5, m31261b());
                }
            }
            outputStream.write(bArr, i4, i5);
            this.f34004f += (long) i5;
            if (m31260a() && m31262c() == 0) {
                this.f34001c.finish();
                this.f34001c.flush();
                this.f34001c = null;
                this.f34000b.reset();
                this.f34007i = (C6872h) this.f34006h.f33991c;
                if (this.f34005g.hasNext()) {
                    this.f34006h = (C6879o) this.f34005g.next();
                } else {
                    this.f34006h = null;
                    this.f34000b.end();
                    this.f34000b = null;
                }
            }
            i3 += i5;
        }
    }

    private final boolean m31260a() {
        return this.f34001c != null;
    }

    private final long m31261b() {
        if (this.f34006h == null) {
            return -1;
        }
        return this.f34006h.f33989a - this.f34004f;
    }

    private final long m31262c() {
        if (this.f34006h == null) {
            return -1;
        }
        return (this.f34006h.f33989a + this.f34006h.f33990b) - this.f34004f;
    }
}
