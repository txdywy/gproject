package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class lp extends C0758b {
    public static volatile lp[] f13032a;
    public int f13033b;
    public String f13034c;
    public String[] f13035d;

    public static lp[] bO_() {
        if (f13032a == null) {
            synchronized (h.b) {
                if (f13032a == null) {
                    f13032a = new lp[0];
                }
            }
        }
        return f13032a;
    }

    public lp() {
        this.f13033b = 0;
        this.f13034c = "";
        this.f13035d = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return false;
        }
        lp lpVar = (lp) obj;
        if (this.f13033b != lpVar.f13033b) {
            return false;
        }
        if (this.f13034c == null) {
            if (lpVar.f13034c != null) {
                return false;
            }
        } else if (!this.f13034c.equals(lpVar.f13034c)) {
            return false;
        }
        if (!h.a(this.f13035d, lpVar.f13035d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lpVar.aO);
        }
        if (lpVar.aO == null || lpVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f13034c == null ? 0 : this.f13034c.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f13033b) * 31)) * 31) + h.a(this.f13035d)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(1, this.f13033b);
        codedOutputByteBufferNano.a(2, this.f13034c);
        if (this.f13035d != null && this.f13035d.length > 0) {
            for (String str : this.f13035d) {
                if (str != null) {
                    codedOutputByteBufferNano.a(3, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = (super.mo1128b() + CodedOutputByteBufferNano.d(1, this.f13033b)) + CodedOutputByteBufferNano.b(2, this.f13034c);
        if (this.f13035d == null || this.f13035d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f13035d.length) {
            String str = this.f13035d[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.lp m13051b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x0040;
            case 26: goto L_0x0047;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r3) {
            case 0: goto L_0x003d;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            case 3: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum CreditType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x003d:
        r7.f13033b = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0040:
        r0 = r8.f();
        r7.f13034c = r0;
        goto L_0x0001;
    L_0x0047:
        r0 = 26;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f13035d;
        if (r0 != 0) goto L_0x006d;
    L_0x0051:
        r0 = r1;
    L_0x0052:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x005c;
    L_0x0057:
        r3 = r7.f13035d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x005c:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0071;
    L_0x0061:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x005c;
    L_0x006d:
        r0 = r7.f13035d;
        r0 = r0.length;
        goto L_0x0052;
    L_0x0071:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f13035d = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.lp.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.lp");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m13051b(aVar);
    }
}
