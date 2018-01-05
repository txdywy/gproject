package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7280l extends b implements Cloneable {
    public int f36102a;
    public int f36103b;

    public C7280l() {
        this.f36102a = -1;
        this.f36103b = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7280l m34418d() {
        try {
            return (C7280l) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7280l)) {
            return false;
        }
        C7280l c7280l = (C7280l) obj;
        if (this.f36102a != c7280l.f36102a) {
            return false;
        }
        if (this.f36103b != c7280l.f36103b) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7280l.aO);
        }
        if (c7280l.aO == null || c7280l.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f36102a) * 31) + this.f36103b) * 31;
        if (this.aO == null || this.aO.m33598b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void m34420a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36102a != -1) {
            codedOutputByteBufferNano.m33518a(1, this.f36102a);
        }
        if (this.f36103b != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36103b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34421b() {
        int b = super.b();
        if (this.f36102a != -1) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36102a);
        }
        if (this.f36103b != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36103b);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7280l m34417b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x003f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case -1: goto L_0x003c;
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            case 10: goto L_0x003c;
            case 11: goto L_0x003c;
            case 12: goto L_0x003c;
            case 13: goto L_0x003c;
            case 14: goto L_0x003c;
            case 15: goto L_0x003c;
            case 16: goto L_0x003c;
            case 17: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum NetworkType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f36102a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0065 }
        switch(r2) {
            case 0: goto L_0x006d;
            case 1: goto L_0x006d;
            case 2: goto L_0x006d;
            case 3: goto L_0x006d;
            case 4: goto L_0x006d;
            case 5: goto L_0x006d;
            case 6: goto L_0x006d;
            case 7: goto L_0x006d;
            case 8: goto L_0x006d;
            case 9: goto L_0x006d;
            case 10: goto L_0x006d;
            case 11: goto L_0x006d;
            case 12: goto L_0x006d;
            case 13: goto L_0x006d;
            case 14: goto L_0x006d;
            case 15: goto L_0x006d;
            case 16: goto L_0x006d;
            case 100: goto L_0x006d;
            default: goto L_0x004a;
        };	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x004a:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = " is not a valid enum MobileSubtype";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x006d:
        r6.f36103b = r2;	 Catch:{ IllegalArgumentException -> 0x0065 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.l.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.l");
    }

    public final /* synthetic */ b cK_() {
        return (C7280l) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7280l) clone();
    }

    public final /* synthetic */ i m34419a(C7213a c7213a) {
        return m34417b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m34418d();
    }
}
