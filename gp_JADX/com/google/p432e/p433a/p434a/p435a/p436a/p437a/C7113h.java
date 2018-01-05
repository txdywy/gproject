package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p488d.p489a.p490a.C7311m;
import java.util.Arrays;

public final class C7113h extends b {
    public static volatile C7113h[] f34800a;
    public C7311m f34801b;
    public String f34802c;
    public long f34803d;
    public byte[] f34804e;

    public static C7113h[] m32316d() {
        if (f34800a == null) {
            synchronized (C7219h.f35465b) {
                if (f34800a == null) {
                    f34800a = new C7113h[0];
                }
            }
        }
        return f34800a;
    }

    public C7113h() {
        this.f34801b = null;
        this.f34802c = "";
        this.f34803d = 0;
        this.f34804e = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32318a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34801b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34801b);
        }
        if (!(this.f34802c == null || this.f34802c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34802c);
        }
        if (this.f34803d != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f34803d);
        }
        if (!Arrays.equals(this.f34804e, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(4, this.f34804e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32319b() {
        int b = super.b();
        if (this.f34801b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34801b);
        }
        if (!(this.f34802c == null || this.f34802c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34802c);
        }
        if (this.f34803d != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f34803d);
        }
        if (Arrays.equals(this.f34804e, C7222l.f35479l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33494b(4, this.f34804e);
    }

    public final /* synthetic */ i m32317a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34801b == null) {
                        this.f34801b = new C7311m();
                    }
                    c7213a.m33552a(this.f34801b);
                    continue;
                case 18:
                    this.f34802c = c7213a.m33564f();
                    continue;
                case 24:
                    this.f34803d = c7213a.m33568j();
                    continue;
                case 34:
                    this.f34804e = c7213a.m33565g();
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
