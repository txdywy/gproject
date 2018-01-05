package com.google.android.finsky.cv.p177a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Arrays;

public final class ip extends C0758b {
    public String f12668A;
    public ip f12669B;
    public iq f12670C;
    public im f12671D;
    public String f12672E;
    public ax f12673F;
    public byte[] f12674G;
    public int f12675H;
    public String f12676I;
    public int f12677J;
    public int f12678a;
    public String f12679b;
    public String f12680c;
    public String f12681d;
    public String f12682e;
    public String f12683f;
    public String f12684g;
    public String f12685h;
    public String f12686i;
    public String f12687j;
    public String f12688k;
    public String f12689l;
    public String f12690m;
    public ih f12691n;
    public ig f12692o;
    public String f12693p;
    public io f12694q;
    public String f12695r;
    public il f12696s;
    public String f12697t;
    public ii f12698u;
    public ij f12699v;
    public ik f12700w;
    public in f12701x;
    public ir f12702y;
    public String f12703z;

    public final ip m12805a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f12678a |= 1;
        this.f12679b = str;
        return this;
    }

    public final boolean bn_() {
        return (this.f12678a & 131072) != 0;
    }

    public final boolean bo_() {
        return (this.f12678a & 2097152) != 0;
    }

    public ip() {
        this.f12678a = 0;
        this.f12679b = "";
        this.f12680c = "";
        this.f12681d = "";
        this.f12682e = "";
        this.f12683f = "";
        this.f12684g = "";
        this.f12685h = "";
        this.f12686i = "";
        this.f12687j = "";
        this.f12688k = "";
        this.f12689l = "";
        this.f12690m = "";
        this.f12691n = null;
        this.f12692o = null;
        this.f12693p = "";
        this.f12694q = null;
        this.f12695r = "";
        this.f12696s = null;
        this.f12697t = "";
        this.f12698u = null;
        this.f12699v = null;
        this.f12700w = null;
        this.f12701x = null;
        this.f12702y = null;
        this.f12703z = "";
        this.f12668A = "";
        this.f12669B = null;
        this.f12670C = null;
        this.f12671D = null;
        this.f12672E = "";
        this.f12673F = null;
        this.f12674G = l.l;
        this.f12675H = 0;
        this.f12676I = "";
        this.f12677J = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ip)) {
            return false;
        }
        ip ipVar = (ip) obj;
        if ((this.f12678a & 1) != (ipVar.f12678a & 1)) {
            return false;
        }
        if (!this.f12679b.equals(ipVar.f12679b)) {
            return false;
        }
        if ((this.f12678a & 2) != (ipVar.f12678a & 2)) {
            return false;
        }
        if (!this.f12680c.equals(ipVar.f12680c)) {
            return false;
        }
        if ((this.f12678a & 4) != (ipVar.f12678a & 4)) {
            return false;
        }
        if (!this.f12681d.equals(ipVar.f12681d)) {
            return false;
        }
        if ((this.f12678a & 8) != (ipVar.f12678a & 8)) {
            return false;
        }
        if (!this.f12682e.equals(ipVar.f12682e)) {
            return false;
        }
        if ((this.f12678a & 16) != (ipVar.f12678a & 16)) {
            return false;
        }
        if (!this.f12683f.equals(ipVar.f12683f)) {
            return false;
        }
        if ((this.f12678a & 32) != (ipVar.f12678a & 32)) {
            return false;
        }
        if (!this.f12684g.equals(ipVar.f12684g)) {
            return false;
        }
        if ((this.f12678a & 64) != (ipVar.f12678a & 64)) {
            return false;
        }
        if (!this.f12685h.equals(ipVar.f12685h)) {
            return false;
        }
        if ((this.f12678a & 128) != (ipVar.f12678a & 128)) {
            return false;
        }
        if (!this.f12686i.equals(ipVar.f12686i)) {
            return false;
        }
        if ((this.f12678a & 256) != (ipVar.f12678a & 256)) {
            return false;
        }
        if (!this.f12687j.equals(ipVar.f12687j)) {
            return false;
        }
        if ((this.f12678a & 512) != (ipVar.f12678a & 512)) {
            return false;
        }
        if (!this.f12688k.equals(ipVar.f12688k)) {
            return false;
        }
        if ((this.f12678a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (ipVar.f12678a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f12689l.equals(ipVar.f12689l)) {
            return false;
        }
        if ((this.f12678a & eq.FLAG_MOVED) != (ipVar.f12678a & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f12690m.equals(ipVar.f12690m)) {
            return false;
        }
        if (this.f12691n == null) {
            if (ipVar.f12691n != null) {
                return false;
            }
        } else if (!this.f12691n.equals(ipVar.f12691n)) {
            return false;
        }
        if (this.f12692o == null) {
            if (ipVar.f12692o != null) {
                return false;
            }
        } else if (!this.f12692o.equals(ipVar.f12692o)) {
            return false;
        }
        if ((this.f12678a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != (ipVar.f12678a & eq.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            return false;
        }
        if (!this.f12693p.equals(ipVar.f12693p)) {
            return false;
        }
        if (this.f12694q == null) {
            if (ipVar.f12694q != null) {
                return false;
            }
        } else if (!this.f12694q.equals(ipVar.f12694q)) {
            return false;
        }
        if ((this.f12678a & 8192) != (ipVar.f12678a & 8192)) {
            return false;
        }
        if (!this.f12695r.equals(ipVar.f12695r)) {
            return false;
        }
        if (this.f12696s == null) {
            if (ipVar.f12696s != null) {
                return false;
            }
        } else if (!this.f12696s.equals(ipVar.f12696s)) {
            return false;
        }
        if ((this.f12678a & 16384) != (ipVar.f12678a & 16384)) {
            return false;
        }
        if (!this.f12697t.equals(ipVar.f12697t)) {
            return false;
        }
        if (this.f12698u == null) {
            if (ipVar.f12698u != null) {
                return false;
            }
        } else if (!this.f12698u.equals(ipVar.f12698u)) {
            return false;
        }
        if (this.f12699v == null) {
            if (ipVar.f12699v != null) {
                return false;
            }
        } else if (!this.f12699v.equals(ipVar.f12699v)) {
            return false;
        }
        if (this.f12700w == null) {
            if (ipVar.f12700w != null) {
                return false;
            }
        } else if (!this.f12700w.equals(ipVar.f12700w)) {
            return false;
        }
        if (this.f12701x == null) {
            if (ipVar.f12701x != null) {
                return false;
            }
        } else if (!this.f12701x.equals(ipVar.f12701x)) {
            return false;
        }
        if (this.f12702y == null) {
            if (ipVar.f12702y != null) {
                return false;
            }
        } else if (!this.f12702y.equals(ipVar.f12702y)) {
            return false;
        }
        if ((this.f12678a & 32768) != (ipVar.f12678a & 32768)) {
            return false;
        }
        if (!this.f12703z.equals(ipVar.f12703z)) {
            return false;
        }
        if ((this.f12678a & 65536) != (ipVar.f12678a & 65536)) {
            return false;
        }
        if (!this.f12668A.equals(ipVar.f12668A)) {
            return false;
        }
        if (this.f12669B == null) {
            if (ipVar.f12669B != null) {
                return false;
            }
        } else if (!this.f12669B.equals(ipVar.f12669B)) {
            return false;
        }
        if (this.f12670C == null) {
            if (ipVar.f12670C != null) {
                return false;
            }
        } else if (!this.f12670C.equals(ipVar.f12670C)) {
            return false;
        }
        if (this.f12671D == null) {
            if (ipVar.f12671D != null) {
                return false;
            }
        } else if (!this.f12671D.equals(ipVar.f12671D)) {
            return false;
        }
        if ((this.f12678a & 131072) != (ipVar.f12678a & 131072)) {
            return false;
        }
        if (!this.f12672E.equals(ipVar.f12672E)) {
            return false;
        }
        if (this.f12673F == null) {
            if (ipVar.f12673F != null) {
                return false;
            }
        } else if (!this.f12673F.equals(ipVar.f12673F)) {
            return false;
        }
        if ((this.f12678a & 262144) != (ipVar.f12678a & 262144)) {
            return false;
        }
        if (!Arrays.equals(this.f12674G, ipVar.f12674G)) {
            return false;
        }
        if ((this.f12678a & 524288) != (ipVar.f12678a & 524288)) {
            return false;
        }
        if (this.f12675H != ipVar.f12675H) {
            return false;
        }
        if ((this.f12678a & 1048576) != (ipVar.f12678a & 1048576)) {
            return false;
        }
        if (!this.f12676I.equals(ipVar.f12676I)) {
            return false;
        }
        if ((this.f12678a & 2097152) != (ipVar.f12678a & 2097152)) {
            return false;
        }
        if (this.f12677J != ipVar.f12677J) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ipVar.aO);
        }
        if (ipVar.aO == null || ipVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12679b.hashCode()) * 31) + this.f12680c.hashCode()) * 31) + this.f12681d.hashCode()) * 31) + this.f12682e.hashCode()) * 31) + this.f12683f.hashCode()) * 31) + this.f12684g.hashCode()) * 31) + this.f12685h.hashCode()) * 31) + this.f12686i.hashCode()) * 31) + this.f12687j.hashCode()) * 31) + this.f12688k.hashCode()) * 31) + this.f12689l.hashCode()) * 31) + this.f12690m.hashCode();
        ih ihVar = this.f12691n;
        hashCode = (ihVar == null ? 0 : ihVar.hashCode()) + (hashCode * 31);
        ig igVar = this.f12692o;
        hashCode = (((igVar == null ? 0 : igVar.hashCode()) + (hashCode * 31)) * 31) + this.f12693p.hashCode();
        io ioVar = this.f12694q;
        hashCode = (((ioVar == null ? 0 : ioVar.hashCode()) + (hashCode * 31)) * 31) + this.f12695r.hashCode();
        il ilVar = this.f12696s;
        hashCode = (((ilVar == null ? 0 : ilVar.hashCode()) + (hashCode * 31)) * 31) + this.f12697t.hashCode();
        ii iiVar = this.f12698u;
        hashCode = (iiVar == null ? 0 : iiVar.hashCode()) + (hashCode * 31);
        ij ijVar = this.f12699v;
        hashCode = (ijVar == null ? 0 : ijVar.hashCode()) + (hashCode * 31);
        ik ikVar = this.f12700w;
        hashCode = (ikVar == null ? 0 : ikVar.hashCode()) + (hashCode * 31);
        in inVar = this.f12701x;
        hashCode = (inVar == null ? 0 : inVar.hashCode()) + (hashCode * 31);
        ir irVar = this.f12702y;
        hashCode = (((((irVar == null ? 0 : irVar.hashCode()) + (hashCode * 31)) * 31) + this.f12703z.hashCode()) * 31) + this.f12668A.hashCode();
        ip ipVar = this.f12669B;
        hashCode = (ipVar == null ? 0 : ipVar.hashCode()) + (hashCode * 31);
        iq iqVar = this.f12670C;
        hashCode = (iqVar == null ? 0 : iqVar.hashCode()) + (hashCode * 31);
        im imVar = this.f12671D;
        hashCode = (((imVar == null ? 0 : imVar.hashCode()) + (hashCode * 31)) * 31) + this.f12672E.hashCode();
        ax axVar = this.f12673F;
        hashCode = ((((((((((axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f12674G)) * 31) + this.f12675H) * 31) + this.f12676I.hashCode()) * 31) + this.f12677J) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12678a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12679b);
        }
        if ((this.f12678a & 4) != 0) {
            codedOutputByteBufferNano.a(2, this.f12681d);
        }
        if ((this.f12678a & 8) != 0) {
            codedOutputByteBufferNano.a(3, this.f12682e);
        }
        if (this.f12691n != null) {
            codedOutputByteBufferNano.b(4, this.f12691n);
        }
        if ((this.f12678a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.a(5, this.f12693p);
        }
        if (this.f12694q != null) {
            codedOutputByteBufferNano.b(6, this.f12694q);
        }
        if ((this.f12678a & 262144) != 0) {
            codedOutputByteBufferNano.a(7, this.f12674G);
        }
        if (this.f12673F != null) {
            codedOutputByteBufferNano.b(8, this.f12673F);
        }
        if ((this.f12678a & 16) != 0) {
            codedOutputByteBufferNano.a(9, this.f12683f);
        }
        if ((this.f12678a & 524288) != 0) {
            codedOutputByteBufferNano.a(10, this.f12675H);
        }
        if ((this.f12678a & 1048576) != 0) {
            codedOutputByteBufferNano.a(11, this.f12676I);
        }
        if ((this.f12678a & 32) != 0) {
            codedOutputByteBufferNano.a(12, this.f12684g);
        }
        if (this.f12696s != null) {
            codedOutputByteBufferNano.b(13, this.f12696s);
        }
        if ((this.f12678a & 8192) != 0) {
            codedOutputByteBufferNano.a(14, this.f12695r);
        }
        if ((this.f12678a & 2) != 0) {
            codedOutputByteBufferNano.a(15, this.f12680c);
        }
        if ((this.f12678a & 64) != 0) {
            codedOutputByteBufferNano.a(16, this.f12685h);
        }
        if ((this.f12678a & 128) != 0) {
            codedOutputByteBufferNano.a(17, this.f12686i);
        }
        if ((this.f12678a & 256) != 0) {
            codedOutputByteBufferNano.a(18, this.f12687j);
        }
        if ((this.f12678a & 512) != 0) {
            codedOutputByteBufferNano.a(19, this.f12688k);
        }
        if ((this.f12678a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(20, this.f12689l);
        }
        if ((this.f12678a & 16384) != 0) {
            codedOutputByteBufferNano.a(21, this.f12697t);
        }
        if (this.f12698u != null) {
            codedOutputByteBufferNano.b(22, this.f12698u);
        }
        if (this.f12699v != null) {
            codedOutputByteBufferNano.b(23, this.f12699v);
        }
        if (this.f12700w != null) {
            codedOutputByteBufferNano.b(24, this.f12700w);
        }
        if (this.f12692o != null) {
            codedOutputByteBufferNano.b(25, this.f12692o);
        }
        if (this.f12701x != null) {
            codedOutputByteBufferNano.b(26, this.f12701x);
        }
        if (this.f12702y != null) {
            codedOutputByteBufferNano.b(28, this.f12702y);
        }
        if ((this.f12678a & 32768) != 0) {
            codedOutputByteBufferNano.a(29, this.f12703z);
        }
        if ((this.f12678a & 65536) != 0) {
            codedOutputByteBufferNano.a(30, this.f12668A);
        }
        if ((this.f12678a & 2097152) != 0) {
            codedOutputByteBufferNano.a(31, this.f12677J);
        }
        if (this.f12669B != null) {
            codedOutputByteBufferNano.b(32, this.f12669B);
        }
        if (this.f12670C != null) {
            codedOutputByteBufferNano.b(33, this.f12670C);
        }
        if ((this.f12678a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(34, this.f12690m);
        }
        if (this.f12671D != null) {
            codedOutputByteBufferNano.b(35, this.f12671D);
        }
        if ((this.f12678a & 131072) != 0) {
            codedOutputByteBufferNano.a(36, this.f12672E);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12678a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12679b);
        }
        if ((this.f12678a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12681d);
        }
        if ((this.f12678a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12682e);
        }
        if (this.f12691n != null) {
            b += CodedOutputByteBufferNano.d(4, this.f12691n);
        }
        if ((this.f12678a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12693p);
        }
        if (this.f12694q != null) {
            b += CodedOutputByteBufferNano.d(6, this.f12694q);
        }
        if ((this.f12678a & 262144) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f12674G);
        }
        if (this.f12673F != null) {
            b += CodedOutputByteBufferNano.d(8, this.f12673F);
        }
        if ((this.f12678a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f12683f);
        }
        if ((this.f12678a & 524288) != 0) {
            b += CodedOutputByteBufferNano.d(10, this.f12675H);
        }
        if ((this.f12678a & 1048576) != 0) {
            b += CodedOutputByteBufferNano.b(11, this.f12676I);
        }
        if ((this.f12678a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(12, this.f12684g);
        }
        if (this.f12696s != null) {
            b += CodedOutputByteBufferNano.d(13, this.f12696s);
        }
        if ((this.f12678a & 8192) != 0) {
            b += CodedOutputByteBufferNano.b(14, this.f12695r);
        }
        if ((this.f12678a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(15, this.f12680c);
        }
        if ((this.f12678a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(16, this.f12685h);
        }
        if ((this.f12678a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(17, this.f12686i);
        }
        if ((this.f12678a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(18, this.f12687j);
        }
        if ((this.f12678a & 512) != 0) {
            b += CodedOutputByteBufferNano.b(19, this.f12688k);
        }
        if ((this.f12678a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.b(20, this.f12689l);
        }
        if ((this.f12678a & 16384) != 0) {
            b += CodedOutputByteBufferNano.b(21, this.f12697t);
        }
        if (this.f12698u != null) {
            b += CodedOutputByteBufferNano.d(22, this.f12698u);
        }
        if (this.f12699v != null) {
            b += CodedOutputByteBufferNano.d(23, this.f12699v);
        }
        if (this.f12700w != null) {
            b += CodedOutputByteBufferNano.d(24, this.f12700w);
        }
        if (this.f12692o != null) {
            b += CodedOutputByteBufferNano.d(25, this.f12692o);
        }
        if (this.f12701x != null) {
            b += CodedOutputByteBufferNano.d(26, this.f12701x);
        }
        if (this.f12702y != null) {
            b += CodedOutputByteBufferNano.d(28, this.f12702y);
        }
        if ((this.f12678a & 32768) != 0) {
            b += CodedOutputByteBufferNano.b(29, this.f12703z);
        }
        if ((this.f12678a & 65536) != 0) {
            b += CodedOutputByteBufferNano.b(30, this.f12668A);
        }
        if ((this.f12678a & 2097152) != 0) {
            b += CodedOutputByteBufferNano.d(31, this.f12677J);
        }
        if (this.f12669B != null) {
            b += CodedOutputByteBufferNano.d(32, this.f12669B);
        }
        if (this.f12670C != null) {
            b += CodedOutputByteBufferNano.d(33, this.f12670C);
        }
        if ((this.f12678a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(34, this.f12690m);
        }
        if (this.f12671D != null) {
            b += CodedOutputByteBufferNano.d(35, this.f12671D);
        }
        if ((this.f12678a & 131072) != 0) {
            return b + CodedOutputByteBufferNano.b(36, this.f12672E);
        }
        return b;
    }

    private final ip m12804b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12679b = aVar.f();
                    this.f12678a |= 1;
                    continue;
                case 18:
                    this.f12681d = aVar.f();
                    this.f12678a |= 4;
                    continue;
                case 26:
                    this.f12682e = aVar.f();
                    this.f12678a |= 8;
                    continue;
                case 34:
                    if (this.f12691n == null) {
                        this.f12691n = new ih();
                    }
                    aVar.a(this.f12691n);
                    continue;
                case 42:
                    this.f12693p = aVar.f();
                    this.f12678a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 50:
                    if (this.f12694q == null) {
                        this.f12694q = new io();
                    }
                    aVar.a(this.f12694q);
                    continue;
                case 58:
                    this.f12674G = aVar.g();
                    this.f12678a |= 262144;
                    continue;
                case 66:
                    if (this.f12673F == null) {
                        this.f12673F = new ax();
                    }
                    aVar.a(this.f12673F);
                    continue;
                case 74:
                    this.f12683f = aVar.f();
                    this.f12678a |= 16;
                    continue;
                case 80:
                    this.f12678a |= 524288;
                    o = aVar.o();
                    try {
                        this.f12675H = aw.m12218a(aVar.i());
                        this.f12678a |= 524288;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 90:
                    this.f12676I = aVar.f();
                    this.f12678a |= 1048576;
                    continue;
                case 98:
                    this.f12684g = aVar.f();
                    this.f12678a |= 32;
                    continue;
                case 106:
                    if (this.f12696s == null) {
                        this.f12696s = new il();
                    }
                    aVar.a(this.f12696s);
                    continue;
                case 114:
                    this.f12695r = aVar.f();
                    this.f12678a |= 8192;
                    continue;
                case 122:
                    this.f12680c = aVar.f();
                    this.f12678a |= 2;
                    continue;
                case 130:
                    this.f12685h = aVar.f();
                    this.f12678a |= 64;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f12686i = aVar.f();
                    this.f12678a |= 128;
                    continue;
                case 146:
                    this.f12687j = aVar.f();
                    this.f12678a |= 256;
                    continue;
                case 154:
                    this.f12688k = aVar.f();
                    this.f12678a |= 512;
                    continue;
                case 162:
                    this.f12689l = aVar.f();
                    this.f12678a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 170:
                    this.f12697t = aVar.f();
                    this.f12678a |= 16384;
                    continue;
                case 178:
                    if (this.f12698u == null) {
                        this.f12698u = new ii();
                    }
                    aVar.a(this.f12698u);
                    continue;
                case 186:
                    if (this.f12699v == null) {
                        this.f12699v = new ij();
                    }
                    aVar.a(this.f12699v);
                    continue;
                case 194:
                    if (this.f12700w == null) {
                        this.f12700w = new ik();
                    }
                    aVar.a(this.f12700w);
                    continue;
                case 202:
                    if (this.f12692o == null) {
                        this.f12692o = new ig();
                    }
                    aVar.a(this.f12692o);
                    continue;
                case 210:
                    if (this.f12701x == null) {
                        this.f12701x = new in();
                    }
                    aVar.a(this.f12701x);
                    continue;
                case 226:
                    if (this.f12702y == null) {
                        this.f12702y = new ir();
                    }
                    aVar.a(this.f12702y);
                    continue;
                case 234:
                    this.f12703z = aVar.f();
                    this.f12678a |= 32768;
                    continue;
                case 242:
                    this.f12668A = aVar.f();
                    this.f12678a |= 65536;
                    continue;
                case 248:
                    this.f12678a |= 2097152;
                    o = aVar.o();
                    try {
                        this.f12677J = iz.m12843a(aVar.i());
                        this.f12678a |= 2097152;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 258:
                    if (this.f12669B == null) {
                        this.f12669B = new ip();
                    }
                    aVar.a(this.f12669B);
                    continue;
                case 266:
                    if (this.f12670C == null) {
                        this.f12670C = new iq();
                    }
                    aVar.a(this.f12670C);
                    continue;
                case 274:
                    this.f12690m = aVar.f();
                    this.f12678a |= eq.FLAG_MOVED;
                    continue;
                case 282:
                    if (this.f12671D == null) {
                        this.f12671D = new im();
                    }
                    aVar.a(this.f12671D);
                    continue;
                case 290:
                    this.f12672E = aVar.f();
                    this.f12678a |= 131072;
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12804b(aVar);
    }
}
