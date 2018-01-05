package com.squareup.okhttp.internal.p525a;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import p526e.C7725i;
import p526e.C7728j;

final class ar implements C7610b {
    public final C7725i f39439a;
    public final boolean f39440b;
    public final aj f39441c = new aj(this.f39439a);

    ar(C7725i c7725i, boolean z) {
        this.f39439a = c7725i;
        this.f39440b = z;
    }

    public final void mo6426a() {
    }

    public final boolean mo6427a(C7613c c7613c) {
        boolean z = false;
        try {
            int h = this.f39439a.mo6500h();
            int h2 = this.f39439a.mo6500h();
            int i = (-16777216 & h2) >>> 24;
            int i2 = 16777215 & h2;
            int i3;
            if ((Integer.MIN_VALUE & h) != 0) {
                i3 = (2147418112 & h) >>> 16;
                h &= 65535;
                if (i3 != 3) {
                    throw new ProtocolException("version != 3: " + i3);
                }
                List a;
                boolean z2;
                switch (h) {
                    case 1:
                        i3 = this.f39439a.mo6500h();
                        this.f39439a.mo6500h();
                        h2 = i3 & Integer.MAX_VALUE;
                        this.f39439a.mo6499g();
                        a = this.f39441c.m36741a(i2 - 10);
                        if ((i & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((i & 2) != 0) {
                            z = true;
                        }
                        c7613c.mo6452a(z, z2, h2, a, C7637y.SPDY_SYN_STREAM);
                        return true;
                    case 2:
                        h2 = this.f39439a.mo6500h() & Integer.MAX_VALUE;
                        a = this.f39441c.m36741a(i2 - 4);
                        if ((i & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c7613c.mo6452a(false, z2, h2, a, C7637y.SPDY_REPLY);
                        return true;
                    case 3:
                        if (i2 != 8) {
                            throw ar.m36760a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
                        }
                        i3 = this.f39439a.mo6500h() & Integer.MAX_VALUE;
                        C7609a a2 = C7609a.m36679a(this.f39439a.mo6500h());
                        if (a2 == null) {
                            throw ar.m36760a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(h));
                        }
                        c7613c.mo6447a(i3, a2);
                        return true;
                    case 4:
                        m36761a(c7613c, i, i2);
                        return true;
                    case 6:
                        if (i2 != 4) {
                            throw ar.m36760a("TYPE_PING length: %d != 4", Integer.valueOf(i2));
                        }
                        boolean z3;
                        h = this.f39439a.mo6500h();
                        boolean z4 = this.f39440b;
                        if ((h & 1) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c7613c.mo6449a(z4 == z3, h, 0);
                        return true;
                    case 7:
                        if (i2 != 8) {
                            throw ar.m36760a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
                        }
                        i3 = this.f39439a.mo6500h() & Integer.MAX_VALUE;
                        if (C7609a.m36681c(this.f39439a.mo6500h()) == null) {
                            throw ar.m36760a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(this.f39439a.mo6500h()));
                        }
                        c7613c.mo6448a(i3, C7728j.f40191b);
                        return true;
                    case 8:
                        c7613c.mo6452a(false, false, this.f39439a.mo6500h() & Integer.MAX_VALUE, this.f39441c.m36741a(i2 - 4), C7637y.SPDY_HEADERS);
                        return true;
                    case 9:
                        if (i2 != 8) {
                            throw ar.m36760a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
                        }
                        i3 = this.f39439a.mo6500h() & Integer.MAX_VALUE;
                        long h3 = (long) (this.f39439a.mo6500h() & Integer.MAX_VALUE);
                        if (h3 == 0) {
                            throw ar.m36760a("windowSizeIncrement was 0", Long.valueOf(h3));
                        }
                        c7613c.mo6446a(i3, h3);
                        return true;
                    default:
                        this.f39439a.mo6497f((long) i2);
                        return true;
                }
            }
            i3 = h & Integer.MAX_VALUE;
            if ((i & 1) != 0) {
                z = true;
            }
            c7613c.mo6450a(z, i3, this.f39439a, i2);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private final void m36761a(C7613c c7613c, int i, int i2) {
        boolean z = true;
        int h = this.f39439a.mo6500h();
        if (i2 != (h * 8) + 4) {
            throw ar.m36760a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(h));
        }
        ap apVar = new ap();
        for (int i3 = 0; i3 < h; i3++) {
            int h2 = this.f39439a.mo6500h();
            int i4 = (-16777216 & h2) >>> 24;
            apVar.m36754a(h2 & 16777215, i4, this.f39439a.mo6500h());
        }
        if ((i & 1) == 0) {
            z = false;
        }
        c7613c.mo6451a(z, apVar);
    }

    private static IOException m36760a(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public final void close() {
        this.f39441c.f39427c.close();
    }
}
