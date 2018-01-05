package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2437j extends C0758b {
    public int f12750a;
    public String f12751b;
    public eu f12752c;

    public C2437j() {
        this.f12750a = 0;
        this.f12751b = "";
        this.f12752c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2437j)) {
            return false;
        }
        C2437j c2437j = (C2437j) obj;
        if ((this.f12750a & 1) != (c2437j.f12750a & 1)) {
            return false;
        }
        if (!this.f12751b.equals(c2437j.f12751b)) {
            return false;
        }
        if (this.f12752c == null) {
            if (c2437j.f12752c != null) {
                return false;
            }
        } else if (!this.f12752c.equals(c2437j.f12752c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2437j.aO);
        }
        if (c2437j.aO == null || c2437j.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12751b.hashCode();
        eu euVar = this.f12752c;
        hashCode = ((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12750a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12751b);
        }
        if (this.f12752c != null) {
            codedOutputByteBufferNano.b(2, this.f12752c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12750a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12751b);
        }
        if (this.f12752c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12752c);
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
                    this.f12751b = aVar.f();
                    this.f12750a |= 1;
                    continue;
                case 18:
                    if (this.f12752c == null) {
                        this.f12752c = new eu();
                    }
                    aVar.a(this.f12752c);
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
