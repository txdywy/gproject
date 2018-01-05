package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ak extends b {
    public aj f39845a;
    public bf f39846b;
    public int f39847c;
    public C7713t f39848d;
    public String f39849e;

    public ak() {
        this.f39845a = null;
        this.f39846b = null;
        this.f39847c = Integer.MIN_VALUE;
        this.f39848d = null;
        this.f39849e = null;
        this.aP = -1;
    }

    public final void m37091a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39845a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39845a);
        }
        if (this.f39846b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39846b);
        }
        if (this.f39847c != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(3, this.f39847c);
        }
        if (this.f39848d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39848d);
        }
        if (this.f39849e != null) {
            codedOutputByteBufferNano.m33521a(5, this.f39849e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37092b() {
        int b = super.b();
        if (this.f39845a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39845a);
        }
        if (this.f39846b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39846b);
        }
        if (this.f39847c != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f39847c);
        }
        if (this.f39848d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39848d);
        }
        if (this.f39849e != null) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f39849e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p529d.p530a.p531a.p532a.p533a.p534a.ak m37089b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001f;
            case 24: goto L_0x0030;
            case 34: goto L_0x0061;
            case 42: goto L_0x0072;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f39845a;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new d.a.a.a.a.a.aj;
        r0.<init>();
        r6.f39845a = r0;
    L_0x0019:
        r0 = r6.f39845a;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r6.f39846b;
        if (r0 != 0) goto L_0x002a;
    L_0x0023:
        r0 = new d.a.a.a.a.a.bf;
        r0.<init>();
        r6.f39846b = r0;
    L_0x002a:
        r0 = r6.f39846b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0030:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0056 }
        switch(r2) {
            case 0: goto L_0x005e;
            case 1: goto L_0x005e;
            case 2: goto L_0x005e;
            case 3: goto L_0x005e;
            case 4: goto L_0x005e;
            case 5: goto L_0x005e;
            default: goto L_0x003b;
        };	 Catch:{ IllegalArgumentException -> 0x0056 }
    L_0x003b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0056 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r4 = " is not a valid enum MemoryEventCode";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0056 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0056 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0056 }
    L_0x0056:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x005e:
        r6.f39847c = r2;	 Catch:{ IllegalArgumentException -> 0x0056 }
        goto L_0x0000;
    L_0x0061:
        r0 = r6.f39848d;
        if (r0 != 0) goto L_0x006c;
    L_0x0065:
        r0 = new d.a.a.a.a.a.t;
        r0.<init>();
        r6.f39848d = r0;
    L_0x006c:
        r0 = r6.f39848d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33564f();
        r6.f39849e = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.a.a.a.ak.b(com.google.protobuf.nano.a):d.a.a.a.a.a.ak");
    }

    public final /* synthetic */ i m37090a(C7213a c7213a) {
        return m37089b(c7213a);
    }
}
