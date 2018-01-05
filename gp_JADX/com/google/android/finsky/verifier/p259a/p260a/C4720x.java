package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4720x extends C0758b {
    public int f24281a;
    public String f24282b;
    public byte[][] f24283c;

    public C4720x() {
        this.f24281a = 0;
        this.f24282b = "";
        this.f24283c = l.k;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24281a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24282b);
        }
        if (this.f24283c != null && this.f24283c.length > 0) {
            for (byte[] bArr : this.f24283c) {
                if (bArr != null) {
                    codedOutputByteBufferNano.a(2, bArr);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f24281a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24282b);
        }
        if (this.f24283c == null || this.f24283c.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f24283c.length) {
            byte[] bArr = this.f24283c[i];
            if (bArr != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(bArr);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24282b = aVar.f();
                    this.f24281a |= 1;
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f24283c == null ? 0 : this.f24283c.length;
                    Object obj = new byte[(a2 + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f24283c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.g();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.g();
                    this.f24283c = obj;
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
