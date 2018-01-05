package com.google.android.finsky.cv.p177a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class iu extends C0758b {
    public static volatile iu[] f12713a;
    public int f12714b;
    public String f12715c;
    public cv f12716d;
    public int f12717e;
    public bd f12718f;
    public String f12719g;
    public String f12720h;
    public String f12721i;
    public String f12722j;
    public String f12723k;
    public long f12724l;
    public String f12725m;
    public String f12726n;
    public long f12727o;
    public int f12728p;
    public long f12729q;
    public kd f12730r;
    public gm f12731s;
    public String f12732t;
    public boolean f12733u;

    public static iu[] br_() {
        if (f12713a == null) {
            synchronized (h.b) {
                if (f12713a == null) {
                    f12713a = new iu[0];
                }
            }
        }
        return f12713a;
    }

    public final boolean bs_() {
        return (this.f12714b & 128) != 0;
    }

    public final boolean m12828d() {
        return (this.f12714b & 512) != 0;
    }

    public final boolean m12829e() {
        return (this.f12714b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0;
    }

    public iu() {
        this.f12714b = 0;
        this.f12715c = "";
        this.f12716d = null;
        this.f12717e = 0;
        this.f12718f = null;
        this.f12719g = "";
        this.f12720h = "";
        this.f12721i = "";
        this.f12722j = "";
        this.f12723k = "";
        this.f12724l = 0;
        this.f12725m = "";
        this.f12726n = "";
        this.f12727o = 0;
        this.f12728p = 0;
        this.f12729q = 0;
        this.f12730r = null;
        this.f12731s = null;
        this.f12732t = "";
        this.f12733u = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iu)) {
            return false;
        }
        iu iuVar = (iu) obj;
        if ((this.f12714b & 1) != (iuVar.f12714b & 1)) {
            return false;
        }
        if (!this.f12715c.equals(iuVar.f12715c)) {
            return false;
        }
        if (this.f12716d == null) {
            if (iuVar.f12716d != null) {
                return false;
            }
        } else if (!this.f12716d.equals(iuVar.f12716d)) {
            return false;
        }
        if ((this.f12714b & 2) != (iuVar.f12714b & 2)) {
            return false;
        }
        if (this.f12717e != iuVar.f12717e) {
            return false;
        }
        if (this.f12718f == null) {
            if (iuVar.f12718f != null) {
                return false;
            }
        } else if (!this.f12718f.equals(iuVar.f12718f)) {
            return false;
        }
        if ((this.f12714b & 4) != (iuVar.f12714b & 4)) {
            return false;
        }
        if (!this.f12719g.equals(iuVar.f12719g)) {
            return false;
        }
        if ((this.f12714b & 8) != (iuVar.f12714b & 8)) {
            return false;
        }
        if (!this.f12720h.equals(iuVar.f12720h)) {
            return false;
        }
        if ((this.f12714b & 16) != (iuVar.f12714b & 16)) {
            return false;
        }
        if (!this.f12721i.equals(iuVar.f12721i)) {
            return false;
        }
        if ((this.f12714b & 32) != (iuVar.f12714b & 32)) {
            return false;
        }
        if (!this.f12722j.equals(iuVar.f12722j)) {
            return false;
        }
        if ((this.f12714b & 64) != (iuVar.f12714b & 64)) {
            return false;
        }
        if (!this.f12723k.equals(iuVar.f12723k)) {
            return false;
        }
        if ((this.f12714b & 128) != (iuVar.f12714b & 128)) {
            return false;
        }
        if (this.f12724l != iuVar.f12724l) {
            return false;
        }
        if ((this.f12714b & 256) != (iuVar.f12714b & 256)) {
            return false;
        }
        if (!this.f12725m.equals(iuVar.f12725m)) {
            return false;
        }
        if ((this.f12714b & 512) != (iuVar.f12714b & 512)) {
            return false;
        }
        if (!this.f12726n.equals(iuVar.f12726n)) {
            return false;
        }
        if ((this.f12714b & MemoryMappedFileBuffer.DEFAULT_PADDING) != (iuVar.f12714b & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (this.f12727o != iuVar.f12727o) {
            return false;
        }
        if ((this.f12714b & eq.FLAG_MOVED) != (iuVar.f12714b & eq.FLAG_MOVED)) {
            return false;
        }
        if (this.f12728p != iuVar.f12728p) {
            return false;
        }
        if ((this.f12714b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (iuVar.f12714b & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (this.f12729q != iuVar.f12729q) {
            return false;
        }
        if (this.f12730r == null) {
            if (iuVar.f12730r != null) {
                return false;
            }
        } else if (!this.f12730r.equals(iuVar.f12730r)) {
            return false;
        }
        if (this.f12731s == null) {
            if (iuVar.f12731s != null) {
                return false;
            }
        } else if (!this.f12731s.equals(iuVar.f12731s)) {
            return false;
        }
        if ((this.f12714b & 8192) != (iuVar.f12714b & 8192)) {
            return false;
        }
        if (!this.f12732t.equals(iuVar.f12732t)) {
            return false;
        }
        if ((this.f12714b & 16384) != (iuVar.f12714b & 16384)) {
            return false;
        }
        if (this.f12733u != iuVar.f12733u) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(iuVar.aO);
        }
        if (iuVar.aO == null || iuVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12715c.hashCode();
        cv cvVar = this.f12716d;
        hashCode = (((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31) + this.f12717e;
        bd bdVar = this.f12718f;
        hashCode = (((((((((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f12719g.hashCode()) * 31) + this.f12720h.hashCode()) * 31) + this.f12721i.hashCode()) * 31) + this.f12722j.hashCode()) * 31) + this.f12723k.hashCode();
        long j = this.f12724l;
        hashCode = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12725m.hashCode()) * 31) + this.f12726n.hashCode();
        j = this.f12727o;
        hashCode = (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12728p;
        j = this.f12729q;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        kd kdVar = this.f12730r;
        hashCode = (kdVar == null ? 0 : kdVar.hashCode()) + (hashCode * 31);
        gm gmVar = this.f12731s;
        hashCode = ((this.f12733u ? 1231 : 1237) + (((((gmVar == null ? 0 : gmVar.hashCode()) + (hashCode * 31)) * 31) + this.f12732t.hashCode()) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12714b & 8192) != 0) {
            codedOutputByteBufferNano.a(1, this.f12732t);
        }
        if ((this.f12714b & 16) != 0) {
            codedOutputByteBufferNano.a(2, this.f12721i);
        }
        if ((this.f12714b & 32) != 0) {
            codedOutputByteBufferNano.a(3, this.f12722j);
        }
        if ((this.f12714b & 64) != 0) {
            codedOutputByteBufferNano.a(4, this.f12723k);
        }
        if ((this.f12714b & 128) != 0) {
            codedOutputByteBufferNano.b(5, this.f12724l);
        }
        if ((this.f12714b & 2) != 0) {
            codedOutputByteBufferNano.a(6, this.f12717e);
        }
        if ((this.f12714b & 4) != 0) {
            codedOutputByteBufferNano.a(7, this.f12719g);
        }
        if ((this.f12714b & 8) != 0) {
            codedOutputByteBufferNano.a(8, this.f12720h);
        }
        if ((this.f12714b & 1) != 0) {
            codedOutputByteBufferNano.a(9, this.f12715c);
        }
        if ((this.f12714b & 256) != 0) {
            codedOutputByteBufferNano.a(19, this.f12725m);
        }
        if ((this.f12714b & 512) != 0) {
            codedOutputByteBufferNano.a(29, this.f12726n);
        }
        if ((this.f12714b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.b(30, this.f12727o);
        }
        if (this.f12731s != null) {
            codedOutputByteBufferNano.b(31, this.f12731s);
        }
        if (this.f12716d != null) {
            codedOutputByteBufferNano.b(33, this.f12716d);
        }
        if (this.f12718f != null) {
            codedOutputByteBufferNano.b(34, this.f12718f);
        }
        if ((this.f12714b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(35, this.f12728p);
        }
        if ((this.f12714b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(38, this.f12729q);
        }
        if (this.f12730r != null) {
            codedOutputByteBufferNano.b(39, this.f12730r);
        }
        if ((this.f12714b & 16384) != 0) {
            codedOutputByteBufferNano.a(40, this.f12733u);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12714b & 8192) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12732t);
        }
        if ((this.f12714b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12721i);
        }
        if ((this.f12714b & 32) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12722j);
        }
        if ((this.f12714b & 64) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12723k);
        }
        if ((this.f12714b & 128) != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f12724l);
        }
        if ((this.f12714b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f12717e);
        }
        if ((this.f12714b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f12719g);
        }
        if ((this.f12714b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f12720h);
        }
        if ((this.f12714b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f12715c);
        }
        if ((this.f12714b & 256) != 0) {
            b += CodedOutputByteBufferNano.b(19, this.f12725m);
        }
        if ((this.f12714b & 512) != 0) {
            b += CodedOutputByteBufferNano.b(29, this.f12726n);
        }
        if ((this.f12714b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.f(30, this.f12727o);
        }
        if (this.f12731s != null) {
            b += CodedOutputByteBufferNano.d(31, this.f12731s);
        }
        if (this.f12716d != null) {
            b += CodedOutputByteBufferNano.d(33, this.f12716d);
        }
        if (this.f12718f != null) {
            b += CodedOutputByteBufferNano.d(34, this.f12718f);
        }
        if ((this.f12714b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.d(35, this.f12728p);
        }
        if ((this.f12714b & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.e(38, this.f12729q);
        }
        if (this.f12730r != null) {
            b += CodedOutputByteBufferNano.d(39, this.f12730r);
        }
        if ((this.f12714b & 16384) != 0) {
            return b + (CodedOutputByteBufferNano.d(40) + 1);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12732t = aVar.f();
                    this.f12714b |= 8192;
                    continue;
                case 18:
                    this.f12721i = aVar.f();
                    this.f12714b |= 16;
                    continue;
                case 26:
                    this.f12722j = aVar.f();
                    this.f12714b |= 32;
                    continue;
                case 34:
                    this.f12723k = aVar.f();
                    this.f12714b |= 64;
                    continue;
                case 40:
                    this.f12724l = aVar.j();
                    this.f12714b |= 128;
                    continue;
                case 48:
                    this.f12717e = aVar.i();
                    this.f12714b |= 2;
                    continue;
                case 58:
                    this.f12719g = aVar.f();
                    this.f12714b |= 4;
                    continue;
                case 66:
                    this.f12720h = aVar.f();
                    this.f12714b |= 8;
                    continue;
                case 74:
                    this.f12715c = aVar.f();
                    this.f12714b |= 1;
                    continue;
                case 154:
                    this.f12725m = aVar.f();
                    this.f12714b |= 256;
                    continue;
                case 234:
                    this.f12726n = aVar.f();
                    this.f12714b |= 512;
                    continue;
                case 240:
                    this.f12727o = aVar.j();
                    this.f12714b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 250:
                    if (this.f12731s == null) {
                        this.f12731s = new gm();
                    }
                    aVar.a(this.f12731s);
                    continue;
                case 266:
                    if (this.f12716d == null) {
                        this.f12716d = new cv();
                    }
                    aVar.a(this.f12716d);
                    continue;
                case 274:
                    if (this.f12718f == null) {
                        this.f12718f = new bd();
                    }
                    aVar.a(this.f12718f);
                    continue;
                case 280:
                    this.f12728p = aVar.i();
                    this.f12714b |= eq.FLAG_MOVED;
                    continue;
                case 304:
                    this.f12729q = aVar.j();
                    this.f12714b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 314:
                    if (this.f12730r == null) {
                        this.f12730r = new kd();
                    }
                    aVar.a(this.f12730r);
                    continue;
                case 320:
                    this.f12733u = aVar.e();
                    this.f12714b |= 16384;
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
