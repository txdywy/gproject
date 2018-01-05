package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.cv.a.lk;
import com.google.android.finsky.cv.a.ll;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;

public final class by extends b {
    public int f38504a;
    public ch f38505b;
    public cv f38506c;
    public lk[] f38507d;
    public ll f38508e;
    public String f38509f;
    public byte[] f38510g;
    public cc[] f38511h;
    public boolean f38512i;
    public String f38513j;
    public String f38514k;
    public String f38515l;
    public bz f38516m;
    public cb f38517n;
    public iu f38518o;
    public iu f38519p;

    public by() {
        this.f38504a = 0;
        this.f38505b = null;
        this.f38506c = null;
        this.f38507d = lk.bN_();
        this.f38508e = null;
        this.f38509f = "";
        this.f38510g = C7222l.f35479l;
        this.f38511h = cc.m36140d();
        this.f38512i = true;
        this.f38513j = "";
        this.f38514k = "";
        this.f38515l = "";
        this.f38516m = null;
        this.f38517n = null;
        this.f38518o = null;
        this.f38519p = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36128a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38505b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38505b);
        }
        if (this.f38518o != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38518o);
        }
        if (this.f38506c != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38506c);
        }
        if ((this.f38504a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38509f);
        }
        if ((this.f38504a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(6, this.f38510g);
        }
        if (this.f38511h != null && this.f38511h.length > 0) {
            for (i iVar : this.f38511h) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar);
                }
            }
        }
        if ((this.f38504a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f38512i);
        }
        if (this.f38507d != null && this.f38507d.length > 0) {
            while (i < this.f38507d.length) {
                i iVar2 = this.f38507d[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(9, iVar2);
                }
                i++;
            }
        }
        if (this.f38519p != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38519p);
        }
        if (this.f38508e != null) {
            codedOutputByteBufferNano.m33532b(12, this.f38508e);
        }
        if ((this.f38504a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f38513j);
        }
        if ((this.f38504a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(14, this.f38515l);
        }
        if (this.f38516m != null) {
            codedOutputByteBufferNano.m33532b(15, this.f38516m);
        }
        if (this.f38517n != null) {
            codedOutputByteBufferNano.m33532b(16, this.f38517n);
        }
        if ((this.f38504a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f38514k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36129b() {
        int i = 0;
        int b = super.b();
        if (this.f38505b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38505b);
        }
        if (this.f38518o != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38518o);
        }
        if (this.f38506c != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38506c);
        }
        if ((this.f38504a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38509f);
        }
        if ((this.f38504a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(6, this.f38510g);
        }
        if (this.f38511h != null && this.f38511h.length > 0) {
            int i2 = b;
            for (i iVar : this.f38511h) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(7, iVar);
                }
            }
            b = i2;
        }
        if ((this.f38504a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if (this.f38507d != null && this.f38507d.length > 0) {
            while (i < this.f38507d.length) {
                i iVar2 = this.f38507d[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(9, iVar2);
                }
                i++;
            }
        }
        if (this.f38519p != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f38519p);
        }
        if (this.f38508e != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f38508e);
        }
        if ((this.f38504a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f38513j);
        }
        if ((this.f38504a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f38515l);
        }
        if (this.f38516m != null) {
            b += CodedOutputByteBufferNano.m33503d(15, this.f38516m);
        }
        if (this.f38517n != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f38517n);
        }
        if ((this.f38504a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(17, this.f38514k);
        }
        return b;
    }

    public final /* synthetic */ i m36127a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38505b == null) {
                        this.f38505b = new ch();
                    }
                    c7213a.m33552a(this.f38505b);
                    continue;
                case 26:
                    if (this.f38518o == null) {
                        this.f38518o = new iu();
                    }
                    c7213a.m33552a(this.f38518o);
                    continue;
                case 34:
                    if (this.f38506c == null) {
                        this.f38506c = new cv();
                    }
                    c7213a.m33552a(this.f38506c);
                    continue;
                case 42:
                    this.f38509f = c7213a.m33564f();
                    this.f38504a |= 1;
                    continue;
                case 50:
                    this.f38510g = c7213a.m33565g();
                    this.f38504a |= 2;
                    continue;
                case 58:
                    a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f38511h == null ? 0 : this.f38511h.length;
                    obj = new cc[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38511h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cc();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cc();
                    c7213a.m33552a(obj[a]);
                    this.f38511h = obj;
                    continue;
                case 64:
                    this.f38512i = c7213a.m33563e();
                    this.f38504a |= 4;
                    continue;
                case 74:
                    a2 = C7222l.m33624a(c7213a, 74);
                    a = this.f38507d == null ? 0 : this.f38507d.length;
                    obj = new lk[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38507d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lk();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new lk();
                    c7213a.m33552a(obj[a]);
                    this.f38507d = obj;
                    continue;
                case 82:
                    if (this.f38519p == null) {
                        this.f38519p = new iu();
                    }
                    c7213a.m33552a(this.f38519p);
                    continue;
                case 98:
                    if (this.f38508e == null) {
                        this.f38508e = new ll();
                    }
                    c7213a.m33552a(this.f38508e);
                    continue;
                case 106:
                    this.f38513j = c7213a.m33564f();
                    this.f38504a |= 8;
                    continue;
                case 114:
                    this.f38515l = c7213a.m33564f();
                    this.f38504a |= 32;
                    continue;
                case 122:
                    if (this.f38516m == null) {
                        this.f38516m = new bz();
                    }
                    c7213a.m33552a(this.f38516m);
                    continue;
                case 130:
                    if (this.f38517n == null) {
                        this.f38517n = new cb();
                    }
                    c7213a.m33552a(this.f38517n);
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f38514k = c7213a.m33564f();
                    this.f38504a |= 16;
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
