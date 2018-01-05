package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class er extends C0758b {
    public int f12304a;
    public String f12305b;
    public jj f12306c;
    public int f12307d;
    public jj f12308e;

    public er() {
        this.f12304a = 0;
        this.f12305b = "";
        this.f12306c = null;
        this.f12307d = 1;
        this.f12308e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof er)) {
            return false;
        }
        er erVar = (er) obj;
        if ((this.f12304a & 1) != (erVar.f12304a & 1)) {
            return false;
        }
        if (!this.f12305b.equals(erVar.f12305b)) {
            return false;
        }
        if (this.f12306c == null) {
            if (erVar.f12306c != null) {
                return false;
            }
        } else if (!this.f12306c.equals(erVar.f12306c)) {
            return false;
        }
        if ((this.f12304a & 2) != (erVar.f12304a & 2)) {
            return false;
        }
        if (this.f12307d != erVar.f12307d) {
            return false;
        }
        if (this.f12308e == null) {
            if (erVar.f12308e != null) {
                return false;
            }
        } else if (!this.f12308e.equals(erVar.f12308e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(erVar.aO);
        }
        if (erVar.aO == null || erVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12305b.hashCode();
        jj jjVar = this.f12306c;
        hashCode = (((jjVar == null ? 0 : jjVar.hashCode()) + (hashCode * 31)) * 31) + this.f12307d;
        jjVar = this.f12308e;
        hashCode = ((jjVar == null ? 0 : jjVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12304a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12305b);
        }
        if (this.f12306c != null) {
            codedOutputByteBufferNano.b(2, this.f12306c);
        }
        if ((this.f12304a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12307d);
        }
        if (this.f12308e != null) {
            codedOutputByteBufferNano.b(4, this.f12308e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12304a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12305b);
        }
        if (this.f12306c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12306c);
        }
        if ((this.f12304a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12307d);
        }
        if (this.f12308e != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f12308e);
        }
        return b;
    }

    private final er m12533b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12305b = aVar.f();
                    this.f12304a |= 1;
                    continue;
                case 18:
                    if (this.f12306c == null) {
                        this.f12306c = new jj();
                    }
                    aVar.a(this.f12306c);
                    continue;
                case 24:
                    this.f12304a |= 2;
                    int o = aVar.o();
                    try {
                        this.f12307d = ap.m12205a(aVar.i());
                        this.f12304a |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 34:
                    if (this.f12308e == null) {
                        this.f12308e = new jj();
                    }
                    aVar.a(this.f12308e);
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
        return m12533b(aVar);
    }
}
