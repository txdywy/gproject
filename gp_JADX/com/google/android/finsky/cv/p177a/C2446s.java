package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2446s extends C0758b {
    public int f13200a;
    public String f13201b;
    public String f13202c;
    public boolean f13203d;

    public C2446s() {
        this.f13200a = 0;
        this.f13201b = "";
        this.f13202c = "";
        this.f13203d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2446s)) {
            return false;
        }
        C2446s c2446s = (C2446s) obj;
        if ((this.f13200a & 1) != (c2446s.f13200a & 1)) {
            return false;
        }
        if (!this.f13201b.equals(c2446s.f13201b)) {
            return false;
        }
        if ((this.f13200a & 2) != (c2446s.f13200a & 2)) {
            return false;
        }
        if (!this.f13202c.equals(c2446s.f13202c)) {
            return false;
        }
        if ((this.f13200a & 4) != (c2446s.f13200a & 4)) {
            return false;
        }
        if (this.f13203d != c2446s.f13203d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2446s.aO);
        }
        if (c2446s.aO == null || c2446s.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f13203d ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f13201b.hashCode()) * 31) + this.f13202c.hashCode()) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13200a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13201b);
        }
        if ((this.f13200a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13202c);
        }
        if ((this.f13200a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f13203d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13200a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13201b);
        }
        if ((this.f13200a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13202c);
        }
        if ((this.f13200a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.d(3) + 1);
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
                    this.f13201b = aVar.f();
                    this.f13200a |= 1;
                    continue;
                case 18:
                    this.f13202c = aVar.f();
                    this.f13200a |= 2;
                    continue;
                case 24:
                    this.f13203d = aVar.e();
                    this.f13200a |= 4;
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
