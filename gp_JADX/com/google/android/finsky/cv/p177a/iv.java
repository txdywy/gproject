package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class iv extends C0758b {
    public static volatile iv[] f12734a;
    public int f12735b;
    public String f12736c;
    public String f12737d;
    public int f12738e;
    public long f12739f;

    public static iv[] bt_() {
        if (f12734a == null) {
            synchronized (h.b) {
                if (f12734a == null) {
                    f12734a = new iv[0];
                }
            }
        }
        return f12734a;
    }

    public iv() {
        this.f12735b = 0;
        this.f12736c = "";
        this.f12737d = "";
        this.f12738e = 0;
        this.f12739f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return false;
        }
        iv ivVar = (iv) obj;
        if ((this.f12735b & 1) != (ivVar.f12735b & 1)) {
            return false;
        }
        if (!this.f12736c.equals(ivVar.f12736c)) {
            return false;
        }
        if ((this.f12735b & 2) != (ivVar.f12735b & 2)) {
            return false;
        }
        if (!this.f12737d.equals(ivVar.f12737d)) {
            return false;
        }
        if ((this.f12735b & 4) != (ivVar.f12735b & 4)) {
            return false;
        }
        if (this.f12738e != ivVar.f12738e) {
            return false;
        }
        if ((this.f12735b & 8) != (ivVar.f12735b & 8)) {
            return false;
        }
        if (this.f12739f != ivVar.f12739f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ivVar.aO);
        }
        if (ivVar.aO == null || ivVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f12736c.hashCode()) * 31) + this.f12737d.hashCode()) * 31) + this.f12738e;
        long j = this.f12739f;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12735b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12736c);
        }
        if ((this.f12735b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12737d);
        }
        if ((this.f12735b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12738e);
        }
        if ((this.f12735b & 8) != 0) {
            codedOutputByteBufferNano.b(4, this.f12739f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12735b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12736c);
        }
        if ((this.f12735b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12737d);
        }
        if ((this.f12735b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12738e);
        }
        if ((this.f12735b & 8) != 0) {
            return b + CodedOutputByteBufferNano.f(4, this.f12739f);
        }
        return b;
    }

    private final iv m12830b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12736c = aVar.f();
                    this.f12735b |= 1;
                    continue;
                case 18:
                    this.f12737d = aVar.f();
                    this.f12735b |= 2;
                    continue;
                case 24:
                    this.f12735b |= 4;
                    int o = aVar.o();
                    try {
                        this.f12738e = br.m12295a(aVar.i());
                        this.f12735b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 32:
                    this.f12739f = aVar.j();
                    this.f12735b |= 8;
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
        return m12830b(aVar);
    }
}
