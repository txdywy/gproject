package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7157f extends b {
    public int f34968a;
    public String f34969b;
    public C7159h f34970c;
    public C7158g f34971d;

    public C7157f() {
        this.f34968a = 0;
        this.f34969b = "";
        this.f34970c = null;
        this.f34971d = null;
        this.aP = -1;
    }

    public final void m32465a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34968a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34968a);
        }
        if (this.f34970c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f34970c);
        }
        if (!(this.f34969b == null || this.f34969b.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f34969b);
        }
        if (this.f34971d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f34971d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32466b() {
        int b = super.b();
        if (this.f34968a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34968a);
        }
        if (this.f34970c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f34970c);
        }
        if (!(this.f34969b == null || this.f34969b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f34969b);
        }
        if (this.f34971d != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f34971d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p455b.p456a.C7157f m32463b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 26: goto L_0x0050;
            case 34: goto L_0x0057;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum FormFieldType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f34968a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r6.f34970c;
        if (r0 != 0) goto L_0x004a;
    L_0x0043:
        r0 = new com.google.h.c.b.a.h;
        r0.<init>();
        r6.f34970c = r0;
    L_0x004a:
        r0 = r6.f34970c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0050:
        r0 = r7.m33564f();
        r6.f34969b = r0;
        goto L_0x0000;
    L_0x0057:
        r0 = r6.f34971d;
        if (r0 != 0) goto L_0x0062;
    L_0x005b:
        r0 = new com.google.h.c.b.a.g;
        r0.<init>();
        r6.f34971d = r0;
    L_0x0062:
        r0 = r6.f34971d;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.b.a.f.b(com.google.protobuf.nano.a):com.google.h.c.b.a.f");
    }

    public final /* synthetic */ i m32464a(C7213a c7213a) {
        return m32463b(c7213a);
    }
}
