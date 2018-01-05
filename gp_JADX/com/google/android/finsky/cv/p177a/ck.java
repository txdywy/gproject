package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ck extends C0758b {
    public int f12042a;
    public String f12043b;
    public String f12044c;

    public ck() {
        this.f12042a = 0;
        this.f12043b = "";
        this.f12044c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        if ((this.f12042a & 1) != (ckVar.f12042a & 1)) {
            return false;
        }
        if (!this.f12043b.equals(ckVar.f12043b)) {
            return false;
        }
        if ((this.f12042a & 2) != (ckVar.f12042a & 2)) {
            return false;
        }
        if (!this.f12044c.equals(ckVar.f12044c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ckVar.aO);
        }
        if (ckVar.aO == null || ckVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12043b.hashCode()) * 31) + this.f12044c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12042a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12043b);
        }
        if ((this.f12042a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12044c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12042a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12043b);
        }
        if ((this.f12042a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12044c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12043b = aVar.f();
                    this.f12042a |= 1;
                    continue;
                case 18:
                    this.f12044c = aVar.f();
                    this.f12042a |= 2;
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
