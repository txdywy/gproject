package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public static volatile ad[] f38018a;
    public int f38019b;
    public String f38020c;
    public ac[] f38021d;
    public String f38022e;
    public String f38023f;

    public static ad[] m35729d() {
        if (f38018a == null) {
            synchronized (C7219h.f35465b) {
                if (f38018a == null) {
                    f38018a = new ad[0];
                }
            }
        }
        return f38018a;
    }

    public ad() {
        this.f38019b = 0;
        this.f38020c = "";
        this.f38021d = ac.m35725d();
        this.f38022e = "";
        this.f38023f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35731a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38019b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38020c);
        }
        if (this.f38021d != null && this.f38021d.length > 0) {
            for (i iVar : this.f38021d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if ((this.f38019b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38022e);
        }
        if ((this.f38019b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38023f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35732b() {
        int b = super.b();
        if ((this.f38019b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38020c);
        }
        if (this.f38021d != null && this.f38021d.length > 0) {
            int i = b;
            for (i iVar : this.f38021d) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if ((this.f38019b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38022e);
        }
        if ((this.f38019b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f38023f);
        }
        return b;
    }

    public final /* synthetic */ i m35730a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38020c = c7213a.m33564f();
                    this.f38019b |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38021d == null ? 0 : this.f38021d.length;
                    Object obj = new ac[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38021d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ac();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ac();
                    c7213a.m33552a(obj[a]);
                    this.f38021d = obj;
                    continue;
                case 26:
                    this.f38022e = c7213a.m33564f();
                    this.f38019b |= 2;
                    continue;
                case 34:
                    this.f38023f = c7213a.m33564f();
                    this.f38019b |= 4;
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
