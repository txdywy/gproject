package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7101j extends b implements Cloneable {
    public static volatile C7101j[] f34743a;
    public C7102k f34744b;
    public C7099h[] f34745c;
    public int f34746d;

    public static C7101j[] m32271d() {
        if (f34743a == null) {
            synchronized (C7219h.f35465b) {
                if (f34743a == null) {
                    f34743a = new C7101j[0];
                }
            }
        }
        return f34743a;
    }

    public C7101j() {
        this.f34744b = null;
        this.f34745c = C7099h.m32261d();
        this.f34746d = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7101j m32272e() {
        try {
            C7101j c7101j = (C7101j) super.cK_();
            if (this.f34744b != null) {
                c7101j.f34744b = (C7102k) this.f34744b.clone();
            }
            if (this.f34745c != null && this.f34745c.length > 0) {
                c7101j.f34745c = new C7099h[this.f34745c.length];
                for (int i = 0; i < this.f34745c.length; i++) {
                    if (this.f34745c[i] != null) {
                        c7101j.f34745c[i] = (C7099h) this.f34745c[i].clone();
                    }
                }
            }
            return c7101j;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7101j)) {
            return false;
        }
        C7101j c7101j = (C7101j) obj;
        if (this.f34744b == null) {
            if (c7101j.f34744b != null) {
                return false;
            }
        } else if (!this.f34744b.equals(c7101j.f34744b)) {
            return false;
        }
        if (!C7219h.m33616a(this.f34745c, c7101j.f34745c)) {
            return false;
        }
        if (this.f34746d != c7101j.f34746d) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7101j.aO);
        }
        if (c7101j.aO == null || c7101j.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C7102k c7102k = this.f34744b;
        hashCode = ((((((c7102k == null ? 0 : c7102k.hashCode()) + (hashCode * 31)) * 31) + C7219h.m33609a(this.f34745c)) * 31) + this.f34746d) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32274a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34744b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34744b);
        }
        if (this.f34745c != null && this.f34745c.length > 0) {
            for (i iVar : this.f34745c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (this.f34746d != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34746d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32275b() {
        int b = super.b();
        if (this.f34744b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34744b);
        }
        if (this.f34745c != null && this.f34745c.length > 0) {
            int i = b;
            for (i iVar : this.f34745c) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (this.f34746d != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f34746d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p425d.p426a.p429b.C7101j m32270b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0020;
            case 24: goto L_0x005f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r7.f34744b;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.d.a.b.k;
        r0.<init>();
        r7.f34744b = r0;
    L_0x001a:
        r0 = r7.f34744b;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0020:
        r0 = 18;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f34745c;
        if (r0 != 0) goto L_0x004c;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r2 = r2 + r0;
        r2 = new com.google.p425d.p426a.p429b.C7099h[r2];
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r3 = r7.f34745c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0035:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0050;
    L_0x003a:
        r3 = new com.google.d.a.b.h;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0035;
    L_0x004c:
        r0 = r7.f34745c;
        r0 = r0.length;
        goto L_0x002b;
    L_0x0050:
        r3 = new com.google.d.a.b.h;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f34745c = r2;
        goto L_0x0001;
    L_0x005f:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0085 }
        switch(r3) {
            case 0: goto L_0x008e;
            case 1: goto L_0x008e;
            case 2: goto L_0x008e;
            default: goto L_0x006a;
        };	 Catch:{ IllegalArgumentException -> 0x0085 }
    L_0x006a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0085 }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0085 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0085 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0085 }
        r5 = " is not a valid enum UpdateType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0085 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0085 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0085 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0085 }
    L_0x0085:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x008e:
        r7.f34746d = r3;	 Catch:{ IllegalArgumentException -> 0x0085 }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.b.j.b(com.google.protobuf.nano.a):com.google.d.a.b.j");
    }

    public final /* synthetic */ b cK_() {
        return (C7101j) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7101j) clone();
    }

    public final /* synthetic */ i m32273a(C7213a c7213a) {
        return m32270b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m32272e();
    }
}
