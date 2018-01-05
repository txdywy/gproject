package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C2452y extends C0758b {
    public static volatile C2452y[] f13223a;
    public int f13224b;
    public bd f13225c;
    public C2427b f13226d;
    public String f13227e;

    public static C2452y[] az_() {
        if (f13223a == null) {
            synchronized (h.b) {
                if (f13223a == null) {
                    f13223a = new C2452y[0];
                }
            }
        }
        return f13223a;
    }

    public C2452y() {
        this.f13224b = 0;
        this.f13225c = null;
        this.f13226d = null;
        this.f13227e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2452y)) {
            return false;
        }
        C2452y c2452y = (C2452y) obj;
        if (this.f13225c == null) {
            if (c2452y.f13225c != null) {
                return false;
            }
        } else if (!this.f13225c.equals(c2452y.f13225c)) {
            return false;
        }
        if (this.f13226d == null) {
            if (c2452y.f13226d != null) {
                return false;
            }
        } else if (!this.f13226d.equals(c2452y.f13226d)) {
            return false;
        }
        if ((this.f13224b & 1) != (c2452y.f13224b & 1)) {
            return false;
        }
        if (!this.f13227e.equals(c2452y.f13227e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2452y.aO);
        }
        if (c2452y.aO == null || c2452y.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bd bdVar = this.f13225c;
        hashCode = (bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31);
        C2427b c2427b = this.f13226d;
        hashCode = ((((c2427b == null ? 0 : c2427b.hashCode()) + (hashCode * 31)) * 31) + this.f13227e.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13225c != null) {
            codedOutputByteBufferNano.b(1, this.f13225c);
        }
        if (this.f13226d != null) {
            codedOutputByteBufferNano.b(2, this.f13226d);
        }
        if ((this.f13224b & 1) != 0) {
            codedOutputByteBufferNano.a(3, this.f13227e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13225c != null) {
            b += CodedOutputByteBufferNano.d(1, this.f13225c);
        }
        if (this.f13226d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f13226d);
        }
        if ((this.f13224b & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f13227e);
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
                    if (this.f13225c == null) {
                        this.f13225c = new bd();
                    }
                    aVar.a(this.f13225c);
                    continue;
                case 18:
                    if (this.f13226d == null) {
                        this.f13226d = new C2427b();
                    }
                    aVar.a(this.f13226d);
                    continue;
                case 26:
                    this.f13227e = aVar.f();
                    this.f13224b |= 1;
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
