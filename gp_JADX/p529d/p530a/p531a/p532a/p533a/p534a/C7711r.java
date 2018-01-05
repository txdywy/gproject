package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7711r extends b {
    public Boolean f40146a;
    public bf f40147b;
    public String f40148c;
    public String f40149d;
    public int f40150e;
    public Long f40151f;
    public String f40152g;

    public C7711r() {
        this.f40146a = null;
        this.f40147b = null;
        this.f40148c = null;
        this.f40149d = null;
        this.f40150e = Integer.MIN_VALUE;
        this.f40151f = null;
        this.f40152g = null;
        this.aP = -1;
    }

    public final void m37294a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40146a != null) {
            codedOutputByteBufferNano.m33522a(1, this.f40146a.booleanValue());
        }
        if (this.f40147b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f40147b);
        }
        if (this.f40148c != null) {
            codedOutputByteBufferNano.m33521a(3, this.f40148c);
        }
        if (this.f40149d != null) {
            codedOutputByteBufferNano.m33521a(4, this.f40149d);
        }
        if (this.f40150e != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(5, this.f40150e);
        }
        if (this.f40151f != null) {
            codedOutputByteBufferNano.m33535c(6, this.f40151f.longValue());
        }
        if (this.f40152g != null) {
            codedOutputByteBufferNano.m33521a(7, this.f40152g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37295b() {
        int b = super.b();
        if (this.f40146a != null) {
            this.f40146a.booleanValue();
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f40147b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f40147b);
        }
        if (this.f40148c != null) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f40148c);
        }
        if (this.f40149d != null) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f40149d);
        }
        if (this.f40150e != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f40150e);
        }
        if (this.f40151f != null) {
            this.f40151f.longValue();
            b += CodedOutputByteBufferNano.m33501d(6) + 8;
        }
        if (this.f40152g != null) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f40152g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.C7711r m37292b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x0019;
            case 26: goto L_0x002a;
            case 34: goto L_0x0031;
            case 40: goto L_0x0038;
            case 49: goto L_0x0069;
            case 58: goto L_0x0074;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33563e();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f40146a = r0;
        goto L_0x0000;
    L_0x0019:
        r0 = r6.f40147b;
        if (r0 != 0) goto L_0x0024;
    L_0x001d:
        r0 = new d.a.a.a.a.a.bf;
        r0.<init>();
        r6.f40147b = r0;
    L_0x0024:
        r0 = r6.f40147b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x002a:
        r0 = r7.m33564f();
        r6.f40148c = r0;
        goto L_0x0000;
    L_0x0031:
        r0 = r7.m33564f();
        r6.f40149d = r0;
        goto L_0x0000;
    L_0x0038:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x005e }
        switch(r2) {
            case 0: goto L_0x0066;
            case 1: goto L_0x0066;
            case 2: goto L_0x0066;
            case 3: goto L_0x0066;
            case 4: goto L_0x0066;
            default: goto L_0x0043;
        };	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x0043:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x005e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = " is not a valid enum CrashType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x005e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0066:
        r6.f40150e = r2;	 Catch:{ IllegalArgumentException -> 0x005e }
        goto L_0x0000;
    L_0x0069:
        r0 = r7.m33570l();
        r0 = java.lang.Long.valueOf(r0);
        r6.f40151f = r0;
        goto L_0x0000;
    L_0x0074:
        r0 = r7.m33564f();
        r6.f40152g = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.r.b(com.google.protobuf.nano.a):d.a.a.a.a.a.r");
    }

    public final /* synthetic */ i m37293a(C7213a c7213a) {
        return m37292b(c7213a);
    }
}
