package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7283o extends b implements Cloneable {
    public int f36116a;
    public String f36117b;
    public String f36118c;
    public String f36119d;
    public String f36120e;
    public String f36121f;
    public String f36122g;
    public String f36123h;
    public String f36124i;
    public String f36125j;

    public C7283o() {
        this.f36116a = 0;
        this.f36117b = "";
        this.f36118c = "";
        this.f36119d = "";
        this.f36120e = "";
        this.f36121f = "";
        this.f36122g = "";
        this.f36123h = "";
        this.f36124i = "";
        this.f36125j = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7283o m34432d() {
        try {
            return (C7283o) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7283o)) {
            return false;
        }
        C7283o c7283o = (C7283o) obj;
        if (this.f36116a != c7283o.f36116a) {
            return false;
        }
        if (this.f36117b == null) {
            if (c7283o.f36117b != null) {
                return false;
            }
        } else if (!this.f36117b.equals(c7283o.f36117b)) {
            return false;
        }
        if (this.f36118c == null) {
            if (c7283o.f36118c != null) {
                return false;
            }
        } else if (!this.f36118c.equals(c7283o.f36118c)) {
            return false;
        }
        if (this.f36119d == null) {
            if (c7283o.f36119d != null) {
                return false;
            }
        } else if (!this.f36119d.equals(c7283o.f36119d)) {
            return false;
        }
        if (this.f36120e == null) {
            if (c7283o.f36120e != null) {
                return false;
            }
        } else if (!this.f36120e.equals(c7283o.f36120e)) {
            return false;
        }
        if (this.f36121f == null) {
            if (c7283o.f36121f != null) {
                return false;
            }
        } else if (!this.f36121f.equals(c7283o.f36121f)) {
            return false;
        }
        if (this.f36122g == null) {
            if (c7283o.f36122g != null) {
                return false;
            }
        } else if (!this.f36122g.equals(c7283o.f36122g)) {
            return false;
        }
        if (this.f36123h == null) {
            if (c7283o.f36123h != null) {
                return false;
            }
        } else if (!this.f36123h.equals(c7283o.f36123h)) {
            return false;
        }
        if (this.f36124i == null) {
            if (c7283o.f36124i != null) {
                return false;
            }
        } else if (!this.f36124i.equals(c7283o.f36124i)) {
            return false;
        }
        if (this.f36125j == null) {
            if (c7283o.f36125j != null) {
                return false;
            }
        } else if (!this.f36125j.equals(c7283o.f36125j)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7283o.aO);
        }
        if (c7283o.aO == null || c7283o.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36125j == null ? 0 : this.f36125j.hashCode()) + (((this.f36124i == null ? 0 : this.f36124i.hashCode()) + (((this.f36123h == null ? 0 : this.f36123h.hashCode()) + (((this.f36122g == null ? 0 : this.f36122g.hashCode()) + (((this.f36121f == null ? 0 : this.f36121f.hashCode()) + (((this.f36120e == null ? 0 : this.f36120e.hashCode()) + (((this.f36119d == null ? 0 : this.f36119d.hashCode()) + (((this.f36118c == null ? 0 : this.f36118c.hashCode()) + (((this.f36117b == null ? 0 : this.f36117b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f36116a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34434a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36116a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36116a);
        }
        if (!(this.f36117b == null || this.f36117b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36117b);
        }
        if (!(this.f36118c == null || this.f36118c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36118c);
        }
        if (!(this.f36119d == null || this.f36119d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36119d);
        }
        if (!(this.f36120e == null || this.f36120e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36120e);
        }
        if (!(this.f36121f == null || this.f36121f.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36121f);
        }
        if (!(this.f36122g == null || this.f36122g.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36122g);
        }
        if (!(this.f36123h == null || this.f36123h.equals(""))) {
            codedOutputByteBufferNano.m33521a(8, this.f36123h);
        }
        if (!(this.f36124i == null || this.f36124i.equals(""))) {
            codedOutputByteBufferNano.m33521a(9, this.f36124i);
        }
        if (!(this.f36125j == null || this.f36125j.equals(""))) {
            codedOutputByteBufferNano.m33521a(10, this.f36125j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34435b() {
        int b = super.b();
        if (this.f36116a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36116a);
        }
        if (!(this.f36117b == null || this.f36117b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36117b);
        }
        if (!(this.f36118c == null || this.f36118c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36118c);
        }
        if (!(this.f36119d == null || this.f36119d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36119d);
        }
        if (!(this.f36120e == null || this.f36120e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36120e);
        }
        if (!(this.f36121f == null || this.f36121f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36121f);
        }
        if (!(this.f36122g == null || this.f36122g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36122g);
        }
        if (!(this.f36123h == null || this.f36123h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36123h);
        }
        if (!(this.f36124i == null || this.f36124i.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f36124i);
        }
        if (this.f36125j == null || this.f36125j.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(10, this.f36125j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7283o m34431b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 26: goto L_0x0046;
            case 34: goto L_0x004d;
            case 42: goto L_0x0054;
            case 50: goto L_0x005b;
            case 58: goto L_0x0062;
            case 66: goto L_0x0069;
            case 74: goto L_0x0070;
            case 82: goto L_0x0077;
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
            case 5: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum VrClientType";
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
        r6.f36116a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33564f();
        r6.f36117b = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.m33564f();
        r6.f36118c = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.m33564f();
        r6.f36119d = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.m33564f();
        r6.f36120e = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r7.m33564f();
        r6.f36121f = r0;
        goto L_0x0000;
    L_0x0062:
        r0 = r7.m33564f();
        r6.f36122g = r0;
        goto L_0x0000;
    L_0x0069:
        r0 = r7.m33564f();
        r6.f36123h = r0;
        goto L_0x0000;
    L_0x0070:
        r0 = r7.m33564f();
        r6.f36124i = r0;
        goto L_0x0000;
    L_0x0077:
        r0 = r7.m33564f();
        r6.f36125j = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.o.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.o");
    }

    public final /* synthetic */ b cK_() {
        return (C7283o) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7283o) clone();
    }

    public final /* synthetic */ i m34433a(C7213a c7213a) {
        return m34431b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m34432d();
    }
}
