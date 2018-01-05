package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bp extends b {
    public static volatile bp[] f38470a;
    public int f38471b;
    public String f38472c;
    public bn[] f38473d;

    public static bp[] m36099d() {
        if (f38470a == null) {
            synchronized (C7219h.f35465b) {
                if (f38470a == null) {
                    f38470a = new bp[0];
                }
            }
        }
        return f38470a;
    }

    public bp() {
        this.f38471b = 0;
        this.f38472c = "";
        this.f38473d = bn.m36092d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36101a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38473d != null && this.f38473d.length > 0) {
            for (i iVar : this.f38473d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38471b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38472c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36102b() {
        int b = super.b();
        if (this.f38473d != null && this.f38473d.length > 0) {
            for (i iVar : this.f38473d) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38471b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38472c);
        }
        return b;
    }

    public final /* synthetic */ i m36100a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38473d == null ? 0 : this.f38473d.length;
                    Object obj = new bn[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38473d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bn();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bn();
                    c7213a.m33552a(obj[a]);
                    this.f38473d = obj;
                    continue;
                case 18:
                    this.f38472c = c7213a.m33564f();
                    this.f38471b |= 1;
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
