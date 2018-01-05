package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class da extends C0758b {
    public int f12129a;
    public String f12130b;
    public String f12131c;
    public String f12132d;
    public String f12133e;
    public String f12134f;
    public lr[] f12135g;

    public da() {
        this.f12129a = 0;
        this.f12130b = "";
        this.f12131c = "";
        this.f12132d = "";
        this.f12133e = "";
        this.f12134f = "";
        this.f12135g = lr.bP_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        if ((this.f12129a & 1) != (daVar.f12129a & 1)) {
            return false;
        }
        if (!this.f12130b.equals(daVar.f12130b)) {
            return false;
        }
        if ((this.f12129a & 2) != (daVar.f12129a & 2)) {
            return false;
        }
        if (!this.f12131c.equals(daVar.f12131c)) {
            return false;
        }
        if ((this.f12129a & 4) != (daVar.f12129a & 4)) {
            return false;
        }
        if (!this.f12132d.equals(daVar.f12132d)) {
            return false;
        }
        if ((this.f12129a & 8) != (daVar.f12129a & 8)) {
            return false;
        }
        if (!this.f12133e.equals(daVar.f12133e)) {
            return false;
        }
        if ((this.f12129a & 16) != (daVar.f12129a & 16)) {
            return false;
        }
        if (!this.f12134f.equals(daVar.f12134f)) {
            return false;
        }
        if (!h.a(this.f12135g, daVar.f12135g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(daVar.aO);
        }
        if (daVar.aO == null || daVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12130b.hashCode()) * 31) + this.f12131c.hashCode()) * 31) + this.f12132d.hashCode()) * 31) + this.f12133e.hashCode()) * 31) + this.f12134f.hashCode()) * 31) + h.a(this.f12135g)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12129a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12130b);
        }
        if ((this.f12129a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12131c);
        }
        if ((this.f12129a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12132d);
        }
        if ((this.f12129a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12133e);
        }
        if ((this.f12129a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12134f);
        }
        if (this.f12135g != null && this.f12135g.length > 0) {
            for (C0757i c0757i : this.f12135g) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(6, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12129a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12130b);
        }
        if ((this.f12129a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12131c);
        }
        if ((this.f12129a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12132d);
        }
        if ((this.f12129a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12133e);
        }
        if ((this.f12129a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12134f);
        }
        if (this.f12135g == null || this.f12135g.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12135g) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(6, c0757i);
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
                case 10:
                    this.f12130b = aVar.f();
                    this.f12129a |= 1;
                    continue;
                case 18:
                    this.f12131c = aVar.f();
                    this.f12129a |= 2;
                    continue;
                case 26:
                    this.f12132d = aVar.f();
                    this.f12129a |= 4;
                    continue;
                case 34:
                    this.f12133e = aVar.f();
                    this.f12129a |= 8;
                    continue;
                case 42:
                    this.f12134f = aVar.f();
                    this.f12129a |= 16;
                    continue;
                case 50:
                    int a2 = l.a(aVar, 50);
                    a = this.f12135g == null ? 0 : this.f12135g.length;
                    Object obj = new lr[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12135g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lr();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lr();
                    aVar.a(obj[a]);
                    this.f12135g = obj;
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
