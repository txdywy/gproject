package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import d.a.a.a.a.a.bp;

public final class ar extends C0758b {
    public int f30874a;
    public bp f30875b;
    public int f30876c;

    public ar() {
        this.f30874a = 0;
        this.f30875b = null;
        this.f30876c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        if (this.f30875b == null) {
            if (arVar.f30875b != null) {
                return false;
            }
        } else if (!this.f30875b.equals(arVar.f30875b)) {
            return false;
        }
        if ((this.f30874a & 1) != (arVar.f30874a & 1)) {
            return false;
        }
        if (this.f30876c != arVar.f30876c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(arVar.aO);
        }
        if (arVar.aO == null || arVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bp bpVar = this.f30875b;
        hashCode = ((((bpVar == null ? 0 : bpVar.hashCode()) + (hashCode * 31)) * 31) + this.f30876c) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f30875b != null) {
            codedOutputByteBufferNano.b(1, this.f30875b);
        }
        if ((this.f30874a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f30876c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f30875b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f30875b);
        }
        if ((this.f30874a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f30876c);
        }
        return b;
    }

    private final ar m28601b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30875b == null) {
                        this.f30875b = new bp();
                    }
                    aVar.a(this.f30875b);
                    continue;
                case 16:
                    this.f30874a |= 1;
                    int o = aVar.o();
                    try {
                        this.f30876c = C6215z.m28692a(aVar.i());
                        this.f30874a |= 1;
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
        return m28601b(aVar);
    }
}
