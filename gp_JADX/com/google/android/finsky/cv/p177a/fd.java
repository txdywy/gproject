package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class fd extends C0758b {
    public int f12354a;
    public iw[] f12355b;
    public int f12356c;
    public String f12357d;
    public String f12358e;

    public fd() {
        this.f12354a = 0;
        this.f12355b = iw.bu_();
        this.f12356c = 0;
        this.f12357d = "";
        this.f12358e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        if (!h.a(this.f12355b, fdVar.f12355b)) {
            return false;
        }
        if ((this.f12354a & 1) != (fdVar.f12354a & 1)) {
            return false;
        }
        if (this.f12356c != fdVar.f12356c) {
            return false;
        }
        if ((this.f12354a & 2) != (fdVar.f12354a & 2)) {
            return false;
        }
        if (!this.f12357d.equals(fdVar.f12357d)) {
            return false;
        }
        if ((this.f12354a & 4) != (fdVar.f12354a & 4)) {
            return false;
        }
        if (!this.f12358e.equals(fdVar.f12358e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fdVar.aO);
        }
        if (fdVar.aO == null || fdVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12355b)) * 31) + this.f12356c) * 31) + this.f12357d.hashCode()) * 31) + this.f12358e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12355b != null && this.f12355b.length > 0) {
            for (C0757i c0757i : this.f12355b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f12354a & 1) != 0) {
            codedOutputByteBufferNano.c(2, this.f12356c);
        }
        if ((this.f12354a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12357d);
        }
        if ((this.f12354a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12358e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12355b != null && this.f12355b.length > 0) {
            for (C0757i c0757i : this.f12355b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f12354a & 1) != 0) {
            b += CodedOutputByteBufferNano.e(2, this.f12356c);
        }
        if ((this.f12354a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12357d);
        }
        if ((this.f12354a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12358e);
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
                    int a2 = l.a(aVar, 10);
                    a = this.f12355b == null ? 0 : this.f12355b.length;
                    Object obj = new iw[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12355b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new iw();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new iw();
                    aVar.a(obj[a]);
                    this.f12355b = obj;
                    continue;
                case 16:
                    this.f12356c = aVar.i();
                    this.f12354a |= 1;
                    continue;
                case 26:
                    this.f12357d = aVar.f();
                    this.f12354a |= 2;
                    continue;
                case 34:
                    this.f12358e = aVar.f();
                    this.f12354a |= 4;
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
