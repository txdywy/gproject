package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class gf extends C0758b {
    public static volatile gf[] f12431a;
    public int f12432b;
    public gi f12433c;
    public long f12434d;
    public int f12435e;

    public static gf[] bb_() {
        if (f12431a == null) {
            synchronized (h.b) {
                if (f12431a == null) {
                    f12431a = new gf[0];
                }
            }
        }
        return f12431a;
    }

    public gf() {
        this.f12432b = 0;
        this.f12433c = null;
        this.f12434d = 0;
        this.f12435e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gf)) {
            return false;
        }
        gf gfVar = (gf) obj;
        if (this.f12433c == null) {
            if (gfVar.f12433c != null) {
                return false;
            }
        } else if (!this.f12433c.equals(gfVar.f12433c)) {
            return false;
        }
        if ((this.f12432b & 1) != (gfVar.f12432b & 1)) {
            return false;
        }
        if (this.f12434d != gfVar.f12434d) {
            return false;
        }
        if ((this.f12432b & 2) != (gfVar.f12432b & 2)) {
            return false;
        }
        if (this.f12435e != gfVar.f12435e) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gfVar.aO);
        }
        if (gfVar.aO == null || gfVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        gi giVar = this.f12433c;
        hashCode = (giVar == null ? 0 : giVar.hashCode()) + (hashCode * 31);
        long j = this.f12434d;
        hashCode = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12435e) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12433c != null) {
            codedOutputByteBufferNano.b(1, this.f12433c);
        }
        if ((this.f12432b & 1) != 0) {
            codedOutputByteBufferNano.b(2, this.f12434d);
        }
        if ((this.f12432b & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12435e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12433c != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12433c);
        }
        if ((this.f12432b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f12434d);
        }
        if ((this.f12432b & 2) != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f12435e);
        }
        return b;
    }

    private final gf m12631b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f12433c == null) {
                        this.f12433c = new gi();
                    }
                    aVar.a(this.f12433c);
                    continue;
                case 16:
                    this.f12434d = aVar.j();
                    this.f12432b |= 1;
                    continue;
                case 24:
                    this.f12432b |= 2;
                    int o = aVar.o();
                    try {
                        this.f12435e = gj.m12649a(aVar.i());
                        this.f12432b |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12631b(aVar);
    }
}
