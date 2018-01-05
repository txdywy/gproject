package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7281m extends b implements Cloneable {
    public String f36104a;
    public int f36105b;
    public String f36106c;
    public String f36107d;
    public String f36108e;

    public C7281m() {
        this.f36104a = "";
        this.f36105b = 0;
        this.f36106c = "";
        this.f36107d = "";
        this.f36108e = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7281m m34423d() {
        try {
            return (C7281m) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7281m)) {
            return false;
        }
        C7281m c7281m = (C7281m) obj;
        if (this.f36104a == null) {
            if (c7281m.f36104a != null) {
                return false;
            }
        } else if (!this.f36104a.equals(c7281m.f36104a)) {
            return false;
        }
        if (this.f36105b != c7281m.f36105b) {
            return false;
        }
        if (this.f36106c == null) {
            if (c7281m.f36106c != null) {
                return false;
            }
        } else if (!this.f36106c.equals(c7281m.f36106c)) {
            return false;
        }
        if (this.f36107d == null) {
            if (c7281m.f36107d != null) {
                return false;
            }
        } else if (!this.f36107d.equals(c7281m.f36107d)) {
            return false;
        }
        if (this.f36108e == null) {
            if (c7281m.f36108e != null) {
                return false;
            }
        } else if (!this.f36108e.equals(c7281m.f36108e)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7281m.aO);
        }
        if (c7281m.aO == null || c7281m.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36108e == null ? 0 : this.f36108e.hashCode()) + (((this.f36107d == null ? 0 : this.f36107d.hashCode()) + (((this.f36106c == null ? 0 : this.f36106c.hashCode()) + (((((this.f36104a == null ? 0 : this.f36104a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f36105b) * 31)) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34425a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36104a == null || this.f36104a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36104a);
        }
        if (this.f36105b != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36105b);
        }
        if (!(this.f36106c == null || this.f36106c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36106c);
        }
        if (!(this.f36107d == null || this.f36107d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36107d);
        }
        if (!(this.f36108e == null || this.f36108e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36108e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34426b() {
        int b = super.b();
        if (!(this.f36104a == null || this.f36104a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36104a);
        }
        if (this.f36105b != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36105b);
        }
        if (!(this.f36106c == null || this.f36106c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36106c);
        }
        if (!(this.f36107d == null || this.f36107d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36107d);
        }
        if (this.f36108e == null || this.f36108e.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(5, this.f36108e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7281m m34422b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            case 26: goto L_0x0046;
            case 34: goto L_0x004d;
            case 42: goto L_0x0054;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f36104a = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r2) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            case 2: goto L_0x0043;
            case 3: goto L_0x0043;
            case 4: goto L_0x0043;
            case 5: goto L_0x0043;
            case 6: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = " is not a valid enum OsType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0043:
        r6.f36105b = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
    L_0x0046:
        r0 = r7.m33564f();
        r6.f36106c = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.m33564f();
        r6.f36107d = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.m33564f();
        r6.f36108e = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.m.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.m");
    }

    public final /* synthetic */ b cK_() {
        return (C7281m) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7281m) clone();
    }

    public final /* synthetic */ i m34424a(C7213a c7213a) {
        return m34422b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m34423d();
    }
}
