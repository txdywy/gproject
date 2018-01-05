package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C2428c extends C0758b {
    public ah[] f11999a;
    public cv f12000b;
    public cv[] f12001c;

    public C2428c() {
        this.f11999a = ah.aC_();
        this.f12000b = null;
        this.f12001c = cv.aS_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2428c)) {
            return false;
        }
        C2428c c2428c = (C2428c) obj;
        if (!h.a(this.f11999a, c2428c.f11999a)) {
            return false;
        }
        if (this.f12000b == null) {
            if (c2428c.f12000b != null) {
                return false;
            }
        } else if (!this.f12000b.equals(c2428c.f12000b)) {
            return false;
        }
        if (!h.a(this.f12001c, c2428c.f12001c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2428c.aO);
        }
        if (c2428c.aO == null || c2428c.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + h.a(this.f11999a);
        cv cvVar = this.f12000b;
        hashCode = ((((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f12001c)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f11999a != null && this.f11999a.length > 0) {
            for (C0757i c0757i : this.f11999a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f12000b != null) {
            codedOutputByteBufferNano.b(2, this.f12000b);
        }
        if (this.f12001c != null && this.f12001c.length > 0) {
            while (i < this.f12001c.length) {
                C0757i c0757i2 = this.f12001c[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(4, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f11999a != null && this.f11999a.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f11999a) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i2;
        }
        if (this.f12000b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12000b);
        }
        if (this.f12001c != null && this.f12001c.length > 0) {
            while (i < this.f12001c.length) {
                C0757i c0757i2 = this.f12001c[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(4, c0757i2);
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
                    a = this.f11999a == null ? 0 : this.f11999a.length;
                    obj = new ah[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11999a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ah();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ah();
                    aVar.a(obj[a]);
                    this.f11999a = obj;
                    continue;
                case 18:
                    if (this.f12000b == null) {
                        this.f12000b = new cv();
                    }
                    aVar.a(this.f12000b);
                    continue;
                case 34:
                    a2 = l.a(aVar, 34);
                    a = this.f12001c == null ? 0 : this.f12001c.length;
                    obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12001c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new cv();
                    aVar.a(obj[a]);
                    this.f12001c = obj;
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
