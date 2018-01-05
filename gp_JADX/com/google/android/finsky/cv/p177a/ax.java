package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ax extends C0758b {
    public static volatile ax[] f11832a;
    public String f11833b;
    public int f11834c;
    public int f11835d;

    public static ax[] aG_() {
        if (f11832a == null) {
            synchronized (h.b) {
                if (f11832a == null) {
                    f11832a = new ax[0];
                }
            }
        }
        return f11832a;
    }

    public ax() {
        this.f11833b = "";
        this.f11834c = 1;
        this.f11835d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        if (this.f11833b == null) {
            if (axVar.f11833b != null) {
                return false;
            }
        } else if (!this.f11833b.equals(axVar.f11833b)) {
            return false;
        }
        if (this.f11834c != axVar.f11834c) {
            return false;
        }
        if (this.f11835d != axVar.f11835d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(axVar.aO);
        }
        if (axVar.aO == null || axVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f11833b == null ? 0 : this.f11833b.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f11834c) * 31) + this.f11835d) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(1, this.f11833b);
        codedOutputByteBufferNano.a(2, this.f11834c);
        codedOutputByteBufferNano.a(3, this.f11835d);
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        return ((super.mo1128b() + CodedOutputByteBufferNano.b(1, this.f11833b)) + CodedOutputByteBufferNano.d(2, this.f11834c)) + CodedOutputByteBufferNano.d(3, this.f11835d);
    }

    private final ax m12220b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f11833b = aVar.f();
                    continue;
                case 16:
                    o = aVar.o();
                    try {
                        this.f11834c = ay.m12224a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 24:
                    o = aVar.o();
                    try {
                        this.f11835d = aw.m12218a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e2) {
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
        return m12220b(aVar);
    }
}
