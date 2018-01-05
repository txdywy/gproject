package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class ab extends C0758b {
    public int f24100a;
    public byte[] f24101b;
    public long f24102c;
    public int f24103d;
    public String f24104e;
    public String f24105f;
    public String f24106g;
    public byte[] f24107h;
    public int f24108i;

    public ab() {
        this.f24100a = 0;
        this.f24101b = l.l;
        this.f24102c = 0;
        this.f24103d = 0;
        this.f24104e = "";
        this.f24105f = "";
        this.f24106g = "";
        this.f24107h = l.l;
        this.f24108i = 1;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24100a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24101b);
        }
        if ((this.f24100a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24102c);
        }
        if ((this.f24100a & 4) != 0) {
            codedOutputByteBufferNano.c(3, this.f24103d);
        }
        if ((this.f24100a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24104e);
        }
        if ((this.f24100a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24105f);
        }
        if ((this.f24100a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f24106g);
        }
        if ((this.f24100a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f24107h);
        }
        if ((this.f24100a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f24108i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24100a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24101b);
        }
        if ((this.f24100a & 2) != 0) {
            b += CodedOutputByteBufferNano.e(2, this.f24102c);
        }
        if ((this.f24100a & 4) != 0) {
            b += CodedOutputByteBufferNano.e(3, this.f24103d);
        }
        if ((this.f24100a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f24104e);
        }
        if ((this.f24100a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f24105f);
        }
        if ((this.f24100a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f24106g);
        }
        if ((this.f24100a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f24107h);
        }
        if ((this.f24100a & 128) != 0) {
            return b + CodedOutputByteBufferNano.d(8, this.f24108i);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.verifier.p259a.p260a.ab m21853b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 24: goto L_0x0028;
            case 34: goto L_0x0035;
            case 42: goto L_0x0042;
            case 50: goto L_0x004f;
            case 58: goto L_0x005c;
            case 64: goto L_0x0069;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.g();
        r6.f24101b = r0;
        r0 = r6.f24100a;
        r0 = r0 | 1;
        r6.f24100a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.j();
        r6.f24102c = r0;
        r0 = r6.f24100a;
        r0 = r0 | 2;
        r6.f24100a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.i();
        r6.f24103d = r0;
        r0 = r6.f24100a;
        r0 = r0 | 4;
        r6.f24100a = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.f();
        r6.f24104e = r0;
        r0 = r6.f24100a;
        r0 = r0 | 8;
        r6.f24100a = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = r7.f();
        r6.f24105f = r0;
        r0 = r6.f24100a;
        r0 = r0 | 16;
        r6.f24100a = r0;
        goto L_0x0000;
    L_0x004f:
        r0 = r7.f();
        r6.f24106g = r0;
        r0 = r6.f24100a;
        r0 = r0 | 32;
        r6.f24100a = r0;
        goto L_0x0000;
    L_0x005c:
        r0 = r7.g();
        r6.f24107h = r0;
        r0 = r6.f24100a;
        r0 = r0 | 64;
        r6.f24100a = r0;
        goto L_0x0000;
    L_0x0069:
        r1 = r6.f24100a;
        r1 = r1 | 128;
        r6.f24100a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0095 }
        switch(r2) {
            case 1: goto L_0x009e;
            case 2: goto L_0x009e;
            case 3: goto L_0x009e;
            default: goto L_0x007a;
        };	 Catch:{ IllegalArgumentException -> 0x0095 }
    L_0x007a:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0095 }
        r4 = " is not a valid enum VerdictSource";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0095 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0095 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0095 }
    L_0x0095:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x009e:
        r6.f24108i = r2;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r6.f24100a;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r2 | 128;
        r6.f24100a = r2;	 Catch:{ IllegalArgumentException -> 0x0095 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.a.a.ab.b(com.google.protobuf.nano.a):com.google.android.finsky.verifier.a.a.ab");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m21853b(aVar);
    }
}
