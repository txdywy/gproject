package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.c;

public final class C2439l extends C0758b {
    public int f12991a;
    public int f12992b;

    public static int m13007a(int i) {
        switch (i) {
            case 0:
            case 1:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum AndroidInstallReason");
        }
    }

    public C2439l() {
        this.f12991a = 0;
        this.f12992b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2439l)) {
            return false;
        }
        C2439l c2439l = (C2439l) obj;
        if ((this.f12991a & 1) != (c2439l.f12991a & 1)) {
            return false;
        }
        if (this.f12992b != c2439l.f12992b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2439l.aO);
        }
        if (c2439l.aO == null || c2439l.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f12992b) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12991a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12992b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12991a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(1, this.f12992b);
        }
        return b;
    }

    private final C2439l m13008b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12991a |= 1;
                    int o = aVar.o();
                    try {
                        this.f12992b = C2439l.m13007a(aVar.i());
                        this.f12991a |= 1;
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
        return m13008b(aVar);
    }

    static {
        c.a(C2439l.class, 1287801890);
    }
}
