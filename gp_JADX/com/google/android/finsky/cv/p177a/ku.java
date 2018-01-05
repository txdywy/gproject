package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ku extends C0758b {
    public int f12962a;
    public jj f12963b;
    public int f12964c;

    public ku() {
        this.f12962a = 0;
        this.f12963b = null;
        this.f12964c = 1;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        if (this.f12963b == null) {
            if (kuVar.f12963b != null) {
                return false;
            }
        } else if (!this.f12963b.equals(kuVar.f12963b)) {
            return false;
        }
        if ((this.f12962a & 1) != (kuVar.f12962a & 1)) {
            return false;
        }
        if (this.f12964c != kuVar.f12964c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kuVar.aO);
        }
        if (kuVar.aO == null || kuVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        jj jjVar = this.f12963b;
        hashCode = ((((jjVar == null ? 0 : jjVar.hashCode()) + (hashCode * 31)) * 31) + this.f12964c) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12963b != null) {
            codedOutputByteBufferNano.b(1, this.f12963b);
        }
        if ((this.f12962a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12964c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12963b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12963b);
        }
        if ((this.f12962a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f12964c);
        }
        return b;
    }

    private final ku m12988b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f12963b == null) {
                        this.f12963b = new jj();
                    }
                    aVar.a(this.f12963b);
                    continue;
                case 16:
                    this.f12962a |= 1;
                    int o = aVar.o();
                    try {
                        this.f12964c = ap.m12205a(aVar.i());
                        this.f12962a |= 1;
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
        return m12988b(aVar);
    }
}
