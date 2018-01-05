package com.google.android.finsky.verifier.p259a.p260a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C4700d extends C0758b {
    public int f24168a;
    public String f24169b;
    public int f24170c;
    public C4705i[] f24171d;
    public boolean f24172e;
    public boolean f24173f;
    public boolean f24174g;
    public boolean f24175h;
    public boolean f24176i;
    public boolean f24177j;
    public boolean f24178k;
    public C4711o[] f24179l;
    public boolean f24180m;
    public long f24181n;
    public long f24182o;
    public C4701e f24183p;

    public final C4700d m21884a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f24168a |= 1;
        this.f24169b = str;
        return this;
    }

    public final C4700d cj_() {
        this.f24168a |= 8;
        this.f24173f = true;
        return this;
    }

    public final C4700d ck_() {
        this.f24168a |= 32;
        this.f24175h = true;
        return this;
    }

    public C4700d() {
        this.f24168a = 0;
        this.f24169b = "";
        this.f24170c = 0;
        this.f24171d = C4705i.cn_();
        this.f24172e = false;
        this.f24173f = false;
        this.f24174g = false;
        this.f24175h = false;
        this.f24176i = false;
        this.f24177j = false;
        this.f24178k = false;
        this.f24179l = C4711o.cq_();
        this.f24180m = false;
        this.f24181n = 0;
        this.f24182o = 0;
        this.f24183p = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f24168a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24169b);
        }
        if ((this.f24168a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24170c);
        }
        if (this.f24171d != null && this.f24171d.length > 0) {
            for (C0757i c0757i : this.f24171d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if ((this.f24168a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f24172e);
        }
        if ((this.f24168a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f24173f);
        }
        if ((this.f24168a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f24174g);
        }
        if ((this.f24168a & 32) != 0) {
            codedOutputByteBufferNano.a(7, this.f24175h);
        }
        if ((this.f24168a & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f24176i);
        }
        if ((this.f24168a & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f24177j);
        }
        if ((this.f24168a & 256) != 0) {
            codedOutputByteBufferNano.a(10, this.f24178k);
        }
        if (this.f24179l != null && this.f24179l.length > 0) {
            while (i < this.f24179l.length) {
                C0757i c0757i2 = this.f24179l[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(11, c0757i2);
                }
                i++;
            }
        }
        if ((this.f24168a & 512) != 0) {
            codedOutputByteBufferNano.a(12, this.f24180m);
        }
        if ((this.f24168a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.b(13, this.f24181n);
        }
        if ((this.f24168a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.b(14, this.f24182o);
        }
        if (this.f24183p != null) {
            codedOutputByteBufferNano.b(15, this.f24183p);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f24168a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24169b);
        }
        if ((this.f24168a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f24170c);
        }
        if (this.f24171d != null && this.f24171d.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f24171d) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i2;
        }
        if ((this.f24168a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f24168a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if ((this.f24168a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if ((this.f24168a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if ((this.f24168a & 64) != 0) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if ((this.f24168a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(9) + 1;
        }
        if ((this.f24168a & 256) != 0) {
            b += CodedOutputByteBufferNano.d(10) + 1;
        }
        if (this.f24179l != null && this.f24179l.length > 0) {
            while (i < this.f24179l.length) {
                C0757i c0757i2 = this.f24179l[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(11, c0757i2);
                }
                i++;
            }
        }
        if ((this.f24168a & 512) != 0) {
            b += CodedOutputByteBufferNano.d(12) + 1;
        }
        if ((this.f24168a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.f(13, this.f24181n);
        }
        if ((this.f24168a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.f(14, this.f24182o);
        }
        if (this.f24183p != null) {
            return b + CodedOutputByteBufferNano.d(15, this.f24183p);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24169b = aVar.f();
                    this.f24168a |= 1;
                    continue;
                case 16:
                    this.f24170c = aVar.i();
                    this.f24168a |= 2;
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f24171d == null ? 0 : this.f24171d.length;
                    obj = new C4705i[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24171d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4705i();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4705i();
                    aVar.a(obj[a]);
                    this.f24171d = obj;
                    continue;
                case 32:
                    this.f24172e = aVar.e();
                    this.f24168a |= 4;
                    continue;
                case 40:
                    this.f24173f = aVar.e();
                    this.f24168a |= 8;
                    continue;
                case 48:
                    this.f24174g = aVar.e();
                    this.f24168a |= 16;
                    continue;
                case 56:
                    this.f24175h = aVar.e();
                    this.f24168a |= 32;
                    continue;
                case 64:
                    this.f24176i = aVar.e();
                    this.f24168a |= 64;
                    continue;
                case 72:
                    this.f24177j = aVar.e();
                    this.f24168a |= 128;
                    continue;
                case 80:
                    this.f24178k = aVar.e();
                    this.f24168a |= 256;
                    continue;
                case 90:
                    a2 = l.a(aVar, 90);
                    a = this.f24179l == null ? 0 : this.f24179l.length;
                    obj = new C4711o[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24179l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C4711o();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C4711o();
                    aVar.a(obj[a]);
                    this.f24179l = obj;
                    continue;
                case 96:
                    this.f24180m = aVar.e();
                    this.f24168a |= 512;
                    continue;
                case 104:
                    this.f24181n = aVar.j();
                    this.f24168a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 112:
                    this.f24182o = aVar.j();
                    this.f24168a |= eq.FLAG_MOVED;
                    continue;
                case 122:
                    if (this.f24183p == null) {
                        this.f24183p = new C4701e();
                    }
                    aVar.a(this.f24183p);
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
