package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7518j extends b {
    public int f38240a;
    public int f38241b;
    public String f38242c;
    public int f38243d;
    public String f38244e;
    public C7512d f38245f;

    public final String m35939d() {
        if (this.f38240a == 0) {
            return this.f38244e;
        }
        return "";
    }

    public final C7518j m35936a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f38240a = -1;
        this.f38240a = 0;
        this.f38244e = str;
        return this;
    }

    public final C7512d m35940e() {
        if (this.f38240a == 1) {
            return this.f38245f;
        }
        return null;
    }

    public C7518j() {
        this.f38240a = -1;
        this.f38241b = 0;
        this.f38242c = "";
        this.f38243d = 0;
        this.f38240a = -1;
        this.f38244e = "";
        this.f38240a = -1;
        this.f38245f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35937a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38241b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38242c);
        }
        if ((this.f38241b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38243d);
        }
        if (this.f38240a == 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38244e);
        }
        if (this.f38240a == 1) {
            codedOutputByteBufferNano.m33532b(4, this.f38245f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35938b() {
        int b = super.b();
        if ((this.f38241b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38242c);
        }
        if ((this.f38241b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f38243d);
        }
        if (this.f38240a == 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38244e);
        }
        if (this.f38240a == 1) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f38245f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p519j.p520a.C7518j m35934b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0062;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f38242c = r0;
        r0 = r6.f38241b;
        r0 = r0 | 1;
        r6.f38241b = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f38241b;
        r1 = r1 | 2;
        r6.f38241b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum ActionIcon";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f38243d = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f38241b;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f38241b = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f38244e = r0;
        r0 = 0;
        r6.f38240a = r0;
        goto L_0x0000;
    L_0x0062:
        r0 = r6.f38245f;
        if (r0 != 0) goto L_0x006d;
    L_0x0066:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.d;
        r0.<init>();
        r6.f38245f = r0;
    L_0x006d:
        r0 = r6.f38245f;
        r7.m33552a(r0);
        r0 = 1;
        r6.f38240a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.j.a.j.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.j.a.j");
    }

    public final /* synthetic */ i m35935a(C7213a c7213a) {
        return m35934b(c7213a);
    }
}
