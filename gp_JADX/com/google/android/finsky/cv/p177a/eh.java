package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.c;

public final class eh extends C0758b {
    public int f12276a;
    public int f12277b;
    public long f12278c;
    public bc f12279d;

    public eh() {
        this.f12276a = 0;
        this.f12277b = 1;
        this.f12278c = 0;
        this.f12279d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        if ((this.f12276a & 1) != (ehVar.f12276a & 1)) {
            return false;
        }
        if (this.f12277b != ehVar.f12277b) {
            return false;
        }
        if ((this.f12276a & 2) != (ehVar.f12276a & 2)) {
            return false;
        }
        if (this.f12278c != ehVar.f12278c) {
            return false;
        }
        if (this.f12279d == null) {
            if (ehVar.f12279d != null) {
                return false;
            }
        } else if (!this.f12279d.equals(ehVar.f12279d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ehVar.aO);
        }
        if (ehVar.aO == null || ehVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12277b;
        long j = this.f12278c;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        bc bcVar = this.f12279d;
        hashCode = ((bcVar == null ? 0 : bcVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12276a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12277b);
        }
        if ((this.f12276a & 2) != 0) {
            codedOutputByteBufferNano.c(2, this.f12278c);
        }
        if (this.f12279d != null) {
            codedOutputByteBufferNano.b(3, this.f12279d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12276a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12277b);
        }
        if ((this.f12276a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 8;
        }
        if (this.f12279d != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f12279d);
        }
        return b;
    }

    private final eh m12506b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12276a |= 1;
                    int o = aVar.o();
                    try {
                        this.f12277b = bp.m12290a(aVar.i());
                        this.f12276a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 17:
                    this.f12278c = aVar.l();
                    this.f12276a |= 2;
                    continue;
                case 26:
                    if (this.f12279d == null) {
                        this.f12279d = new bc();
                    }
                    aVar.a(this.f12279d);
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
        return m12506b(aVar);
    }

    static {
        c.a(eh.class, 1151047770);
    }
}
