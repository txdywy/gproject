package com.google.wireless.android.finsky.dfe.nano;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.am;
import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.ao;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7545u extends b {
    public int f39206a;
    public ao[] f39207b;
    public String f39208c;
    public C7546v[] f39209d;
    public byte[] f39210e;
    public bd f39211f;
    public String f39212g;
    public String f39213h;
    public String f39214i;
    public boolean f39215j;
    public am f39216k;
    public boolean f39217l;
    public int f39218m;
    public String f39219n;
    public String f39220o;
    public String f39221p;
    public bd f39222q;
    public String f39223r;

    public C7545u() {
        this.f39206a = 0;
        this.f39207b = ao.m34651d();
        this.f39208c = "";
        this.f39209d = C7546v.m36590d();
        this.f39210e = C7222l.f35479l;
        this.f39211f = null;
        this.f39212g = "";
        this.f39213h = "";
        this.f39214i = "";
        this.f39215j = false;
        this.f39216k = null;
        this.f39217l = false;
        this.f39218m = 0;
        this.f39219n = "";
        this.f39220o = "";
        this.f39221p = "";
        this.f39222q = null;
        this.f39223r = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36587a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f39207b != null && this.f39207b.length > 0) {
            for (i iVar : this.f39207b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f39206a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39208c);
        }
        if (this.f39209d != null && this.f39209d.length > 0) {
            while (i < this.f39209d.length) {
                i iVar2 = this.f39209d[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar2);
                }
                i++;
            }
        }
        if ((this.f39206a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(6, this.f39210e);
        }
        if (this.f39211f != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39211f);
        }
        if ((this.f39206a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f39212g);
        }
        if ((this.f39206a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f39213h);
        }
        if ((this.f39206a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f39214i);
        }
        if ((this.f39206a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f39215j);
        }
        if ((this.f39206a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(14, this.f39217l);
        }
        if ((this.f39206a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(15, this.f39218m);
        }
        if ((this.f39206a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(16, this.f39219n);
        }
        if ((this.f39206a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f39220o);
        }
        if ((this.f39206a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(18, this.f39221p);
        }
        if (this.f39222q != null) {
            codedOutputByteBufferNano.m33532b(19, this.f39222q);
        }
        if ((this.f39206a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33521a(20, this.f39223r);
        }
        if (this.f39216k != null) {
            codedOutputByteBufferNano.m33532b(21, this.f39216k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36588b() {
        int i = 0;
        int b = super.b();
        if (this.f39207b != null && this.f39207b.length > 0) {
            int i2 = b;
            for (i iVar : this.f39207b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if ((this.f39206a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39208c);
        }
        if (this.f39209d != null && this.f39209d.length > 0) {
            while (i < this.f39209d.length) {
                i iVar2 = this.f39209d[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(3, iVar2);
                }
                i++;
            }
        }
        if ((this.f39206a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(6, this.f39210e);
        }
        if (this.f39211f != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f39211f);
        }
        if ((this.f39206a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f39212g);
        }
        if ((this.f39206a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f39213h);
        }
        if ((this.f39206a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f39214i);
        }
        if ((this.f39206a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f39206a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(14) + 1;
        }
        if ((this.f39206a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(15, this.f39218m);
        }
        if ((this.f39206a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f39219n);
        }
        if ((this.f39206a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f39220o);
        }
        if ((this.f39206a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(18, this.f39221p);
        }
        if (this.f39222q != null) {
            b += CodedOutputByteBufferNano.m33503d(19, this.f39222q);
        }
        if ((this.f39206a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33493b(20, this.f39223r);
        }
        if (this.f39216k != null) {
            return b + CodedOutputByteBufferNano.m33503d(21, this.f39216k);
        }
        return b;
    }

    public final /* synthetic */ i m36586a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39207b == null ? 0 : this.f39207b.length;
                    obj = new ao[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39207b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ao();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ao();
                    c7213a.m33552a(obj[a]);
                    this.f39207b = obj;
                    continue;
                case 18:
                    this.f39208c = c7213a.m33564f();
                    this.f39206a |= 1;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f39209d == null ? 0 : this.f39209d.length;
                    obj = new C7546v[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39209d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7546v();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7546v();
                    c7213a.m33552a(obj[a]);
                    this.f39209d = obj;
                    continue;
                case 50:
                    this.f39210e = c7213a.m33565g();
                    this.f39206a |= 2;
                    continue;
                case 58:
                    if (this.f39211f == null) {
                        this.f39211f = new bd();
                    }
                    c7213a.m33552a(this.f39211f);
                    continue;
                case 66:
                    this.f39212g = c7213a.m33564f();
                    this.f39206a |= 4;
                    continue;
                case 74:
                    this.f39213h = c7213a.m33564f();
                    this.f39206a |= 8;
                    continue;
                case 82:
                    this.f39214i = c7213a.m33564f();
                    this.f39206a |= 16;
                    continue;
                case 88:
                    this.f39215j = c7213a.m33563e();
                    this.f39206a |= 32;
                    continue;
                case 112:
                    this.f39217l = c7213a.m33563e();
                    this.f39206a |= 64;
                    continue;
                case 120:
                    this.f39218m = c7213a.m33567i();
                    this.f39206a |= 128;
                    continue;
                case 130:
                    this.f39219n = c7213a.m33564f();
                    this.f39206a |= 256;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f39220o = c7213a.m33564f();
                    this.f39206a |= 512;
                    continue;
                case 146:
                    this.f39221p = c7213a.m33564f();
                    this.f39206a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 154:
                    if (this.f39222q == null) {
                        this.f39222q = new bd();
                    }
                    c7213a.m33552a(this.f39222q);
                    continue;
                case 162:
                    this.f39223r = c7213a.m33564f();
                    this.f39206a |= eq.FLAG_MOVED;
                    continue;
                case 170:
                    if (this.f39216k == null) {
                        this.f39216k = new am();
                    }
                    c7213a.m33552a(this.f39216k);
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
