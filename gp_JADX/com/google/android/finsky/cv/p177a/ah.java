package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ah extends C0758b {
    public static volatile ah[] f11788a;
    public int f11789b;
    public int f11790c;
    public String f11791d;
    public bd f11792e;
    public String f11793f;
    public eu f11794g;

    public static ah[] aC_() {
        if (f11788a == null) {
            synchronized (h.b) {
                if (f11788a == null) {
                    f11788a = new ah[0];
                }
            }
        }
        return f11788a;
    }

    public ah() {
        this.f11789b = 0;
        this.f11790c = 1;
        this.f11791d = "";
        this.f11792e = null;
        this.f11793f = "";
        this.f11794g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        if ((this.f11789b & 1) != (ahVar.f11789b & 1)) {
            return false;
        }
        if (this.f11790c != ahVar.f11790c) {
            return false;
        }
        if ((this.f11789b & 2) != (ahVar.f11789b & 2)) {
            return false;
        }
        if (!this.f11791d.equals(ahVar.f11791d)) {
            return false;
        }
        if (this.f11792e == null) {
            if (ahVar.f11792e != null) {
                return false;
            }
        } else if (!this.f11792e.equals(ahVar.f11792e)) {
            return false;
        }
        if ((this.f11789b & 4) != (ahVar.f11789b & 4)) {
            return false;
        }
        if (!this.f11793f.equals(ahVar.f11793f)) {
            return false;
        }
        if (this.f11794g == null) {
            if (ahVar.f11794g != null) {
                return false;
            }
        } else if (!this.f11794g.equals(ahVar.f11794g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ahVar.aO);
        }
        if (ahVar.aO == null || ahVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f11790c) * 31) + this.f11791d.hashCode();
        bd bdVar = this.f11792e;
        hashCode = (((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f11793f.hashCode();
        eu euVar = this.f11794g;
        hashCode = ((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11789b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11790c);
        }
        if ((this.f11789b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11791d);
        }
        if (this.f11792e != null) {
            codedOutputByteBufferNano.b(3, this.f11792e);
        }
        if ((this.f11789b & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f11793f);
        }
        if (this.f11794g != null) {
            codedOutputByteBufferNano.b(5, this.f11794g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11789b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f11790c);
        }
        if ((this.f11789b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11791d);
        }
        if (this.f11792e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f11792e);
        }
        if ((this.f11789b & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f11793f);
        }
        if (this.f11794g != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f11794g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.ah m12182b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0069;
            case 42: goto L_0x0076;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f11789b;
        r1 = r1 | 1;
        r6.f11789b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Id";
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
        r6.f11790c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f11789b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f11789b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.f();
        r6.f11791d = r0;
        r0 = r6.f11789b;
        r0 = r0 | 2;
        r6.f11789b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r6.f11792e;
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f11792e = r0;
    L_0x0063:
        r0 = r6.f11792e;
        r7.a(r0);
        goto L_0x0000;
    L_0x0069:
        r0 = r7.f();
        r6.f11793f = r0;
        r0 = r6.f11789b;
        r0 = r0 | 4;
        r6.f11789b = r0;
        goto L_0x0000;
    L_0x0076:
        r0 = r6.f11794g;
        if (r0 != 0) goto L_0x0081;
    L_0x007a:
        r0 = new com.google.android.finsky.cv.a.eu;
        r0.<init>();
        r6.f11794g = r0;
    L_0x0081:
        r0 = r6.f11794g;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.ah.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.ah");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12182b(aVar);
    }
}
