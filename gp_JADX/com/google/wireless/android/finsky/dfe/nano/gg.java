package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gg extends b {
    public int f39085a;
    public ge[] f39086b;
    public boolean f39087c;
    public ax[] f39088d;

    public gg() {
        this.f39085a = 0;
        this.f39086b = ge.m36489d();
        this.f39087c = false;
        this.f39088d = ax.aG_();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36497a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f39086b != null && this.f39086b.length > 0) {
            for (i iVar : this.f39086b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f39085a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f39087c);
        }
        if (this.f39088d != null && this.f39088d.length > 0) {
            while (i < this.f39088d.length) {
                i iVar2 = this.f39088d[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36498b() {
        int i = 0;
        int b = super.b();
        if (this.f39086b != null && this.f39086b.length > 0) {
            int i2 = b;
            for (i iVar : this.f39086b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if ((this.f39085a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f39088d != null && this.f39088d.length > 0) {
            while (i < this.f39088d.length) {
                i iVar2 = this.f39088d[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(3, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m36496a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39086b == null ? 0 : this.f39086b.length;
                    obj = new ge[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39086b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ge();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ge();
                    c7213a.m33552a(obj[a]);
                    this.f39086b = obj;
                    continue;
                case 16:
                    this.f39087c = c7213a.m33563e();
                    this.f39085a |= 1;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f39088d == null ? 0 : this.f39088d.length;
                    obj = new ax[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39088d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ax();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ax();
                    c7213a.m33552a(obj[a]);
                    this.f39088d = obj;
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
