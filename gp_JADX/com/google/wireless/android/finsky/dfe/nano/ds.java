package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ds extends b {
    public int f38682a;
    public String f38683b;
    public String f38684c;
    public bd f38685d;
    public String f38686e;
    public cv[] f38687f;

    public ds() {
        this.f38682a = 0;
        this.f38683b = "";
        this.f38684c = "";
        this.f38685d = null;
        this.f38686e = "";
        this.f38687f = cv.aS_();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36278a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38682a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38683b);
        }
        if ((this.f38682a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38684c);
        }
        if (this.f38685d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38685d);
        }
        if ((this.f38682a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38686e);
        }
        if (this.f38687f != null && this.f38687f.length > 0) {
            for (i iVar : this.f38687f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36279b() {
        int b = super.b();
        if ((this.f38682a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38683b);
        }
        if ((this.f38682a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38684c);
        }
        if (this.f38685d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38685d);
        }
        if ((this.f38682a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38686e);
        }
        if (this.f38687f == null || this.f38687f.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f38687f) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(5, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m36277a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38683b = c7213a.m33564f();
                    this.f38682a |= 1;
                    continue;
                case 18:
                    this.f38684c = c7213a.m33564f();
                    this.f38682a |= 2;
                    continue;
                case 26:
                    if (this.f38685d == null) {
                        this.f38685d = new bd();
                    }
                    c7213a.m33552a(this.f38685d);
                    continue;
                case 34:
                    this.f38686e = c7213a.m33564f();
                    this.f38682a |= 4;
                    continue;
                case 42:
                    int a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f38687f == null ? 0 : this.f38687f.length;
                    Object obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38687f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cv();
                    c7213a.m33552a(obj[a]);
                    this.f38687f = obj;
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
