package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class gk extends C0758b {
    public static volatile gk[] f12454a;
    public int f12455b;
    public String f12456c;
    public int f12457d;

    public static gk[] be_() {
        if (f12454a == null) {
            synchronized (h.b) {
                if (f12454a == null) {
                    f12454a = new gk[0];
                }
            }
        }
        return f12454a;
    }

    public gk() {
        this.f12455b = 0;
        this.f12456c = "";
        this.f12457d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        if ((this.f12455b & 1) != (gkVar.f12455b & 1)) {
            return false;
        }
        if (!this.f12456c.equals(gkVar.f12456c)) {
            return false;
        }
        if ((this.f12455b & 2) != (gkVar.f12455b & 2)) {
            return false;
        }
        if (this.f12457d != gkVar.f12457d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gkVar.aO);
        }
        if (gkVar.aO == null || gkVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12456c.hashCode()) * 31) + this.f12457d) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12455b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12456c);
        }
        if ((this.f12455b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12457d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12455b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12456c);
        }
        if ((this.f12455b & 2) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f12457d);
        }
        return b;
    }

    private final gk m12650b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12456c = aVar.f();
                    this.f12455b |= 1;
                    continue;
                case 16:
                    this.f12455b |= 2;
                    int o = aVar.o();
                    try {
                        this.f12457d = gj.m12649a(aVar.i());
                        this.f12455b |= 2;
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
        return m12650b(aVar);
    }
}
