package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7272d extends b implements Cloneable {
    public int f36041a;
    public String f36042b;
    public String f36043c;

    public C7272d() {
        this.f36041a = 0;
        this.f36042b = "";
        this.f36043c = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7272d m34383d() {
        try {
            return (C7272d) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7272d)) {
            return false;
        }
        C7272d c7272d = (C7272d) obj;
        if (this.f36041a != c7272d.f36041a) {
            return false;
        }
        if (this.f36042b == null) {
            if (c7272d.f36042b != null) {
                return false;
            }
        } else if (!this.f36042b.equals(c7272d.f36042b)) {
            return false;
        }
        if (this.f36043c == null) {
            if (c7272d.f36043c != null) {
                return false;
            }
        } else if (!this.f36043c.equals(c7272d.f36043c)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7272d.aO);
        }
        if (c7272d.aO == null || c7272d.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36043c == null ? 0 : this.f36043c.hashCode()) + (((this.f36042b == null ? 0 : this.f36042b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f36041a) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34385a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36041a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36041a);
        }
        if (!(this.f36042b == null || this.f36042b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36042b);
        }
        if (!(this.f36043c == null || this.f36043c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36043c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34386b() {
        int b = super.b();
        if (this.f36041a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36041a);
        }
        if (!(this.f36042b == null || this.f36042b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36042b);
        }
        if (this.f36043c == null || this.f36043c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(3, this.f36043c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7272d m34382b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 26: goto L_0x0046;
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
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum ClientType";
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
        r6.f36041a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33564f();
        r6.f36042b = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.m33564f();
        r6.f36043c = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.d.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.d");
    }

    public final /* synthetic */ b cK_() {
        return (C7272d) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7272d) clone();
    }

    public final /* synthetic */ i m34384a(C7213a c7213a) {
        return m34382b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m34383d();
    }
}
