package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fm extends b {
    public int f38985a;
    public String f38986b;
    public String f38987c;
    public byte[][] f38988d;
    public byte[] f38989e;

    public fm() {
        this.f38985a = 0;
        this.f38986b = "";
        this.f38987c = "";
        this.f38988d = C7222l.f35478k;
        this.f38989e = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36431a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38985a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38986b);
        }
        if ((this.f38985a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38987c);
        }
        if (this.f38988d != null && this.f38988d.length > 0) {
            for (byte[] bArr : this.f38988d) {
                if (bArr != null) {
                    codedOutputByteBufferNano.m33523a(3, bArr);
                }
            }
        }
        if ((this.f38985a & 4) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f38989e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36432b() {
        int i = 0;
        int b = super.b();
        if ((this.f38985a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38986b);
        }
        if ((this.f38985a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38987c);
        }
        if (this.f38988d != null && this.f38988d.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f38988d.length) {
                byte[] bArr = this.f38988d[i];
                if (bArr != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33496b(bArr);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f38985a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(4, this.f38989e);
        }
        return b;
    }

    public final /* synthetic */ i m36430a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38986b = c7213a.m33564f();
                    this.f38985a |= 1;
                    continue;
                case 18:
                    this.f38987c = c7213a.m33564f();
                    this.f38985a |= 2;
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38988d == null ? 0 : this.f38988d.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f38988d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33565g();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33565g();
                    this.f38988d = obj;
                    continue;
                case 34:
                    this.f38989e = c7213a.m33565g();
                    this.f38985a |= 4;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
