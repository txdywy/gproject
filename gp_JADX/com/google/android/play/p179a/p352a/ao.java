package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ao extends C0758b {
    public int f30838a;
    public int f30839b;
    public boolean f30840c;
    public boolean f30841d;
    public int[] f30842e;
    public String f30843f;
    public boolean f30844g;

    public final ao m28585a(int i) {
        this.f30839b = i;
        this.f30838a |= 1;
        return this;
    }

    public final ao m28586a(boolean z) {
        this.f30838a |= 2;
        this.f30840c = z;
        return this;
    }

    public final ao m28590b(boolean z) {
        this.f30838a |= 4;
        this.f30841d = z;
        return this;
    }

    public ao() {
        m28584a();
    }

    public final ao m28584a() {
        this.f30838a = 0;
        this.f30839b = 0;
        this.f30840c = false;
        this.f30841d = false;
        this.f30842e = l.e;
        this.f30843f = "";
        this.f30844g = false;
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if ((this.f30838a & 1) != (aoVar.f30838a & 1)) {
            return false;
        }
        if (this.f30839b != aoVar.f30839b) {
            return false;
        }
        if ((this.f30838a & 2) != (aoVar.f30838a & 2)) {
            return false;
        }
        if (this.f30840c != aoVar.f30840c) {
            return false;
        }
        if ((this.f30838a & 4) != (aoVar.f30838a & 4)) {
            return false;
        }
        if (this.f30841d != aoVar.f30841d) {
            return false;
        }
        if (!h.a(this.f30842e, aoVar.f30842e)) {
            return false;
        }
        if ((this.f30838a & 8) != (aoVar.f30838a & 8)) {
            return false;
        }
        if (!this.f30843f.equals(aoVar.f30843f)) {
            return false;
        }
        if ((this.f30838a & 16) != (aoVar.f30838a & 16)) {
            return false;
        }
        if (this.f30844g != aoVar.f30844g) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(aoVar.aO);
        }
        if (aoVar.aO == null || aoVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int hashCode = ((this.f30840c ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + this.f30839b) * 31)) * 31;
        if (this.f30841d) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (((((i + hashCode) * 31) + h.a(this.f30842e)) * 31) + this.f30843f.hashCode()) * 31;
        if (!this.f30844g) {
            i2 = 1237;
        }
        i2 = (i + i2) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30838a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30839b);
        }
        if ((this.f30838a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30840c);
        }
        if ((this.f30838a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30841d);
        }
        if (this.f30842e != null && this.f30842e.length > 0) {
            for (int a : this.f30842e) {
                codedOutputByteBufferNano.a(4, a);
            }
        }
        if ((this.f30838a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f30843f);
        }
        if ((this.f30838a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f30844g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f30838a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f30839b);
        }
        if ((this.f30838a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f30838a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if (this.f30842e != null && this.f30842e.length > 0) {
            int i2 = 0;
            while (i < this.f30842e.length) {
                i2 += CodedOutputByteBufferNano.c(this.f30842e[i]);
                i++;
            }
            b = (b + i2) + (this.f30842e.length * 1);
        }
        if ((this.f30838a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30843f);
        }
        if ((this.f30838a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.d(6) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.ao m28583b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x004c;
            case 24: goto L_0x0059;
            case 32: goto L_0x0066;
            case 34: goto L_0x009a;
            case 42: goto L_0x00dc;
            case 48: goto L_0x00ea;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f30838a;
        r2 = r2 | 1;
        r7.f30838a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r3) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            case 2: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 34;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = " is not a valid enum Id";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0043:
        r7.f30839b = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r7.f30838a;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3 | 1;
        r7.f30838a = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0001;
    L_0x004c:
        r0 = r8.e();
        r7.f30840c = r0;
        r0 = r7.f30838a;
        r0 = r0 | 2;
        r7.f30838a = r0;
        goto L_0x0001;
    L_0x0059:
        r0 = r8.e();
        r7.f30841d = r0;
        r0 = r7.f30838a;
        r0 = r0 | 4;
        r7.f30838a = r0;
        goto L_0x0001;
    L_0x0066:
        r0 = 32;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f30842e;
        if (r0 != 0) goto L_0x008c;
    L_0x0070:
        r0 = r1;
    L_0x0071:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x007b;
    L_0x0076:
        r3 = r7.f30842e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x007b:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0090;
    L_0x0080:
        r3 = r8.i();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x007b;
    L_0x008c:
        r0 = r7.f30842e;
        r0 = r0.length;
        goto L_0x0071;
    L_0x0090:
        r3 = r8.i();
        r2[r0] = r3;
        r7.f30842e = r2;
        goto L_0x0001;
    L_0x009a:
        r0 = r8.i();
        r3 = r8.c(r0);
        r2 = r8.o();
        r0 = r1;
    L_0x00a7:
        r4 = r8.m();
        if (r4 <= 0) goto L_0x00b3;
    L_0x00ad:
        r8.i();
        r0 = r0 + 1;
        goto L_0x00a7;
    L_0x00b3:
        r8.e(r2);
        r2 = r7.f30842e;
        if (r2 != 0) goto L_0x00d1;
    L_0x00ba:
        r2 = r1;
    L_0x00bb:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00c5;
    L_0x00c0:
        r4 = r7.f30842e;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00c5:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00d5;
    L_0x00c8:
        r4 = r8.i();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00c5;
    L_0x00d1:
        r2 = r7.f30842e;
        r2 = r2.length;
        goto L_0x00bb;
    L_0x00d5:
        r7.f30842e = r0;
        r8.d(r3);
        goto L_0x0001;
    L_0x00dc:
        r0 = r8.f();
        r7.f30843f = r0;
        r0 = r7.f30838a;
        r0 = r0 | 8;
        r7.f30838a = r0;
        goto L_0x0001;
    L_0x00ea:
        r0 = r8.e();
        r7.f30844g = r0;
        r0 = r7.f30838a;
        r0 = r0 | 16;
        r7.f30838a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.ao.b(com.google.protobuf.nano.a):com.google.android.play.a.a.ao");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28583b(aVar);
    }
}
