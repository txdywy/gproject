package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dm extends b {
    public int f38662a;
    public String f38663b;
    public av[] f38664c;
    public byte[] f38665d;
    public int f38666e;

    public dm() {
        this.f38662a = 0;
        this.f38663b = "";
        this.f38664c = av.m36035d();
        this.f38665d = C7222l.f35479l;
        this.f38666e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36260a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38662a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38663b);
        }
        if (this.f38664c != null && this.f38664c.length > 0) {
            for (i iVar : this.f38664c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if ((this.f38662a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f38665d);
        }
        if ((this.f38662a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38666e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36261b() {
        int b = super.b();
        if ((this.f38662a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38663b);
        }
        if (this.f38664c != null && this.f38664c.length > 0) {
            int i = b;
            for (i iVar : this.f38664c) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if ((this.f38662a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f38665d);
        }
        if ((this.f38662a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f38666e);
        }
        return b;
    }

    public final /* synthetic */ i m36259a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38663b = c7213a.m33564f();
                    this.f38662a |= 1;
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38664c == null ? 0 : this.f38664c.length;
                    Object obj = new av[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38664c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new av();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new av();
                    c7213a.m33552a(obj[a]);
                    this.f38664c = obj;
                    continue;
                case 26:
                    this.f38665d = c7213a.m33565g();
                    this.f38662a |= 2;
                    continue;
                case 32:
                    this.f38666e = c7213a.m33567i();
                    this.f38662a |= 4;
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
