package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bf extends C0758b {
    public int f11877a;
    public int f11878b;
    public int f11879c;
    public int f11880d;

    public bf() {
        this.f11877a = 0;
        this.f11878b = 0;
        this.f11879c = 0;
        this.f11880d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        if (this.f11878b != bfVar.f11878b) {
            return false;
        }
        if (this.f11879c != bfVar.f11879c) {
            return false;
        }
        if ((this.f11877a & 1) != (bfVar.f11877a & 1)) {
            return false;
        }
        if (this.f11880d != bfVar.f11880d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bfVar.aO);
        }
        if (bfVar.aO == null || bfVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f11878b) * 31) + this.f11879c) * 31) + this.f11880d) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(3, this.f11878b);
        codedOutputByteBufferNano.a(4, this.f11879c);
        if ((this.f11877a & 1) != 0) {
            codedOutputByteBufferNano.a(18, this.f11880d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = (super.mo1128b() + CodedOutputByteBufferNano.d(3, this.f11878b)) + CodedOutputByteBufferNano.d(4, this.f11879c);
        if ((this.f11877a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(18, this.f11880d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.bf m12252b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 24: goto L_0x000e;
            case 32: goto L_0x0015;
            case 144: goto L_0x001c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.i();
        r6.f11878b = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.i();
        r6.f11879c = r0;
        goto L_0x0000;
    L_0x001c:
        r1 = r6.f11877a;
        r1 = r1 | 1;
        r6.f11877a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0048 }
        switch(r2) {
            case 0: goto L_0x0050;
            case 1: goto L_0x0050;
            case 2: goto L_0x0050;
            case 3: goto L_0x0050;
            case 4: goto L_0x0050;
            case 5: goto L_0x0050;
            case 6: goto L_0x0050;
            case 7: goto L_0x0050;
            case 8: goto L_0x0050;
            default: goto L_0x002d;
        };	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x002d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0048 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0048 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0050:
        r6.f11880d = r2;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = r6.f11877a;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = r2 | 1;
        r6.f11877a = r2;	 Catch:{ IllegalArgumentException -> 0x0048 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.bf.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.bf");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12252b(aVar);
    }
}
