package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class je extends C0758b {
    public static volatile je[] f12761a;
    public int f12762b;
    public int f12763c;
    public String f12764d;
    public bd f12765e;
    public eu f12766f;
    public byte[] f12767g;
    public cv f12768h;
    public int f12769i;
    public String f12770j;
    public jc f12771k;
    public boolean f12772l;
    public String f12773m;

    public static je[] bv_() {
        if (f12761a == null) {
            synchronized (h.b) {
                if (f12761a == null) {
                    f12761a = new je[0];
                }
            }
        }
        return f12761a;
    }

    public je() {
        this.f12762b = 0;
        this.f12763c = 1;
        this.f12764d = "";
        this.f12765e = null;
        this.f12766f = null;
        this.f12767g = l.l;
        this.f12768h = null;
        this.f12769i = 0;
        this.f12770j = "";
        this.f12771k = null;
        this.f12772l = false;
        this.f12773m = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof je)) {
            return false;
        }
        je jeVar = (je) obj;
        if ((this.f12762b & 1) != (jeVar.f12762b & 1)) {
            return false;
        }
        if (this.f12763c != jeVar.f12763c) {
            return false;
        }
        if ((this.f12762b & 2) != (jeVar.f12762b & 2)) {
            return false;
        }
        if (!this.f12764d.equals(jeVar.f12764d)) {
            return false;
        }
        if (this.f12765e == null) {
            if (jeVar.f12765e != null) {
                return false;
            }
        } else if (!this.f12765e.equals(jeVar.f12765e)) {
            return false;
        }
        if (this.f12766f == null) {
            if (jeVar.f12766f != null) {
                return false;
            }
        } else if (!this.f12766f.equals(jeVar.f12766f)) {
            return false;
        }
        if ((this.f12762b & 4) != (jeVar.f12762b & 4)) {
            return false;
        }
        if (!Arrays.equals(this.f12767g, jeVar.f12767g)) {
            return false;
        }
        if (this.f12768h == null) {
            if (jeVar.f12768h != null) {
                return false;
            }
        } else if (!this.f12768h.equals(jeVar.f12768h)) {
            return false;
        }
        if ((this.f12762b & 8) != (jeVar.f12762b & 8)) {
            return false;
        }
        if (this.f12769i != jeVar.f12769i) {
            return false;
        }
        if ((this.f12762b & 16) != (jeVar.f12762b & 16)) {
            return false;
        }
        if (!this.f12770j.equals(jeVar.f12770j)) {
            return false;
        }
        if (this.f12771k == null) {
            if (jeVar.f12771k != null) {
                return false;
            }
        } else if (!this.f12771k.equals(jeVar.f12771k)) {
            return false;
        }
        if ((this.f12762b & 32) != (jeVar.f12762b & 32)) {
            return false;
        }
        if (this.f12772l != jeVar.f12772l) {
            return false;
        }
        if ((this.f12762b & 64) != (jeVar.f12762b & 64)) {
            return false;
        }
        if (!this.f12773m.equals(jeVar.f12773m)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jeVar.aO);
        }
        if (jeVar.aO == null || jeVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12763c) * 31) + this.f12764d.hashCode();
        bd bdVar = this.f12765e;
        hashCode = (bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31);
        eu euVar = this.f12766f;
        hashCode = (((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f12767g);
        cv cvVar = this.f12768h;
        hashCode = (((((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31) + this.f12769i) * 31) + this.f12770j.hashCode();
        jc jcVar = this.f12771k;
        hashCode = ((((this.f12772l ? 1231 : 1237) + (((jcVar == null ? 0 : jcVar.hashCode()) + (hashCode * 31)) * 31)) * 31) + this.f12773m.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12762b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12763c);
        }
        if ((this.f12762b & 16) != 0) {
            codedOutputByteBufferNano.a(2, this.f12770j);
        }
        if (this.f12771k != null) {
            codedOutputByteBufferNano.b(3, this.f12771k);
        }
        if ((this.f12762b & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12767g);
        }
        if (this.f12765e != null) {
            codedOutputByteBufferNano.b(5, this.f12765e);
        }
        if ((this.f12762b & 2) != 0) {
            codedOutputByteBufferNano.a(6, this.f12764d);
        }
        if (this.f12766f != null) {
            codedOutputByteBufferNano.b(7, this.f12766f);
        }
        if (this.f12768h != null) {
            codedOutputByteBufferNano.b(8, this.f12768h);
        }
        if ((this.f12762b & 8) != 0) {
            codedOutputByteBufferNano.a(9, this.f12769i);
        }
        if ((this.f12762b & 32) != 0) {
            codedOutputByteBufferNano.a(10, this.f12772l);
        }
        if ((this.f12762b & 64) != 0) {
            codedOutputByteBufferNano.a(11, this.f12773m);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12762b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12763c);
        }
        if ((this.f12762b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12770j);
        }
        if (this.f12771k != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12771k);
        }
        if ((this.f12762b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12767g);
        }
        if (this.f12765e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12765e);
        }
        if ((this.f12762b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f12764d);
        }
        if (this.f12766f != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12766f);
        }
        if (this.f12768h != null) {
            b += CodedOutputByteBufferNano.d(8, this.f12768h);
        }
        if ((this.f12762b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(9, this.f12769i);
        }
        if ((this.f12762b & 32) != 0) {
            b += CodedOutputByteBufferNano.d(10) + 1;
        }
        if ((this.f12762b & 64) != 0) {
            return b + CodedOutputByteBufferNano.b(11, this.f12773m);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.je m12855b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0069;
            case 42: goto L_0x0076;
            case 50: goto L_0x0088;
            case 58: goto L_0x0096;
            case 66: goto L_0x00a8;
            case 72: goto L_0x00ba;
            case 80: goto L_0x00df;
            case 90: goto L_0x00ed;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f12762b;
        r1 = r1 | 1;
        r6.f12762b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Id";
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
        r6.f12763c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f12762b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f12762b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.f();
        r6.f12770j = r0;
        r0 = r6.f12762b;
        r0 = r0 | 16;
        r6.f12762b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r6.f12771k;
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new com.google.android.finsky.cv.a.jc;
        r0.<init>();
        r6.f12771k = r0;
    L_0x0063:
        r0 = r6.f12771k;
        r7.a(r0);
        goto L_0x0000;
    L_0x0069:
        r0 = r7.g();
        r6.f12767g = r0;
        r0 = r6.f12762b;
        r0 = r0 | 4;
        r6.f12762b = r0;
        goto L_0x0000;
    L_0x0076:
        r0 = r6.f12765e;
        if (r0 != 0) goto L_0x0081;
    L_0x007a:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f12765e = r0;
    L_0x0081:
        r0 = r6.f12765e;
        r7.a(r0);
        goto L_0x0000;
    L_0x0088:
        r0 = r7.f();
        r6.f12764d = r0;
        r0 = r6.f12762b;
        r0 = r0 | 2;
        r6.f12762b = r0;
        goto L_0x0000;
    L_0x0096:
        r0 = r6.f12766f;
        if (r0 != 0) goto L_0x00a1;
    L_0x009a:
        r0 = new com.google.android.finsky.cv.a.eu;
        r0.<init>();
        r6.f12766f = r0;
    L_0x00a1:
        r0 = r6.f12766f;
        r7.a(r0);
        goto L_0x0000;
    L_0x00a8:
        r0 = r6.f12768h;
        if (r0 != 0) goto L_0x00b3;
    L_0x00ac:
        r0 = new com.google.android.finsky.cv.a.cv;
        r0.<init>();
        r6.f12768h = r0;
    L_0x00b3:
        r0 = r6.f12768h;
        r7.a(r0);
        goto L_0x0000;
    L_0x00ba:
        r1 = r6.f12762b;
        r1 = r1 | 8;
        r6.f12762b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r2 = com.google.android.finsky.cv.p177a.aw.m12218a(r2);	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r6.f12769i = r2;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r2 = r6.f12762b;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r2 = r2 | 8;
        r6.f12762b = r2;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        goto L_0x0000;
    L_0x00d6:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00df:
        r0 = r7.e();
        r6.f12772l = r0;
        r0 = r6.f12762b;
        r0 = r0 | 32;
        r6.f12762b = r0;
        goto L_0x0000;
    L_0x00ed:
        r0 = r7.f();
        r6.f12773m = r0;
        r0 = r6.f12762b;
        r0 = r0 | 64;
        r6.f12762b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.je.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.je");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12855b(aVar);
    }
}
