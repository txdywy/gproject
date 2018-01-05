package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class jx extends C0758b {
    public static volatile jx[] f12836a;
    public int f12837b;
    public String f12838c;
    public int f12839d;
    public int f12840e;

    public static jx[] bC_() {
        if (f12836a == null) {
            synchronized (h.b) {
                if (f12836a == null) {
                    f12836a = new jx[0];
                }
            }
        }
        return f12836a;
    }

    public jx() {
        this.f12837b = 0;
        this.f12838c = "";
        this.f12839d = 0;
        this.f12840e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jx)) {
            return false;
        }
        jx jxVar = (jx) obj;
        if ((this.f12837b & 1) != (jxVar.f12837b & 1)) {
            return false;
        }
        if (!this.f12838c.equals(jxVar.f12838c)) {
            return false;
        }
        if ((this.f12837b & 2) != (jxVar.f12837b & 2)) {
            return false;
        }
        if (this.f12839d != jxVar.f12839d) {
            return false;
        }
        if ((this.f12837b & 4) != (jxVar.f12837b & 4)) {
            return false;
        }
        if (this.f12840e != jxVar.f12840e) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jxVar.aO);
        }
        if (jxVar.aO == null || jxVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12838c.hashCode()) * 31) + this.f12839d) * 31) + this.f12840e) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12837b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12838c);
        }
        if ((this.f12837b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12839d);
        }
        if ((this.f12837b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12840e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12837b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12838c);
        }
        if ((this.f12837b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12839d);
        }
        if ((this.f12837b & 4) != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f12840e);
        }
        return b;
    }

    private final jx m12916b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12838c = aVar.f();
                    this.f12837b |= 1;
                    continue;
                case 16:
                    this.f12837b |= 2;
                    int o = aVar.o();
                    try {
                        this.f12839d = kc.m12934a(aVar.i());
                        this.f12837b |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 24:
                    this.f12840e = aVar.i();
                    this.f12837b |= 4;
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
        return m12916b(aVar);
    }
}
