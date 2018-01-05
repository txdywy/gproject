package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0839c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0811h extends C0758b {
    public String f5147a;
    public long f5148b;
    public byte[] f5149c;
    public String f5150d;
    public ae[] f5151e;
    public C0839c[] f5152f;
    public int f5153g;

    public C0811h() {
        this.f5147a = "";
        this.f5148b = 0;
        this.f5149c = l.l;
        this.f5150d = "";
        this.f5151e = ae.m5273a();
        this.f5152f = C0839c.m5355a();
        this.f5153g = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f5147a == null || this.f5147a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5147a);
        }
        if (!Arrays.equals(this.f5149c, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5149c);
        }
        if (!(this.f5150d == null || this.f5150d.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5150d);
        }
        if (this.f5151e != null && this.f5151e.length > 0) {
            for (C0757i c0757i : this.f5151e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(5, c0757i);
                }
            }
        }
        if (this.f5148b != 0) {
            codedOutputByteBufferNano.b(7, this.f5148b);
        }
        if (this.f5152f != null && this.f5152f.length > 0) {
            while (i < this.f5152f.length) {
                C0757i c0757i2 = this.f5152f[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(13, c0757i2);
                }
                i++;
            }
        }
        if (this.f5153g != 0) {
            codedOutputByteBufferNano.a(14, this.f5153g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (!(this.f5147a == null || this.f5147a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5147a);
        }
        if (!Arrays.equals(this.f5149c, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5149c);
        }
        if (!(this.f5150d == null || this.f5150d.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5150d);
        }
        if (this.f5151e != null && this.f5151e.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f5151e) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(5, c0757i);
                }
            }
            b = i2;
        }
        if (this.f5148b != 0) {
            b += CodedOutputByteBufferNano.f(7, this.f5148b);
        }
        if (this.f5152f != null && this.f5152f.length > 0) {
            while (i < this.f5152f.length) {
                C0757i c0757i2 = this.f5152f[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(13, c0757i2);
                }
                i++;
            }
        }
        if (this.f5153g != 0) {
            return b + CodedOutputByteBufferNano.d(14, this.f5153g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h m5148b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0016;
            case 34: goto L_0x001d;
            case 42: goto L_0x0024;
            case 56: goto L_0x0063;
            case 106: goto L_0x006a;
            case 112: goto L_0x00aa;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.f();
        r7.f5147a = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r8.g();
        r7.f5149c = r0;
        goto L_0x0001;
    L_0x001d:
        r0 = r8.f();
        r7.f5150d = r0;
        goto L_0x0001;
    L_0x0024:
        r0 = 42;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5151e;
        if (r0 != 0) goto L_0x0050;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae[r2];
        if (r0 == 0) goto L_0x0039;
    L_0x0034:
        r3 = r7.f5151e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0039:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0054;
    L_0x003e:
        r3 = new com.google.a.a.a.a.b.a.b.a.ae;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0039;
    L_0x0050:
        r0 = r7.f5151e;
        r0 = r0.length;
        goto L_0x002f;
    L_0x0054:
        r3 = new com.google.a.a.a.a.b.a.b.a.ae;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5151e = r2;
        goto L_0x0001;
    L_0x0063:
        r2 = r8.j();
        r7.f5148b = r2;
        goto L_0x0001;
    L_0x006a:
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f5152f;
        if (r0 != 0) goto L_0x0096;
    L_0x0074:
        r0 = r1;
    L_0x0075:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0839c[r2];
        if (r0 == 0) goto L_0x007f;
    L_0x007a:
        r3 = r7.f5152f;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x007f:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x009a;
    L_0x0084:
        r3 = new com.google.a.a.a.a.b.a.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x007f;
    L_0x0096:
        r0 = r7.f5152f;
        r0 = r0.length;
        goto L_0x0075;
    L_0x009a:
        r3 = new com.google.a.a.a.a.b.a.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f5152f = r2;
        goto L_0x0001;
    L_0x00aa:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00d0 }
        switch(r3) {
            case 0: goto L_0x00d9;
            case 1: goto L_0x00b5;
            case 2: goto L_0x00d9;
            case 3: goto L_0x00d9;
            default: goto L_0x00b5;
        };	 Catch:{ IllegalArgumentException -> 0x00d0 }
    L_0x00b5:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r5 = 43;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r5 = " is not a valid enum DisplayType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00d0 }
    L_0x00d0:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00d9:
        r7.f5153g = r3;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.f.h.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.f.h");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5148b(aVar);
    }
}
