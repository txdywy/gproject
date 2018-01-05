package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bt extends C0758b {
    public int f11962a;
    public long f11963b;
    public String f11964c;
    public String f11965d;
    public bz f11966e;

    public bt() {
        this.f11962a = 0;
        this.f11963b = 0;
        this.f11964c = "";
        this.f11965d = "";
        this.f11966e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bt)) {
            return false;
        }
        bt btVar = (bt) obj;
        if ((this.f11962a & 1) != (btVar.f11962a & 1)) {
            return false;
        }
        if (this.f11963b != btVar.f11963b) {
            return false;
        }
        if ((this.f11962a & 2) != (btVar.f11962a & 2)) {
            return false;
        }
        if (!this.f11964c.equals(btVar.f11964c)) {
            return false;
        }
        if ((this.f11962a & 4) != (btVar.f11962a & 4)) {
            return false;
        }
        if (!this.f11965d.equals(btVar.f11965d)) {
            return false;
        }
        if (this.f11966e == null) {
            if (btVar.f11966e != null) {
                return false;
            }
        } else if (!this.f11966e.equals(btVar.f11966e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(btVar.aO);
        }
        if (btVar.aO == null || btVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f11963b;
        hashCode = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11964c.hashCode()) * 31) + this.f11965d.hashCode();
        bz bzVar = this.f11966e;
        hashCode = ((bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11962a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f11963b);
        }
        if ((this.f11962a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11964c);
        }
        if ((this.f11962a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11965d);
        }
        if (this.f11966e != null) {
            codedOutputByteBufferNano.b(4, this.f11966e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11962a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f11963b);
        }
        if ((this.f11962a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11964c);
        }
        if ((this.f11962a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11965d);
        }
        if (this.f11966e != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f11966e);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f11963b = aVar.j();
                    this.f11962a |= 1;
                    continue;
                case 18:
                    this.f11964c = aVar.f();
                    this.f11962a |= 2;
                    continue;
                case 26:
                    this.f11965d = aVar.f();
                    this.f11962a |= 4;
                    continue;
                case 34:
                    if (this.f11966e == null) {
                        this.f11966e = new bz();
                    }
                    aVar.a(this.f11966e);
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
}
