package com.google.android.finsky.cv.p177a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class bd extends C0758b {
    public static volatile bd[] f11855a;
    public int f11856b;
    public int f11857c;
    public int f11858d;
    public bf f11859e;
    public String f11860f;
    public String f11861g;
    public String f11862h;
    public boolean f11863i;
    public boolean f11864j;
    public int f11865k;
    public String f11866l;
    public boolean f11867m;
    public av f11868n;
    public String f11869o;
    public bg f11870p;
    public String f11871q;
    public be f11872r;
    public int f11873s;

    public static bd[] aH_() {
        if (f11855a == null) {
            synchronized (h.b) {
                if (f11855a == null) {
                    f11855a = new bd[0];
                }
            }
        }
        return f11855a;
    }

    public final boolean aI_() {
        return (this.f11856b & 16) != 0;
    }

    public final boolean m12247d() {
        return (this.f11856b & 128) != 0;
    }

    public final boolean m12248e() {
        return (this.f11856b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0;
    }

    public bd() {
        this.f11856b = 0;
        this.f11857c = 0;
        this.f11858d = 0;
        this.f11859e = null;
        this.f11860f = "";
        this.f11861g = "";
        this.f11862h = "";
        this.f11863i = false;
        this.f11864j = false;
        this.f11865k = 0;
        this.f11866l = "";
        this.f11867m = false;
        this.f11868n = null;
        this.f11869o = "";
        this.f11870p = null;
        this.f11871q = "";
        this.f11872r = null;
        this.f11873s = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        if ((this.f11856b & 1) != (bdVar.f11856b & 1)) {
            return false;
        }
        if (this.f11857c != bdVar.f11857c) {
            return false;
        }
        if ((this.f11856b & 2) != (bdVar.f11856b & 2)) {
            return false;
        }
        if (this.f11858d != bdVar.f11858d) {
            return false;
        }
        if (this.f11859e == null) {
            if (bdVar.f11859e != null) {
                return false;
            }
        } else if (!this.f11859e.equals(bdVar.f11859e)) {
            return false;
        }
        if (this.f11860f == null) {
            if (bdVar.f11860f != null) {
                return false;
            }
        } else if (!this.f11860f.equals(bdVar.f11860f)) {
            return false;
        }
        if ((this.f11856b & 4) != (bdVar.f11856b & 4)) {
            return false;
        }
        if (!this.f11861g.equals(bdVar.f11861g)) {
            return false;
        }
        if ((this.f11856b & 8) != (bdVar.f11856b & 8)) {
            return false;
        }
        if (!this.f11862h.equals(bdVar.f11862h)) {
            return false;
        }
        if ((this.f11856b & 16) != (bdVar.f11856b & 16)) {
            return false;
        }
        if (this.f11863i != bdVar.f11863i) {
            return false;
        }
        if ((this.f11856b & 32) != (bdVar.f11856b & 32)) {
            return false;
        }
        if (this.f11864j != bdVar.f11864j) {
            return false;
        }
        if ((this.f11856b & 64) != (bdVar.f11856b & 64)) {
            return false;
        }
        if (this.f11865k != bdVar.f11865k) {
            return false;
        }
        if ((this.f11856b & 128) != (bdVar.f11856b & 128)) {
            return false;
        }
        if (!this.f11866l.equals(bdVar.f11866l)) {
            return false;
        }
        if ((this.f11856b & 256) != (bdVar.f11856b & 256)) {
            return false;
        }
        if (this.f11867m != bdVar.f11867m) {
            return false;
        }
        if (this.f11868n == null) {
            if (bdVar.f11868n != null) {
                return false;
            }
        } else if (!this.f11868n.equals(bdVar.f11868n)) {
            return false;
        }
        if ((this.f11856b & 512) != (bdVar.f11856b & 512)) {
            return false;
        }
        if (!this.f11869o.equals(bdVar.f11869o)) {
            return false;
        }
        if (this.f11870p == null) {
            if (bdVar.f11870p != null) {
                return false;
            }
        } else if (!this.f11870p.equals(bdVar.f11870p)) {
            return false;
        }
        if ((this.f11856b & MemoryMappedFileBuffer.DEFAULT_PADDING) != (bdVar.f11856b & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (!this.f11871q.equals(bdVar.f11871q)) {
            return false;
        }
        if (this.f11872r == null) {
            if (bdVar.f11872r != null) {
                return false;
            }
        } else if (!this.f11872r.equals(bdVar.f11872r)) {
            return false;
        }
        if ((this.f11856b & eq.FLAG_MOVED) != (bdVar.f11856b & eq.FLAG_MOVED)) {
            return false;
        }
        if (this.f11873s != bdVar.f11873s) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bdVar.aO);
        }
        if (bdVar.aO == null || bdVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f11857c) * 31) + this.f11858d;
        bf bfVar = this.f11859e;
        int hashCode2 = ((((((this.f11860f == null ? 0 : this.f11860f.hashCode()) + (((bfVar == null ? 0 : bfVar.hashCode()) + (hashCode * 31)) * 31)) * 31) + this.f11861g.hashCode()) * 31) + this.f11862h.hashCode()) * 31;
        if (this.f11863i) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11864j) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode = (((((hashCode + hashCode2) * 31) + this.f11865k) * 31) + this.f11866l.hashCode()) * 31;
        if (!this.f11867m) {
            i = 1237;
        }
        hashCode += i;
        av avVar = this.f11868n;
        hashCode = (((avVar == null ? 0 : avVar.hashCode()) + (hashCode * 31)) * 31) + this.f11869o.hashCode();
        bg bgVar = this.f11870p;
        hashCode = (((bgVar == null ? 0 : bgVar.hashCode()) + (hashCode * 31)) * 31) + this.f11871q.hashCode();
        be beVar = this.f11872r;
        hashCode = ((((beVar == null ? 0 : beVar.hashCode()) + (hashCode * 31)) * 31) + this.f11873s) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11856b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11857c);
        }
        if (this.f11859e != null) {
            codedOutputByteBufferNano.a(2, this.f11859e);
        }
        codedOutputByteBufferNano.a(5, this.f11860f);
        if ((this.f11856b & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f11862h);
        }
        if ((this.f11856b & 4) != 0) {
            codedOutputByteBufferNano.a(7, this.f11861g);
        }
        if ((this.f11856b & 2) != 0) {
            codedOutputByteBufferNano.a(8, this.f11858d);
        }
        if ((this.f11856b & 16) != 0) {
            codedOutputByteBufferNano.a(9, this.f11863i);
        }
        if (this.f11872r != null) {
            codedOutputByteBufferNano.a(10, this.f11872r);
        }
        if ((this.f11856b & 64) != 0) {
            codedOutputByteBufferNano.a(14, this.f11865k);
        }
        if ((this.f11856b & 128) != 0) {
            codedOutputByteBufferNano.a(15, this.f11866l);
        }
        if ((this.f11856b & 256) != 0) {
            codedOutputByteBufferNano.a(16, this.f11867m);
        }
        if (this.f11868n != null) {
            codedOutputByteBufferNano.b(17, this.f11868n);
        }
        if ((this.f11856b & 512) != 0) {
            codedOutputByteBufferNano.a(19, this.f11869o);
        }
        if (this.f11870p != null) {
            codedOutputByteBufferNano.b(20, this.f11870p);
        }
        if ((this.f11856b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(21, this.f11873s);
        }
        if ((this.f11856b & 32) != 0) {
            codedOutputByteBufferNano.a(22, this.f11864j);
        }
        if ((this.f11856b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(23, this.f11871q);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11856b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f11857c);
        }
        if (this.f11859e != null) {
            b += CodedOutputByteBufferNano.c(2, this.f11859e);
        }
        b += CodedOutputByteBufferNano.b(5, this.f11860f);
        if ((this.f11856b & 8) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f11862h);
        }
        if ((this.f11856b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f11861g);
        }
        if ((this.f11856b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f11858d);
        }
        if ((this.f11856b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(9) + 1;
        }
        if (this.f11872r != null) {
            b += CodedOutputByteBufferNano.c(10, this.f11872r);
        }
        if ((this.f11856b & 64) != 0) {
            b += CodedOutputByteBufferNano.d(14, this.f11865k);
        }
        if ((this.f11856b & 128) != 0) {
            b += CodedOutputByteBufferNano.b(15, this.f11866l);
        }
        if ((this.f11856b & 256) != 0) {
            b += CodedOutputByteBufferNano.d(16) + 1;
        }
        if (this.f11868n != null) {
            b += CodedOutputByteBufferNano.d(17, this.f11868n);
        }
        if ((this.f11856b & 512) != 0) {
            b += CodedOutputByteBufferNano.b(19, this.f11869o);
        }
        if (this.f11870p != null) {
            b += CodedOutputByteBufferNano.d(20, this.f11870p);
        }
        if ((this.f11856b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.d(21, this.f11873s);
        }
        if ((this.f11856b & 32) != 0) {
            b += CodedOutputByteBufferNano.d(22) + 1;
        }
        if ((this.f11856b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            return b + CodedOutputByteBufferNano.b(23, this.f11871q);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.bd m12243b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 19: goto L_0x004b;
            case 42: goto L_0x005d;
            case 50: goto L_0x0064;
            case 58: goto L_0x0071;
            case 64: goto L_0x007e;
            case 72: goto L_0x008c;
            case 83: goto L_0x009a;
            case 112: goto L_0x00ae;
            case 122: goto L_0x00bc;
            case 128: goto L_0x00ca;
            case 138: goto L_0x00d8;
            case 154: goto L_0x00ea;
            case 162: goto L_0x00f8;
            case 168: goto L_0x010a;
            case 176: goto L_0x0149;
            case 186: goto L_0x0157;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f11856b;
        r1 = r1 | 1;
        r6.f11856b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            case 6: goto L_0x0042;
            case 7: goto L_0x0042;
            case 8: goto L_0x0042;
            case 9: goto L_0x0042;
            case 10: goto L_0x001f;
            case 11: goto L_0x001f;
            case 12: goto L_0x001f;
            case 13: goto L_0x0042;
            case 14: goto L_0x0042;
            case 15: goto L_0x0042;
            case 16: goto L_0x0042;
            case 17: goto L_0x0042;
            case 18: goto L_0x0042;
            case 19: goto L_0x0042;
            case 20: goto L_0x0042;
            case 21: goto L_0x0042;
            case 22: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum ImageType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f11857c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f11856b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f11856b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f11859e;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.android.finsky.cv.a.bf;
        r0.<init>();
        r6.f11859e = r0;
    L_0x0056:
        r0 = r6.f11859e;
        r1 = 2;
        r7.a(r0, r1);
        goto L_0x0000;
    L_0x005d:
        r0 = r7.f();
        r6.f11860f = r0;
        goto L_0x0000;
    L_0x0064:
        r0 = r7.f();
        r6.f11862h = r0;
        r0 = r6.f11856b;
        r0 = r0 | 8;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x0071:
        r0 = r7.f();
        r6.f11861g = r0;
        r0 = r6.f11856b;
        r0 = r0 | 4;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x007e:
        r0 = r7.i();
        r6.f11858d = r0;
        r0 = r6.f11856b;
        r0 = r0 | 2;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x008c:
        r0 = r7.e();
        r6.f11863i = r0;
        r0 = r6.f11856b;
        r0 = r0 | 16;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x009a:
        r0 = r6.f11872r;
        if (r0 != 0) goto L_0x00a5;
    L_0x009e:
        r0 = new com.google.android.finsky.cv.a.be;
        r0.<init>();
        r6.f11872r = r0;
    L_0x00a5:
        r0 = r6.f11872r;
        r1 = 10;
        r7.a(r0, r1);
        goto L_0x0000;
    L_0x00ae:
        r0 = r7.i();
        r6.f11865k = r0;
        r0 = r6.f11856b;
        r0 = r0 | 64;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x00bc:
        r0 = r7.f();
        r6.f11866l = r0;
        r0 = r6.f11856b;
        r0 = r0 | 128;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x00ca:
        r0 = r7.e();
        r6.f11867m = r0;
        r0 = r6.f11856b;
        r0 = r0 | 256;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x00d8:
        r0 = r6.f11868n;
        if (r0 != 0) goto L_0x00e3;
    L_0x00dc:
        r0 = new com.google.android.finsky.cv.a.av;
        r0.<init>();
        r6.f11868n = r0;
    L_0x00e3:
        r0 = r6.f11868n;
        r7.a(r0);
        goto L_0x0000;
    L_0x00ea:
        r0 = r7.f();
        r6.f11869o = r0;
        r0 = r6.f11856b;
        r0 = r0 | 512;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x00f8:
        r0 = r6.f11870p;
        if (r0 != 0) goto L_0x0103;
    L_0x00fc:
        r0 = new com.google.android.finsky.cv.a.bg;
        r0.<init>();
        r6.f11870p = r0;
    L_0x0103:
        r0 = r6.f11870p;
        r7.a(r0);
        goto L_0x0000;
    L_0x010a:
        r1 = r6.f11856b;
        r1 = r1 | 2048;
        r6.f11856b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0136 }
        switch(r2) {
            case 0: goto L_0x013f;
            case 1: goto L_0x013f;
            case 2: goto L_0x013f;
            case 3: goto L_0x013f;
            case 4: goto L_0x013f;
            case 5: goto L_0x013f;
            case 6: goto L_0x013f;
            case 7: goto L_0x013f;
            default: goto L_0x011b;
        };	 Catch:{ IllegalArgumentException -> 0x0136 }
    L_0x011b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0136 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0136 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0136 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0136 }
    L_0x0136:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x013f:
        r6.f11873s = r2;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r2 = r6.f11856b;	 Catch:{ IllegalArgumentException -> 0x0136 }
        r2 = r2 | 2048;
        r6.f11856b = r2;	 Catch:{ IllegalArgumentException -> 0x0136 }
        goto L_0x0000;
    L_0x0149:
        r0 = r7.e();
        r6.f11864j = r0;
        r0 = r6.f11856b;
        r0 = r0 | 32;
        r6.f11856b = r0;
        goto L_0x0000;
    L_0x0157:
        r0 = r7.f();
        r6.f11871q = r0;
        r0 = r6.f11856b;
        r0 = r0 | 1024;
        r6.f11856b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.bd.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.bd");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12243b(aVar);
    }
}
