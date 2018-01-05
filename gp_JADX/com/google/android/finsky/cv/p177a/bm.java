package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class bm extends C0758b {
    public static volatile bm[] f11937a;
    public int f11938b;
    public long f11939c;
    public String f11940d;
    public bo f11941e;
    public bn[] f11942f;

    public static bm[] aM_() {
        if (f11937a == null) {
            synchronized (h.b) {
                if (f11937a == null) {
                    f11937a = new bm[0];
                }
            }
        }
        return f11937a;
    }

    public bm() {
        this.f11938b = 0;
        this.f11939c = 0;
        this.f11940d = "";
        this.f11941e = null;
        this.f11942f = bn.aN_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        if ((this.f11938b & 1) != (bmVar.f11938b & 1)) {
            return false;
        }
        if (this.f11939c != bmVar.f11939c) {
            return false;
        }
        if ((this.f11938b & 2) != (bmVar.f11938b & 2)) {
            return false;
        }
        if (!this.f11940d.equals(bmVar.f11940d)) {
            return false;
        }
        if (this.f11941e == null) {
            if (bmVar.f11941e != null) {
                return false;
            }
        } else if (!this.f11941e.equals(bmVar.f11941e)) {
            return false;
        }
        if (!h.a(this.f11942f, bmVar.f11942f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bmVar.aO);
        }
        if (bmVar.aO == null || bmVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f11939c;
        hashCode = (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11940d.hashCode();
        bo boVar = this.f11941e;
        hashCode = ((((boVar == null ? 0 : boVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f11942f)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11938b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f11939c);
        }
        if ((this.f11938b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11940d);
        }
        if (this.f11941e != null) {
            codedOutputByteBufferNano.b(3, this.f11941e);
        }
        if (this.f11942f != null && this.f11942f.length > 0) {
            for (C0757i c0757i : this.f11942f) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11938b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f11939c);
        }
        if ((this.f11938b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11940d);
        }
        if (this.f11941e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f11941e);
        }
        if (this.f11942f == null || this.f11942f.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f11942f) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(4, c0757i);
            }
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f11939c = aVar.j();
                    this.f11938b |= 1;
                    continue;
                case 18:
                    this.f11940d = aVar.f();
                    this.f11938b |= 2;
                    continue;
                case 26:
                    if (this.f11941e == null) {
                        this.f11941e = new bo();
                    }
                    aVar.a(this.f11941e);
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f11942f == null ? 0 : this.f11942f.length;
                    Object obj = new bn[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11942f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bn();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bn();
                    aVar.a(obj[a]);
                    this.f11942f = obj;
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
