package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class fa extends C0758b {
    public int f12347a;
    public String f12348b;
    public String f12349c;
    public String f12350d;
    public ez[] f12351e;

    public fa() {
        this.f12347a = 0;
        this.f12348b = "";
        this.f12349c = "";
        this.f12350d = "";
        this.f12351e = ez.ba_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        if ((this.f12347a & 1) != (faVar.f12347a & 1)) {
            return false;
        }
        if (!this.f12348b.equals(faVar.f12348b)) {
            return false;
        }
        if ((this.f12347a & 2) != (faVar.f12347a & 2)) {
            return false;
        }
        if (!this.f12349c.equals(faVar.f12349c)) {
            return false;
        }
        if ((this.f12347a & 4) != (faVar.f12347a & 4)) {
            return false;
        }
        if (!this.f12350d.equals(faVar.f12350d)) {
            return false;
        }
        if (!h.a(this.f12351e, faVar.f12351e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(faVar.aO);
        }
        if (faVar.aO == null || faVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f12348b.hashCode()) * 31) + this.f12349c.hashCode()) * 31) + this.f12350d.hashCode()) * 31) + h.a(this.f12351e)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12347a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12348b);
        }
        if ((this.f12347a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12349c);
        }
        if (this.f12351e != null && this.f12351e.length > 0) {
            for (C0757i c0757i : this.f12351e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if ((this.f12347a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12350d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12347a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12348b);
        }
        if ((this.f12347a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12349c);
        }
        if (this.f12351e != null && this.f12351e.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12351e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if ((this.f12347a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12350d);
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
                    this.f12348b = aVar.f();
                    this.f12347a |= 1;
                    continue;
                case 18:
                    this.f12349c = aVar.f();
                    this.f12347a |= 2;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f12351e == null ? 0 : this.f12351e.length;
                    Object obj = new ez[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12351e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ez();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ez();
                    aVar.a(obj[a]);
                    this.f12351e = obj;
                    continue;
                case 34:
                    this.f12350d = aVar.f();
                    this.f12347a |= 4;
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
