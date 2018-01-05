package com.google.android.finsky.installer.p208b.p209a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C3312b extends C0758b {
    public static volatile C3312b[] f17117a;
    public int f17118b;
    public int f17119c;
    public boolean f17120d;
    public C3316f f17121e;
    public boolean f17122f;
    public int f17123g;
    public int f17124h;
    public boolean f17125i;
    public int f17126j;
    public int f17127k;
    public boolean f17128l;

    public static C3312b[] ak_() {
        if (f17117a == null) {
            synchronized (h.b) {
                if (f17117a == null) {
                    f17117a = new C3312b[0];
                }
            }
        }
        return f17117a;
    }

    public C3312b() {
        this.f17118b = 0;
        this.f17119c = 1;
        this.f17120d = false;
        this.f17121e = null;
        this.f17122f = false;
        this.f17123g = 1;
        this.f17124h = 1;
        this.f17125i = false;
        this.f17126j = 125;
        this.f17127k = 1;
        this.f17128l = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f17118b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f17119c);
        }
        if ((this.f17118b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f17120d);
        }
        if (this.f17121e != null) {
            codedOutputByteBufferNano.b(3, this.f17121e);
        }
        if ((this.f17118b & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f17122f);
        }
        if ((this.f17118b & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f17123g);
        }
        if ((this.f17118b & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f17124h);
        }
        if ((this.f17118b & 32) != 0) {
            codedOutputByteBufferNano.a(7, this.f17125i);
        }
        if ((this.f17118b & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f17126j);
        }
        if ((this.f17118b & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f17127k);
        }
        if ((this.f17118b & 256) != 0) {
            codedOutputByteBufferNano.a(10, this.f17128l);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f17118b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f17119c);
        }
        if ((this.f17118b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (this.f17121e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f17121e);
        }
        if ((this.f17118b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f17118b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f17123g);
        }
        if ((this.f17118b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f17124h);
        }
        if ((this.f17118b & 32) != 0) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if ((this.f17118b & 64) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f17126j);
        }
        if ((this.f17118b & 128) != 0) {
            b += CodedOutputByteBufferNano.d(9, this.f17127k);
        }
        if ((this.f17118b & 256) != 0) {
            return b + (CodedOutputByteBufferNano.d(10) + 1);
        }
        return b;
    }

    public static C3312b m16652a(byte[] bArr) {
        return (C3312b) C0757i.m4905a(new C3312b(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f17119c = aVar.i();
                    this.f17118b |= 1;
                    continue;
                case 16:
                    this.f17120d = aVar.e();
                    this.f17118b |= 2;
                    continue;
                case 26:
                    if (this.f17121e == null) {
                        this.f17121e = new C3316f();
                    }
                    aVar.a(this.f17121e);
                    continue;
                case 32:
                    this.f17122f = aVar.e();
                    this.f17118b |= 4;
                    continue;
                case 40:
                    this.f17123g = aVar.i();
                    this.f17118b |= 8;
                    continue;
                case 48:
                    this.f17124h = aVar.i();
                    this.f17118b |= 16;
                    continue;
                case 56:
                    this.f17125i = aVar.e();
                    this.f17118b |= 32;
                    continue;
                case 64:
                    this.f17126j = aVar.i();
                    this.f17118b |= 64;
                    continue;
                case 72:
                    this.f17127k = aVar.i();
                    this.f17118b |= 128;
                    continue;
                case 80:
                    this.f17128l = aVar.e();
                    this.f17118b |= 256;
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
