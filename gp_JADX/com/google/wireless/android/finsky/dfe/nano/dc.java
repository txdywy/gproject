package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dc extends b {
    public static volatile dc[] f38628a;
    public int f38629b;
    public String f38630c;
    public df[] f38631d;
    public byte[] f38632e;

    public static dc[] m36219d() {
        if (f38628a == null) {
            synchronized (C7219h.f35465b) {
                if (f38628a == null) {
                    f38628a = new dc[0];
                }
            }
        }
        return f38628a;
    }

    public dc() {
        this.f38629b = 0;
        this.f38630c = "";
        this.f38631d = df.m36229d();
        this.f38632e = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36221a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38629b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38630c);
        }
        if (this.f38631d != null && this.f38631d.length > 0) {
            for (i iVar : this.f38631d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if ((this.f38629b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f38632e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36222b() {
        int b = super.b();
        if ((this.f38629b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38630c);
        }
        if (this.f38631d != null && this.f38631d.length > 0) {
            int i = b;
            for (i iVar : this.f38631d) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if ((this.f38629b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(3, this.f38632e);
        }
        return b;
    }

    public final /* synthetic */ i m36220a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38630c = c7213a.m33564f();
                    this.f38629b |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38631d == null ? 0 : this.f38631d.length;
                    Object obj = new df[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38631d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new df();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new df();
                    c7213a.m33552a(obj[a]);
                    this.f38631d = obj;
                    continue;
                case 26:
                    this.f38632e = c7213a.m33565g();
                    this.f38629b |= 2;
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
