package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class jz extends C0758b {
    public static volatile jz[] f12845a;
    public int f12846b;
    public int f12847c;
    public long f12848d;
    public long f12849e;

    public static jz[] bE_() {
        if (f12845a == null) {
            synchronized (h.b) {
                if (f12845a == null) {
                    f12845a = new jz[0];
                }
            }
        }
        return f12845a;
    }

    public jz() {
        this.f12846b = 0;
        this.f12847c = 0;
        this.f12848d = 0;
        this.f12849e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        if ((this.f12846b & 1) != (jzVar.f12846b & 1)) {
            return false;
        }
        if (this.f12847c != jzVar.f12847c) {
            return false;
        }
        if ((this.f12846b & 2) != (jzVar.f12846b & 2)) {
            return false;
        }
        if (this.f12848d != jzVar.f12848d) {
            return false;
        }
        if ((this.f12846b & 4) != (jzVar.f12846b & 4)) {
            return false;
        }
        if (this.f12849e != jzVar.f12849e) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jzVar.aO);
        }
        if (jzVar.aO == null || jzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12847c;
        long j = this.f12848d;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12849e;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12846b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12847c);
        }
        if ((this.f12846b & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f12848d);
        }
        if ((this.f12846b & 4) != 0) {
            codedOutputByteBufferNano.b(3, this.f12849e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12846b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12847c);
        }
        if ((this.f12846b & 2) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f12848d);
        }
        if ((this.f12846b & 4) != 0) {
            return b + CodedOutputByteBufferNano.f(3, this.f12849e);
        }
        return b;
    }

    private final jz m12923b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12846b |= 1;
                    int o = aVar.o();
                    try {
                        this.f12847c = kc.m12934a(aVar.i());
                        this.f12846b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 16:
                    this.f12848d = aVar.j();
                    this.f12846b |= 2;
                    continue;
                case 24:
                    this.f12849e = aVar.j();
                    this.f12846b |= 4;
                    continue;
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
        return m12923b(aVar);
    }
}
