package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4722z extends C0758b {
    public int f24291a;
    public String f24292b;
    public long f24293c;
    public byte[] f24294d;
    public boolean f24295e;
    public boolean f24296f;
    public String[] f24297g;

    public final C4722z m21967a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f24291a |= 1;
        this.f24292b = str;
        return this;
    }

    public final C4722z m21966a(long j) {
        this.f24291a |= 2;
        this.f24293c = j;
        return this;
    }

    public final C4722z m21969a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.f24291a |= 4;
        this.f24294d = bArr;
        return this;
    }

    public final C4722z m21968a(boolean z) {
        this.f24291a |= 8;
        this.f24295e = z;
        return this;
    }

    public final C4722z m21973b(boolean z) {
        this.f24291a |= 16;
        this.f24296f = z;
        return this;
    }

    public C4722z() {
        this.f24291a = 0;
        this.f24292b = "";
        this.f24293c = 0;
        this.f24294d = l.l;
        this.f24295e = false;
        this.f24296f = false;
        this.f24297g = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24291a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24292b);
        }
        if ((this.f24291a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24293c);
        }
        if ((this.f24291a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24294d);
        }
        if ((this.f24291a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24295e);
        }
        if ((this.f24291a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24296f);
        }
        if (this.f24297g != null && this.f24297g.length > 0) {
            for (String str : this.f24297g) {
                if (str != null) {
                    codedOutputByteBufferNano.a(6, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f24291a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24292b);
        }
        if ((this.f24291a & 2) != 0) {
            b += CodedOutputByteBufferNano.e(2, this.f24293c);
        }
        if ((this.f24291a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f24294d);
        }
        if ((this.f24291a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f24291a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if (this.f24297g == null || this.f24297g.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f24297g.length) {
            String str = this.f24297g[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(str);
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
                    this.f24292b = aVar.f();
                    this.f24291a |= 1;
                    continue;
                case 16:
                    this.f24293c = aVar.j();
                    this.f24291a |= 2;
                    continue;
                case 26:
                    this.f24294d = aVar.g();
                    this.f24291a |= 4;
                    continue;
                case 32:
                    this.f24295e = aVar.e();
                    this.f24291a |= 8;
                    continue;
                case 40:
                    this.f24296f = aVar.e();
                    this.f24291a |= 16;
                    continue;
                case 50:
                    int a2 = l.a(aVar, 50);
                    a = this.f24297g == null ? 0 : this.f24297g.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24297g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f24297g = obj;
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
