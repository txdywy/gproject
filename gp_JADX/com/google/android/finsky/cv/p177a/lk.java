package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class lk extends C0758b {
    public static volatile lk[] f13015a;
    public int f13016b;
    public String f13017c;
    public byte[] f13018d;
    public String f13019e;
    public double f13020f;
    public int f13021g;

    public static lk[] bN_() {
        if (f13015a == null) {
            synchronized (h.b) {
                if (f13015a == null) {
                    f13015a = new lk[0];
                }
            }
        }
        return f13015a;
    }

    public lk() {
        this.f13016b = 0;
        this.f13017c = "";
        this.f13018d = l.l;
        this.f13019e = "";
        this.f13020f = 0.0d;
        this.f13021g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj;
        if ((this.f13016b & 1) != (lkVar.f13016b & 1)) {
            return false;
        }
        if (!this.f13017c.equals(lkVar.f13017c)) {
            return false;
        }
        if ((this.f13016b & 2) != (lkVar.f13016b & 2)) {
            return false;
        }
        if (!Arrays.equals(this.f13018d, lkVar.f13018d)) {
            return false;
        }
        if ((this.f13016b & 4) != (lkVar.f13016b & 4)) {
            return false;
        }
        if (!this.f13019e.equals(lkVar.f13019e)) {
            return false;
        }
        if ((this.f13016b & 8) != (lkVar.f13016b & 8)) {
            return false;
        }
        if (Double.doubleToLongBits(this.f13020f) != Double.doubleToLongBits(lkVar.f13020f)) {
            return false;
        }
        if ((this.f13016b & 16) != (lkVar.f13016b & 16)) {
            return false;
        }
        if (this.f13021g != lkVar.f13021g) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lkVar.aO);
        }
        if (lkVar.aO == null || lkVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f13017c.hashCode()) * 31) + Arrays.hashCode(this.f13018d)) * 31) + this.f13019e.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f13020f);
        int i = ((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f13021g) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13016b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13017c);
        }
        if ((this.f13016b & 16) != 0) {
            codedOutputByteBufferNano.a(2, this.f13021g);
        }
        if ((this.f13016b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f13019e);
        }
        if ((this.f13016b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f13018d);
        }
        if ((this.f13016b & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f13020f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13016b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13017c);
        }
        if ((this.f13016b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f13021g);
        }
        if ((this.f13016b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f13019e);
        }
        if ((this.f13016b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f13018d);
        }
        if ((this.f13016b & 8) != 0) {
            return b + (CodedOutputByteBufferNano.d(5) + 8);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.lk m13037b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0065;
            case 41: goto L_0x0072;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f13017c = r0;
        r0 = r6.f13016b;
        r0 = r0 | 1;
        r6.f13016b = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f13016b;
        r1 = r1 | 16;
        r6.f13016b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            case 3: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 55;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum AggregatedUserSentiment";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f13021g = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f13016b;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 16;
        r6.f13016b = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r7.f();
        r6.f13019e = r0;
        r0 = r6.f13016b;
        r0 = r0 | 4;
        r6.f13016b = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.g();
        r6.f13018d = r0;
        r0 = r6.f13016b;
        r0 = r0 | 2;
        r6.f13016b = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.l();
        r0 = java.lang.Double.longBitsToDouble(r0);
        r6.f13020f = r0;
        r0 = r6.f13016b;
        r0 = r0 | 8;
        r6.f13016b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.lk.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.lk");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m13037b(aVar);
    }
}
