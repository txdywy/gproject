package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class hs extends C0758b {
    public jy[] f12610a;
    public jy[] f12611b;

    public hs() {
        this.f12610a = jy.bD_();
        this.f12611b = jy.bD_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        if (!h.a(this.f12610a, hsVar.f12610a)) {
            return false;
        }
        if (!h.a(this.f12611b, hsVar.f12611b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hsVar.aO);
        }
        if (hsVar.aO == null || hsVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12610a)) * 31) + h.a(this.f12611b)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f12610a != null && this.f12610a.length > 0) {
            for (C0757i c0757i : this.f12610a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f12611b != null && this.f12611b.length > 0) {
            while (i < this.f12611b.length) {
                C0757i c0757i2 = this.f12611b[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(2, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f12610a != null && this.f12610a.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f12610a) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i2;
        }
        if (this.f12611b != null && this.f12611b.length > 0) {
            while (i < this.f12611b.length) {
                C0757i c0757i2 = this.f12611b[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(2, c0757i2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = l.a(aVar, 10);
                    a = this.f12610a == null ? 0 : this.f12610a.length;
                    obj = new jy[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12610a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jy();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new jy();
                    aVar.a(obj[a]);
                    this.f12610a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f12611b == null ? 0 : this.f12611b.length;
                    obj = new jy[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12611b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jy();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new jy();
                    aVar.a(obj[a]);
                    this.f12611b = obj;
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
