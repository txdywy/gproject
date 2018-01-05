package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class ac extends C0758b {
    public int f24109a;
    public boolean f24110b;
    public int f24111c;
    public String f24112d;
    public int f24113e;
    public byte[] f24114f;
    public int f24115g;
    public ad f24116h;
    public String f24117i;
    public int f24118j;

    public static int m21857a(int i) {
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum ErrorType");
        }
    }

    public final ac m21860a(boolean z) {
        this.f24109a |= 1;
        this.f24110b = z;
        return this;
    }

    public final ac m21865b(int i) {
        this.f24111c = i;
        this.f24109a |= 2;
        return this;
    }

    public final ac m21859a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f24109a |= 4;
        this.f24112d = str;
        return this;
    }

    public final ac m21866c(int i) {
        this.f24109a |= 8;
        this.f24113e = i;
        return this;
    }

    public final ac m21861a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.f24109a |= 16;
        this.f24114f = bArr;
        return this;
    }

    public ac() {
        this.f24109a = 0;
        this.f24110b = false;
        this.f24111c = -1;
        this.f24112d = "";
        this.f24113e = 0;
        this.f24114f = l.l;
        this.f24115g = 0;
        this.f24116h = null;
        this.f24117i = "";
        this.f24118j = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24109a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24110b);
        }
        if ((this.f24109a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24111c);
        }
        if ((this.f24109a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24112d);
        }
        if ((this.f24109a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24113e);
        }
        if ((this.f24109a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24114f);
        }
        if ((this.f24109a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f24115g);
        }
        if (this.f24116h != null) {
            codedOutputByteBufferNano.b(7, this.f24116h);
        }
        if ((this.f24109a & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f24117i);
        }
        if ((this.f24109a & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f24118j);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24109a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f24109a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f24111c);
        }
        if ((this.f24109a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f24112d);
        }
        if ((this.f24109a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f24113e);
        }
        if ((this.f24109a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f24114f);
        }
        if ((this.f24109a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f24115g);
        }
        if (this.f24116h != null) {
            b += CodedOutputByteBufferNano.d(7, this.f24116h);
        }
        if ((this.f24109a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f24117i);
        }
        if ((this.f24109a & 128) != 0) {
            return b + CodedOutputByteBufferNano.d(9, this.f24118j);
        }
        return b;
    }

    private final ac m21858b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24110b = aVar.e();
                    this.f24109a |= 1;
                    continue;
                case 16:
                    this.f24109a |= 2;
                    int o = aVar.o();
                    try {
                        this.f24111c = ac.m21857a(aVar.i());
                        this.f24109a |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 26:
                    this.f24112d = aVar.f();
                    this.f24109a |= 4;
                    continue;
                case 32:
                    this.f24113e = aVar.i();
                    this.f24109a |= 8;
                    continue;
                case 42:
                    this.f24114f = aVar.g();
                    this.f24109a |= 16;
                    continue;
                case 48:
                    this.f24115g = aVar.i();
                    this.f24109a |= 32;
                    continue;
                case 58:
                    if (this.f24116h == null) {
                        this.f24116h = new ad();
                    }
                    aVar.a(this.f24116h);
                    continue;
                case 66:
                    this.f24117i = aVar.f();
                    this.f24109a |= 64;
                    continue;
                case 72:
                    this.f24118j = aVar.i();
                    this.f24109a |= 128;
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m21858b(aVar);
    }
}
