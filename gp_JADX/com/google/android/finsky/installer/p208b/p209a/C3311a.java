package com.google.android.finsky.installer.p208b.p209a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C3311a extends C0758b {
    public int f17112a;
    public long f17113b;
    public long f17114c;
    public int f17115d;
    public String[] f17116e;

    public final C3311a m16647a(long j) {
        this.f17112a |= 1;
        this.f17113b = j;
        return this;
    }

    public final C3311a m16651b(long j) {
        this.f17112a |= 2;
        this.f17114c = j;
        return this;
    }

    public final C3311a m16646a(int i) {
        this.f17112a |= 4;
        this.f17115d = i;
        return this;
    }

    public C3311a() {
        this.f17112a = 0;
        this.f17113b = 0;
        this.f17114c = 0;
        this.f17115d = 0;
        this.f17116e = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f17112a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f17113b);
        }
        if ((this.f17112a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f17114c);
        }
        if ((this.f17112a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f17115d);
        }
        if (this.f17116e != null && this.f17116e.length > 0) {
            for (String str : this.f17116e) {
                if (str != null) {
                    codedOutputByteBufferNano.a(4, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f17112a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f17113b);
        }
        if ((this.f17112a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f17114c);
        }
        if ((this.f17112a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f17115d);
        }
        if (this.f17116e == null || this.f17116e.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f17116e.length) {
            String str = this.f17116e[i];
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
                case 8:
                    this.f17113b = aVar.j();
                    this.f17112a |= 1;
                    continue;
                case 16:
                    this.f17114c = aVar.j();
                    this.f17112a |= 2;
                    continue;
                case 24:
                    this.f17115d = aVar.i();
                    this.f17112a |= 4;
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f17116e == null ? 0 : this.f17116e.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f17116e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f17116e = obj;
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
