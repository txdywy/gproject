package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7278j extends b implements Cloneable {
    public String f36088a;
    public String f36089b;
    public int f36090c;
    public String f36091d;
    public String f36092e;
    public int f36093f;
    public String f36094g;

    public C7278j() {
        this.f36088a = "";
        this.f36089b = "";
        this.f36090c = 0;
        this.f36091d = "";
        this.f36092e = "";
        this.f36093f = 0;
        this.f36094g = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7278j m34409d() {
        try {
            return (C7278j) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7278j)) {
            return false;
        }
        C7278j c7278j = (C7278j) obj;
        if (this.f36088a == null) {
            if (c7278j.f36088a != null) {
                return false;
            }
        } else if (!this.f36088a.equals(c7278j.f36088a)) {
            return false;
        }
        if (this.f36089b == null) {
            if (c7278j.f36089b != null) {
                return false;
            }
        } else if (!this.f36089b.equals(c7278j.f36089b)) {
            return false;
        }
        if (this.f36090c != c7278j.f36090c) {
            return false;
        }
        if (this.f36091d == null) {
            if (c7278j.f36091d != null) {
                return false;
            }
        } else if (!this.f36091d.equals(c7278j.f36091d)) {
            return false;
        }
        if (this.f36092e == null) {
            if (c7278j.f36092e != null) {
                return false;
            }
        } else if (!this.f36092e.equals(c7278j.f36092e)) {
            return false;
        }
        if (this.f36093f != c7278j.f36093f) {
            return false;
        }
        if (this.f36094g == null) {
            if (c7278j.f36094g != null) {
                return false;
            }
        } else if (!this.f36094g.equals(c7278j.f36094g)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7278j.aO);
        }
        if (c7278j.aO == null || c7278j.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36094g == null ? 0 : this.f36094g.hashCode()) + (((((this.f36092e == null ? 0 : this.f36092e.hashCode()) + (((this.f36091d == null ? 0 : this.f36091d.hashCode()) + (((((this.f36089b == null ? 0 : this.f36089b.hashCode()) + (((this.f36088a == null ? 0 : this.f36088a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + this.f36090c) * 31)) * 31)) * 31) + this.f36093f) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34411a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36088a == null || this.f36088a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36088a);
        }
        if (!(this.f36089b == null || this.f36089b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36089b);
        }
        if (this.f36090c != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f36090c);
        }
        if (!(this.f36091d == null || this.f36091d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36091d);
        }
        if (!(this.f36092e == null || this.f36092e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36092e);
        }
        if (this.f36093f != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f36093f);
        }
        if (!(this.f36094g == null || this.f36094g.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36094g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34412b() {
        int b = super.b();
        if (!(this.f36088a == null || this.f36088a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36088a);
        }
        if (!(this.f36089b == null || this.f36089b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36089b);
        }
        if (this.f36090c != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f36090c);
        }
        if (!(this.f36091d == null || this.f36091d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36091d);
        }
        if (!(this.f36092e == null || this.f36092e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36092e);
        }
        if (this.f36093f != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f36093f);
        }
        if (this.f36094g == null || this.f36094g.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(7, this.f36094g);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7278j m34408b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x0015;
            case 24: goto L_0x001c;
            case 34: goto L_0x004d;
            case 42: goto L_0x0054;
            case 48: goto L_0x005b;
            case 58: goto L_0x008e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f36088a = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.m33564f();
        r6.f36089b = r0;
        goto L_0x0000;
    L_0x001c:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0042 }
        switch(r2) {
            case 0: goto L_0x004a;
            case 1: goto L_0x004a;
            case 2: goto L_0x004a;
            case 3: goto L_0x004a;
            default: goto L_0x0027;
        };	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0027:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = " is not a valid enum DeviceType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0042 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004a:
        r6.f36090c = r2;	 Catch:{ IllegalArgumentException -> 0x0042 }
        goto L_0x0000;
    L_0x004d:
        r0 = r7.m33564f();
        r6.f36091d = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.m33564f();
        r6.f36092e = r0;
        goto L_0x0000;
    L_0x005b:
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0081 }
        switch(r2) {
            case 0: goto L_0x008a;
            case 1: goto L_0x008a;
            case 2: goto L_0x008a;
            case 3: goto L_0x008a;
            case 4: goto L_0x008a;
            case 5: goto L_0x008a;
            case 6: goto L_0x008a;
            case 7: goto L_0x008a;
            case 8: goto L_0x008a;
            default: goto L_0x0066;
        };	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x0066:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r4 = " is not a valid enum OsType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0081 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0081 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x0081:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x008a:
        r6.f36093f = r2;	 Catch:{ IllegalArgumentException -> 0x0081 }
        goto L_0x0000;
    L_0x008e:
        r0 = r7.m33564f();
        r6.f36094g = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.j.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.j");
    }

    public final /* synthetic */ b cK_() {
        return (C7278j) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7278j) clone();
    }

    public final /* synthetic */ i m34410a(C7213a c7213a) {
        return m34408b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m34409d();
    }
}
