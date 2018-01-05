package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;

public final class C7498w extends b {
    public int f38149a;
    public C7500y f38150b;
    public ContentFilterSettingsResponse f38151c;
    public String f38152d;
    public bd f38153e;
    public boolean f38154f;
    public int f38155g;

    public C7498w() {
        this.f38149a = 0;
        this.f38150b = null;
        this.f38151c = null;
        this.f38152d = "";
        this.f38153e = null;
        this.f38154f = false;
        this.f38155g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35859a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38150b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38150b);
        }
        if (this.f38151c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38151c);
        }
        if ((this.f38149a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38152d);
        }
        if (this.f38153e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38153e);
        }
        if ((this.f38149a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f38154f);
        }
        if ((this.f38149a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38155g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35860b() {
        int b = super.b();
        if (this.f38150b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38150b);
        }
        if (this.f38151c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38151c);
        }
        if ((this.f38149a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38152d);
        }
        if (this.f38153e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38153e);
        }
        if ((this.f38149a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f38149a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(6, this.f38155g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.C7498w m35857b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001f;
            case 26: goto L_0x0030;
            case 34: goto L_0x003d;
            case 40: goto L_0x004e;
            case 48: goto L_0x005b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f38150b;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.wireless.android.finsky.dfe.h.a.y;
        r0.<init>();
        r6.f38150b = r0;
    L_0x0019:
        r0 = r6.f38150b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r6.f38151c;
        if (r0 != 0) goto L_0x002a;
    L_0x0023:
        r0 = new com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
        r0.<init>();
        r6.f38151c = r0;
    L_0x002a:
        r0 = r6.f38151c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0030:
        r0 = r7.m33564f();
        r6.f38152d = r0;
        r0 = r6.f38149a;
        r0 = r0 | 1;
        r6.f38149a = r0;
        goto L_0x0000;
    L_0x003d:
        r0 = r6.f38153e;
        if (r0 != 0) goto L_0x0048;
    L_0x0041:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f38153e = r0;
    L_0x0048:
        r0 = r6.f38153e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x004e:
        r0 = r7.m33563e();
        r6.f38154f = r0;
        r0 = r6.f38149a;
        r0 = r0 | 2;
        r6.f38149a = r0;
        goto L_0x0000;
    L_0x005b:
        r1 = r6.f38149a;
        r1 = r1 | 4;
        r6.f38149a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0087 }
        switch(r2) {
            case 0: goto L_0x0090;
            case 1: goto L_0x0090;
            case 2: goto L_0x0090;
            default: goto L_0x006c;
        };	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x006c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0087 }
        r4 = " is not a valid enum MenuSetup";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0087 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0087 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0087:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0090:
        r6.f38155g = r2;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r6.f38149a;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r2 | 4;
        r6.f38149a = r2;	 Catch:{ IllegalArgumentException -> 0x0087 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.w.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.w");
    }

    public final /* synthetic */ i m35858a(C7213a c7213a) {
        return m35857b(c7213a);
    }
}
