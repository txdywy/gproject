package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class cv extends b {
    public C7367w[] f38608a;
    public String[] f38609b;

    public cv() {
        this.f38608a = C7367w.m34905d();
        this.f38609b = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36202a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38608a != null && this.f38608a.length > 0) {
            for (i iVar : this.f38608a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f38609b != null && this.f38609b.length > 0) {
            while (i < this.f38609b.length) {
                String str = this.f38609b[i];
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(2, str);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36203b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f38608a != null && this.f38608a.length > 0) {
            i = b;
            for (i iVar : this.f38608a) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i;
        }
        if (this.f38609b == null || this.f38609b.length <= 0) {
            return b;
        }
        i = 0;
        int i3 = 0;
        while (i2 < this.f38609b.length) {
            String str = this.f38609b[i2];
            if (str != null) {
                i3++;
                i += CodedOutputByteBufferNano.m33495b(str);
            }
            i2++;
        }
        return (b + i) + (i3 * 1);
    }

    public final /* synthetic */ i m36201a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38608a == null ? 0 : this.f38608a.length;
                    obj = new C7367w[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38608a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7367w();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7367w();
                    c7213a.m33552a(obj[a]);
                    this.f38608a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38609b == null ? 0 : this.f38609b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38609b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38609b = obj;
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
