package com.google.wireless.android.finsky.dfe.p517i.p518a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7502a extends b {
    public C7505d[] f38180a;
    public C7507f[] f38181b;
    public C7506e[] f38182c;

    public C7502a() {
        this.f38180a = C7505d.m35882d();
        this.f38181b = C7507f.m35890d();
        this.f38182c = C7506e.m35886d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35873a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38180a != null && this.f38180a.length > 0) {
            for (i iVar : this.f38180a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f38181b != null && this.f38181b.length > 0) {
            for (i iVar2 : this.f38181b) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
            }
        }
        if (this.f38182c != null && this.f38182c.length > 0) {
            while (i < this.f38182c.length) {
                i iVar3 = this.f38182c[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar3);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35874b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f38180a != null && this.f38180a.length > 0) {
            i = b;
            for (i iVar : this.f38180a) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i;
        }
        if (this.f38181b != null && this.f38181b.length > 0) {
            i = b;
            for (i iVar2 : this.f38181b) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
            }
            b = i;
        }
        if (this.f38182c != null && this.f38182c.length > 0) {
            while (i2 < this.f38182c.length) {
                i iVar3 = this.f38182c[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(3, iVar3);
                }
                i2++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m35872a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38180a == null ? 0 : this.f38180a.length;
                    obj = new C7505d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38180a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7505d();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7505d();
                    c7213a.m33552a(obj[a]);
                    this.f38180a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38181b == null ? 0 : this.f38181b.length;
                    obj = new C7507f[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38181b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7507f();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7507f();
                    c7213a.m33552a(obj[a]);
                    this.f38181b = obj;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38182c == null ? 0 : this.f38182c.length;
                    obj = new C7506e[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38182c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7506e();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7506e();
                    c7213a.m33552a(obj[a]);
                    this.f38182c = obj;
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
