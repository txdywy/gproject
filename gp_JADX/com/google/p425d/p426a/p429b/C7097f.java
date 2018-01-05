package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p356a.p357a.p358a.p359a.C7280l;
import java.util.Arrays;

public final class C7097f extends b implements Cloneable {
    public C7095d f34719a;
    public C7093b[] f34720b;
    public byte[] f34721c;
    public int f34722d;
    public String f34723e;
    public int f34724f;
    public C7280l f34725g;
    public C7104m f34726h;

    public C7097f() {
        this.f34719a = null;
        this.f34720b = C7093b.m32231d();
        this.f34721c = C7222l.f35479l;
        this.f34722d = 0;
        this.f34723e = "";
        this.f34724f = 0;
        this.f34725g = null;
        this.f34726h = null;
        this.aO = null;
        this.aP = -1;
    }

    private final C7097f m32252d() {
        try {
            C7097f c7097f = (C7097f) super.cK_();
            if (this.f34719a != null) {
                c7097f.f34719a = (C7095d) this.f34719a.clone();
            }
            if (this.f34720b != null && this.f34720b.length > 0) {
                c7097f.f34720b = new C7093b[this.f34720b.length];
                for (int i = 0; i < this.f34720b.length; i++) {
                    if (this.f34720b[i] != null) {
                        c7097f.f34720b[i] = (C7093b) this.f34720b[i].clone();
                    }
                }
            }
            if (this.f34725g != null) {
                c7097f.f34725g = (C7280l) this.f34725g.clone();
            }
            if (this.f34726h != null) {
                c7097f.f34726h = (C7104m) this.f34726h.clone();
            }
            return c7097f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7097f)) {
            return false;
        }
        C7097f c7097f = (C7097f) obj;
        if (this.f34719a == null) {
            if (c7097f.f34719a != null) {
                return false;
            }
        } else if (!this.f34719a.equals(c7097f.f34719a)) {
            return false;
        }
        if (!C7219h.m33616a(this.f34720b, c7097f.f34720b)) {
            return false;
        }
        if (!Arrays.equals(this.f34721c, c7097f.f34721c)) {
            return false;
        }
        if (this.f34722d != c7097f.f34722d) {
            return false;
        }
        if (this.f34723e == null) {
            if (c7097f.f34723e != null) {
                return false;
            }
        } else if (!this.f34723e.equals(c7097f.f34723e)) {
            return false;
        }
        if (this.f34724f != c7097f.f34724f) {
            return false;
        }
        if (this.f34725g == null) {
            if (c7097f.f34725g != null) {
                return false;
            }
        } else if (!this.f34725g.equals(c7097f.f34725g)) {
            return false;
        }
        if (this.f34726h == null) {
            if (c7097f.f34726h != null) {
                return false;
            }
        } else if (!this.f34726h.equals(c7097f.f34726h)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7097f.aO);
        }
        if (c7097f.aO == null || c7097f.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C7095d c7095d = this.f34719a;
        hashCode = (((this.f34723e == null ? 0 : this.f34723e.hashCode()) + (((((((((c7095d == null ? 0 : c7095d.hashCode()) + (hashCode * 31)) * 31) + C7219h.m33609a(this.f34720b)) * 31) + Arrays.hashCode(this.f34721c)) * 31) + this.f34722d) * 31)) * 31) + this.f34724f;
        C7280l c7280l = this.f34725g;
        hashCode = (c7280l == null ? 0 : c7280l.hashCode()) + (hashCode * 31);
        C7104m c7104m = this.f34726h;
        hashCode = ((c7104m == null ? 0 : c7104m.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32254a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34719a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34719a);
        }
        if (this.f34720b != null && this.f34720b.length > 0) {
            for (i iVar : this.f34720b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (!Arrays.equals(this.f34721c, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(3, this.f34721c);
        }
        if (this.f34722d != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f34722d);
        }
        if (this.f34724f != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f34724f);
        }
        if (this.f34725g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f34725g);
        }
        if (!(this.f34723e == null || this.f34723e.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f34723e);
        }
        if (this.f34726h != null) {
            codedOutputByteBufferNano.m33532b(8, this.f34726h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32255b() {
        int b = super.b();
        if (this.f34719a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34719a);
        }
        if (this.f34720b != null && this.f34720b.length > 0) {
            int i = b;
            for (i iVar : this.f34720b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (!Arrays.equals(this.f34721c, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f34721c);
        }
        if (this.f34722d != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34722d);
        }
        if (this.f34724f != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f34724f);
        }
        if (this.f34725g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f34725g);
        }
        if (!(this.f34723e == null || this.f34723e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f34723e);
        }
        if (this.f34726h != null) {
            return b + CodedOutputByteBufferNano.m33503d(8, this.f34726h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p425d.p426a.p429b.C7097f m32251b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0020;
            case 26: goto L_0x005f;
            case 32: goto L_0x0066;
            case 40: goto L_0x0099;
            case 50: goto L_0x00a1;
            case 58: goto L_0x00b3;
            case 66: goto L_0x00bb;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r7.f34719a;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.d.a.b.d;
        r0.<init>();
        r7.f34719a = r0;
    L_0x001a:
        r0 = r7.f34719a;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0020:
        r0 = 18;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f34720b;
        if (r0 != 0) goto L_0x004c;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r2 = r2 + r0;
        r2 = new com.google.p425d.p426a.p429b.C7093b[r2];
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r3 = r7.f34720b;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0035:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0050;
    L_0x003a:
        r3 = new com.google.d.a.b.b;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0035;
    L_0x004c:
        r0 = r7.f34720b;
        r0 = r0.length;
        goto L_0x002b;
    L_0x0050:
        r3 = new com.google.d.a.b.b;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f34720b = r2;
        goto L_0x0001;
    L_0x005f:
        r0 = r8.m33565g();
        r7.f34721c = r0;
        goto L_0x0001;
    L_0x0066:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x008c }
        switch(r3) {
            case 0: goto L_0x0095;
            case 1: goto L_0x0095;
            case 2: goto L_0x0095;
            case 3: goto L_0x0095;
            case 4: goto L_0x0095;
            case 5: goto L_0x0095;
            case 6: goto L_0x0095;
            case 7: goto L_0x0095;
            case 8: goto L_0x0095;
            case 9: goto L_0x0095;
            case 10: goto L_0x0095;
            case 11: goto L_0x0095;
            case 12: goto L_0x0095;
            case 13: goto L_0x0095;
            case 14: goto L_0x0095;
            case 15: goto L_0x0095;
            case 16: goto L_0x0095;
            default: goto L_0x0071;
        };	 Catch:{ IllegalArgumentException -> 0x008c }
    L_0x0071:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x008c }
        r5 = 43;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008c }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x008c }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x008c }
        r5 = " is not a valid enum FetchReason";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x008c }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x008c }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x008c }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x008c }
    L_0x008c:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0095:
        r7.f34722d = r3;	 Catch:{ IllegalArgumentException -> 0x008c }
        goto L_0x0001;
    L_0x0099:
        r0 = r8.m33567i();
        r7.f34724f = r0;
        goto L_0x0001;
    L_0x00a1:
        r0 = r7.f34725g;
        if (r0 != 0) goto L_0x00ac;
    L_0x00a5:
        r0 = new com.google.wireless.android.a.a.a.a.l;
        r0.<init>();
        r7.f34725g = r0;
    L_0x00ac:
        r0 = r7.f34725g;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00b3:
        r0 = r8.m33564f();
        r7.f34723e = r0;
        goto L_0x0001;
    L_0x00bb:
        r0 = r7.f34726h;
        if (r0 != 0) goto L_0x00c6;
    L_0x00bf:
        r0 = new com.google.d.a.b.m;
        r0.<init>();
        r7.f34726h = r0;
    L_0x00c6:
        r0 = r7.f34726h;
        r8.m33552a(r0);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.b.f.b(com.google.protobuf.nano.a):com.google.d.a.b.f");
    }

    public final /* synthetic */ b cK_() {
        return (C7097f) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7097f) clone();
    }

    public final /* synthetic */ i m32253a(C7213a c7213a) {
        return m32251b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m32252d();
    }
}
