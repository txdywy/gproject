package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class lf extends C0758b {
    public static volatile lf[] f13005a;
    public int f13006b;
    public int f13007c;
    public lg f13008d;

    public static lf[] bL_() {
        if (f13005a == null) {
            synchronized (h.b) {
                if (f13005a == null) {
                    f13005a = new lf[0];
                }
            }
        }
        return f13005a;
    }

    public lf() {
        this.f13006b = 0;
        this.f13007c = 0;
        this.f13008d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        if ((this.f13006b & 1) != (lfVar.f13006b & 1)) {
            return false;
        }
        if (this.f13007c != lfVar.f13007c) {
            return false;
        }
        if (this.f13008d == null) {
            if (lfVar.f13008d != null) {
                return false;
            }
        } else if (!this.f13008d.equals(lfVar.f13008d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lfVar.aO);
        }
        if (lfVar.aO == null || lfVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f13007c;
        lg lgVar = this.f13008d;
        hashCode = ((lgVar == null ? 0 : lgVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13006b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13007c);
        }
        if (this.f13008d != null) {
            codedOutputByteBufferNano.b(2, this.f13008d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13006b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f13007c);
        }
        if (this.f13008d != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f13008d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.lf m13022b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f13006b;
        r1 = r1 | 1;
        r6.f13006b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            case 6: goto L_0x0042;
            case 7: goto L_0x0042;
            case 8: goto L_0x0042;
            case 9: goto L_0x0042;
            case 10: goto L_0x0042;
            case 11: goto L_0x0042;
            case 12: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Type";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f13007c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f13006b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f13006b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f13008d;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.android.finsky.cv.a.lg;
        r0.<init>();
        r6.f13008d = r0;
    L_0x0056:
        r0 = r6.f13008d;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.lf.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.lf");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m13022b(aVar);
    }
}
