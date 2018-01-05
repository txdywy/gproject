package com.squareup.okhttp.internal.p525a;

import com.squareup.haha.perflib.HprofParser;
import java.util.logging.Level;
import p526e.C7725i;
import p526e.C7726f;
import p526e.aa;
import p526e.ab;

final class ad implements aa {
    public final C7725i f39399a;
    public int f39400b;
    public byte f39401c;
    public int f39402d;
    public int f39403e;
    public short f39404f;

    public ad(C7725i c7725i) {
        this.f39399a = c7725i;
    }

    public final long mo6423a(C7726f c7726f, long j) {
        while (this.f39403e == 0) {
            this.f39399a.mo6497f((long) this.f39404f);
            this.f39404f = (short) 0;
            if ((this.f39401c & 4) != 0) {
                return -1;
            }
            int i = this.f39402d;
            int a = ac.m36698a(this.f39399a);
            this.f39403e = a;
            this.f39400b = a;
            byte f = (byte) (this.f39399a.mo6496f() & HprofParser.ROOT_UNKNOWN);
            this.f39401c = (byte) (this.f39399a.mo6496f() & HprofParser.ROOT_UNKNOWN);
            if (ac.f39397a.isLoggable(Level.FINE)) {
                ac.f39397a.fine(ae.m36708a(true, this.f39402d, this.f39400b, f, this.f39401c));
            }
            this.f39402d = this.f39399a.mo6500h() & Integer.MAX_VALUE;
            if (f != (byte) 9) {
                throw ac.m36701b("%s != TYPE_CONTINUATION", Byte.valueOf(f));
            } else if (this.f39402d != i) {
                throw ac.m36701b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
        long a2 = this.f39399a.mo6423a(c7726f, Math.min(j, (long) this.f39403e));
        if (a2 == -1) {
            return -1;
        }
        this.f39403e = (int) (((long) this.f39403e) - a2);
        return a2;
    }

    public final ab mo6424a() {
        return this.f39399a.mo6424a();
    }

    public final void close() {
    }
}
