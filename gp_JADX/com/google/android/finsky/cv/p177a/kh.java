package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class kh extends C0758b {
    public static volatile kh[] f12875a;
    public int f12876b;
    public long f12877c;
    public hn f12878d;
    public kj f12879e;
    public int f12880f;

    public static kh[] bH_() {
        if (f12875a == null) {
            synchronized (h.b) {
                if (f12875a == null) {
                    f12875a = new kh[0];
                }
            }
        }
        return f12875a;
    }

    public kh() {
        this.f12876b = 0;
        this.f12877c = 0;
        this.f12878d = null;
        this.f12879e = null;
        this.f12880f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        if ((this.f12876b & 1) != (khVar.f12876b & 1)) {
            return false;
        }
        if (this.f12877c != khVar.f12877c) {
            return false;
        }
        if (this.f12878d == null) {
            if (khVar.f12878d != null) {
                return false;
            }
        } else if (!this.f12878d.equals(khVar.f12878d)) {
            return false;
        }
        if (this.f12879e == null) {
            if (khVar.f12879e != null) {
                return false;
            }
        } else if (!this.f12879e.equals(khVar.f12879e)) {
            return false;
        }
        if ((this.f12876b & 2) != (khVar.f12876b & 2)) {
            return false;
        }
        if (this.f12880f != khVar.f12880f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(khVar.aO);
        }
        if (khVar.aO == null || khVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f12877c;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        hn hnVar = this.f12878d;
        hashCode = (hnVar == null ? 0 : hnVar.hashCode()) + (hashCode * 31);
        kj kjVar = this.f12879e;
        hashCode = ((((kjVar == null ? 0 : kjVar.hashCode()) + (hashCode * 31)) * 31) + this.f12880f) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12876b & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f12877c);
        }
        if (this.f12878d != null) {
            codedOutputByteBufferNano.b(2, this.f12878d);
        }
        if (this.f12879e != null) {
            codedOutputByteBufferNano.b(3, this.f12879e);
        }
        if ((this.f12876b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f12880f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12876b & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f12877c);
        }
        if (this.f12878d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12878d);
        }
        if (this.f12879e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12879e);
        }
        if ((this.f12876b & 2) != 0) {
            return b + CodedOutputByteBufferNano.d(4, this.f12880f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.kh m12950b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x001b;
            case 26: goto L_0x002c;
            case 32: goto L_0x003d;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.j();
        r6.f12877c = r0;
        r0 = r6.f12876b;
        r0 = r0 | 1;
        r6.f12876b = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f12878d;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.android.finsky.cv.a.hn;
        r0.<init>();
        r6.f12878d = r0;
    L_0x0026:
        r0 = r6.f12878d;
        r7.a(r0);
        goto L_0x0000;
    L_0x002c:
        r0 = r6.f12879e;
        if (r0 != 0) goto L_0x0037;
    L_0x0030:
        r0 = new com.google.android.finsky.cv.a.kj;
        r0.<init>();
        r6.f12879e = r0;
    L_0x0037:
        r0 = r6.f12879e;
        r7.a(r0);
        goto L_0x0000;
    L_0x003d:
        r1 = r6.f12876b;
        r1 = r1 | 2;
        r6.f12876b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0069 }
        switch(r2) {
            case 0: goto L_0x0071;
            case 1: goto L_0x0071;
            case 2: goto L_0x0071;
            case 3: goto L_0x0071;
            default: goto L_0x004e;
        };	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x004e:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0069 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0069 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x0069:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0071:
        r6.f12880f = r2;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r6.f12876b;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r2 | 2;
        r6.f12876b = r2;	 Catch:{ IllegalArgumentException -> 0x0069 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.kh.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.kh");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12950b(aVar);
    }
}
