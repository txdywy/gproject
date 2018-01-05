package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C2448u extends C0758b {
    public static volatile C2448u[] f13204a;
    public int f13205b;
    public String f13206c;
    public String f13207d;
    public C2449v f13208e;
    public boolean f13209f;

    public static C2448u[] ay_() {
        if (f13204a == null) {
            synchronized (h.b) {
                if (f13204a == null) {
                    f13204a = new C2448u[0];
                }
            }
        }
        return f13204a;
    }

    public C2448u() {
        this.f13205b = 0;
        this.f13206c = "";
        this.f13207d = "";
        this.f13208e = null;
        this.f13209f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2448u)) {
            return false;
        }
        C2448u c2448u = (C2448u) obj;
        if ((this.f13205b & 1) != (c2448u.f13205b & 1)) {
            return false;
        }
        if (!this.f13206c.equals(c2448u.f13206c)) {
            return false;
        }
        if ((this.f13205b & 2) != (c2448u.f13205b & 2)) {
            return false;
        }
        if (!this.f13207d.equals(c2448u.f13207d)) {
            return false;
        }
        if (this.f13208e == null) {
            if (c2448u.f13208e != null) {
                return false;
            }
        } else if (!this.f13208e.equals(c2448u.f13208e)) {
            return false;
        }
        if ((this.f13205b & 4) != (c2448u.f13205b & 4)) {
            return false;
        }
        if (this.f13209f != c2448u.f13209f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2448u.aO);
        }
        if (c2448u.aO == null || c2448u.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f13206c.hashCode()) * 31) + this.f13207d.hashCode();
        C2449v c2449v = this.f13208e;
        hashCode = ((this.f13209f ? 1231 : 1237) + (((c2449v == null ? 0 : c2449v.hashCode()) + (hashCode * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13205b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13206c);
        }
        if ((this.f13205b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13207d);
        }
        if (this.f13208e != null) {
            codedOutputByteBufferNano.b(3, this.f13208e);
        }
        if ((this.f13205b & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f13209f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13205b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13206c);
        }
        if ((this.f13205b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13207d);
        }
        if (this.f13208e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f13208e);
        }
        if ((this.f13205b & 4) != 0) {
            return b + (CodedOutputByteBufferNano.d(4) + 1);
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
                    this.f13206c = aVar.f();
                    this.f13205b |= 1;
                    continue;
                case 18:
                    this.f13207d = aVar.f();
                    this.f13205b |= 2;
                    continue;
                case 26:
                    if (this.f13208e == null) {
                        this.f13208e = new C2449v();
                    }
                    aVar.a(this.f13208e);
                    continue;
                case 32:
                    this.f13209f = aVar.e();
                    this.f13205b |= 4;
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
