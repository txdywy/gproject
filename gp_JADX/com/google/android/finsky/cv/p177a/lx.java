package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class lx extends C0758b {
    public static volatile lx[] f13072a;
    public int f13073b;
    public String f13074c;
    public String f13075d;
    public int f13076e;
    public long f13077f;
    public eu f13078g;
    public bd f13079h;
    public bd f13080i;
    public String f13081j;
    public String f13082k;
    public String f13083l;

    public static lx[] bS_() {
        if (f13072a == null) {
            synchronized (h.b) {
                if (f13072a == null) {
                    f13072a = new lx[0];
                }
            }
        }
        return f13072a;
    }

    public final boolean bT_() {
        return (this.f13073b & 8) != 0;
    }

    public lx() {
        this.f13073b = 0;
        this.f13074c = "";
        this.f13075d = "";
        this.f13076e = 0;
        this.f13077f = 0;
        this.f13078g = null;
        this.f13079h = null;
        this.f13080i = null;
        this.f13081j = "";
        this.f13082k = "";
        this.f13083l = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        if ((this.f13073b & 1) != (lxVar.f13073b & 1)) {
            return false;
        }
        if (!this.f13074c.equals(lxVar.f13074c)) {
            return false;
        }
        if ((this.f13073b & 2) != (lxVar.f13073b & 2)) {
            return false;
        }
        if (!this.f13075d.equals(lxVar.f13075d)) {
            return false;
        }
        if ((this.f13073b & 4) != (lxVar.f13073b & 4)) {
            return false;
        }
        if (this.f13076e != lxVar.f13076e) {
            return false;
        }
        if ((this.f13073b & 8) != (lxVar.f13073b & 8)) {
            return false;
        }
        if (this.f13077f != lxVar.f13077f) {
            return false;
        }
        if (this.f13078g == null) {
            if (lxVar.f13078g != null) {
                return false;
            }
        } else if (!this.f13078g.equals(lxVar.f13078g)) {
            return false;
        }
        if (this.f13079h == null) {
            if (lxVar.f13079h != null) {
                return false;
            }
        } else if (!this.f13079h.equals(lxVar.f13079h)) {
            return false;
        }
        if (this.f13080i == null) {
            if (lxVar.f13080i != null) {
                return false;
            }
        } else if (!this.f13080i.equals(lxVar.f13080i)) {
            return false;
        }
        if ((this.f13073b & 16) != (lxVar.f13073b & 16)) {
            return false;
        }
        if (!this.f13081j.equals(lxVar.f13081j)) {
            return false;
        }
        if ((this.f13073b & 32) != (lxVar.f13073b & 32)) {
            return false;
        }
        if (!this.f13082k.equals(lxVar.f13082k)) {
            return false;
        }
        if ((this.f13073b & 64) != (lxVar.f13073b & 64)) {
            return false;
        }
        if (!this.f13083l.equals(lxVar.f13083l)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lxVar.aO);
        }
        if (lxVar.aO == null || lxVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f13074c.hashCode()) * 31) + this.f13075d.hashCode()) * 31) + this.f13076e;
        long j = this.f13077f;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        eu euVar = this.f13078g;
        hashCode = (euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31);
        bd bdVar = this.f13079h;
        hashCode = (bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31);
        bdVar = this.f13080i;
        hashCode = ((((((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f13081j.hashCode()) * 31) + this.f13082k.hashCode()) * 31) + this.f13083l.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13073b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13074c);
        }
        if ((this.f13073b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f13075d);
        }
        if ((this.f13073b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f13076e);
        }
        if ((this.f13073b & 8) != 0) {
            codedOutputByteBufferNano.b(4, this.f13077f);
        }
        if (this.f13078g != null) {
            codedOutputByteBufferNano.b(5, this.f13078g);
        }
        if (this.f13079h != null) {
            codedOutputByteBufferNano.b(6, this.f13079h);
        }
        if (this.f13080i != null) {
            codedOutputByteBufferNano.b(7, this.f13080i);
        }
        if ((this.f13073b & 16) != 0) {
            codedOutputByteBufferNano.a(8, this.f13081j);
        }
        if ((this.f13073b & 32) != 0) {
            codedOutputByteBufferNano.a(9, this.f13082k);
        }
        if ((this.f13073b & 64) != 0) {
            codedOutputByteBufferNano.a(10, this.f13083l);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13073b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13074c);
        }
        if ((this.f13073b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13075d);
        }
        if ((this.f13073b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f13076e);
        }
        if ((this.f13073b & 8) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f13077f);
        }
        if (this.f13078g != null) {
            b += CodedOutputByteBufferNano.d(5, this.f13078g);
        }
        if (this.f13079h != null) {
            b += CodedOutputByteBufferNano.d(6, this.f13079h);
        }
        if (this.f13080i != null) {
            b += CodedOutputByteBufferNano.d(7, this.f13080i);
        }
        if ((this.f13073b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f13081j);
        }
        if ((this.f13073b & 32) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f13082k);
        }
        if ((this.f13073b & 64) != 0) {
            return b + CodedOutputByteBufferNano.b(10, this.f13083l);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.lx m13076b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0065;
            case 42: goto L_0x0072;
            case 50: goto L_0x0084;
            case 58: goto L_0x0096;
            case 66: goto L_0x00a8;
            case 74: goto L_0x00b6;
            case 82: goto L_0x00c4;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f13074c = r0;
        r0 = r6.f13073b;
        r0 = r0 | 1;
        r6.f13073b = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.f();
        r6.f13075d = r0;
        r0 = r6.f13073b;
        r0 = r0 | 2;
        r6.f13073b = r0;
        goto L_0x0000;
    L_0x0028:
        r1 = r6.f13073b;
        r1 = r1 | 4;
        r6.f13073b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0054 }
        switch(r2) {
            case 0: goto L_0x005c;
            case 1: goto L_0x005c;
            case 2: goto L_0x005c;
            case 3: goto L_0x005c;
            default: goto L_0x0039;
        };	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0039:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = " is not a valid enum WatchRestriction";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0054:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x005c:
        r6.f13076e = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r6.f13073b;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2 | 4;
        r6.f13073b = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;
    L_0x0065:
        r0 = r7.j();
        r6.f13077f = r0;
        r0 = r6.f13073b;
        r0 = r0 | 8;
        r6.f13073b = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r6.f13078g;
        if (r0 != 0) goto L_0x007d;
    L_0x0076:
        r0 = new com.google.android.finsky.cv.a.eu;
        r0.<init>();
        r6.f13078g = r0;
    L_0x007d:
        r0 = r6.f13078g;
        r7.a(r0);
        goto L_0x0000;
    L_0x0084:
        r0 = r6.f13079h;
        if (r0 != 0) goto L_0x008f;
    L_0x0088:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f13079h = r0;
    L_0x008f:
        r0 = r6.f13079h;
        r7.a(r0);
        goto L_0x0000;
    L_0x0096:
        r0 = r6.f13080i;
        if (r0 != 0) goto L_0x00a1;
    L_0x009a:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f13080i = r0;
    L_0x00a1:
        r0 = r6.f13080i;
        r7.a(r0);
        goto L_0x0000;
    L_0x00a8:
        r0 = r7.f();
        r6.f13081j = r0;
        r0 = r6.f13073b;
        r0 = r0 | 16;
        r6.f13073b = r0;
        goto L_0x0000;
    L_0x00b6:
        r0 = r7.f();
        r6.f13082k = r0;
        r0 = r6.f13073b;
        r0 = r0 | 32;
        r6.f13073b = r0;
        goto L_0x0000;
    L_0x00c4:
        r0 = r7.f();
        r6.f13083l = r0;
        r0 = r6.f13073b;
        r0 = r0 | 64;
        r6.f13073b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.lx.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.lx");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m13076b(aVar);
    }
}
