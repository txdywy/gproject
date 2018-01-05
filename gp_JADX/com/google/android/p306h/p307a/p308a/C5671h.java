package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C5671h extends C0758b {
    public static volatile C5671h[] f28754a;
    public C5672i f28755b;
    public Integer f28756c;
    public String[] f28757d;
    public String f28758e;

    public static C5671h[] m26876a() {
        if (f28754a == null) {
            synchronized (h.b) {
                if (f28754a == null) {
                    f28754a = new C5671h[0];
                }
            }
        }
        return f28754a;
    }

    public C5671h() {
        this.f28755b = null;
        this.f28757d = l.j;
        this.f28758e = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28755b != null) {
            codedOutputByteBufferNano.b(1, this.f28755b);
        }
        if (this.f28756c != null) {
            codedOutputByteBufferNano.a(2, this.f28756c.intValue());
        }
        if (this.f28757d != null && this.f28757d.length > 0) {
            for (String str : this.f28757d) {
                if (str != null) {
                    codedOutputByteBufferNano.a(3, str);
                }
            }
        }
        if (this.f28758e != null) {
            codedOutputByteBufferNano.a(4, this.f28758e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f28755b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f28755b);
        }
        if (this.f28756c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f28756c.intValue());
        }
        if (this.f28757d != null && this.f28757d.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f28757d.length) {
                String str = this.f28757d[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f28758e != null) {
            return b + CodedOutputByteBufferNano.b(4, this.f28758e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.p306h.p307a.p308a.C5671h m26877b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 16: goto L_0x0020;
            case 26: goto L_0x0055;
            case 34: goto L_0x0089;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r7.f28755b;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.android.h.a.a.i;
        r0.<init>();
        r7.f28755b = r0;
    L_0x001a:
        r0 = r7.f28755b;
        r8.a(r0);
        goto L_0x0001;
    L_0x0020:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0046 }
        switch(r3) {
            case 0: goto L_0x004e;
            case 1: goto L_0x004e;
            case 2: goto L_0x004e;
            case 3: goto L_0x004e;
            case 4: goto L_0x004e;
            default: goto L_0x002b;
        };	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x002b:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0046 }
        r5 = 46;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0046 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0046 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0046 }
        r5 = " is not a valid enum TaskResultCode";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0046 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0046 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0046 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x0046:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x004e:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x0046 }
        r7.f28756c = r3;	 Catch:{ IllegalArgumentException -> 0x0046 }
        goto L_0x0001;
    L_0x0055:
        r0 = 26;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f28757d;
        if (r0 != 0) goto L_0x007b;
    L_0x005f:
        r0 = r1;
    L_0x0060:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x006a;
    L_0x0065:
        r3 = r7.f28757d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x006a:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x007f;
    L_0x006f:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x006a;
    L_0x007b:
        r0 = r7.f28757d;
        r0 = r0.length;
        goto L_0x0060;
    L_0x007f:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f28757d = r2;
        goto L_0x0001;
    L_0x0089:
        r0 = r8.f();
        r7.f28758e = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.h.a.a.h.b(com.google.protobuf.nano.a):com.google.android.h.a.a.h");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m26877b(aVar);
    }
}
