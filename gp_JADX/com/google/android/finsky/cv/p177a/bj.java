package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class bj extends C0758b {
    public int f11896a;
    public long[] f11897b;
    public String f11898c;
    public bc f11899d;
    public long f11900e;
    public String f11901f;

    public bj() {
        this.f11896a = 0;
        this.f11897b = l.f;
        this.f11898c = "";
        this.f11899d = null;
        this.f11900e = 0;
        this.f11901f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        if (!h.a(this.f11897b, bjVar.f11897b)) {
            return false;
        }
        if ((this.f11896a & 1) != (bjVar.f11896a & 1)) {
            return false;
        }
        if (!this.f11898c.equals(bjVar.f11898c)) {
            return false;
        }
        if (this.f11899d == null) {
            if (bjVar.f11899d != null) {
                return false;
            }
        } else if (!this.f11899d.equals(bjVar.f11899d)) {
            return false;
        }
        if ((this.f11896a & 2) != (bjVar.f11896a & 2)) {
            return false;
        }
        if (this.f11900e != bjVar.f11900e) {
            return false;
        }
        if ((this.f11896a & 4) != (bjVar.f11896a & 4)) {
            return false;
        }
        if (!this.f11901f.equals(bjVar.f11901f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bjVar.aO);
        }
        if (bjVar.aO == null || bjVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f11897b)) * 31) + this.f11898c.hashCode();
        bc bcVar = this.f11899d;
        hashCode = (bcVar == null ? 0 : bcVar.hashCode()) + (hashCode * 31);
        long j = this.f11900e;
        hashCode = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11901f.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11897b != null && this.f11897b.length > 0) {
            for (long c : this.f11897b) {
                codedOutputByteBufferNano.c(1, c);
            }
        }
        if ((this.f11896a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f11898c);
        }
        if (this.f11899d != null) {
            codedOutputByteBufferNano.b(3, this.f11899d);
        }
        if ((this.f11896a & 2) != 0) {
            codedOutputByteBufferNano.c(4, this.f11900e);
        }
        if ((this.f11896a & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f11901f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11897b != null && this.f11897b.length > 0) {
            b = (b + (this.f11897b.length * 8)) + (this.f11897b.length * 1);
        }
        if ((this.f11896a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11898c);
        }
        if (this.f11899d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f11899d);
        }
        if ((this.f11896a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 8;
        }
        if ((this.f11896a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f11901f);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 9:
                    a2 = l.a(aVar, 9);
                    if (this.f11897b == null) {
                        a = 0;
                    } else {
                        a = this.f11897b.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11897b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.l();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.l();
                    this.f11897b = obj;
                    continue;
                case 10:
                    a = aVar.i();
                    a2 = aVar.c(a);
                    int i = a / 8;
                    a = this.f11897b == null ? 0 : this.f11897b.length;
                    Object obj2 = new long[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11897b, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = aVar.l();
                        a++;
                    }
                    this.f11897b = obj2;
                    aVar.d(a2);
                    continue;
                case 18:
                    this.f11898c = aVar.f();
                    this.f11896a |= 1;
                    continue;
                case 26:
                    if (this.f11899d == null) {
                        this.f11899d = new bc();
                    }
                    aVar.a(this.f11899d);
                    continue;
                case 33:
                    this.f11900e = aVar.l();
                    this.f11896a |= 2;
                    continue;
                case 42:
                    this.f11901f = aVar.f();
                    this.f11896a |= 4;
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
