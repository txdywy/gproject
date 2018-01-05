package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ln extends C0758b {
    public int f13026a;
    public boolean f13027b;
    public String f13028c;
    public String f13029d;
    public String f13030e;
    public ax[] f13031f;

    public ln() {
        this.f13026a = 0;
        this.f13027b = false;
        this.f13028c = "";
        this.f13029d = "";
        this.f13030e = "";
        this.f13031f = ax.aG_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        if ((this.f13026a & 1) != (lnVar.f13026a & 1)) {
            return false;
        }
        if (this.f13027b != lnVar.f13027b) {
            return false;
        }
        if ((this.f13026a & 2) != (lnVar.f13026a & 2)) {
            return false;
        }
        if (!this.f13028c.equals(lnVar.f13028c)) {
            return false;
        }
        if ((this.f13026a & 4) != (lnVar.f13026a & 4)) {
            return false;
        }
        if (!this.f13029d.equals(lnVar.f13029d)) {
            return false;
        }
        if ((this.f13026a & 8) != (lnVar.f13026a & 8)) {
            return false;
        }
        if (!this.f13030e.equals(lnVar.f13030e)) {
            return false;
        }
        if (!h.a(this.f13031f, lnVar.f13031f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lnVar.aO);
        }
        if (lnVar.aO == null || lnVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((((this.f13027b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f13028c.hashCode()) * 31) + this.f13029d.hashCode()) * 31) + this.f13030e.hashCode()) * 31) + h.a(this.f13031f)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13026a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13027b);
        }
        if ((this.f13026a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13028c);
        }
        if ((this.f13026a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f13029d);
        }
        if ((this.f13026a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f13030e);
        }
        if (this.f13031f != null && this.f13031f.length > 0) {
            for (C0757i c0757i : this.f13031f) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(5, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13026a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f13026a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13028c);
        }
        if ((this.f13026a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f13029d);
        }
        if ((this.f13026a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f13030e);
        }
        if (this.f13031f == null || this.f13031f.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f13031f) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(5, c0757i);
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
                    this.f13027b = aVar.e();
                    this.f13026a |= 1;
                    continue;
                case 18:
                    this.f13028c = aVar.f();
                    this.f13026a |= 2;
                    continue;
                case 26:
                    this.f13029d = aVar.f();
                    this.f13026a |= 4;
                    continue;
                case 34:
                    this.f13030e = aVar.f();
                    this.f13026a |= 8;
                    continue;
                case 42:
                    int a2 = l.a(aVar, 42);
                    a = this.f13031f == null ? 0 : this.f13031f.length;
                    Object obj = new ax[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13031f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ax();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ax();
                    aVar.a(obj[a]);
                    this.f13031f = obj;
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
