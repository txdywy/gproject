package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7304f extends b {
    public String f36248a;
    public byte[] f36249b;
    public String f36250c;
    public int f36251d;
    public int f36252e;
    public int f36253f;
    public C7305g[] f36254g;

    public C7304f() {
        this.f36248a = "";
        this.f36249b = C7222l.f35479l;
        this.f36250c = "";
        this.f36251d = 0;
        this.f36252e = 0;
        this.f36253f = 0;
        this.f36254g = C7305g.m34543d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34541a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36250c == null || this.f36250c.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36250c);
        }
        if (this.f36251d != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36251d);
        }
        if (!(this.f36248a == null || this.f36248a.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36248a);
        }
        if (this.f36252e != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f36252e);
        }
        if (this.f36253f != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f36253f);
        }
        if (this.f36254g != null && this.f36254g.length > 0) {
            for (i iVar : this.f36254g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(8, iVar);
                }
            }
        }
        if (!Arrays.equals(this.f36249b, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(9, this.f36249b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34542b() {
        int b = super.b();
        if (!(this.f36250c == null || this.f36250c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36250c);
        }
        if (this.f36251d != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36251d);
        }
        if (!(this.f36248a == null || this.f36248a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36248a);
        }
        if (this.f36252e != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f36252e);
        }
        if (this.f36253f != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f36253f);
        }
        if (this.f36254g != null && this.f36254g.length > 0) {
            int i = b;
            for (i iVar : this.f36254g) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(8, iVar);
                }
            }
            b = i;
        }
        if (Arrays.equals(this.f36249b, C7222l.f35479l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33494b(9, this.f36249b);
    }

    public final /* synthetic */ i m34540a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36250c = c7213a.m33564f();
                    continue;
                case 16:
                    this.f36251d = c7213a.m33567i();
                    continue;
                case 34:
                    this.f36248a = c7213a.m33564f();
                    continue;
                case 40:
                    this.f36252e = c7213a.m33567i();
                    continue;
                case 48:
                    this.f36253f = c7213a.m33567i();
                    continue;
                case 66:
                    int a2 = C7222l.m33624a(c7213a, 66);
                    a = this.f36254g == null ? 0 : this.f36254g.length;
                    Object obj = new C7305g[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36254g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7305g();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7305g();
                    c7213a.m33552a(obj[a]);
                    this.f36254g = obj;
                    continue;
                case 74:
                    this.f36249b = c7213a.m33565g();
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
