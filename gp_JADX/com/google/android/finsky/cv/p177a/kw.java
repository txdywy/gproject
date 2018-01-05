package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class kw extends C0758b {
    public static volatile kw[] f12968a;
    public int f12969b;
    public String f12970c;
    public String f12971d;
    public String f12972e;
    public String f12973f;
    public String f12974g;

    public static kw[] bJ_() {
        if (f12968a == null) {
            synchronized (h.b) {
                if (f12968a == null) {
                    f12968a = new kw[0];
                }
            }
        }
        return f12968a;
    }

    public kw() {
        this.f12969b = 0;
        this.f12970c = "";
        this.f12971d = "";
        this.f12972e = "";
        this.f12973f = "";
        this.f12974g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        if (this.f12970c == null) {
            if (kwVar.f12970c != null) {
                return false;
            }
        } else if (!this.f12970c.equals(kwVar.f12970c)) {
            return false;
        }
        if ((this.f12969b & 1) != (kwVar.f12969b & 1)) {
            return false;
        }
        if (!this.f12971d.equals(kwVar.f12971d)) {
            return false;
        }
        if ((this.f12969b & 2) != (kwVar.f12969b & 2)) {
            return false;
        }
        if (!this.f12972e.equals(kwVar.f12972e)) {
            return false;
        }
        if ((this.f12969b & 4) != (kwVar.f12969b & 4)) {
            return false;
        }
        if (!this.f12973f.equals(kwVar.f12973f)) {
            return false;
        }
        if ((this.f12969b & 8) != (kwVar.f12969b & 8)) {
            return false;
        }
        if (!this.f12974g.equals(kwVar.f12974g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kwVar.aO);
        }
        if (kwVar.aO == null || kwVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        if (this.f12970c == null) {
            i = 0;
        } else {
            i = this.f12970c.hashCode();
        }
        i = (((((((((i + hashCode) * 31) + this.f12971d.hashCode()) * 31) + this.f12972e.hashCode()) * 31) + this.f12973f.hashCode()) * 31) + this.f12974g.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return i + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(1, this.f12970c);
        if ((this.f12969b & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12971d);
        }
        if ((this.f12969b & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12972e);
        }
        if ((this.f12969b & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12973f);
        }
        if ((this.f12969b & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12974g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b() + CodedOutputByteBufferNano.b(1, this.f12970c);
        if ((this.f12969b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12971d);
        }
        if ((this.f12969b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12972e);
        }
        if ((this.f12969b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12973f);
        }
        if ((this.f12969b & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f12974g);
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
                    this.f12970c = aVar.f();
                    continue;
                case 18:
                    this.f12971d = aVar.f();
                    this.f12969b |= 1;
                    continue;
                case 26:
                    this.f12972e = aVar.f();
                    this.f12969b |= 2;
                    continue;
                case 34:
                    this.f12973f = aVar.f();
                    this.f12969b |= 4;
                    continue;
                case 42:
                    this.f12974g = aVar.f();
                    this.f12969b |= 8;
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
